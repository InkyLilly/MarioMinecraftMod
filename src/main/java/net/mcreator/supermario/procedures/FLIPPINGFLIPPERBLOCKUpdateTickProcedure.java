package net.mcreator.supermario.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.supermario.init.SuperMarioModBlocks;

import java.util.Map;

public class FLIPPINGFLIPPERBLOCKUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		class FLIPPINGFLIPPERBLOCKUpdateTickWait1 {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				this.world = world;
				MinecraftForge.EVENT_BUS.register(FLIPPINGFLIPPERBLOCKUpdateTickWait1.this);
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					FLIPPINGFLIPPERBLOCKUpdateTickWait1.this.ticks += 1;
					if (FLIPPINGFLIPPERBLOCKUpdateTickWait1.this.ticks >= FLIPPINGFLIPPERBLOCKUpdateTickWait1.this.waitTicks)
						run();
				}
			}

			private void run() {
				MinecraftForge.EVENT_BUS.unregister(FLIPPINGFLIPPERBLOCKUpdateTickWait1.this);
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = SuperMarioModBlocks.FLIP_BLOCK.get().defaultBlockState();
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
		new FLIPPINGFLIPPERBLOCKUpdateTickWait1().start(world, 80);
	}
}
