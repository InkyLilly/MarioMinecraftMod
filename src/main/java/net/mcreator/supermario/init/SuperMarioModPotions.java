
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.supermario.SuperMarioMod;

public class SuperMarioModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, SuperMarioMod.MODID);
	public static final RegistryObject<Potion> GLOHM_POTION = REGISTRY.register("glohm_potion", () -> new Potion(new MobEffectInstance(SuperMarioModMobEffects.GLOHM_EFFECT.get(), 72000, 0, false, false)));
}
