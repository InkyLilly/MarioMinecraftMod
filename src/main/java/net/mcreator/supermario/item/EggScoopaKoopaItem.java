
package net.mcreator.supermario.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.supermario.procedures.EggScoopaKoopaPlayerFinishesUsingItemProcedure;
import net.mcreator.supermario.init.SuperMarioModTabs;

public class EggScoopaKoopaItem extends Item {
	public EggScoopaKoopaItem() {
		super(new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ITEMS).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(-3).saturationMod(-0.4f)

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EggScoopaKoopaPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
