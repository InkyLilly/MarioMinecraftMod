package net.mcreator.supermario.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FireballThrownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).FireBalls_Remaining > 0) {
			{
				double _setval = (entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).FireBalls_Remaining - 1;
				entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FireBalls_Remaining = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).FireBalls_Remaining == 0) {
				{
					double _setval = 25;
					entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FireBall_Cooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			{
				double _setval = 0.55;
				entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FireBall_Power = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = entity.getYRot();
				entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.FireBall_Yaw = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("super_mario:fireball")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("super_mario:fireball")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 2);
			if (world instanceof ServerLevel _level) {
				Entity _entityToSpawn = SuperMarioModEntities.FIREBALL.get().create(_level);
				_entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
				if (_entityToSpawn instanceof Mob _mobToSpawn) {
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(_entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				}
				(_entityToSpawn).getPersistentData().putDouble("fireballxvelocity", ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).FireBall_Power
						* Math.cos(((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).FireBall_Yaw + 90) * (Math.PI / 180))));
				(_entityToSpawn).getPersistentData().putDouble("fireballzvelocity", ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).FireBall_Power
						* Math.sin(((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).FireBall_Yaw + 90) * (Math.PI / 180))));
				_level.addFreshEntity(_entityToSpawn);
			}
		}
	}
}
