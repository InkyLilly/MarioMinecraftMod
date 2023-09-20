package net.mcreator.supermario.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.supermario.init.SuperMarioModMobEffects;
import net.mcreator.supermario.entity.GoldBallEntity;
import net.mcreator.supermario.entity.FireballEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class GoldBallOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("fireballxvelocity")), (entity.getDeltaMovement().y()), (entity.getPersistentData().getDouble("fireballzvelocity"))));
		if (entity.isOnGround()) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.3, (entity.getDeltaMovement().z())));
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if (!(entityiterator instanceof Player || entityiterator instanceof FireballEntity || entityiterator instanceof ItemEntity || entityiterator instanceof GoldBallEntity)) {
						if (entityiterator instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(SuperMarioModMobEffects.GOLD_SNARED.get(), 200, 0, (false), (false)));
						entityiterator.hurt(DamageSource.ON_FIRE, 6);
						if (!entity.level.isClientSide())
							entity.discard();
					}
				}
			}
		}
	}
}
