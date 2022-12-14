
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.supermario.item.YoshiEggYellowItem;
import net.mcreator.supermario.item.YoshiEggWhiteItem;
import net.mcreator.supermario.item.YoshiEggRedItem;
import net.mcreator.supermario.item.YoshiEggPurpleItem;
import net.mcreator.supermario.item.YoshiEggPinkItem;
import net.mcreator.supermario.item.YoshiEggOrangeItem;
import net.mcreator.supermario.item.YoshiEggLightBlueItem;
import net.mcreator.supermario.item.YoshiEggGreenItem;
import net.mcreator.supermario.item.YoshiEggBrownItem;
import net.mcreator.supermario.item.YoshiEggBlueItem;
import net.mcreator.supermario.item.YoshiEggBlackItem;
import net.mcreator.supermario.item.YoshiBerryItem;
import net.mcreator.supermario.item.WendysWandItem;
import net.mcreator.supermario.item.WendyMagicItem;
import net.mcreator.supermario.item.UltraHammerItem;
import net.mcreator.supermario.item.SuperballFlowerItem;
import net.mcreator.supermario.item.SuperStarItem;
import net.mcreator.supermario.item.SuperMushroomItem;
import net.mcreator.supermario.item.SuperLeafItem;
import net.mcreator.supermario.item.SuperHammerItem;
import net.mcreator.supermario.item.SuperBellItem;
import net.mcreator.supermario.item.SuperAcornItem;
import net.mcreator.supermario.item.StarPieceItem;
import net.mcreator.supermario.item.SpringMushroomItem;
import net.mcreator.supermario.item.SpaghettiOsItem;
import net.mcreator.supermario.item.SpaghettiItem;
import net.mcreator.supermario.item.SledgeHammerItem;
import net.mcreator.supermario.item.RoysWandItem;
import net.mcreator.supermario.item.RoyMagicItem;
import net.mcreator.supermario.item.RockMushroomItem;
import net.mcreator.supermario.item.RedPowBlockItem;
import net.mcreator.supermario.item.PropellerMushroomItem;
import net.mcreator.supermario.item.PowBlockItem;
import net.mcreator.supermario.item.PoisonWaterItem;
import net.mcreator.supermario.item.PoisonMushroomItem;
import net.mcreator.supermario.item.PastaSauceItem;
import net.mcreator.supermario.item.PBalloonItem;
import net.mcreator.supermario.item.OneUpMushroomItem;
import net.mcreator.supermario.item.NoodlesItem;
import net.mcreator.supermario.item.MortonsWandItem;
import net.mcreator.supermario.item.MortonMagicItem;
import net.mcreator.supermario.item.MetalHammerItem;
import net.mcreator.supermario.item.MechaKoopaRangedItemItem;
import net.mcreator.supermario.item.MeatballItem;
import net.mcreator.supermario.item.MagikoopaWandItem;
import net.mcreator.supermario.item.LudwigsWandItem;
import net.mcreator.supermario.item.LudwigMagicItem;
import net.mcreator.supermario.item.LifeShroomItem;
import net.mcreator.supermario.item.LemmysWandItem;
import net.mcreator.supermario.item.LemmyMagicItem;
import net.mcreator.supermario.item.LarrysWandItem;
import net.mcreator.supermario.item.LarryMagicItem;
import net.mcreator.supermario.item.KoopaMagicItem;
import net.mcreator.supermario.item.InvincibilityLeafItem;
import net.mcreator.supermario.item.IggysWandItem;
import net.mcreator.supermario.item.IggyMagicItem;
import net.mcreator.supermario.item.IceBrickItemItem;
import net.mcreator.supermario.item.HurlHammerItem;
import net.mcreator.supermario.item.HuckitClawItem;
import net.mcreator.supermario.item.HammerItem;
import net.mcreator.supermario.item.GoombaiconItem;
import net.mcreator.supermario.item.GoldenDashMushroomItem;
import net.mcreator.supermario.item.GoldFlowerItem;
import net.mcreator.supermario.item.GarlicItem;
import net.mcreator.supermario.item.FireFlowerItem;
import net.mcreator.supermario.item.EggScoopaKoopaItem;
import net.mcreator.supermario.item.EekHammerItem;
import net.mcreator.supermario.item.ChillHammerItem;
import net.mcreator.supermario.item.CapeFeatherItem;
import net.mcreator.supermario.item.CakeItem;
import net.mcreator.supermario.item.BurnHammerItem;
import net.mcreator.supermario.item.BooMushroomItem;
import net.mcreator.supermario.item.BeeMushroomItem;
import net.mcreator.supermario.SuperMarioMod;

public class SuperMarioModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SuperMarioMod.MODID);
	public static final RegistryObject<Item> GOOMBA = REGISTRY.register("goomba_spawn_egg", () -> new ForgeSpawnEggItem(SuperMarioModEntities.GOOMBA,
			-3381760, -6724096, new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ENTITIES)));
	public static final RegistryObject<Item> PARA_GOOMBA = REGISTRY.register("para_goomba_spawn_egg",
			() -> new ForgeSpawnEggItem(SuperMarioModEntities.PARA_GOOMBA, -3381760, -13210,
					new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ENTITIES)));
	public static final RegistryObject<Item> BOB_OMB = REGISTRY.register("bob_omb_spawn_egg",
			() -> new ForgeSpawnEggItem(SuperMarioModEntities.BOB_OMB, -16764007, -16763905,
					new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ENTITIES)));
	public static final RegistryObject<Item> BOO = REGISTRY.register("boo_spawn_egg",
			() -> new ForgeSpawnEggItem(SuperMarioModEntities.BOO, -1, -3355393, new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ENTITIES)));
	public static final RegistryObject<Item> STRETCH_BOO = REGISTRY.register("stretch_boo_spawn_egg",
			() -> new ForgeSpawnEggItem(SuperMarioModEntities.STRETCH_BOO, -1, -3355393,
					new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ENTITIES)));
	public static final RegistryObject<Item> COOLIGAN = REGISTRY.register("cooligan_spawn_egg",
			() -> new ForgeSpawnEggItem(SuperMarioModEntities.COOLIGAN, -16776961, -1,
					new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ENTITIES)));
	public static final RegistryObject<Item> HUCKIT_CRAB = REGISTRY.register("huckit_crab_spawn_egg",
			() -> new ForgeSpawnEggItem(SuperMarioModEntities.HUCKIT_CRAB, -52429, -39322,
					new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ENTITIES)));
	public static final RegistryObject<Item> HUCKIT_CLAW = REGISTRY.register("huckit_claw", () -> new HuckitClawItem());
	public static final RegistryObject<Item> FUZZY = REGISTRY.register("fuzzy_spawn_egg", () -> new ForgeSpawnEggItem(SuperMarioModEntities.FUZZY,
			-16777216, -6710887, new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ENTITIES)));
	public static final RegistryObject<Item> BULLET_BILL = REGISTRY.register("bullet_bill_spawn_egg",
			() -> new ForgeSpawnEggItem(SuperMarioModEntities.BULLET_BILL, -16777216, -16777216,
					new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ENTITIES)));
	public static final RegistryObject<Item> MECHA_KOOPA = REGISTRY.register("mecha_koopa_spawn_egg",
			() -> new ForgeSpawnEggItem(SuperMarioModEntities.MECHA_KOOPA, -13395712, -256,
					new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ENTITIES)));
	public static final RegistryObject<Item> MECHA_KOOPA_RANGED_ITEM = REGISTRY.register("mecha_koopa_ranged_item",
			() -> new MechaKoopaRangedItemItem());
	public static final RegistryObject<Item> MUSHSTONE = block(SuperMarioModBlocks.MUSHSTONE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHSTONE_STAIRS = block(SuperMarioModBlocks.MUSHSTONE_STAIRS, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHSTONE_SLAB = block(SuperMarioModBlocks.MUSHSTONE_SLAB, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHSTONE_BLUE = block(SuperMarioModBlocks.MUSHSTONE_BLUE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHSTONE_BLUE_STAIRS = block(SuperMarioModBlocks.MUSHSTONE_BLUE_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHSTONE_BLUE_SLAB = block(SuperMarioModBlocks.MUSHSTONE_BLUE_SLAB, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_OCEAN_STONE = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_OCEAN_STONE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> CORAL = block(SuperMarioModBlocks.CORAL, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> QUESTION_MARK_BLOCK = block(SuperMarioModBlocks.QUESTION_MARK_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BRICK_BLOCK = block(SuperMarioModBlocks.BRICK_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BRICK_BLOCK_STAIRS = block(SuperMarioModBlocks.BRICK_BLOCK_STAIRS, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BRICK_BLOCK_SLAB = block(SuperMarioModBlocks.BRICK_BLOCK_SLAB, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BRICK_BLOCK_BLUE = block(SuperMarioModBlocks.BRICK_BLOCK_BLUE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BRICK_BLOCK_GREEN = block(SuperMarioModBlocks.BRICK_BLOCK_GREEN, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BRICK_BLOCK_PURPLE = block(SuperMarioModBlocks.BRICK_BLOCK_PURPLE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BRICK_BLOCK_RED = block(SuperMarioModBlocks.BRICK_BLOCK_RED, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BRICK_BLOCK_GRAY = block(SuperMarioModBlocks.BRICK_BLOCK_GRAY, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> HIT_BLOCK = block(SuperMarioModBlocks.HIT_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHSTONE_HARD_BLOCK = block(SuperMarioModBlocks.MUSHSTONE_HARD_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_TREE_LOG = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_TREE_LOG,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_TREE_LEAVES = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_TREE_LEAVES,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_SNOWY_TREE_LEAVES = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_SNOWY_TREE_LEAVES,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> STONE_CASTLE_BRICKS = block(SuperMarioModBlocks.STONE_CASTLE_BRICKS, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> CASTLE_BRIDGE = block(SuperMarioModBlocks.CASTLE_BRIDGE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MINI_PIPE = block(SuperMarioModBlocks.MINI_PIPE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MINI_PIPE_TOP = block(SuperMarioModBlocks.MINI_PIPE_TOP, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MINI_PIPE_BLUE = block(SuperMarioModBlocks.MINI_PIPE_BLUE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MINI_PIPE_TOP_BLUE = block(SuperMarioModBlocks.MINI_PIPE_TOP_BLUE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MINI_PIPE_YELLOW = block(SuperMarioModBlocks.MINI_PIPE_YELLOW, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MINI_PIPE_TOP_YELLOW = block(SuperMarioModBlocks.MINI_PIPE_TOP_YELLOW,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MINI_PIPE_RED = block(SuperMarioModBlocks.MINI_PIPE_RED, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MINI_PIPE_TOP_RED = block(SuperMarioModBlocks.MINI_PIPE_TOP_RED, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MINI_PIPE_ORANGE = block(SuperMarioModBlocks.MINI_PIPE_ORANGE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MINI_PIPE_TOP_ORANGE = block(SuperMarioModBlocks.MINI_PIPE_TOP_ORANGE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MINI_PIPE_SILVER = block(SuperMarioModBlocks.MINI_PIPE_SILVER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MINI_PIPE_TOP_SILVER = block(SuperMarioModBlocks.MINI_PIPE_TOP_SILVER,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BLUE_IRON_BLOCK = block(SuperMarioModBlocks.BLUE_IRON_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_ROAD = block(SuperMarioModBlocks.MUSHROOM_WORLD_ROAD, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_ROAD_STAIRS = block(SuperMarioModBlocks.MUSHROOM_WORLD_ROAD_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_ROAD_SLAB = block(SuperMarioModBlocks.MUSHROOM_WORLD_ROAD_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_SNOWY_ROAD = block(SuperMarioModBlocks.MUSHROOM_WORLD_SNOWY_ROAD,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_GROUND = block(SuperMarioModBlocks.MUSHROOM_WORLD_GROUND,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_GROUND_STAIRS = block(SuperMarioModBlocks.MUSHROOM_WORLD_GROUND_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_GROUND_SLAB = block(SuperMarioModBlocks.MUSHROOM_WORLD_GROUND_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_HARD_BLOCK = block(SuperMarioModBlocks.MUSHROOM_WORLD_HARD_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_BLUE_HARD_BLOCK = block(SuperMarioModBlocks.MUSHROOM_WORLD_BLUE_HARD_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_GRAY_HARD_BLOCK = block(SuperMarioModBlocks.MUSHROOM_WORLD_GRAY_HARD_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_GRASS = block(SuperMarioModBlocks.MUSHROOM_WORLD_GRASS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_GRASS_STAIRS = block(SuperMarioModBlocks.MUSHROOM_WORLD_GRASS_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_GRASS_SLAB = block(SuperMarioModBlocks.MUSHROOM_WORLD_GRASS_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_SAND = block(SuperMarioModBlocks.MUSHROOM_WORLD_SAND, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_SAND_STAIRS = block(SuperMarioModBlocks.MUSHROOM_WORLD_SAND_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_SAND_SLAB = block(SuperMarioModBlocks.MUSHROOM_WORLD_SAND_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_PILLAR_PURPLE = block(SuperMarioModBlocks.MUSHROOM_WORLD_PILLAR_PURPLE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_PILLAR_CORNER_PURPLE = block(SuperMarioModBlocks.MUSHROOM_WORLD_PILLAR_CORNER_PURPLE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_STONE_BLOCK = block(SuperMarioModBlocks.MUSHROOM_WORLD_STONE_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_STONE_STAIRS = block(SuperMarioModBlocks.MUSHROOM_WORLD_STONE_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_STONE_SLAB = block(SuperMarioModBlocks.MUSHROOM_WORLD_STONE_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_SNOWY_STONE_BLOCK = block(SuperMarioModBlocks.MUSHROOM_WORLD_SNOWY_STONE_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_SNOWY_STONE_STAIRS = block(SuperMarioModBlocks.MUSHROOM_WORLD_SNOWY_STONE_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_SNOWY_STONE_SLAB = block(SuperMarioModBlocks.MUSHROOM_WORLD_SNOWY_STONE_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_GREEN_STONE_BLOCK = block(SuperMarioModBlocks.MUSHROOM_WORLD_GREEN_STONE_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_GREEN_STONE_STAIRS = block(SuperMarioModBlocks.MUSHROOM_WORLD_GREEN_STONE_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_GREEN_STONE_SLAB = block(SuperMarioModBlocks.MUSHROOM_WORLD_GREEN_STONE_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_RED_STONE_BLOCK = block(SuperMarioModBlocks.MUSHROOM_WORLD_RED_STONE_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_RED_STONE_STAIRS = block(SuperMarioModBlocks.MUSHROOM_WORLD_RED_STONE_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_RED_STONE_SLAB = block(SuperMarioModBlocks.MUSHROOM_WORLD_RED_STONE_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_UNDERWATER_BLOCK = block(SuperMarioModBlocks.MUSHROOM_WORLD_UNDERWATER_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_UNDERWATER_STONE = block(SuperMarioModBlocks.MUSHROOM_WORLD_UNDERWATER_STONE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_UNDERWATER_RING_PINK = block(SuperMarioModBlocks.MUSHROOM_WORLD_UNDERWATER_RING_PINK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_UNDERWATER_RING_WHITE = block(SuperMarioModBlocks.MUSHROOM_WORLD_UNDERWATER_RING_WHITE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> NOTE_BLOCK = block(SuperMarioModBlocks.NOTE_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_PILLAR_BLUE = block(SuperMarioModBlocks.MUSHROOM_WORLD_PILLAR_BLUE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_PILLAR_CORNER_BLUE = block(SuperMarioModBlocks.MUSHROOM_WORLD_PILLAR_CORNER_BLUE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> CASTLE_BLOCK = block(SuperMarioModBlocks.CASTLE_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BLUE_CASTLE_BLOCK = block(SuperMarioModBlocks.BLUE_CASTLE_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> CASTLE_TILE_BLACK = block(SuperMarioModBlocks.CASTLE_TILE_BLACK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> CASTLE_TILE_WHITE = block(SuperMarioModBlocks.CASTLE_TILE_WHITE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> CASTLE_BACKGROUND_WALL = block(SuperMarioModBlocks.CASTLE_BACKGROUND_WALL,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> CASTLE_PILLAR = block(SuperMarioModBlocks.CASTLE_PILLAR, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> CASTLE_BRICK = block(SuperMarioModBlocks.CASTLE_BRICK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> CLOUD_BLOCK = block(SuperMarioModBlocks.CLOUD_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> RAINY_CLOUD_BLOCK = block(SuperMarioModBlocks.RAINY_CLOUD_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_GRASS = block(SuperMarioModBlocks.DINOSAUR_LAND_GRASS, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_GRASS_STAIRS = block(SuperMarioModBlocks.DINOSAUR_LAND_GRASS_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_GRASS_SLAB = block(SuperMarioModBlocks.DINOSAUR_LAND_GRASS_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_DIRT = block(SuperMarioModBlocks.DINOSAUR_LAND_DIRT, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_DIRT_STAIRS = block(SuperMarioModBlocks.DINOSAUR_LAND_DIRT_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_DIRT_SLAB = block(SuperMarioModBlocks.DINOSAUR_LAND_DIRT_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_FOREST_GRASS = block(SuperMarioModBlocks.DINOSAUR_LAND_FOREST_GRASS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_FOREST_GRASS_STAIRS = block(SuperMarioModBlocks.DINOSAUR_LAND_FOREST_GRASS_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_FOREST_GRASS_SLAB = block(SuperMarioModBlocks.DINOSAUR_LAND_FOREST_GRASS_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_FOREST_DIRT = block(SuperMarioModBlocks.DINOSAUR_LAND_FOREST_DIRT,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_FOREST_DIRT_STAIRS = block(SuperMarioModBlocks.DINOSAUR_LAND_FOREST_DIRT_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_FOREST_DIRT_SLAB = block(SuperMarioModBlocks.DINOSAUR_LAND_FOREST_DIRT_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_CHOCOLATE_GRASS = block(SuperMarioModBlocks.DINOSAUR_LAND_CHOCOLATE_GRASS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_CHOCOLATE_GRASS_STAIRS = block(SuperMarioModBlocks.DINOSAUR_LAND_CHOCOLATE_GRASS_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_CHOCOLATE_GRASS_SLAB = block(SuperMarioModBlocks.DINOSAUR_LAND_CHOCOLATE_GRASS_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_CHOCOLATE_DIRT = block(SuperMarioModBlocks.DINOSAUR_LAND_CHOCOLATE_DIRT,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_CHOCOLATE_DIRT_STAIRS = block(SuperMarioModBlocks.DINOSAUR_LAND_CHOCOLATE_DIRT_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_CHOCOLATE_DIRT_SLAB = block(SuperMarioModBlocks.DINOSAUR_LAND_CHOCOLATE_DIRT_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_TREE = block(SuperMarioModBlocks.DINOSAUR_LAND_TREE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_LEAVES = block(SuperMarioModBlocks.DINOSAUR_LAND_LEAVES,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> LOG_BRIDGE = block(SuperMarioModBlocks.LOG_BRIDGE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_UNDERGROUND_STONE_GRAY = block(SuperMarioModBlocks.DINOSAUR_LAND_UNDERGROUND_STONE_GRAY,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_UNDERGROUND_ROAD_GRAY = block(SuperMarioModBlocks.DINOSAUR_LAND_UNDERGROUND_ROAD_GRAY,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_UNDERGROUND_STONE_LAVENDER = block(
			SuperMarioModBlocks.DINOSAUR_LAND_UNDERGROUND_STONE_LAVENDER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_UNDERGROUND_ROAD_LAVENDER = block(
			SuperMarioModBlocks.DINOSAUR_LAND_UNDERGROUND_ROAD_LAVENDER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_UNDERGROUND_STONE_GREEN = block(SuperMarioModBlocks.DINOSAUR_LAND_UNDERGROUND_STONE_GREEN,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_UNDERGROUND_ROAD_GREEN = block(SuperMarioModBlocks.DINOSAUR_LAND_UNDERGROUND_ROAD_GREEN,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_UNDERGROUND_STONE_YELLOW = block(
			SuperMarioModBlocks.DINOSAUR_LAND_UNDERGROUND_STONE_YELLOW, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_UNDERGROUND_ROAD_YELLOW = block(SuperMarioModBlocks.DINOSAUR_LAND_UNDERGROUND_ROAD_YELLOW,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_UNDERGROUND_STONE_BROWN = block(SuperMarioModBlocks.DINOSAUR_LAND_UNDERGROUND_STONE_BROWN,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_UNDERGROUND_ROAD_BROWN = block(SuperMarioModBlocks.DINOSAUR_LAND_UNDERGROUND_ROAD_BROWN,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_GHOST_HOUSE_ROAD = block(SuperMarioModBlocks.DINOSAUR_LAND_GHOST_HOUSE_ROAD,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_GHOST_HOUSE_BLOCK = block(SuperMarioModBlocks.DINOSAUR_LAND_GHOST_HOUSE_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_GHOST_HOUSE_PILLAR = block(SuperMarioModBlocks.DINOSAUR_LAND_GHOST_HOUSE_PILLAR,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_GHOST_HOUSE_BRICKS = block(SuperMarioModBlocks.DINOSAUR_LAND_GHOST_HOUSE_BRICKS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_CASTLE_STONE = block(SuperMarioModBlocks.DINOSAUR_LAND_CASTLE_STONE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_CASTLE_ROAD = block(SuperMarioModBlocks.DINOSAUR_LAND_CASTLE_ROAD,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_CASTLE_BLOCK = block(SuperMarioModBlocks.DINOSAUR_LAND_CASTLE_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_CASTLE_STONE_BLUE = block(SuperMarioModBlocks.DINOSAUR_LAND_CASTLE_STONE_BLUE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_CASTLE_ROAD_BLUE = block(SuperMarioModBlocks.DINOSAUR_LAND_CASTLE_ROAD_BLUE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_CASTLE_BLOCK_BLUE = block(SuperMarioModBlocks.DINOSAUR_LAND_CASTLE_BLOCK_BLUE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_CASTLE_STONE_CHOCO = block(SuperMarioModBlocks.DINOSAUR_LAND_CASTLE_STONE_CHOCO,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_CASTLE_ROAD_CHOCO = block(SuperMarioModBlocks.DINOSAUR_LAND_CASTLE_ROAD_CHOCO,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SWITCH_PALACE_BLOCK = block(SuperMarioModBlocks.SWITCH_PALACE_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> AIRSHIP_LOG_YELLOW = block(SuperMarioModBlocks.AIRSHIP_LOG_YELLOW, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> AIRSHIP_WINDOW_YELLOW = block(SuperMarioModBlocks.AIRSHIP_WINDOW_YELLOW,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> AIRSHIP_FENCE_YELLOW = block(SuperMarioModBlocks.AIRSHIP_FENCE_YELLOW,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> AIRSHIP_LOG_BROWN = block(SuperMarioModBlocks.AIRSHIP_LOG_BROWN, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> AIRSHIP_WINDOW_BROWN = block(SuperMarioModBlocks.AIRSHIP_WINDOW_BROWN,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> AIRSHIP_FENCE_BROWN = block(SuperMarioModBlocks.AIRSHIP_FENCE_BROWN, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> AIRSHIP_LOG_LIGHT_BLUE = block(SuperMarioModBlocks.AIRSHIP_LOG_LIGHT_BLUE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> AIRSHIP_WINDOW_LIGHT_BLUE = block(SuperMarioModBlocks.AIRSHIP_WINDOW_LIGHT_BLUE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> AIRSHIP_FENCE_LIGHT_BLUE = block(SuperMarioModBlocks.AIRSHIP_FENCE_LIGHT_BLUE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> AIRSHIP_LOG_BLUE = block(SuperMarioModBlocks.AIRSHIP_LOG_BLUE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> AIRSHIP_WINDOW_BLUE = block(SuperMarioModBlocks.AIRSHIP_WINDOW_BLUE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> AIRSHIP_FENCE_BLUE = block(SuperMarioModBlocks.AIRSHIP_FENCE_BLUE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> AIRSHIP_LOG_GREEN = block(SuperMarioModBlocks.AIRSHIP_LOG_GREEN, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> AIRSHIP_WINDOW_GREEN = block(SuperMarioModBlocks.AIRSHIP_WINDOW_GREEN,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> AIRSHIP_FENCE_GREEN = block(SuperMarioModBlocks.AIRSHIP_FENCE_GREEN, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> ACORN_PLAINS_GRASS = block(SuperMarioModBlocks.ACORN_PLAINS_GRASS, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> ACORN_PLAINS_GRASS_STAIRS = block(SuperMarioModBlocks.ACORN_PLAINS_GRASS_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> ACORN_PLAINS_GRASS_SLAB = block(SuperMarioModBlocks.ACORN_PLAINS_GRASS_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> ACORN_PLAINS_DIRT = block(SuperMarioModBlocks.ACORN_PLAINS_DIRT, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> ACORN_PLAINS_DIRT_STAIRS = block(SuperMarioModBlocks.ACORN_PLAINS_DIRT_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> ACORN_PLAINS_DIRT_SLAB = block(SuperMarioModBlocks.ACORN_PLAINS_DIRT_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> ACORN_PLAINS_STONE = block(SuperMarioModBlocks.ACORN_PLAINS_STONE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> ACORN_WOOD_DOOR = doubleBlock(SuperMarioModBlocks.ACORN_WOOD_DOOR, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> ACORN_TREE_LOG = block(SuperMarioModBlocks.ACORN_TREE_LOG, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_LEAVES = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_LEAVES,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CAVE_ROAD = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CAVE_ROAD,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CAVE_ROAD_STAIRS = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CAVE_ROAD_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CAVE_ROAD_SLAB = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CAVE_ROAD_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CAVE_STONE = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CAVE_STONE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CAVE_STONE_STAIRS = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CAVE_STONE_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CAVE_STONE_SLAB = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CAVE_STONE_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CRYSTAL_PINK = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CRYSTAL_PINK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CRYSTAL_PURPLE = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CRYSTAL_PURPLE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CRYSTAL_BLUE = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CRYSTAL_BLUE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CRYSTAL_GREEN = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CRYSTAL_GREEN,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_STEM = block(SuperMarioModBlocks.MUSHROOM_STEM, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_STEM_PINK = block(SuperMarioModBlocks.MUSHROOM_STEM_PINK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_STEM_BLUE = block(SuperMarioModBlocks.MUSHROOM_STEM_BLUE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_CAP_PINK = block(SuperMarioModBlocks.MUSHROOM_CAP_PINK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_CAP_TEAL = block(SuperMarioModBlocks.MUSHROOM_CAP_TEAL, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_CAP_RED = block(SuperMarioModBlocks.MUSHROOM_CAP_RED, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_CAP_GREEN = block(SuperMarioModBlocks.MUSHROOM_CAP_GREEN, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_CAP_YELLOW = block(SuperMarioModBlocks.MUSHROOM_CAP_YELLOW, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_CAP_BLUE = block(SuperMarioModBlocks.MUSHROOM_CAP_BLUE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_CAP_ORANGE = block(SuperMarioModBlocks.MUSHROOM_CAP_ORANGE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_CAP_PURPLE = block(SuperMarioModBlocks.MUSHROOM_CAP_PURPLE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> LAYER_CAKE_DESERT_ROAD = block(SuperMarioModBlocks.LAYER_CAKE_DESERT_ROAD,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> LAYER_CAKE_DESERT_ROAD_STAIRS = block(SuperMarioModBlocks.LAYER_CAKE_DESERT_ROAD_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> LAYER_CAKE_DESERT_ROAD_SLAB = block(SuperMarioModBlocks.LAYER_CAKE_DESERT_ROAD_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> LAYER_CAKE_DESERT_SAND = block(SuperMarioModBlocks.LAYER_CAKE_DESERT_SAND,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> LAYER_CAKE_DESERT_SAND_STAIRS = block(SuperMarioModBlocks.LAYER_CAKE_DESERT_SAND_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> LAYER_CAKE_DESERT_SAND_SLAB = block(SuperMarioModBlocks.LAYER_CAKE_DESERT_SAND_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> LAYER_CAKE_DESERT_SAND_DECORATIVE = block(SuperMarioModBlocks.LAYER_CAKE_DESERT_SAND_DECORATIVE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> LAYER_CAKE_DESERT_THICK_SAND = block(SuperMarioModBlocks.LAYER_CAKE_DESERT_THICK_SAND,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> LAYER_CAKE_DESERT_QUICKSAND = block(SuperMarioModBlocks.LAYER_CAKE_DESERT_QUICKSAND,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> LAYER_CAKE_DESERT_STONE = block(SuperMarioModBlocks.LAYER_CAKE_DESERT_STONE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> LAYER_CAKE_DESERT_STONE_PILLAR = block(SuperMarioModBlocks.LAYER_CAKE_DESERT_STONE_PILLAR,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> LAYER_CAKE_DESERT_STONE_EYE_PILLAR = block(SuperMarioModBlocks.LAYER_CAKE_DESERT_STONE_EYE_PILLAR,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SPARKLING_WATERS_BEACH_GRASS = block(SuperMarioModBlocks.SPARKLING_WATERS_BEACH_GRASS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SPARKLING_WATERS_BEACH_GRASS_STAIRS = block(SuperMarioModBlocks.SPARKLING_WATERS_BEACH_GRASS_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SPARKLING_WATERS_BEACH_GRASS_SLAB = block(SuperMarioModBlocks.SPARKLING_WATERS_BEACH_GRASS_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SPARKLING_WATERS_BEACH_STONE = block(SuperMarioModBlocks.SPARKLING_WATERS_BEACH_STONE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SPARKLING_WATERS_BEACH_STONE_STAIRS = block(SuperMarioModBlocks.SPARKLING_WATERS_BEACH_STONE_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SPARKLING_WATERS_BEACH_STONE_SLAB = block(SuperMarioModBlocks.SPARKLING_WATERS_BEACH_STONE_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SPARKLING_WATERS_ROAD = block(SuperMarioModBlocks.SPARKLING_WATERS_ROAD,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SPARKLING_WATERS_ROAD_STAIRS = block(SuperMarioModBlocks.SPARKLING_WATERS_ROAD_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SPARKLING_WATERS_ROAD_SLAB = block(SuperMarioModBlocks.SPARKLING_WATERS_ROAD_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SPARKLING_WATERS_STONE = block(SuperMarioModBlocks.SPARKLING_WATERS_STONE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SPARKLING_WATERS_STONE_STAIRS = block(SuperMarioModBlocks.SPARKLING_WATERS_STONE_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SPARKLING_WATERS_STONE_SLAB = block(SuperMarioModBlocks.SPARKLING_WATERS_STONE_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_SNOWY_DIRT = block(SuperMarioModBlocks.FROSTED_GLACIER_SNOWY_DIRT,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_SNOWY_DIRT_STAIRS = block(SuperMarioModBlocks.FROSTED_GLACIER_SNOWY_DIRT_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_SNOWY_DIRT_SLAB = block(SuperMarioModBlocks.FROSTED_GLACIER_SNOWY_DIRT_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_DIRT = block(SuperMarioModBlocks.FROSTED_GLACIER_DIRT,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_DIRT_STAIRS = block(SuperMarioModBlocks.FROSTED_GLACIER_DIRT_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTER_GLACIER_DIRT_SLAB = block(SuperMarioModBlocks.FROSTER_GLACIER_DIRT_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_SNOWY_ICE = block(SuperMarioModBlocks.FROSTED_GLACIER_SNOWY_ICE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_ICE = block(SuperMarioModBlocks.FROSTED_GLACIER_ICE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_LOG = block(SuperMarioModBlocks.FROSTED_GLACIER_LOG, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_LEAVES = block(SuperMarioModBlocks.FROSTED_GLACIER_LEAVES,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SODA_JUNGLE_GRASS = block(SuperMarioModBlocks.SODA_JUNGLE_GRASS, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SODA_JUNGLE_GRASS_STAIRS = block(SuperMarioModBlocks.SODA_JUNGLE_GRASS_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SODA_JUNGLE_GRASS_SLAB = block(SuperMarioModBlocks.SODA_JUNGLE_GRASS_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SODA_JUNGLE_DIRT = block(SuperMarioModBlocks.SODA_JUNGLE_DIRT, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SODA_JUNGLE_DIRT_STAIRS = block(SuperMarioModBlocks.SODA_JUNGLE_DIRT_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SODA_JUNGLE_DIRT_SLAB = block(SuperMarioModBlocks.SODA_JUNGLE_DIRT_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SODA_JUNGLE_GHOST_GRASS = block(SuperMarioModBlocks.SODA_JUNGLE_GHOST_GRASS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SODA_JUNGLE_GHOST_GRASS_STAIRS = block(SuperMarioModBlocks.SODA_JUNGLE_GHOST_GRASS_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SODA_JUNGLE_GHOST_GRASS_SLAB = block(SuperMarioModBlocks.SODA_JUNGLE_GHOST_GRASS_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SODA_JUNGLE_GHOST_DIRT = block(SuperMarioModBlocks.SODA_JUNGLE_GHOST_DIRT,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SODA_JUNGLE_GHOST_DIRT_STAIRS = block(SuperMarioModBlocks.SODA_JUNGLE_GHOST_DIRT_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SODA_JUNGLE_GHOST_DIRT_SLAB = block(SuperMarioModBlocks.SODA_JUNGLE_GHOST_DIRT_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> POISON_WATER_BUCKET = REGISTRY.register("poison_water_bucket", () -> new PoisonWaterItem());
	public static final RegistryObject<Item> ROCK_CANDY_MINES_STONE_WHITE = block(SuperMarioModBlocks.ROCK_CANDY_MINES_STONE_WHITE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> ROCK_CANDY_MINES_STONE_GREEN = block(SuperMarioModBlocks.ROCK_CANDY_MINES_STONE_GREEN,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> ROCK_CANDY_MINES_STONE_BLUE = block(SuperMarioModBlocks.ROCK_CANDY_MINES_STONE_BLUE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> ROCK_CANDY_MINES_STONE_RED = block(SuperMarioModBlocks.ROCK_CANDY_MINES_STONE_RED,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MERINGUE_CLOUDS_GRASS = block(SuperMarioModBlocks.MERINGUE_CLOUDS_GRASS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MERINGUE_CLOUDS_GRASS_STAIRS = block(SuperMarioModBlocks.MERINGUE_CLOUDS_GRASS_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MERINGUE_CLOUDS_GRASS_SLAB = block(SuperMarioModBlocks.MERINGUE_CLOUDS_GRASS_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MERINGUE_CLOUDS_STONE = block(SuperMarioModBlocks.MERINGUE_CLOUDS_STONE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MERINGUE_CLOUDS_STONE_STAIRS = block(SuperMarioModBlocks.MERINGUE_CLOUDS_STONE_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MERINGUE_CLOUDS_SLAB = block(SuperMarioModBlocks.MERINGUE_CLOUDS_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FLUFFY_CLOUD_BLOCK = block(SuperMarioModBlocks.FLUFFY_CLOUD_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FLUFFY_CLOUD_BLOCK_BLUE = block(SuperMarioModBlocks.FLUFFY_CLOUD_BLOCK_BLUE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FLUFFY_CLOUD_BLOCK_PINK = block(SuperMarioModBlocks.FLUFFY_CLOUD_BLOCK_PINK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_HILL_RED = block(SuperMarioModBlocks.MUSHROOM_HILL_RED, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_HILL_GREEN = block(SuperMarioModBlocks.MUSHROOM_HILL_GREEN, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_HILL_BLUE = block(SuperMarioModBlocks.MUSHROOM_HILL_BLUE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_HILL_YELLOW = block(SuperMarioModBlocks.MUSHROOM_HILL_YELLOW,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BONUS_AREA_BLOCK_PINK = block(SuperMarioModBlocks.BONUS_AREA_BLOCK_PINK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BONUS_AREA_BLOCK_BLUE = block(SuperMarioModBlocks.BONUS_AREA_BLOCK_BLUE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BONUS_AREA_BLOCK_GREEN = block(SuperMarioModBlocks.BONUS_AREA_BLOCK_GREEN,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BONUS_AREA_BLOCK_YELLOW = block(SuperMarioModBlocks.BONUS_AREA_BLOCK_YELLOW,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> GHOST_HOUSE_DOOR = doubleBlock(SuperMarioModBlocks.GHOST_HOUSE_DOOR, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> KOOPA_CASTLE_BRICK = block(SuperMarioModBlocks.KOOPA_CASTLE_BRICK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> KOOPA_CASTLE_BRICK_GRAY = block(SuperMarioModBlocks.KOOPA_CASTLE_BRICK_GRAY,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BOSS_DOOR_RED = doubleBlock(SuperMarioModBlocks.BOSS_DOOR_RED, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BOSS_DOOR_BLUE = doubleBlock(SuperMarioModBlocks.BOSS_DOOR_BLUE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> TOWER_BLOCK_GREEN = block(SuperMarioModBlocks.TOWER_BLOCK_GREEN, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> TOWER_BLOCK_WHITE = block(SuperMarioModBlocks.TOWER_BLOCK_WHITE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> TOWER_BLOCK_LIME = block(SuperMarioModBlocks.TOWER_BLOCK_LIME, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> TOWER_BLOCK_ORANGE = block(SuperMarioModBlocks.TOWER_BLOCK_ORANGE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> TOWER_BLOCK_OLIVE = block(SuperMarioModBlocks.TOWER_BLOCK_OLIVE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> TOWER_BLOCK_GRAY = block(SuperMarioModBlocks.TOWER_BLOCK_GRAY, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> TOWER_BLOCK_BLUE = block(SuperMarioModBlocks.TOWER_BLOCK_BLUE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> TOWER_BLOCK_CYAN = block(SuperMarioModBlocks.TOWER_BLOCK_CYAN, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> TOWER_BLOCK_BROWN = block(SuperMarioModBlocks.TOWER_BLOCK_BROWN, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> TOWER_BLOCK_LIGHT_BLUE = block(SuperMarioModBlocks.TOWER_BLOCK_LIGHT_BLUE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> TOWER_BLOCK_BLACK = block(SuperMarioModBlocks.TOWER_BLOCK_BLACK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> TOWER_BLOCK_RED = block(SuperMarioModBlocks.TOWER_BLOCK_RED, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> HAUNTED_WOOD = block(SuperMarioModBlocks.HAUNTED_WOOD, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> HAUNTED_LOG = block(SuperMarioModBlocks.HAUNTED_LOG, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> HAUNTED_PLANKS = block(SuperMarioModBlocks.HAUNTED_PLANKS, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> HAUNTED_STAIRS = block(SuperMarioModBlocks.HAUNTED_STAIRS, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> HAUNTED_SLAB = block(SuperMarioModBlocks.HAUNTED_SLAB, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> HAUNTED_FENCE = block(SuperMarioModBlocks.HAUNTED_FENCE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> HAUNTED_FENCE_GATE = block(SuperMarioModBlocks.HAUNTED_FENCE_GATE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> HAUNTED_PRESSURE_PLATE = block(SuperMarioModBlocks.HAUNTED_PRESSURE_PLATE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> HAUNTED_BUTTON = block(SuperMarioModBlocks.HAUNTED_BUTTON, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> HAUNTED_WOOD_PILLAR = block(SuperMarioModBlocks.HAUNTED_WOOD_PILLAR, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> HAUNTED_WOOD_LIGHT_PILLAR = block(SuperMarioModBlocks.HAUNTED_WOOD_LIGHT_PILLAR,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> GHOST_HOUSE_FLOOR = block(SuperMarioModBlocks.GHOST_HOUSE_FLOOR, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> HAUNTED_STONE = block(SuperMarioModBlocks.HAUNTED_STONE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> HAUNTED_STONE_WOODEN = block(SuperMarioModBlocks.HAUNTED_STONE_WOODEN,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> VOLCANO_ROCK = block(SuperMarioModBlocks.VOLCANO_ROCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> VOLCANO_ROCK_STAIRS = block(SuperMarioModBlocks.VOLCANO_ROCK_STAIRS, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> VOLCANO_ROCK_SLAB = block(SuperMarioModBlocks.VOLCANO_ROCK_SLAB, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> VOLCANO_ROCK_WALL = block(SuperMarioModBlocks.VOLCANO_ROCK_WALL, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_GRASS_BLOCK = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_GRASS_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_GRASS_BLOCK_STAIRS = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_GRASS_BLOCK_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_GRASS_BLOCK_SLAB = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_GRASS_BLOCK_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_PATH_BLOCK = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_PATH_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_PATH_BLOCK_STAIRS = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_PATH_BLOCK_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_PATH_BLOCK_SLAB = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_PATH_BLOCK_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SUPER_LEAF_TREE_LOG = block(SuperMarioModBlocks.SUPER_LEAF_TREE_LOG, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SUPER_LEAF_TREE_STRIPE_LOG = block(SuperMarioModBlocks.SUPER_LEAF_TREE_STRIPE_LOG,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> SUPER_LEAF_TREE_TAIL_LOG = block(SuperMarioModBlocks.SUPER_LEAF_TREE_TAIL_LOG,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_BLOCK = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_DECORATIVE_BRICK = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_DECORATIVE_BRICK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_WINDOW = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_WINDOW,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_BLOCK_FENCE = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_BLOCK_FENCE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_BLOCK_WALL = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_BLOCK_WALL,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_TILED_BRICK = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_TILED_BRICK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_ROOF = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_ROOF,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_ROOF_STAIRS = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_ROOF_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_ROOF_SLAB = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_ROOF_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGOM_CASTLE_TILES = block(SuperMarioModBlocks.MUSHROOM_KINGOM_CASTLE_TILES,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_TILES_STAIRS = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_TILES_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_TILES_SLAB = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_TILES_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> RED_CARPET_STAIRS = block(SuperMarioModBlocks.RED_CARPET_STAIRS, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> RED_CARPET_SLAB = block(SuperMarioModBlocks.RED_CARPET_SLAB, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_BASEBOARD = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_BASEBOARD,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_TILED_BASEBOARD = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_TILED_BASEBOARD, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_CARPETED_BASEBOARD = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_CARPETED_BASEBOARD, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_GREEN_WALLPAPER = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_GREEN_WALLPAPER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_GREEN_TOP_WALLPAPER = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_GREEN_TOP_WALLPAPER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_WALLPAPER = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_WALLPAPER,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_CLOUD_WALLPAPER = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_CLOUD_WALLPAPER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_DARK_WALLPAPER = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_DARK_WALLPAPER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_DARK_CLOUD_WALLPAPER = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_DARK_CLOUD_WALLPAPER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_TILED_GREEN_WALLPAPER = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_TILED_GREEN_WALLPAPER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_TILED_GREEN_TOP_WALLPAPER = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_TILED_GREEN_TOP_WALLPAPER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_TILED_WALLPAPER = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_TILED_WALLPAPER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_CARPETED_GREEN_WALLPAPER = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_CARPETED_GREEN_WALLPAPER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_CARPETED_GREEN_TOP_WALLPAPER = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_CARPETED_GREEN_TOP_WALLPAPER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_CARPETED_WALLPAPER = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_CARPETED_WALLPAPER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_WOODEN_BRICKS = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_WOODEN_BRICKS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_TILED_WOODEN_BRICKS = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_TILED_WOODEN_BRICKS, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_CARPETED_WOODEN_BRICKS = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_CARPETED_WOODEN_BRICKS, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_STONE_FLOOR = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_STONE_FLOOR,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_STONE_FLOOR_SLAB = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_STONE_FLOOR_SLAB, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_RAILING = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_RAILING,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_BASEMENT_WALL = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_BASEMENT_WALL,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_FAKE_BASEMENT_WALL = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_FAKE_BASEMENT_WALL, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_UPPER_TILES = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_UPPER_TILES,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_BLUE_WALLPAPER = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_BLUE_WALLPAPER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_BLUE_TOP_WALLPAPER = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_BLUE_TOP_WALLPAPER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_UPPER_WALLPAPER = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_UPPER_WALLPAPER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_UPPER_STAR_WALLPAPER = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_UPPER_STAR_WALLPAPER, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> PEACHS_CASTLE_DOOR = doubleBlock(SuperMarioModBlocks.PEACHS_CASTLE_DOOR,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> PEACHS_CASTLE_STAR_DOOR = doubleBlock(SuperMarioModBlocks.PEACHS_CASTLE_STAR_DOOR,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> PEACHS_CASTLE_ONE_STAR_DOOR = doubleBlock(SuperMarioModBlocks.PEACHS_CASTLE_ONE_STAR_DOOR,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> PEACHS_CASTLE_THREE_STAR_DOOR = doubleBlock(SuperMarioModBlocks.PEACHS_CASTLE_THREE_STAR_DOOR,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> PEACHES_CASTLE_LOCKED_DOOR = doubleBlock(SuperMarioModBlocks.PEACHES_CASTLE_LOCKED_DOOR,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> PEACHS_CASTLE_PLANK_DOOR = doubleBlock(SuperMarioModBlocks.PEACHS_CASTLE_PLANK_DOOR,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> PEACHS_CASTLE_IRON_DOOR = doubleBlock(SuperMarioModBlocks.PEACHS_CASTLE_IRON_DOOR,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BOWSER_ICON_BLOCK = block(SuperMarioModBlocks.BOWSER_ICON_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BOWSER_JR_ICON_BLOCK = block(SuperMarioModBlocks.BOWSER_JR_ICON_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> RAINBOW_BLOCK = block(SuperMarioModBlocks.RAINBOW_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BOWSER_ICON_BLOCK_LAUGHING = block(SuperMarioModBlocks.BOWSER_ICON_BLOCK_LAUGHING,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_VINE_GREEN = block(SuperMarioModBlocks.MUSHROOM_WORLD_VINE_GREEN,
			SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> RAINBOW_BLOCK_2 = block(SuperMarioModBlocks.RAINBOW_BLOCK_2, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_VINE_ORANGE = block(SuperMarioModBlocks.MUSHROOM_WORLD_VINE_ORANGE,
			SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> RAINBOW_BLOCK_3 = block(SuperMarioModBlocks.RAINBOW_BLOCK_3, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_VINE_BLUE = block(SuperMarioModBlocks.MUSHROOM_WORLD_VINE_BLUE,
			SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> RAINBOW_BLOCK_4 = block(SuperMarioModBlocks.RAINBOW_BLOCK_4, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_WORLD_VINE_WHITE = block(SuperMarioModBlocks.MUSHROOM_WORLD_VINE_WHITE,
			SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> RAINBOW_BLOCK_5 = block(SuperMarioModBlocks.RAINBOW_BLOCK_5, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> CASTLE_STAINED_GLASS_WINDOW = block(SuperMarioModBlocks.CASTLE_STAINED_GLASS_WINDOW,
			SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> RAINBOW_BLOCK_6 = block(SuperMarioModBlocks.RAINBOW_BLOCK_6, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> CASTLE_STAINED_GLASS_WINDOW_BORDERLESS = block(
			SuperMarioModBlocks.CASTLE_STAINED_GLASS_WINDOW_BORDERLESS, SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> RAINBOW_BLOCK_7 = block(SuperMarioModBlocks.RAINBOW_BLOCK_7, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_SUN_CARPET = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_SUN_CARPET,
			SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> CASTLE_THRONE = block(SuperMarioModBlocks.CASTLE_THRONE, SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_COURTYARD_STATUE = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_COURTYARD_STATUE, SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> DEACTIVATED_MECHA_KOOPA = block(SuperMarioModBlocks.DEACTIVATED_MECHA_KOOPA,
			SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> BOB_OMB_BATTLEFIELD_PAINTING = block(SuperMarioModBlocks.BOB_OMB_BATTLEFIELD_PAINTING,
			SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> WHOMPS_FORTRESS_PAINTING = block(SuperMarioModBlocks.WHOMPS_FORTRESS_PAINTING,
			SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> JOLLY_RODGER_BAY_PAINTING = block(SuperMarioModBlocks.JOLLY_RODGER_BAY_PAINTING,
			SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> COOL_COOL_MOUNTAIN_PAINTING = block(SuperMarioModBlocks.COOL_COOL_MOUNTAIN_PAINTING,
			SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> LETHAL_LAVA_LAND_PAINTING = block(SuperMarioModBlocks.LETHAL_LAVA_LAND_PAINTING,
			SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> WET_DRY_WORLD_PAINTING = block(SuperMarioModBlocks.WET_DRY_WORLD_PAINTING,
			SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> TINY_HUGE_ISLAND_PAINTING = block(SuperMarioModBlocks.TINY_HUGE_ISLAND_PAINTING,
			SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> TALL_TALL_MOUNTAIN_PAINTING = block(SuperMarioModBlocks.TALL_TALL_MOUNTAIN_PAINTING,
			SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> PEACH_PAINTING = block(SuperMarioModBlocks.PEACH_PAINTING, SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> BOWSER_PAINTING = block(SuperMarioModBlocks.BOWSER_PAINTING, SuperMarioModTabs.TAB_MARIO_DECORATION);
	public static final RegistryObject<Item> WARP_PIPE = block(SuperMarioModBlocks.WARP_PIPE, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> PIPE = block(SuperMarioModBlocks.PIPE, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> P_SWITCH = block(SuperMarioModBlocks.P_SWITCH, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> ON_BLOCK = block(SuperMarioModBlocks.ON_BLOCK, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> OFF_BLOCK = block(SuperMarioModBlocks.OFF_BLOCK, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> P_BLOCK = block(SuperMarioModBlocks.P_BLOCK, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> P_BLOCK_OUTLINE = block(SuperMarioModBlocks.P_BLOCK_OUTLINE, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> BOWSER_STATUE = block(SuperMarioModBlocks.BOWSER_STATUE, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> TRIANGLE_BLOCK = block(SuperMarioModBlocks.TRIANGLE_BLOCK, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> CHAIN_LINK_FENCE = block(SuperMarioModBlocks.CHAIN_LINK_FENCE,
			SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> MESSAGE_BLOCK = block(SuperMarioModBlocks.MESSAGE_BLOCK, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> WOOD_POST = block(SuperMarioModBlocks.WOOD_POST, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> WOODEN_CRATE = block(SuperMarioModBlocks.WOODEN_CRATE, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> BUILDER_BOX_MARIO = block(SuperMarioModBlocks.BUILDER_BOX_MARIO,
			SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> POW_BLOCK_BLOCK = block(SuperMarioModBlocks.POW_BLOCK_BLOCK, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> BUILDER_BOX_LUIGI = block(SuperMarioModBlocks.BUILDER_BOX_LUIGI,
			SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> RED_POW_BLOCK_BLOCK = block(SuperMarioModBlocks.RED_POW_BLOCK_BLOCK,
			SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> BUILDER_BOX_TOAD = block(SuperMarioModBlocks.BUILDER_BOX_TOAD,
			SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> BUILDER_BOX_TOADETTE = block(SuperMarioModBlocks.BUILDER_BOX_TOADETTE,
			SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> BUILDER_BOX_PEACH = block(SuperMarioModBlocks.BUILDER_BOX_PEACH,
			SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> BUILDER_BOX_YOSHI = block(SuperMarioModBlocks.BUILDER_BOX_YOSHI,
			SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> BUILDER_BOX_DAISY = block(SuperMarioModBlocks.BUILDER_BOX_DAISY,
			SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> BUILDER_BOX_WARIO = block(SuperMarioModBlocks.BUILDER_BOX_WARIO,
			SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> BUILDER_BOX_WALUIGI = block(SuperMarioModBlocks.BUILDER_BOX_WALUIGI,
			SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> BUILDER_BOX_ROSALINA = block(SuperMarioModBlocks.BUILDER_BOX_ROSALINA,
			SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> IRON_CRATE = block(SuperMarioModBlocks.IRON_CRATE, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> IRON_BOWSER_CRATE = block(SuperMarioModBlocks.IRON_BOWSER_CRATE,
			SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> BILL_BLASTER = block(SuperMarioModBlocks.BILL_BLASTER, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> COIN = block(SuperMarioModBlocks.COIN, SuperMarioModTabs.TAB_MARIO_ITEMS);
	public static final RegistryObject<Item> STAR_COIN = block(SuperMarioModBlocks.STAR_COIN, SuperMarioModTabs.TAB_MARIO_ITEMS);
	public static final RegistryObject<Item> HAMMER = REGISTRY.register("hammer", () -> new HammerItem());
	public static final RegistryObject<Item> SUPER_HAMMER = REGISTRY.register("super_hammer", () -> new SuperHammerItem());
	public static final RegistryObject<Item> ULTRA_HAMMER = REGISTRY.register("ultra_hammer", () -> new UltraHammerItem());
	public static final RegistryObject<Item> SLEDGE_HAMMER = REGISTRY.register("sledge_hammer", () -> new SledgeHammerItem());
	public static final RegistryObject<Item> METAL_HAMMER = REGISTRY.register("metal_hammer", () -> new MetalHammerItem());
	public static final RegistryObject<Item> EEK_HAMMER = REGISTRY.register("eek_hammer", () -> new EekHammerItem());
	public static final RegistryObject<Item> BURN_HAMMER = REGISTRY.register("burn_hammer", () -> new BurnHammerItem());
	public static final RegistryObject<Item> CHILL_HAMMER = REGISTRY.register("chill_hammer", () -> new ChillHammerItem());
	public static final RegistryObject<Item> HURL_HAMMER = REGISTRY.register("hurl_hammer", () -> new HurlHammerItem());
	public static final RegistryObject<Item> SUPER_MUSHROOM = REGISTRY.register("super_mushroom", () -> new SuperMushroomItem());
	public static final RegistryObject<Item> ONE_UP_MUSHROOM = REGISTRY.register("one_up_mushroom", () -> new OneUpMushroomItem());
	public static final RegistryObject<Item> POISON_MUSHROOM = REGISTRY.register("poison_mushroom", () -> new PoisonMushroomItem());
	public static final RegistryObject<Item> LIFE_SHROOM = REGISTRY.register("life_shroom", () -> new LifeShroomItem());
	public static final RegistryObject<Item> PROPELLER_MUSHROOM = REGISTRY.register("propeller_mushroom", () -> new PropellerMushroomItem());
	public static final RegistryObject<Item> BOO_MUSHROOM = REGISTRY.register("boo_mushroom", () -> new BooMushroomItem());
	public static final RegistryObject<Item> SPRING_MUSHROOM = REGISTRY.register("spring_mushroom", () -> new SpringMushroomItem());
	public static final RegistryObject<Item> BEE_MUSHROOM = REGISTRY.register("bee_mushroom", () -> new BeeMushroomItem());
	public static final RegistryObject<Item> ROCK_MUSHROOM = REGISTRY.register("rock_mushroom", () -> new RockMushroomItem());
	public static final RegistryObject<Item> GOLDEN_DASH_MUSHROOM = REGISTRY.register("golden_dash_mushroom", () -> new GoldenDashMushroomItem());
	public static final RegistryObject<Item> SUPER_ACORN = REGISTRY.register("super_acorn", () -> new SuperAcornItem());
	public static final RegistryObject<Item> SUPER_BELL = REGISTRY.register("super_bell", () -> new SuperBellItem());
	public static final RegistryObject<Item> FIRE_FLOWER = REGISTRY.register("fire_flower", () -> new FireFlowerItem());
	public static final RegistryObject<Item> SUPERBALL_FLOWER = REGISTRY.register("superball_flower", () -> new SuperballFlowerItem());
	public static final RegistryObject<Item> GOLD_FLOWER = REGISTRY.register("gold_flower", () -> new GoldFlowerItem());
	public static final RegistryObject<Item> SUPER_LEAF = REGISTRY.register("super_leaf", () -> new SuperLeafItem());
	public static final RegistryObject<Item> INVINCIBILITY_LEAF = REGISTRY.register("invincibility_leaf", () -> new InvincibilityLeafItem());
	public static final RegistryObject<Item> CAPE_FEATHER = REGISTRY.register("cape_feather", () -> new CapeFeatherItem());
	public static final RegistryObject<Item> P_BALLOON = REGISTRY.register("p_balloon", () -> new PBalloonItem());
	public static final RegistryObject<Item> SUPER_STAR = REGISTRY.register("super_star", () -> new SuperStarItem());
	public static final RegistryObject<Item> POW_BLOCK = REGISTRY.register("pow_block", () -> new PowBlockItem());
	public static final RegistryObject<Item> RED_POW_BLOCK = REGISTRY.register("red_pow_block", () -> new RedPowBlockItem());
	public static final RegistryObject<Item> NOODLES = REGISTRY.register("noodles", () -> new NoodlesItem());
	public static final RegistryObject<Item> MEATBALL = REGISTRY.register("meatball", () -> new MeatballItem());
	public static final RegistryObject<Item> PASTA_SAUCE = REGISTRY.register("pasta_sauce", () -> new PastaSauceItem());
	public static final RegistryObject<Item> SPAGHETTI = REGISTRY.register("spaghetti", () -> new SpaghettiItem());
	public static final RegistryObject<Item> SPAGHETTI_OS = REGISTRY.register("spaghetti_os", () -> new SpaghettiOsItem());
	public static final RegistryObject<Item> CAKE = REGISTRY.register("cake", () -> new CakeItem());
	public static final RegistryObject<Item> EGG_SCOOPA_KOOPA = REGISTRY.register("egg_scoopa_koopa", () -> new EggScoopaKoopaItem());
	public static final RegistryObject<Item> GARLIC = REGISTRY.register("garlic", () -> new GarlicItem());
	public static final RegistryObject<Item> YOSHI_BERRY = REGISTRY.register("yoshi_berry", () -> new YoshiBerryItem());
	public static final RegistryObject<Item> STAR_PIECE = REGISTRY.register("star_piece", () -> new StarPieceItem());
	public static final RegistryObject<Item> ICE_BRICK_ITEM = REGISTRY.register("ice_brick_item", () -> new IceBrickItemItem());
	public static final RegistryObject<Item> YOSHI_EGG_GREEN = REGISTRY.register("yoshi_egg_green", () -> new YoshiEggGreenItem());
	public static final RegistryObject<Item> YOSHI_EGG_RED = REGISTRY.register("yoshi_egg_red", () -> new YoshiEggRedItem());
	public static final RegistryObject<Item> YOSHI_EGG_BLUE = REGISTRY.register("yoshi_egg_blue", () -> new YoshiEggBlueItem());
	public static final RegistryObject<Item> YOSHI_EGG_YELLOW = REGISTRY.register("yoshi_egg_yellow", () -> new YoshiEggYellowItem());
	public static final RegistryObject<Item> YOSHI_EGG_PINK = REGISTRY.register("yoshi_egg_pink", () -> new YoshiEggPinkItem());
	public static final RegistryObject<Item> YOSHI_EGG_LIGHT_BLUE = REGISTRY.register("yoshi_egg_light_blue", () -> new YoshiEggLightBlueItem());
	public static final RegistryObject<Item> YOSHI_EGG_PURPLE = REGISTRY.register("yoshi_egg_purple", () -> new YoshiEggPurpleItem());
	public static final RegistryObject<Item> YOSHI_EGG_BLACK = REGISTRY.register("yoshi_egg_black", () -> new YoshiEggBlackItem());
	public static final RegistryObject<Item> YOSHI_EGG_WHITE = REGISTRY.register("yoshi_egg_white", () -> new YoshiEggWhiteItem());
	public static final RegistryObject<Item> YOSHI_EGG_ORANGE = REGISTRY.register("yoshi_egg_orange", () -> new YoshiEggOrangeItem());
	public static final RegistryObject<Item> YOSHI_EGG_BROWN = REGISTRY.register("yoshi_egg_brown", () -> new YoshiEggBrownItem());
	public static final RegistryObject<Item> GOOMBAICON = REGISTRY.register("goombaicon", () -> new GoombaiconItem());
	public static final RegistryObject<Item> MAGIKOOPA_WAND = REGISTRY.register("magikoopa_wand", () -> new MagikoopaWandItem());
	public static final RegistryObject<Item> KOOPA_MAGIC = REGISTRY.register("koopa_magic", () -> new KoopaMagicItem());
	public static final RegistryObject<Item> LARRY_MAGIC = REGISTRY.register("larry_magic", () -> new LarryMagicItem());
	public static final RegistryObject<Item> LEMMY_MAGIC = REGISTRY.register("lemmy_magic", () -> new LemmyMagicItem());
	public static final RegistryObject<Item> LUDWIG_MAGIC = REGISTRY.register("ludwig_magic", () -> new LudwigMagicItem());
	public static final RegistryObject<Item> ROY_MAGIC = REGISTRY.register("roy_magic", () -> new RoyMagicItem());
	public static final RegistryObject<Item> WENDY_MAGIC = REGISTRY.register("wendy_magic", () -> new WendyMagicItem());
	public static final RegistryObject<Item> MORTON_MAGIC = REGISTRY.register("morton_magic", () -> new MortonMagicItem());
	public static final RegistryObject<Item> ICE_BRICK_BLOCK = block(SuperMarioModBlocks.ICE_BRICK_BLOCK, null);
	public static final RegistryObject<Item> IGGY_MAGIC = REGISTRY.register("iggy_magic", () -> new IggyMagicItem());
	public static final RegistryObject<Item> LARRYS_WAND = REGISTRY.register("larrys_wand", () -> new LarrysWandItem());
	public static final RegistryObject<Item> ROYS_WAND = REGISTRY.register("roys_wand", () -> new RoysWandItem());
	public static final RegistryObject<Item> WENDYS_WAND = REGISTRY.register("wendys_wand", () -> new WendysWandItem());
	public static final RegistryObject<Item> LEMMYS_WAND = REGISTRY.register("lemmys_wand", () -> new LemmysWandItem());
	public static final RegistryObject<Item> LUDWIGS_WAND = REGISTRY.register("ludwigs_wand", () -> new LudwigsWandItem());
	public static final RegistryObject<Item> IGGYS_WAND = REGISTRY.register("iggys_wand", () -> new IggysWandItem());
	public static final RegistryObject<Item> MORTONS_WAND = REGISTRY.register("mortons_wand", () -> new MortonsWandItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
