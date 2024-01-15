package net.mcreator.supermario.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.supermario.network.SuperMarioModVariables;

public class PSwitchOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).P_Switch_Active == false) {
			{
				double _setval = 260;
				entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.P_Switch_Timer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			SuperMarioModVariables.MapVariables.get(world).P_Switch_Users_Active = SuperMarioModVariables.MapVariables.get(world).P_Switch_Users_Active + 1;
			SuperMarioModVariables.MapVariables.get(world).syncData(world);
			{
				boolean _setval = true;
				entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.P_Switch_Active = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("super_mario:pswitch")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("super_mario:pswitch")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).P_Switch_Active == true) {
			{
				double _setval = 260;
				entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.P_Switch_Timer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("super_mario:pswitch")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("super_mario:pswitch")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
