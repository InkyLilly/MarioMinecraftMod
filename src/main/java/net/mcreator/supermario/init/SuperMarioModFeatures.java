
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.supermario.world.features.plants.RetroFireFlowerPlantFeature;
import net.mcreator.supermario.world.features.plants.PurpleFlowerBushFeature;
import net.mcreator.supermario.world.features.plants.PinkFlowerBushFeature;
import net.mcreator.supermario.world.features.plants.MushroomKingdomFlowerYellowFeature;
import net.mcreator.supermario.world.features.plants.MushroomKingdomFlowerRedFeature;
import net.mcreator.supermario.world.features.plants.MushroomKingdomFlowerCyanFeature;
import net.mcreator.supermario.world.features.plants.IceFlowerPlantFeature;
import net.mcreator.supermario.world.features.plants.GoldFlowerPlantFeature;
import net.mcreator.supermario.world.features.plants.FireFlowerPlantFeature;
import net.mcreator.supermario.world.features.plants.BoomerangFlowerPlantFeature;
import net.mcreator.supermario.world.features.plants.BlueFlowerBushFeature;
import net.mcreator.supermario.SuperMarioMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class SuperMarioModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SuperMarioMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> FIRE_FLOWER_PLANT = register("fire_flower_plant", FireFlowerPlantFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, FireFlowerPlantFeature.GENERATE_BIOMES, FireFlowerPlantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ICE_FLOWER_PLANT = register("ice_flower_plant", IceFlowerPlantFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, IceFlowerPlantFeature.GENERATE_BIOMES, IceFlowerPlantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GOLD_FLOWER_PLANT = register("gold_flower_plant", GoldFlowerPlantFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, GoldFlowerPlantFeature.GENERATE_BIOMES, GoldFlowerPlantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RETRO_FIRE_FLOWER_PLANT = register("retro_fire_flower_plant", RetroFireFlowerPlantFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RetroFireFlowerPlantFeature.GENERATE_BIOMES, RetroFireFlowerPlantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BOOMERANG_FLOWER_PLANT = register("boomerang_flower_plant", BoomerangFlowerPlantFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BoomerangFlowerPlantFeature.GENERATE_BIOMES, BoomerangFlowerPlantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PINK_FLOWER_BUSH = register("pink_flower_bush", PinkFlowerBushFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PinkFlowerBushFeature.GENERATE_BIOMES, PinkFlowerBushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLUE_FLOWER_BUSH = register("blue_flower_bush", BlueFlowerBushFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BlueFlowerBushFeature.GENERATE_BIOMES, BlueFlowerBushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PURPLE_FLOWER_BUSH = register("purple_flower_bush", PurpleFlowerBushFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PurpleFlowerBushFeature.GENERATE_BIOMES, PurpleFlowerBushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MUSHROOM_KINGDOM_FLOWER_CYAN = register("mushroom_kingdom_flower_cyan", MushroomKingdomFlowerCyanFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MushroomKingdomFlowerCyanFeature.GENERATE_BIOMES, MushroomKingdomFlowerCyanFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MUSHROOM_KINGDOM_FLOWER_RED = register("mushroom_kingdom_flower_red", MushroomKingdomFlowerRedFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MushroomKingdomFlowerRedFeature.GENERATE_BIOMES, MushroomKingdomFlowerRedFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MUSHROOM_KINGDOM_FLOWER_YELLOW = register("mushroom_kingdom_flower_yellow", MushroomKingdomFlowerYellowFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MushroomKingdomFlowerYellowFeature.GENERATE_BIOMES, MushroomKingdomFlowerYellowFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
