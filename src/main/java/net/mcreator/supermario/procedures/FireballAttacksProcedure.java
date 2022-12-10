package net.mcreator.supermario.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FireballAttacksProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
		execute(event, event.getEntityLiving().level, event.getEntityLiving().getX(), event.getEntityLiving().getY(), event.getEntityLiving().getZ(),
				event.getEntityLiving());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof FireballEntity) {
			entity.getPersistentData().putBoolean("FireBallSafe", (true));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(SuperMarioModMobEffects.FIRE_BALL_IMMUNE_EFFECT.get(), 60, 0, (false), (false)));
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((entityiterator.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SuperMarioModVariables.PlayerVariables())).IsFireBall_Immune == false
							|| entityiterator.getPersistentData().getBoolean("FireBallSafe") == false
							|| !(entityiterator instanceof LivingEntity _livEnt
									? _livEnt.hasEffect(SuperMarioModMobEffects.FIRE_BALL_IMMUNE_EFFECT.get())
									: false)) {
						entityiterator.hurt(DamageSource.IN_FIRE, 4);
						entityiterator.setSecondsOnFire(9);
					}
				}
			}
		}
	}
}
