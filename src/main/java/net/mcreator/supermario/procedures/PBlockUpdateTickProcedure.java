package net.mcreator.supermario.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.supermario.network.SuperMarioModVariables;
import net.mcreator.supermario.init.SuperMarioModBlocks;

import java.util.Map;
import java.util.ArrayList;

public class PBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (SuperMarioModVariables.MapVariables.get(world).P_Switch_Users_Active == 0) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = SuperMarioModBlocks.P_BLOCK_OUTLINE.get().defaultBlockState();
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
}
