
package net.mcreator.supermario.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class PastaSauceItem extends Item {

	public PastaSauceItem() {
		super(new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}

}
