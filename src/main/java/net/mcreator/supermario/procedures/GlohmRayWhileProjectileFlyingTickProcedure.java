package net.mcreator.supermario.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.supermario.init.SuperMarioModParticleTypes;

public class GlohmRayWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (SuperMarioModParticleTypes.GLOHM_PARTICLE.get()), x, y, z, 3, 0, 0, 0, 0);
	}
}
