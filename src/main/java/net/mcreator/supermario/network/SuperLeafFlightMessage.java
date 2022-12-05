
package net.mcreator.supermario.network;

import net.mcreator.supermario.SuperMarioMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SuperLeafFlightMessage {

	int type, pressedms;

	public SuperLeafFlightMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public SuperLeafFlightMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(SuperLeafFlightMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(SuperLeafFlightMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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

			SuperLeafFlightOnKeyPressedProcedure.execute(entity);
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		SuperMarioMod.addNetworkMessage(SuperLeafFlightMessage.class, SuperLeafFlightMessage::buffer, SuperLeafFlightMessage::new,
				SuperLeafFlightMessage::handler);
	}

}
