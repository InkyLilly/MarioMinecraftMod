
package net.mcreator.supermario.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class SodaJungleGhostDirtStairsBlock extends StairBlock {

	public SodaJungleGhostDirtStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(),
				BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.GRAVEL).strength(0.95f, 7f).dynamicShape());

	}

	@Override
	public float getExplosionResistance() {
		return 7f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState p_56947_) {
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

}
