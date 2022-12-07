package net.mcreator.supermario.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.supermario.network.SuperMarioModVariables;

public class InvincibilityLeafRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new SuperMarioModVariables.PlayerVariables())).Invincibility_Leaf_Active == false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			{
				boolean _setval = true;
				entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Invincibility_Leaf_Active = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
