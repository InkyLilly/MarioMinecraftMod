package net.mcreator.supermario.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.supermario.network.SuperMarioModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PropellerPowerUpOnGroundProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
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
				}
			}
		}
	}
}
