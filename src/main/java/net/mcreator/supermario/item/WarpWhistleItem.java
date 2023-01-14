
package net.mcreator.supermario.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.supermario.procedures.WarpWhistleRightclickedProcedure;
import net.mcreator.supermario.procedures.WarpWhistlePlayerFinishesUsingItemProcedure;
import net.mcreator.supermario.init.SuperMarioModTabs;

public class WarpWhistleItem extends Item {
	public WarpWhistleItem() {
		super(new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		WarpWhistleRightclickedProcedure.execute(world, x, y, z);
		return ar;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		WarpWhistlePlayerFinishesUsingItemProcedure.execute();
		return retval;
	}
}
