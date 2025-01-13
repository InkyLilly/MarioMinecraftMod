package net.mcreator.supermario.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.supermario.init.SuperMarioModMobEffects;

public class AmpberryRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		(itemstack).shrink(1);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(SuperMarioModMobEffects.GLOHM_EFFECT.get());
	}
}
