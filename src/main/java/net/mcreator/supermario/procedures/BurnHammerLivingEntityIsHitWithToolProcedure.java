package net.mcreator.supermario.procedures;

import net.minecraft.world.entity.Entity;

public class BurnHammerLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(30);
	}
}
