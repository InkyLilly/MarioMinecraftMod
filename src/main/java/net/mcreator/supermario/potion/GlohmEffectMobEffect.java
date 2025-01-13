
package net.mcreator.supermario.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.supermario.procedures.GlohmEffectOnEffectActiveTickProcedure;

public class GlohmEffectMobEffect extends MobEffect {
	public GlohmEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -65536);
	}

	@Override
	public String getDescriptionId() {
		return "effect.super_mario.glohm_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		GlohmEffectOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
