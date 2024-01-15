
package net.mcreator.supermario.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.supermario.procedures.NoteBlockEntityWalksOnTheBlockProcedure;

import java.util.List;
import java.util.Collections;

public class MushroomTrampolineOrangeBlock extends Block {
	public MushroomTrampolineOrangeBlock() {
		super(BlockBehaviour.Properties.of(Material.DECORATION).sound(SoundType.FUNGUS).strength(0.7999999999999999f, 9f).speedFactor(0.9f).jumpFactor(3f));
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

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		NoteBlockEntityWalksOnTheBlockProcedure.execute(entity);
	}
}
