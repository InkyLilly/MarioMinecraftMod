
package net.mcreator.supermario.world.dimension;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.carver.WorldCarver;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.DimensionSpecialEffects;

import net.mcreator.supermario.init.SuperMarioModBlocks;

import java.util.Set;
import java.util.HashSet;

import com.google.common.collect.ImmutableSet;

@Mod.EventBusSubscriber
public class DinosaurLandDimensionDimension {
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Fixers {
		@SubscribeEvent
		public static void registerFillerBlocks(FMLCommonSetupEvent event) {
			Set<Block> replaceableBlocks = new HashSet<>();
			replaceableBlocks.add(SuperMarioModBlocks.DINOSAUR_LAND_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.DINOSAUR_LAND_FOREST_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.DINOSAUR_LAND_FOREST_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.DINOSAUR_LAND_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.DINOSAUR_LAND_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.DINOSAUR_LAND_UNDERGROUND_ROAD_GRAY.get());
			replaceableBlocks.add(SuperMarioModBlocks.DINOSAUR_LAND_UNDERGROUND_STONE_GRAY.get());
			replaceableBlocks.add(SuperMarioModBlocks.DINOSAUR_LAND_CHOCOLATE_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.DINOSAUR_LAND_CHOCOLATE_DIRT.get());
			event.enqueueWork(() -> {
				WorldCarver.CAVE.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CAVE.replaceableBlocks).addAll(replaceableBlocks).build();
				WorldCarver.CANYON.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CANYON.replaceableBlocks).addAll(replaceableBlocks).build();
			});
		}

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(FMLClientSetupEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(128, true, DimensionSpecialEffects.SkyType.NORMAL, false, false) {
				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return color.multiply(sunHeight * 0.94 + 0.06, sunHeight * 0.94 + 0.06, sunHeight * 0.91 + 0.09);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return false;
				}
			};
			event.enqueueWork(() -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation("super_mario:dinosaur_land_dimension"), customEffect));
		}
	}
}
