
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.supermario.potion.FireBallImmuneEffectMobEffect;
import net.mcreator.supermario.SuperMarioMod;

public class SuperMarioModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SuperMarioMod.MODID);
	public static final RegistryObject<MobEffect> FIRE_BALL_IMMUNE_EFFECT = REGISTRY.register("fire_ball_immune_effect",
			() -> new FireBallImmuneEffectMobEffect());
}
