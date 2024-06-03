
package net.mcreator.supermario.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.supermario.init.SuperMarioModTabs;

public class N64ControllerYellowItem extends Item {
	public N64ControllerYellowItem() {
		super(new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_DECORATION).stacksTo(1).rarity(Rarity.COMMON));
	}
}
