
package net.mcreator.supermario.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class HammerItem extends Item {

	public HammerItem() {
		super(new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ITEMS).durability(100).rarity(Rarity.COMMON));
	}

	@Override
	public int getEnchantmentValue() {
		return 11;
	}

	@Override
	public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
		if (equipmentSlot == EquipmentSlot.MAINHAND) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			builder.putAll(super.getDefaultAttributeModifiers(equipmentSlot));
			builder.put(Attributes.ATTACK_DAMAGE,
					new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Item modifier", -0.7d, AttributeModifier.Operation.ADDITION));
			builder.put(Attributes.ATTACK_SPEED,
					new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Item modifier", -2.4, AttributeModifier.Operation.ADDITION));
		}
		return super.getDefaultAttributeModifiers(equipmentSlot);
	}

}
