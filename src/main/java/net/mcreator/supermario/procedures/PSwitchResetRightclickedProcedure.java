package net.mcreator.supermario.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.supermario.network.SuperMarioModVariables;

public class PSwitchResetRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.P_Switch_Timer = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		SuperMarioModVariables.MapVariables.get(world).P_Switch_Users_Active = 0;
		SuperMarioModVariables.MapVariables.get(world).syncData(world);
	}
}
