
package net.mcreator.supermario.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LemmyMagicItem extends Item {
	public LemmyMagicItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.EPIC));
	}
}
