package net.mcreator.supermario.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.supermario.network.SuperMarioModVariables;
import net.mcreator.supermario.init.SuperMarioModBlocks;

import java.util.Map;

public class BlueFilledBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (SuperMarioModVariables.MapVariables.get(world).ON_Block_Active == true) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = SuperMarioModBlocks.BLUE_OUTLINE_BLOCK.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}