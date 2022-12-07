package net.mcreator.supermario.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SledgeHammerProjectileHitsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide()) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(SuperMarioModItems.SLEDGE_HAMMER.get()));
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
