
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
import net.mcreator.supermario.block.entity.BrickBlockBlockEntity;
import net.mcreator.supermario.SuperMarioMod;

public class SuperMarioModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, SuperMarioMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> QUESTION_MARK_BLOCK = register("question_mark_block",
			SuperMarioModBlocks.QUESTION_MARK_BLOCK, QuestionMarkBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BRICK_BLOCK = register("brick_block", SuperMarioModBlocks.BRICK_BLOCK,
			BrickBlockBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
