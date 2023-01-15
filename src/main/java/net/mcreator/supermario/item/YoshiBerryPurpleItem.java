
package net.mcreator.supermario.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.supermario.init.SuperMarioModTabs;

public class YoshiBerryPurpleItem extends Item {
	public YoshiBerryPurpleItem() {
		super(new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ITEMS).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(7).saturationMod(0.7999999999999999f)

						.build()));
	}
}
