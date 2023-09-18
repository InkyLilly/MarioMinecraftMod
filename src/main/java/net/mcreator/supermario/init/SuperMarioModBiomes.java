
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
import net.mcreator.supermario.world.biome.SparklingWatersOceanBiome;
import net.mcreator.supermario.world.biome.SparklingWaterBeachBiome;
import net.mcreator.supermario.world.biome.SodaJungleBiome;
import net.mcreator.supermario.world.biome.RockCandyMinesBiome;
import net.mcreator.supermario.world.biome.MushroomWorldSnowyPlainsBiome;
import net.mcreator.supermario.world.biome.MushroomWorldPlainsBiome;
import net.mcreator.supermario.world.biome.MushroomWorldHillsBiome;
import net.mcreator.supermario.world.biome.MushroomWorldDesertBiome;
import net.mcreator.supermario.world.biome.MushroomKingdomSnowyPlainsBiome;
import net.mcreator.supermario.world.biome.MushroomKingdomOceanBiome;
import net.mcreator.supermario.world.biome.MushroomKingdomDryPlainsBiome;
import net.mcreator.supermario.world.biome.MoonBiomeBiome;
import net.mcreator.supermario.world.biome.MeringueCloudsBiome;
import net.mcreator.supermario.world.biome.LayerCakeDesertBiome;
import net.mcreator.supermario.world.biome.HauntedSodaJungleBiome;
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
