package net.mcreator.supermario.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.supermario.network.SuperMarioModVariables;

public class PowerUpHealth3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).PowerUp_Health == 3;
	}
}
