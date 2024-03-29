
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.WorldGenSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.supermario.world.biome.VolcanoBiome;
import net.mcreator.supermario.world.biome.VanillaDomeBiome;
import net.mcreator.supermario.world.biome.SparklingWatersOceanBiome;
import net.mcreator.supermario.world.biome.SparklingWaterBeachBiome;
import net.mcreator.supermario.world.biome.SodaJungleBiome;
import net.mcreator.supermario.world.biome.RockCandyMinesBiome;
import net.mcreator.supermario.world.biome.MushroomWorldSnowyPlainsBiome;
import net.mcreator.supermario.world.biome.MushroomWorldPlainsBiome;
import net.mcreator.supermario.world.biome.MushroomWorldHillsBiome;
import net.mcreator.supermario.world.biome.MushroomWorldDesertBiome;
import net.mcreator.supermario.world.biome.MushroomKingdomSnowyPlainsBiome;
import net.mcreator.supermario.world.biome.MushroomKingdomPlainsBiome;
import net.mcreator.supermario.world.biome.MushroomKingdomOceanBiome;
import net.mcreator.supermario.world.biome.MushroomKingdomDryPlainsBiome;
import net.mcreator.supermario.world.biome.MoonBiomeBiome;
import net.mcreator.supermario.world.biome.MeringueCloudsBiome;
import net.mcreator.supermario.world.biome.LayerCakeDesertBiome;
import net.mcreator.supermario.world.biome.HauntedSodaJungleBiome;
import net.mcreator.supermario.world.biome.FrostedGlacierBiome;
import net.mcreator.supermario.world.biome.ForestOfIllusionBiome;
import net.mcreator.supermario.world.biome.FlowerKingdomVolcanoBiome;
import net.mcreator.supermario.world.biome.FlowerKingdomTundraBiome;
import net.mcreator.supermario.world.biome.FlowerKingdomSwampBiome;
import net.mcreator.supermario.world.biome.FlowerKingdomPlainsBiome;
import net.mcreator.supermario.world.biome.FlowerKingdomMountainBiome;
import net.mcreator.supermario.world.biome.FlowerKingdomJungleBiome;
import net.mcreator.supermario.world.biome.FlowerKingdomForestBiome;
import net.mcreator.supermario.world.biome.FlowerKingdomDesertBiome;
import net.mcreator.supermario.world.biome.FlowerKingdomBeachBiome;
import net.mcreator.supermario.world.biome.DonutPlainsBiome;
import net.mcreator.supermario.world.biome.ChocolateIslandBiome;
import net.mcreator.supermario.world.biome.AcornPlainsBiome;
import net.mcreator.supermario.SuperMarioMod;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

@Mod.EventBusSubscriber
public class SuperMarioModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, SuperMarioMod.MODID);
	public static final RegistryObject<Biome> ACORN_PLAINS = REGISTRY.register("acorn_plains", () -> AcornPlainsBiome.createBiome());
	public static final RegistryObject<Biome> SPARKLING_WATER_BEACH = REGISTRY.register("sparkling_water_beach", () -> SparklingWaterBeachBiome.createBiome());
	public static final RegistryObject<Biome> LAYER_CAKE_DESERT = REGISTRY.register("layer_cake_desert", () -> LayerCakeDesertBiome.createBiome());
	public static final RegistryObject<Biome> SODA_JUNGLE = REGISTRY.register("soda_jungle", () -> SodaJungleBiome.createBiome());
	public static final RegistryObject<Biome> MERINGUE_CLOUDS = REGISTRY.register("meringue_clouds", () -> MeringueCloudsBiome.createBiome());
	public static final RegistryObject<Biome> SPARKLING_WATERS_OCEAN = REGISTRY.register("sparkling_waters_ocean", () -> SparklingWatersOceanBiome.createBiome());
	public static final RegistryObject<Biome> ROCK_CANDY_MINES = REGISTRY.register("rock_candy_mines", () -> RockCandyMinesBiome.createBiome());
	public static final RegistryObject<Biome> MUSHROOM_WORLD_PLAINS = REGISTRY.register("mushroom_world_plains", () -> MushroomWorldPlainsBiome.createBiome());
	public static final RegistryObject<Biome> MUSHROOM_WORLD_SNOWY_PLAINS = REGISTRY.register("mushroom_world_snowy_plains", () -> MushroomWorldSnowyPlainsBiome.createBiome());
	public static final RegistryObject<Biome> MUSHROOM_WORLD_HILLS = REGISTRY.register("mushroom_world_hills", () -> MushroomWorldHillsBiome.createBiome());
	public static final RegistryObject<Biome> MUSHROOM_KINGDOM_DRY_PLAINS = REGISTRY.register("mushroom_kingdom_dry_plains", () -> MushroomKingdomDryPlainsBiome.createBiome());
	public static final RegistryObject<Biome> MUSHROOM_KINGDOM_SNOWY_PLAINS = REGISTRY.register("mushroom_kingdom_snowy_plains", () -> MushroomKingdomSnowyPlainsBiome.createBiome());
	public static final RegistryObject<Biome> HAUNTED_SODA_JUNGLE = REGISTRY.register("haunted_soda_jungle", () -> HauntedSodaJungleBiome.createBiome());
	public static final RegistryObject<Biome> MUSHROOM_WORLD_DESERT = REGISTRY.register("mushroom_world_desert", () -> MushroomWorldDesertBiome.createBiome());
	public static final RegistryObject<Biome> VOLCANO = REGISTRY.register("volcano", () -> VolcanoBiome.createBiome());
	public static final RegistryObject<Biome> MUSHROOM_KINGDOM_OCEAN = REGISTRY.register("mushroom_kingdom_ocean", () -> MushroomKingdomOceanBiome.createBiome());
	public static final RegistryObject<Biome> MOON_BIOME = REGISTRY.register("moon_biome", () -> MoonBiomeBiome.createBiome());
	public static final RegistryObject<Biome> FROSTED_GLACIER = REGISTRY.register("frosted_glacier", () -> FrostedGlacierBiome.createBiome());
	public static final RegistryObject<Biome> MUSHROOM_KINGDOM_PLAINS = REGISTRY.register("mushroom_kingdom_plains", () -> MushroomKingdomPlainsBiome.createBiome());
	public static final RegistryObject<Biome> FLOWER_KINGDOM_PLAINS = REGISTRY.register("flower_kingdom_plains", () -> FlowerKingdomPlainsBiome.createBiome());
	public static final RegistryObject<Biome> FLOWER_KINGDOM_FOREST = REGISTRY.register("flower_kingdom_forest", () -> FlowerKingdomForestBiome.createBiome());
	public static final RegistryObject<Biome> FLOWER_KINGDOM_BEACH = REGISTRY.register("flower_kingdom_beach", () -> FlowerKingdomBeachBiome.createBiome());
	public static final RegistryObject<Biome> FLOWER_KINGDOM_SWAMP = REGISTRY.register("flower_kingdom_swamp", () -> FlowerKingdomSwampBiome.createBiome());
	public static final RegistryObject<Biome> FLOWER_KINGDOM_TUNDRA = REGISTRY.register("flower_kingdom_tundra", () -> FlowerKingdomTundraBiome.createBiome());
	public static final RegistryObject<Biome> FLOWER_KINGDOM_MOUNTAIN = REGISTRY.register("flower_kingdom_mountain", () -> FlowerKingdomMountainBiome.createBiome());
	public static final RegistryObject<Biome> FLOWER_KINGDOM_JUNGLE = REGISTRY.register("flower_kingdom_jungle", () -> FlowerKingdomJungleBiome.createBiome());
	public static final RegistryObject<Biome> FLOWER_KINGDOM_DESERT = REGISTRY.register("flower_kingdom_desert", () -> FlowerKingdomDesertBiome.createBiome());
	public static final RegistryObject<Biome> FLOWER_KINGDOM_VOLCANO = REGISTRY.register("flower_kingdom_volcano", () -> FlowerKingdomVolcanoBiome.createBiome());
	public static final RegistryObject<Biome> DONUT_PLAINS = REGISTRY.register("donut_plains", () -> DonutPlainsBiome.createBiome());
	public static final RegistryObject<Biome> VANILLA_DOME = REGISTRY.register("vanilla_dome", () -> VanillaDomeBiome.createBiome());
	public static final RegistryObject<Biome> FOREST_OF_ILLUSION = REGISTRY.register("forest_of_illusion", () -> ForestOfIllusionBiome.createBiome());
	public static final RegistryObject<Biome> CHOCOLATE_ISLAND = REGISTRY.register("chocolate_island", () -> ChocolateIslandBiome.createBiome());

	@SubscribeEvent
	public static void onServerAboutToStart(ServerAboutToStartEvent event) {
		MinecraftServer server = event.getServer();
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registry.DIMENSION_TYPE_REGISTRY);
		Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY);
		WorldGenSettings worldGenSettings = server.getWorldData().worldGenSettings();
		for (Map.Entry<ResourceKey<LevelStem>, LevelStem> entry : worldGenSettings.dimensions().entrySet()) {
			DimensionType dimensionType = entry.getValue().typeHolder().value();
			if (dimensionType == dimensionTypeRegistry.getOrThrow(DimensionType.OVERWORLD_LOCATION)) {
				ChunkGenerator chunkGenerator = entry.getValue().generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters.values());
					for (Climate.ParameterPoint parameterPoint : MushroomWorldDesertBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, MUSHROOM_WORLD_DESERT.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : VanillaDomeBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, VANILLA_DOME.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : ForestOfIllusionBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, FOREST_OF_ILLUSION.getId()))));
					}
					for (Climate.ParameterPoint parameterPoint : ChocolateIslandBiome.PARAMETER_POINTS) {
						parameters.add(new Pair<>(parameterPoint, biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, CHOCOLATE_ISLAND.getId()))));
					}

					MultiNoiseBiomeSource moddedNoiseSource = new MultiNoiseBiomeSource(new Climate.ParameterList<>(parameters), noiseSource.preset);
					chunkGenerator.biomeSource = moddedNoiseSource;
					chunkGenerator.runtimeBiomeSource = moddedNoiseSource;
				}
				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
					if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
						List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, MUSHROOM_WORLD_DESERT.getId()), SuperMarioModBlocks.MUSHROOM_WORLD_SAND.get().defaultBlockState(),
								SuperMarioModBlocks.MUSHROOM_WORLD_SAND.get().defaultBlockState(), SuperMarioModBlocks.MUSHROOM_WORLD_RED_STONE_BLOCK.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, VANILLA_DOME.getId()), SuperMarioModBlocks.DINOSAUR_LAND_UNDERGROUND_ROAD_GRAY.get().defaultBlockState(),
								SuperMarioModBlocks.DINOSAUR_LAND_UNDERGROUND_STONE_GRAY.get().defaultBlockState(), SuperMarioModBlocks.DINOSAUR_LAND_UNDERGROUND_STONE_GRAY.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, FOREST_OF_ILLUSION.getId()), SuperMarioModBlocks.DINOSAUR_LAND_FOREST_GRASS.get().defaultBlockState(),
								SuperMarioModBlocks.DINOSAUR_LAND_FOREST_DIRT.get().defaultBlockState(), SuperMarioModBlocks.DINOSAUR_LAND_FOREST_DIRT.get().defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, CHOCOLATE_ISLAND.getId()), SuperMarioModBlocks.DINOSAUR_LAND_CHOCOLATE_GRASS.get().defaultBlockState(),
								SuperMarioModBlocks.DINOSAUR_LAND_CHOCOLATE_DIRT.get().defaultBlockState(), SuperMarioModBlocks.DINOSAUR_LAND_CHOCOLATE_DIRT.get().defaultBlockState()));
						NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(), noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(),
								noiseGeneratorSettings.noiseRouter(), SurfaceRules.sequence(surfaceRules.toArray(i -> new SurfaceRules.RuleSource[i])), noiseGeneratorSettings.seaLevel(), noiseGeneratorSettings.disableMobGeneration(),
								noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(), noiseGeneratorSettings.useLegacyRandomSource());
						noiseGenerator.settings = new Holder.Direct(moddedNoiseGeneratorSettings);
					}
				}
			}

		}
	}

	private static SurfaceRules.RuleSource preliminarySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(),
						SurfaceRules.sequence(
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
										SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock)))));
	}
}
