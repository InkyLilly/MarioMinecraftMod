package net.mcreator.supermario.procedures;

import net.minecraft.world.entity.Entity;

public class PlumbingArmorBootsTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.fallDistance = 0;
	}
}
