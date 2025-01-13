
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
public class ConcordiaDimensionDimension {
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Fixers {
		@SubscribeEvent
		public static void registerFillerBlocks(FMLCommonSetupEvent event) {
			Set<Block> replaceableBlocks = new HashSet<>();
			replaceableBlocks.add(SuperMarioModBlocks.RUMBLA_ISLAND_STONE.get());
			replaceableBlocks.add(SuperMarioModBlocks.LOTTACOINS_ISLAND_PATH.get());
			replaceableBlocks.add(SuperMarioModBlocks.LOTTACOINS_ISLAND_BLOCK.get());
			replaceableBlocks.add(SuperMarioModBlocks.RAYNFORST_ISLAND_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.RAYNFORST_ISLAND_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.MERRYGO_ISLAND_RED_PATH.get());
			replaceableBlocks.add(SuperMarioModBlocks.MERRYGO_ISLAND_BRICKS.get());
			replaceableBlocks.add(SuperMarioModBlocks.OFFANDON_ISLAND_TAN_TILE.get());
			replaceableBlocks.add(SuperMarioModBlocks.OFFANDON_ISLAND_BRICKS.get());
			replaceableBlocks.add(SuperMarioModBlocks.SLIPPENGLIDE_ISLAND_LIGHT_SNOW.get());
			replaceableBlocks.add(SuperMarioModBlocks.SLIPPENGLIDE_ISLAND_LIGHT_STONE.get());
			replaceableBlocks.add(SuperMarioModBlocks.CONDUCTOR_ISLAND_FLOWERING_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.CONDUCTOR_ISLAND_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.DESOLATT_ISLAND_SAND.get());
			replaceableBlocks.add(SuperMarioModBlocks.DESOLATT_ISLAND_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.SOLI_TREE_TILE_PLATFORM.get());
			replaceableBlocks.add(SuperMarioModBlocks.SOLI_TREE_LOG.get());
			replaceableBlocks.add(SuperMarioModBlocks.ALLSAND_ISLAND_SAND.get());
			replaceableBlocks.add(SuperMarioModBlocks.ALLSAND_ISLAND_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.TWISTEE_ISLAND_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.TWISTEE_ISLAND_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.BULBFISH_ISLAND_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.BULBFISH_ISLAND_STONE.get());
			replaceableBlocks.add(SuperMarioModBlocks.RUMBLA_ISLAND_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.RUMBLA_ISLAND_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLORALL_ISLAND_GRASSY_FLOWER_PATCH.get());
			replaceableBlocks.add(SuperMarioModBlocks.FLORALL_ISLAND_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.JELLYFISH_ISLAND_FLOOR.get());
			replaceableBlocks.add(SuperMarioModBlocks.JELLYFISH_ISLAND_PILLAR.get());
			replaceableBlocks.add(SuperMarioModBlocks.SKORCHEEN_ISLAND_STONE_TOP.get());
			replaceableBlocks.add(SuperMarioModBlocks.SKORCHEEN_ISLAND_STONE.get());
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
			event.enqueueWork(() -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation("super_mario:concordia_dimension"), customEffect));
		}
	}
}
