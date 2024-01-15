
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
public class FlowerKingdomDimension {
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Fixers {
		@SubscribeEvent
		public static void registerFillerBlocks(FMLCommonSetupEvent event) {
			Set<Block> replaceableBlocks = new HashSet<>();
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_DESERT_STONE.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_VOLCANO_ROAD.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_VOLCANO_STONE.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_DESERT_ROAD.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_DESERT_STONE.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_SWAMP_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_SWAMP_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_FOREST_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_FOREST_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_JUNGLE_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_JUNGLE_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_MOUNTAIN_ROAD.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_MOUNTAIN_STONE.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_TUNDRA_SNOW.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_TUNDRA_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_BEACH_ROAD.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLOWER_KINGDOM_BEACH_DIRT.get());
			event.enqueueWork(() -> {
				WorldCarver.CAVE.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CAVE.replaceableBlocks).addAll(replaceableBlocks).build();
				WorldCarver.CANYON.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CANYON.replaceableBlocks).addAll(replaceableBlocks).build();
			});
		}

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(FMLClientSetupEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(Float.NaN, true, DimensionSpecialEffects.SkyType.NONE, false, false) {
				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return color;
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return false;
				}
			};
			event.enqueueWork(() -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation("super_mario:flower_kingdom"), customEffect));
		}
	}
}
