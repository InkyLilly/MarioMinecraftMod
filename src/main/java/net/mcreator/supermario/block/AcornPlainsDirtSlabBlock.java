
package net.mcreator.supermario.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class AcornPlainsDirtSlabBlock extends SlabBlock {

	public AcornPlainsDirtSlabBlock() {
		super(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.GRAVEL).strength(0.8999999999999999f, 4f));

	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, state.getValue(TYPE) == SlabType.DOUBLE ? 2 : 1));
	}

}
