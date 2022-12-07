
package net.mcreator.supermario.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.supermario.init.SuperMarioModBlocks;

import java.util.List;
import java.util.Collections;

public class BowserStatueBlock extends Block {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public BowserStatueBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.55f, 9.5f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {

		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 0, 0, 16, 3.9999999999999996, 16), box(2, 0, 4, 15, 25.5, 15));
			case NORTH -> Shapes.or(box(0, 0, 0, 16, 3.9999999999999996, 16), box(1, 0, 1, 14, 25.5, 12));
			case EAST -> Shapes.or(box(0, 0, 0, 16, 3.9999999999999996, 16), box(4, 0, 1, 15, 25.5, 14));
			case WEST -> Shapes.or(box(0, 0, 0, 16, 3.9999999999999996, 16), box(1, 0, 2, 12, 25.5, 15));
			case UP -> Shapes.or(box(0, 0, 0, 16, 16, 3.9999999999999996), box(1, 4, 0, 14, 15, 25.5));
			case DOWN -> Shapes.or(box(0, 0, 12.0000000000000004, 16, 16, 16), box(1, 1, -9.5, 14, 12, 16));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(SuperMarioModBlocks.BOWSER_STATUE.get(), renderType -> renderType == RenderType.cutout());
	}
}
