package net.mcreator.supermario.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PMarker6Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new SuperMarioModVariables.PlayerVariables())).PowerUp_Running_Charge >= 120;
	}
}
