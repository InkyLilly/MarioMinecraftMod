package net.mcreator.supermario.world.features.treedecorators;

public class SodaJungleTrunkDecorator extends TrunkVineDecorator {

	public static final SodaJungleTrunkDecorator INSTANCE = new SodaJungleTrunkDecorator();

	public static com.mojang.serialization.Codec<SodaJungleTrunkDecorator> codec;
	public static TreeDecoratorType<?> tdt;

	static {
		codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		tdt = new TreeDecoratorType<>(codec);
		tdt.setRegistryName("soda_jungle_tree_trunk_decorator");
		ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
	}

	@Override
	protected TreeDecoratorType<?> type() {
		return tdt;
	}

	@Override
	public void place(LevelSimulatedReader levelReader, BiConsumer<BlockPos, BlockState> biConsumer, Random random, List<BlockPos> listBlockPos,
			List<BlockPos> listBlockPos2) {
		listBlockPos.forEach(blockpos -> {
			if (random.nextInt(3) > 0) {
				BlockPos bp = blockpos.below();
				if (Feature.isAir(levelReader, bp)) {
					biConsumer.accept(blockpos, Blocks.VINE.defaultBlockState());
				}
			}

		});
	}
}
