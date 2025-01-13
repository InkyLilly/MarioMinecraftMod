
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.supermario.SuperMarioMod;

public class SuperMarioModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, SuperMarioMod.MODID);
	public static final RegistryObject<ParticleType<?>> GLOHM_PARTICLE = REGISTRY.register("glohm_particle", () -> new SimpleParticleType(false));
}
