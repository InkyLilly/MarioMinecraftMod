package net.mcreator.supermario.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerJumpsIntoQuestionBlockProcedure {
	@SubscribeEvent
	public static void onEntityJump(LivingEvent.LivingJumpEvent event) {
		execute(event, event.getEntityLiving().level, event.getEntityLiving().getX(), event.getEntityLiving().getY(), event.getEntityLiving().getZ(),
				event.getEntityLiving());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getDeltaMovement().y() != 0) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == SuperMarioModBlocks.QUESTION_MARK_BLOCK.get()) {
				world.setBlock(new BlockPos(x, y, z), SuperMarioModBlocks.HIT_BLOCK.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("super_mario:powerupappear")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("super_mario:powerupappear")),
								SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 0.5, z))).getBlock() == SuperMarioModBlocks.QUESTION_MARK_BLOCK.get()) {
				world.setBlock(new BlockPos(x, y + 0.5, z), SuperMarioModBlocks.HIT_BLOCK.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("super_mario:powerupappear")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("super_mario:powerupappear")),
								SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == SuperMarioModBlocks.QUESTION_MARK_BLOCK.get()) {
				world.setBlock(new BlockPos(x, y + 1, z), SuperMarioModBlocks.HIT_BLOCK.get().defaultBlockState(), 3);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("super_mario:powerupappear")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("super_mario:powerupappear")),
								SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}