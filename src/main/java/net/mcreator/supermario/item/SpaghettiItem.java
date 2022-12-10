
package net.mcreator.supermario.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.supermario.init.SuperMarioModTabs;

public class SpaghettiItem extends Item {
	public SpaghettiItem() {
		super(new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ITEMS).stacksTo(64).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(9).saturationMod(0.7f)

						.build()));
	}
}
