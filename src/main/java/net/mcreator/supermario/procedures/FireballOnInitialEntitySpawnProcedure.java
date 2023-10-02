package net.mcreator.supermario.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class FireballOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		class FireballOnInitialEntitySpawnWait1 {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				this.world = world;
				MinecraftForge.EVENT_BUS.register(FireballOnInitialEntitySpawnWait1.this);
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					FireballOnInitialEntitySpawnWait1.this.ticks += 1;
					if (FireballOnInitialEntitySpawnWait1.this.ticks >= FireballOnInitialEntitySpawnWait1.this.waitTicks)
						run();
				}
			}

			private void run() {
				MinecraftForge.EVENT_BUS.unregister(FireballOnInitialEntitySpawnWait1.this);
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
		new FireballOnInitialEntitySpawnWait1().start(world, 100);
	}
}
