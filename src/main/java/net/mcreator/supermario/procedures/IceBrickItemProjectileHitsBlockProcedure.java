package net.mcreator.supermario.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.supermario.init.SuperMarioModBlocks;

public class IceBrickItemProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
			if (world instanceof ServerLevel _level)
				FallingBlockEntity.fall(_level, new BlockPos(x, y + 1, z), SuperMarioModBlocks.ICE_BRICK_BLOCK.get().defaultBlockState());
		}
	}
}
