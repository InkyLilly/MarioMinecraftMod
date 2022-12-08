
package net.mcreator.supermario.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class NoodlesItem extends Item {

	public NoodlesItem() {
		super(new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ITEMS).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.1f)

						.build()));
	}

}
