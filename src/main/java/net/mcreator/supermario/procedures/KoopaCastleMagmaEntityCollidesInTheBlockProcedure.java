package net.mcreator.supermario.procedures;

import net.minecraft.world.entity.Entity;

public class KoopaCastleMagmaEntityCollidesInTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
	}
}
