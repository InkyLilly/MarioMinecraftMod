
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.supermario.block.entity.WoodenCrateBlockEntity;
import net.mcreator.supermario.block.entity.UnbreakableBrickBlockBlockEntity;
import net.mcreator.supermario.block.entity.RetroSarasalandQuestionMarkBlockBlockEntity;
import net.mcreator.supermario.block.entity.RetroSarasalandBrickBlockBlockEntity;
import net.mcreator.supermario.block.entity.RedQuestionMarkBlockBlockEntity;
import net.mcreator.supermario.block.entity.QuestionMarkBlockBlockEntity;
import net.mcreator.supermario.block.entity.IronCrateBlockEntity;
import net.mcreator.supermario.block.entity.IronBowserCrateBlockEntity;
import net.mcreator.supermario.block.entity.FlipBlockBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxYoshiBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxYellowToadBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxWarioBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxWaluigiBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxToadetteBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxToadRedBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxToadBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxShyGuyBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxRosalinaBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxRedToadBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxPurpleToadBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxPiranhaPlantBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxPeachBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxNabbitBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxMarioBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxLuigiBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxKoopaBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxKamekBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxGreenToadBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxDryBonesBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxDonkeyKongBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxDaisyBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxBooBlockEntity;
import net.mcreator.supermario.block.entity.BuilderBoxBirdoBlockEntity;
import net.mcreator.supermario.block.entity.BrickBlockRedBlockEntity;
import net.mcreator.supermario.block.entity.BrickBlockPurpleBlockEntity;
import net.mcreator.supermario.block.entity.BrickBlockGreenBlockEntity;
import net.mcreator.supermario.block.entity.BrickBlockGrayBlockEntity;
import net.mcreator.supermario.block.entity.BrickBlockBlueBlockEntity;
import net.mcreator.supermario.block.entity.BrickBlockBlockEntity;
import net.mcreator.supermario.SuperMarioMod;

public class SuperMarioModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, SuperMarioMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> QUESTION_MARK_BLOCK = register("question_mark_block", SuperMarioModBlocks.QUESTION_MARK_BLOCK, QuestionMarkBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BRICK_BLOCK = register("brick_block", SuperMarioModBlocks.BRICK_BLOCK, BrickBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BRICK_BLOCK_BLUE = register("brick_block_blue", SuperMarioModBlocks.BRICK_BLOCK_BLUE, BrickBlockBlueBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BRICK_BLOCK_GREEN = register("brick_block_green", SuperMarioModBlocks.BRICK_BLOCK_GREEN, BrickBlockGreenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BRICK_BLOCK_PURPLE = register("brick_block_purple", SuperMarioModBlocks.BRICK_BLOCK_PURPLE, BrickBlockPurpleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BRICK_BLOCK_RED = register("brick_block_red", SuperMarioModBlocks.BRICK_BLOCK_RED, BrickBlockRedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BRICK_BLOCK_GRAY = register("brick_block_gray", SuperMarioModBlocks.BRICK_BLOCK_GRAY, BrickBlockGrayBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RETRO_SARASALAND_QUESTION_MARK_BLOCK = register("retro_sarasaland_question_mark_block", SuperMarioModBlocks.RETRO_SARASALAND_QUESTION_MARK_BLOCK,
			RetroSarasalandQuestionMarkBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RETRO_SARASALAND_BRICK_BLOCK = register("retro_sarasaland_brick_block", SuperMarioModBlocks.RETRO_SARASALAND_BRICK_BLOCK, RetroSarasalandBrickBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FLIP_BLOCK = register("flip_block", SuperMarioModBlocks.FLIP_BLOCK, FlipBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> IRON_CRATE = register("iron_crate", SuperMarioModBlocks.IRON_CRATE, IronCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> IRON_BOWSER_CRATE = register("iron_bowser_crate", SuperMarioModBlocks.IRON_BOWSER_CRATE, IronBowserCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WOODEN_CRATE = register("wooden_crate", SuperMarioModBlocks.WOODEN_CRATE, WoodenCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_MARIO = register("builder_box_mario", SuperMarioModBlocks.BUILDER_BOX_MARIO, BuilderBoxMarioBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_LUIGI = register("builder_box_luigi", SuperMarioModBlocks.BUILDER_BOX_LUIGI, BuilderBoxLuigiBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_PEACH = register("builder_box_peach", SuperMarioModBlocks.BUILDER_BOX_PEACH, BuilderBoxPeachBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_YOSHI = register("builder_box_yoshi", SuperMarioModBlocks.BUILDER_BOX_YOSHI, BuilderBoxYoshiBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_DAISY = register("builder_box_daisy", SuperMarioModBlocks.BUILDER_BOX_DAISY, BuilderBoxDaisyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_WARIO = register("builder_box_wario", SuperMarioModBlocks.BUILDER_BOX_WARIO, BuilderBoxWarioBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_WALUIGI = register("builder_box_waluigi", SuperMarioModBlocks.BUILDER_BOX_WALUIGI, BuilderBoxWaluigiBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_ROSALINA = register("builder_box_rosalina", SuperMarioModBlocks.BUILDER_BOX_ROSALINA, BuilderBoxRosalinaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_KOOPA = register("builder_box_koopa", SuperMarioModBlocks.BUILDER_BOX_KOOPA, BuilderBoxKoopaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_DRY_BONES = register("builder_box_dry_bones", SuperMarioModBlocks.BUILDER_BOX_DRY_BONES, BuilderBoxDryBonesBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_SHY_GUY = register("builder_box_shy_guy", SuperMarioModBlocks.BUILDER_BOX_SHY_GUY, BuilderBoxShyGuyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_BIRDO = register("builder_box_birdo", SuperMarioModBlocks.BUILDER_BOX_BIRDO, BuilderBoxBirdoBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_DONKEY_KONG = register("builder_box_donkey_kong", SuperMarioModBlocks.BUILDER_BOX_DONKEY_KONG, BuilderBoxDonkeyKongBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_BOO = register("builder_box_boo", SuperMarioModBlocks.BUILDER_BOX_BOO, BuilderBoxBooBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_NABBIT = register("builder_box_nabbit", SuperMarioModBlocks.BUILDER_BOX_NABBIT, BuilderBoxNabbitBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_PIRANHA_PLANT = register("builder_box_piranha_plant", SuperMarioModBlocks.BUILDER_BOX_PIRANHA_PLANT, BuilderBoxPiranhaPlantBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_KAMEK = register("builder_box_kamek", SuperMarioModBlocks.BUILDER_BOX_KAMEK, BuilderBoxKamekBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_RED_TOAD = register("builder_box_red_toad", SuperMarioModBlocks.BUILDER_BOX_RED_TOAD, BuilderBoxRedToadBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_TOAD_RED = register("builder_box_toad_red", SuperMarioModBlocks.BUILDER_BOX_TOAD_RED, BuilderBoxToadRedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_TOAD = register("builder_box_toad", SuperMarioModBlocks.BUILDER_BOX_TOAD, BuilderBoxToadBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_YELLOW_TOAD = register("builder_box_yellow_toad", SuperMarioModBlocks.BUILDER_BOX_YELLOW_TOAD, BuilderBoxYellowToadBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_GREEN_TOAD = register("builder_box_green_toad", SuperMarioModBlocks.BUILDER_BOX_GREEN_TOAD, BuilderBoxGreenToadBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_PURPLE_TOAD = register("builder_box_purple_toad", SuperMarioModBlocks.BUILDER_BOX_PURPLE_TOAD, BuilderBoxPurpleToadBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUILDER_BOX_TOADETTE = register("builder_box_toadette", SuperMarioModBlocks.BUILDER_BOX_TOADETTE, BuilderBoxToadetteBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RED_QUESTION_MARK_BLOCK = register("red_question_mark_block", SuperMarioModBlocks.RED_QUESTION_MARK_BLOCK, RedQuestionMarkBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> UNBREAKABLE_BRICK_BLOCK = register("unbreakable_brick_block", SuperMarioModBlocks.UNBREAKABLE_BRICK_BLOCK, UnbreakableBrickBlockBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
