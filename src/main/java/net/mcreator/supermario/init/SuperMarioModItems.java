
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

import net.mcreator.supermario.item.SuperballFlowerItem;
import net.mcreator.supermario.item.SuperStarItem;
import net.mcreator.supermario.item.SuperMushroomItem;
import net.mcreator.supermario.item.SuperLeafItem;
import net.mcreator.supermario.item.SpringMushroomItem;
import net.mcreator.supermario.item.RockMushroomItem;
import net.mcreator.supermario.item.PropellerMushroomItem;
import net.mcreator.supermario.item.PoisonMushroomItem;
import net.mcreator.supermario.item.PBalloonItem;
import net.mcreator.supermario.item.OneUpMushroomItem;
import net.mcreator.supermario.item.LifeShroomItem;
import net.mcreator.supermario.item.InvincibilityLeafItem;
import net.mcreator.supermario.item.HuckitClawItem;
import net.mcreator.supermario.item.GoombaiconItem;
import net.mcreator.supermario.item.GoldenDashMushroomItem;
import net.mcreator.supermario.item.GoldFlowerItem;
import net.mcreator.supermario.item.FireFlowerItem;
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
	public static final RegistryObject<Item> MUSHSTONE = block(SuperMarioModBlocks.MUSHSTONE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHSTONE_STAIRS = block(SuperMarioModBlocks.MUSHSTONE_STAIRS, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHSTONE_SLAB = block(SuperMarioModBlocks.MUSHSTONE_SLAB, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> QUESTION_MARK_BLOCK = block(SuperMarioModBlocks.QUESTION_MARK_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BRICK_BLOCK = block(SuperMarioModBlocks.BRICK_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> HIT_BLOCK = block(SuperMarioModBlocks.HIT_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHSTONE_HARD_BLOCK = block(SuperMarioModBlocks.MUSHSTONE_HARD_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_TREE_LOG = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_TREE_LOG,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_TREE_LEAVES = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_TREE_LEAVES,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_SNOWY_TREE_LEAVES = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_SNOWY_TREE_LEAVES,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
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
	public static final RegistryObject<Item> CASTLE_BLOCK = block(SuperMarioModBlocks.CASTLE_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BLUE_CASTLE_BLOCK = block(SuperMarioModBlocks.BLUE_CASTLE_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> CASTLE_TILE_BLACK = block(SuperMarioModBlocks.CASTLE_TILE_BLACK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> CASTLE_TILE_WHITE = block(SuperMarioModBlocks.CASTLE_TILE_WHITE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> CASTLE_BRICK = block(SuperMarioModBlocks.CASTLE_BRICK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> CLOUD_BLOCK = block(SuperMarioModBlocks.CLOUD_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> RAINY_CLOUD_BLOCK = block(SuperMarioModBlocks.RAINY_CLOUD_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_GRASS = block(SuperMarioModBlocks.DINOSAUR_LAND_GRASS, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_DIRT = block(SuperMarioModBlocks.DINOSAUR_LAND_DIRT, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_GRASS_STAIRS = block(SuperMarioModBlocks.DINOSAUR_LAND_GRASS_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_GRASS_SLAB = block(SuperMarioModBlocks.DINOSAUR_LAND_GRASS_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_DIRT_STAIRS = block(SuperMarioModBlocks.DINOSAUR_LAND_DIRT_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> DINOSAUR_LAND_DIRT_SLAB = block(SuperMarioModBlocks.DINOSAUR_LAND_DIRT_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
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
	public static final RegistryObject<Item> ACORN_TREE_LOG = block(SuperMarioModBlocks.ACORN_TREE_LOG, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_LEAVES = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_LEAVES,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
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
	public static final RegistryObject<Item> IRON_CRATE = block(SuperMarioModBlocks.IRON_CRATE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> IRON_BOWSER_CRATE = block(SuperMarioModBlocks.IRON_BOWSER_CRATE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
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
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_BLOCK = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_DECORATIVE_BRICK = block(
			SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_DECORATIVE_BRICK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_KINGDOM_CASTLE_WINDOW = block(SuperMarioModBlocks.MUSHROOM_KINGDOM_CASTLE_WINDOW,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> MUSHROOM_PORTAL_BLOCK = block(SuperMarioModBlocks.MUSHROOM_PORTAL_BLOCK,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> WARP_PIPE = block(SuperMarioModBlocks.WARP_PIPE, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> PIPE = block(SuperMarioModBlocks.PIPE, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> ON_BLOCK = block(SuperMarioModBlocks.ON_BLOCK, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> OFF_BLOCK = block(SuperMarioModBlocks.OFF_BLOCK, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> P_BLOCK = block(SuperMarioModBlocks.P_BLOCK, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> P_BLOCK_OUTLINE = block(SuperMarioModBlocks.P_BLOCK_OUTLINE, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> BOWSER_STATUE = block(SuperMarioModBlocks.BOWSER_STATUE, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
	public static final RegistryObject<Item> TRIANGLE_BLOCK = block(SuperMarioModBlocks.TRIANGLE_BLOCK, SuperMarioModTabs.TAB_MARIO_GIMMICK_BLOCKS);
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
	public static final RegistryObject<Item> FIRE_FLOWER = REGISTRY.register("fire_flower", () -> new FireFlowerItem());
	public static final RegistryObject<Item> SUPERBALL_FLOWER = REGISTRY.register("superball_flower", () -> new SuperballFlowerItem());
	public static final RegistryObject<Item> GOLD_FLOWER = REGISTRY.register("gold_flower", () -> new GoldFlowerItem());
	public static final RegistryObject<Item> SUPER_LEAF = REGISTRY.register("super_leaf", () -> new SuperLeafItem());
	public static final RegistryObject<Item> INVINCIBILITY_LEAF = REGISTRY.register("invincibility_leaf", () -> new InvincibilityLeafItem());
	public static final RegistryObject<Item> P_BALLOON = REGISTRY.register("p_balloon", () -> new PBalloonItem());
	public static final RegistryObject<Item> SUPER_STAR = REGISTRY.register("super_star", () -> new SuperStarItem());
	public static final RegistryObject<Item> GOOMBAICON = REGISTRY.register("goombaicon", () -> new GoombaiconItem());
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
	public static final RegistryObject<Item> ACORN_WOOD_DOOR = doubleBlock(SuperMarioModBlocks.ACORN_WOOD_DOOR, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BOSS_DOOR_RED = doubleBlock(SuperMarioModBlocks.BOSS_DOOR_RED, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> BOSS_DOOR_BLUE = doubleBlock(SuperMarioModBlocks.BOSS_DOOR_BLUE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
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
	public static final RegistryObject<Item> MESSAGE_BLOCK = block(SuperMarioModBlocks.MESSAGE_BLOCK, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_DIRT = block(SuperMarioModBlocks.FROSTED_GLACIER_DIRT,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_DIRT_STAIRS = block(SuperMarioModBlocks.FROSTED_GLACIER_DIRT_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTER_GLACIER_DIRT_SLAB = block(SuperMarioModBlocks.FROSTER_GLACIER_DIRT_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_SNOWY_DIRT = block(SuperMarioModBlocks.FROSTED_GLACIER_SNOWY_DIRT,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_SNOWY_DIRT_STAIRS = block(SuperMarioModBlocks.FROSTED_GLACIER_SNOWY_DIRT_STAIRS,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_SNOWY_DIRT_SLAB = block(SuperMarioModBlocks.FROSTED_GLACIER_SNOWY_DIRT_SLAB,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_ICE = block(SuperMarioModBlocks.FROSTED_GLACIER_ICE, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_SNOWY_ICE = block(SuperMarioModBlocks.FROSTED_GLACIER_SNOWY_ICE,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_LOG = block(SuperMarioModBlocks.FROSTED_GLACIER_LOG, SuperMarioModTabs.TAB_MARIO_BLOCKS);
	public static final RegistryObject<Item> FROSTED_GLACIER_LEAVES = block(SuperMarioModBlocks.FROSTED_GLACIER_LEAVES,
			SuperMarioModTabs.TAB_MARIO_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
