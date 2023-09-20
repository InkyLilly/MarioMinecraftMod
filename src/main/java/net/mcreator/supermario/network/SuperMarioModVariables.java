package net.mcreator.supermario.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.supermario.SuperMarioMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SuperMarioModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		SuperMarioMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		SuperMarioMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.PowerUp_Health = original.PowerUp_Health;
			clone.Super_Leaf_Flight_Active = original.Super_Leaf_Flight_Active;
			clone.Super_Leaf_Active = original.Super_Leaf_Active;
			clone.PowerUp_Running_Charge = original.PowerUp_Running_Charge;
			clone.PowerUp_Running_Able = original.PowerUp_Running_Able;
			clone.P_Switch_Timer = original.P_Switch_Timer;
			clone.P_Switch_Active = original.P_Switch_Active;
			clone.Propeller_Mushroom_Active = original.Propeller_Mushroom_Active;
			clone.Propeller_Mushroom_Flight_Active = original.Propeller_Mushroom_Flight_Active;
			clone.Propeller_Mushroom_Falling = original.Propeller_Mushroom_Falling;
			clone.FireBall_Yaw = original.FireBall_Yaw;
			clone.FireBall_Power = original.FireBall_Power;
			clone.FireBalls_Remaining = original.FireBalls_Remaining;
			clone.Fire_Flower_Active = original.Fire_Flower_Active;
			clone.Gold_Flower_Active = original.Gold_Flower_Active;
			clone.FireBall_Cooldown = original.FireBall_Cooldown;
			if (!event.isWasDeath()) {
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getPlayer().level);
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (mapdata != null)
					SuperMarioMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					SuperMarioMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (worlddata != null)
					SuperMarioMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "super_mario_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				SuperMarioMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "super_mario_mapvars";
		public double P_Switch_Users_Active = 0;
		public boolean OFF_Block_Active = false;
		public boolean ON_Block_Active = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			P_Switch_Users_Active = nbt.getDouble("P_Switch_Users_Active");
			OFF_Block_Active = nbt.getBoolean("OFF_Block_Active");
			ON_Block_Active = nbt.getBoolean("ON_Block_Active");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("P_Switch_Users_Active", P_Switch_Users_Active);
			nbt.putBoolean("OFF_Block_Active", OFF_Block_Active);
			nbt.putBoolean("ON_Block_Active", ON_Block_Active);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				SuperMarioMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("super_mario", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double PowerUp_Health = 0;
		public boolean Super_Leaf_Flight_Active = false;
		public boolean Super_Leaf_Active = false;
		public double PowerUp_Running_Charge = 0;
		public boolean PowerUp_Running_Able = false;
		public double P_Switch_Timer = 0;
		public boolean P_Switch_Active = false;
		public boolean Propeller_Mushroom_Active = false;
		public boolean Propeller_Mushroom_Flight_Active = false;
		public boolean Propeller_Mushroom_Falling = false;
		public double FireBall_Yaw = 0;
		public double FireBall_Power = 0;
		public double FireBalls_Remaining = 0;
		public boolean Fire_Flower_Active = false;
		public boolean Gold_Flower_Active = false;
		public double FireBall_Cooldown = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				SuperMarioMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("PowerUp_Health", PowerUp_Health);
			nbt.putBoolean("Super_Leaf_Flight_Active", Super_Leaf_Flight_Active);
			nbt.putBoolean("Super_Leaf_Active", Super_Leaf_Active);
			nbt.putDouble("PowerUp_Running_Charge", PowerUp_Running_Charge);
			nbt.putBoolean("PowerUp_Running_Able", PowerUp_Running_Able);
			nbt.putDouble("P_Switch_Timer", P_Switch_Timer);
			nbt.putBoolean("P_Switch_Active", P_Switch_Active);
			nbt.putBoolean("Propeller_Mushroom_Active", Propeller_Mushroom_Active);
			nbt.putBoolean("Propeller_Mushroom_Flight_Active", Propeller_Mushroom_Flight_Active);
			nbt.putBoolean("Propeller_Mushroom_Falling", Propeller_Mushroom_Falling);
			nbt.putDouble("FireBall_Yaw", FireBall_Yaw);
			nbt.putDouble("FireBall_Power", FireBall_Power);
			nbt.putDouble("FireBalls_Remaining", FireBalls_Remaining);
			nbt.putBoolean("Fire_Flower_Active", Fire_Flower_Active);
			nbt.putBoolean("Gold_Flower_Active", Gold_Flower_Active);
			nbt.putDouble("FireBall_Cooldown", FireBall_Cooldown);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			PowerUp_Health = nbt.getDouble("PowerUp_Health");
			Super_Leaf_Flight_Active = nbt.getBoolean("Super_Leaf_Flight_Active");
			Super_Leaf_Active = nbt.getBoolean("Super_Leaf_Active");
			PowerUp_Running_Charge = nbt.getDouble("PowerUp_Running_Charge");
			PowerUp_Running_Able = nbt.getBoolean("PowerUp_Running_Able");
			P_Switch_Timer = nbt.getDouble("P_Switch_Timer");
			P_Switch_Active = nbt.getBoolean("P_Switch_Active");
			Propeller_Mushroom_Active = nbt.getBoolean("Propeller_Mushroom_Active");
			Propeller_Mushroom_Flight_Active = nbt.getBoolean("Propeller_Mushroom_Flight_Active");
			Propeller_Mushroom_Falling = nbt.getBoolean("Propeller_Mushroom_Falling");
			FireBall_Yaw = nbt.getDouble("FireBall_Yaw");
			FireBall_Power = nbt.getDouble("FireBall_Power");
			FireBalls_Remaining = nbt.getDouble("FireBalls_Remaining");
			Fire_Flower_Active = nbt.getBoolean("Fire_Flower_Active");
			Gold_Flower_Active = nbt.getBoolean("Gold_Flower_Active");
			FireBall_Cooldown = nbt.getDouble("FireBall_Cooldown");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.PowerUp_Health = message.data.PowerUp_Health;
					variables.Super_Leaf_Flight_Active = message.data.Super_Leaf_Flight_Active;
					variables.Super_Leaf_Active = message.data.Super_Leaf_Active;
					variables.PowerUp_Running_Charge = message.data.PowerUp_Running_Charge;
					variables.PowerUp_Running_Able = message.data.PowerUp_Running_Able;
					variables.P_Switch_Timer = message.data.P_Switch_Timer;
					variables.P_Switch_Active = message.data.P_Switch_Active;
					variables.Propeller_Mushroom_Active = message.data.Propeller_Mushroom_Active;
					variables.Propeller_Mushroom_Flight_Active = message.data.Propeller_Mushroom_Flight_Active;
					variables.Propeller_Mushroom_Falling = message.data.Propeller_Mushroom_Falling;
					variables.FireBall_Yaw = message.data.FireBall_Yaw;
					variables.FireBall_Power = message.data.FireBall_Power;
					variables.FireBalls_Remaining = message.data.FireBalls_Remaining;
					variables.Fire_Flower_Active = message.data.Fire_Flower_Active;
					variables.Gold_Flower_Active = message.data.Gold_Flower_Active;
					variables.FireBall_Cooldown = message.data.FireBall_Cooldown;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
