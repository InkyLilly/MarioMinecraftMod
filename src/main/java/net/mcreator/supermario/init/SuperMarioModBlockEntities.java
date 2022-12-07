
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.supermario.block.entity.QuestionMarkBlockBlockEntity;
import net.mcreator.supermario.block.entity.IronCrateBlockEntity;
import net.mcreator.supermario.block.entity.IronBowserCrateBlockEntity;
import net.mcreator.supermario.block.entity.BrickBlockRedBlockEntity;
import net.mcreator.supermario.block.entity.BrickBlockPurpleBlockEntity;
import net.mcreator.supermario.block.entity.BrickBlockGreenBlockEntity;
import net.mcreator.supermario.block.entity.BrickBlockGrayBlockEntity;
import net.mcreator.supermario.block.entity.BrickBlockBlueBlockEntity;
import net.mcreator.supermario.block.entity.BrickBlockBlockEntity;
import net.mcreator.supermario.SuperMarioMod;

public class SuperMarioModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, SuperMarioMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> QUESTION_MARK_BLOCK = register("question_mark_block",
			SuperMarioModBlocks.QUESTION_MARK_BLOCK, QuestionMarkBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BRICK_BLOCK = register("brick_block", SuperMarioModBlocks.BRICK_BLOCK,
			BrickBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BRICK_BLOCK_BLUE = register("brick_block_blue", SuperMarioModBlocks.BRICK_BLOCK_BLUE,
			BrickBlockBlueBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BRICK_BLOCK_GREEN = register("brick_block_green", SuperMarioModBlocks.BRICK_BLOCK_GREEN,
			BrickBlockGreenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BRICK_BLOCK_PURPLE = register("brick_block_purple", SuperMarioModBlocks.BRICK_BLOCK_PURPLE,
			BrickBlockPurpleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BRICK_BLOCK_RED = register("brick_block_red", SuperMarioModBlocks.BRICK_BLOCK_RED,
			BrickBlockRedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BRICK_BLOCK_GRAY = register("brick_block_gray", SuperMarioModBlocks.BRICK_BLOCK_GRAY,
			BrickBlockGrayBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> IRON_CRATE = register("iron_crate", SuperMarioModBlocks.IRON_CRATE,
			IronCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> IRON_BOWSER_CRATE = register("iron_bowser_crate", SuperMarioModBlocks.IRON_BOWSER_CRATE,
			IronBowserCrateBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
