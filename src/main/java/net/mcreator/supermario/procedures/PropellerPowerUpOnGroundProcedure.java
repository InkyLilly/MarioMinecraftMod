package net.mcreator.supermario.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.supermario.network.SuperMarioModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PropellerPowerUpOnGroundProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).Propeller_Mushroom_Falling == true) {
			if (entity.isOnGround()) {
				{
					boolean _setval = false;
					entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Propeller_Mushroom_Falling = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.SLOW_FALLING);
				if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).Propeller_Mushroom_Active == true) {
					{
						boolean _setval = true;
						entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Propeller_Mushroom_Flight_Active = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("super_mario:propellersuitfly")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("super_mario:propellersuitfly")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			}
		}
	}
}
