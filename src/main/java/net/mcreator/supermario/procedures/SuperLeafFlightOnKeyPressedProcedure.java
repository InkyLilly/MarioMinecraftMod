package net.mcreator.supermario.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import net.mcreator.supermario.network.SuperMarioModVariables;

public class SuperLeafFlightOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getBlockState(new BlockPos(x, y - 1, z)).canOcclude()) {
			if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).Super_Leaf_Flight_Active == true) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.35, (entity.getDeltaMovement().z())));
				entity.fallDistance = 0;
			}
		}
		if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).Super_Leaf_Active == true
				&& (entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).Super_Leaf_Flight_Active == false) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (-0.05), (entity.getDeltaMovement().z())));
			entity.fallDistance = 0;
		}
		if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).Propeller_Mushroom_Active == true) {
			if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).Propeller_Mushroom_Flight_Active == true) {
				if (!world.getBlockState(new BlockPos(x, y - 1, z)).canOcclude()) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 1.5, (entity.getDeltaMovement().z())));
					{
						boolean _setval = false;
						entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Propeller_Mushroom_Flight_Active = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					entity.fallDistance = 0;
					{
						boolean _setval = true;
						entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Propeller_Mushroom_Falling = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 10000000, 0, (false), (false)));
				}
			}
		}
	}
}
