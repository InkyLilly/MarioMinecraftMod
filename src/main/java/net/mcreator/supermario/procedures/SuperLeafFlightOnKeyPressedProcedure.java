package net.mcreator.supermario.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

import net.mcreator.supermario.network.SuperMarioModVariables;

public class SuperLeafFlightOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).Super_Leaf_Flight_Active == true) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.35, (entity.getDeltaMovement().z())));
			entity.fallDistance = 0;
		}
		if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).Super_Leaf_Active == true
				&& (entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).Super_Leaf_Flight_Active == false) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (-0.05), (entity.getDeltaMovement().z())));
			entity.fallDistance = 0;
		}
	}
}
