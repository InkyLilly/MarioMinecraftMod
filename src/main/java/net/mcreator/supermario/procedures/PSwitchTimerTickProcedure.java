package net.mcreator.supermario.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.supermario.network.SuperMarioModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PSwitchTimerTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).P_Switch_Active == true) {
			if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).P_Switch_Timer > 0) {
				{
					double _setval = (entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).P_Switch_Timer - 1;
					entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.P_Switch_Timer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).P_Switch_Timer == 0) {
				if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).P_Switch_Active == true) {
					{
						boolean _setval = false;
						entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.P_Switch_Active = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					SuperMarioModVariables.MapVariables.get(world).P_Switch_Users_Active = SuperMarioModVariables.MapVariables.get(world).P_Switch_Users_Active - 1;
					SuperMarioModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}
