package net.mcreator.supermario.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.supermario.network.SuperMarioModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SuperLeafRunningProcedure {
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
		if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new SuperMarioModVariables.PlayerVariables())).Super_Leaf_Active == true
				&& (entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SuperMarioModVariables.PlayerVariables())).PowerUp_Running_Able == true) {
			if (entity.isSprinting() && entity.isOnGround()) {
				if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SuperMarioModVariables.PlayerVariables())).PowerUp_Running_Charge < 120) {
					{
						double _setval = (entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new SuperMarioModVariables.PlayerVariables())).PowerUp_Running_Charge + 1;
						entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PowerUp_Running_Charge = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SuperMarioModVariables.PlayerVariables())).PowerUp_Running_Charge > 0) {
					{
						double _setval = (entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new SuperMarioModVariables.PlayerVariables())).PowerUp_Running_Charge - 1;
						entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PowerUp_Running_Charge = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new SuperMarioModVariables.PlayerVariables())).PowerUp_Running_Charge == 120) {
				{
					boolean _setval = true;
					entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Super_Leaf_Flight_Active = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new SuperMarioModVariables.PlayerVariables())).PowerUp_Running_Charge == 0) {
				if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new SuperMarioModVariables.PlayerVariables())).Super_Leaf_Flight_Active == true) {
					{
						boolean _setval = false;
						entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Super_Leaf_Flight_Active = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
		if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new SuperMarioModVariables.PlayerVariables())).Super_Leaf_Active == false) {
			{
				double _setval = 0;
				entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PowerUp_Running_Charge = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				boolean _setval = false;
				entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Super_Leaf_Flight_Active = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
