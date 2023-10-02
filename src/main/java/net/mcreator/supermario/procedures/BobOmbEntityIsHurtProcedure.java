package net.mcreator.supermario.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BobOmbEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		class BobOmbEntityIsHurtWait3 {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				this.world = world;
				MinecraftForge.EVENT_BUS.register(BobOmbEntityIsHurtWait3.this);
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					BobOmbEntityIsHurtWait3.this.ticks += 1;
					if (BobOmbEntityIsHurtWait3.this.ticks >= BobOmbEntityIsHurtWait3.this.waitTicks)
						run();
				}
			}

			private void run() {
				MinecraftForge.EVENT_BUS.unregister(BobOmbEntityIsHurtWait3.this);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.HOSTILE, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.HOSTILE, 1, 1, false);
					}
				}
				class BobOmbEntityIsHurtWait2 {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						this.world = world;
						MinecraftForge.EVENT_BUS.register(BobOmbEntityIsHurtWait2.this);
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							BobOmbEntityIsHurtWait2.this.ticks += 1;
							if (BobOmbEntityIsHurtWait2.this.ticks >= BobOmbEntityIsHurtWait2.this.waitTicks)
								run();
						}
					}

					private void run() {
						MinecraftForge.EVENT_BUS.unregister(BobOmbEntityIsHurtWait2.this);
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.BREAK);
					}
				}
				new BobOmbEntityIsHurtWait2().start(world, 10);
			}
		}
		new BobOmbEntityIsHurtWait3().start(world, 100);
	}
}
