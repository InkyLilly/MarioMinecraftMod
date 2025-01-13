package net.mcreator.supermario.procedures;

import net.minecraft.world.entity.Entity;

public class SnaptorPlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		sourceentity.startRiding(entity);
	}
}
