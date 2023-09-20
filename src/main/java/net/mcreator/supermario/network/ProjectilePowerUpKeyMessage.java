
package net.mcreator.supermario.network;

import net.mcreator.supermario.SuperMarioMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProjectilePowerUpKeyMessage {

	int type, pressedms;

	public ProjectilePowerUpKeyMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public ProjectilePowerUpKeyMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(ProjectilePowerUpKeyMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(ProjectilePowerUpKeyMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;

		if (type == 0) {

			ProjectilePowerUpKeyOnKeyPressedProcedure.execute(world, x, y, z);
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		SuperMarioMod.addNetworkMessage(ProjectilePowerUpKeyMessage.class, ProjectilePowerUpKeyMessage::buffer, ProjectilePowerUpKeyMessage::new, ProjectilePowerUpKeyMessage::handler);
	}

}
