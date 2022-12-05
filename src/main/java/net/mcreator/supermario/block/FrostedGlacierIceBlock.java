
package net.mcreator.supermario.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class FrostedGlacierIceBlock extends Block {

	public FrostedGlacierIceBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.GLASS).strength(2.3499999999999996f, 9.5f).friction(1f).speedFactor(0.9f)
				.jumpFactor(1.1f));

	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

}
