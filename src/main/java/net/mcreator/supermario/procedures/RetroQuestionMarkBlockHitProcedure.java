package net.mcreator.supermario.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.supermario.init.SuperMarioModBlocks;

public class RetroQuestionMarkBlockHitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), SuperMarioModBlocks.RETRO_SARASALAND_HIT_BLOCK.get().defaultBlockState(), 3);
	}
}
