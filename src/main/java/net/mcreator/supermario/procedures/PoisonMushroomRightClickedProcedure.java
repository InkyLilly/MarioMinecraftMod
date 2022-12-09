package net.mcreator.supermario.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PoisonMushroomRightClickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 5));
		(itemstack).setCount((int) ((itemstack).getCount() - 1));
	}
}
