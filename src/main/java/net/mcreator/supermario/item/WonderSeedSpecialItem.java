
package net.mcreator.supermario.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.supermario.init.SuperMarioModTabs;

public class WonderSeedSpecialItem extends Item {
	public WonderSeedSpecialItem() {
		super(new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
