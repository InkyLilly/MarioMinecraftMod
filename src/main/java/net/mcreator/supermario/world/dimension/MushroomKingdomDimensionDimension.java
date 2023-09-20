
package net.mcreator.supermario.world.dimension;

@Mod.EventBusSubscriber
public class MushroomKingdomDimensionDimension {

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Fixers {

		@SubscribeEvent
		public static void registerFillerBlocks(FMLCommonSetupEvent event) {
			Set<Block> replaceableBlocks = new HashSet<>();
			replaceableBlocks.add(SuperMarioModBlocks.ACORN_PLAINS_DIRT.get());

			replaceableBlocks.add(SuperMarioModBlocks.SODA_JUNGLE_GHOST_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.SODA_JUNGLE_GHOST_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.FROSTED_GLACIER_SNOWY_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.FROSTED_GLACIER_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.SPARKLING_WATERS_BEACH_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.SPARKLING_WATERS_BEACH_STONE.get());
			replaceableBlocks.add(SuperMarioModBlocks.MERINGUE_CLOUDS_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.MERINGUE_CLOUDS_STONE.get());
			replaceableBlocks.add(SuperMarioModBlocks.LAYER_CAKE_DESERT_ROAD.get());
			replaceableBlocks.add(SuperMarioModBlocks.LAYER_CAKE_DESERT_SAND.get());
			replaceableBlocks.add(Blocks.AIR);
			replaceableBlocks.add(SuperMarioModBlocks.ROCK_CANDY_MINES_STONE_WHITE.get());
			replaceableBlocks.add(SuperMarioModBlocks.SODA_JUNGLE_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.SODA_JUNGLE_DIRT.get());
			replaceableBlocks.add(Blocks.AIR);
			replaceableBlocks.add(SuperMarioModBlocks.MUSHROOM_KINGDOM_OCEAN_STONE.get());
			replaceableBlocks.add(SuperMarioModBlocks.ACORN_PLAINS_GRASS.get());
			replaceableBlocks.add(SuperMarioModBlocks.ACORN_PLAINS_DIRT.get());
			replaceableBlocks.add(SuperMarioModBlocks.SPARKLING_WATERS_ROAD.get());
			replaceableBlocks.add(SuperMarioModBlocks.SPARKLING_WATERS_STONE.get());
			replaceableBlocks.add(SuperMarioModBlocks.MUSHSTONE.get());
			replaceableBlocks.add(SuperMarioModBlocks.MUSHSTONE.get());
			replaceableBlocks.add(SuperMarioModBlocks.VOLCANO_ROCK.get());
			replaceableBlocks.add(SuperMarioModBlocks.VOLCANO_ROCK.get());
			replaceableBlocks.add(SuperMarioModBlocks.MUSHSTONE.get());
			replaceableBlocks.add(SuperMarioModBlocks.MUSHSTONE.get());

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

			event.enqueueWork(() -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation("super_mario:mushroom_kingdom_dimension"), customEffect));
		}

	}

}
