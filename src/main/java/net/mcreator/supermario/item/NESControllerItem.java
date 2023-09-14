
package net.mcreator.supermario.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.supermario.init.SuperMarioModTabs;

public class NESControllerItem extends Item {
	public NESControllerItem() {
		super(new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_DECORATION).stacksTo(1).rarity(Rarity.COMMON));
	}
}
