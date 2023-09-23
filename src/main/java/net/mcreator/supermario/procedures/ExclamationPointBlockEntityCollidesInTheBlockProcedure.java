package net.mcreator.supermario.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.supermario.init.SuperMarioModBlocks;

import java.util.Map;

public class ExclamationPointBlockEntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _bp = new BlockPos(x, y, z);
			BlockState _bs = Blocks.AIR.defaultBlockState();
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
		world.setBlock(new BlockPos(x, y, z), SuperMarioModBlocks.HIT_BLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z), SuperMarioModBlocks.HIT_BLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 2, z), SuperMarioModBlocks.HIT_BLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 3, z), SuperMarioModBlocks.HIT_BLOCK.get().defaultBlockState(), 3);
		class ExclamationPointBlockEntityCollidesInTheBlockWait9 {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				this.world = world;
				MinecraftForge.EVENT_BUS.register(ExclamationPointBlockEntityCollidesInTheBlockWait9.this);
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					ExclamationPointBlockEntityCollidesInTheBlockWait9.this.ticks += 1;
					if (ExclamationPointBlockEntityCollidesInTheBlockWait9.this.ticks >= ExclamationPointBlockEntityCollidesInTheBlockWait9.this.waitTicks)
						run();
				}
			}

			private void run() {
				MinecraftForge.EVENT_BUS.unregister(ExclamationPointBlockEntityCollidesInTheBlockWait9.this);
				world.setBlock(new BlockPos(x, y, z), SuperMarioModBlocks.EXCLAMATION_POINT_BLOCK.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y + 3, z), Blocks.AIR.defaultBlockState(), 3);
			}
		}
		new ExclamationPointBlockEntityCollidesInTheBlockWait9().start(world, 200);
	}
}
