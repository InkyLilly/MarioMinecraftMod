
package net.mcreator.supermario.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.supermario.init.SuperMarioModTabs;

public class SNESControllerItem extends Item {
	public SNESControllerItem() {
		super(new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_DECORATION).stacksTo(1).rarity(Rarity.COMMON));
	}
}
