
package net.mcreator.supermario.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class SparklingWatersBeachGrassSlabBlock extends SlabBlock {

	public SparklingWatersBeachGrassSlabBlock() {
		super(BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.STONE).strength(0.95f, 8.5f));

	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, state.getValue(TYPE) == SlabType.DOUBLE ? 2 : 1));
	}

}
