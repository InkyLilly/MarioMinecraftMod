package net.mcreator.supermario.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.supermario.init.SuperMarioModMobEffects;

public class GlohmRayProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(SuperMarioModMobEffects.GLOHM_EFFECT.get(), 72000, 0, (false), (false)));
	}
}
