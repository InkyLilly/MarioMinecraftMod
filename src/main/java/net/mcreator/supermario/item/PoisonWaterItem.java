
package net.mcreator.supermario.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.supermario.init.SuperMarioModTabs;
import net.mcreator.supermario.init.SuperMarioModFluids;

public class PoisonWaterItem extends BucketItem {
	public PoisonWaterItem() {
		super(SuperMarioModFluids.POISON_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(SuperMarioModTabs.TAB_MARIO_BLOCKS));
	}
}
