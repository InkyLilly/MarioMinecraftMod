package net.mcreator.supermario.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.supermario.init.SuperMarioModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerJumpsIntoQuestionBlockProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getDeltaMovement().y() > 0) {
			if ((world.getBlockState(new BlockPos(x,
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
					z))).getBlock() == SuperMarioModBlocks.QUESTION_MARK_BLOCK.get()
					|| (world
							.getBlockState(new BlockPos(x,
									entity.level.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE,
											ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
									z))) == SuperMarioModBlocks.QUESTION_MARK_BLOCK.get().defaultBlockState()) {
				world.setBlock(new BlockPos(x,
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)),
								ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
						z), SuperMarioModBlocks.HIT_BLOCK.get().defaultBlockState(), 3);
				{
					BlockEntity _ent = world
							.getBlockEntity(new BlockPos(x,
									entity.level.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE,
											ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
									z));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(Blocks.AIR);
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
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
			if ((world.getBlockState(new BlockPos(x,
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0.5)),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
					z))).getBlock() == SuperMarioModBlocks.QUESTION_MARK_BLOCK.get()
					|| (world
							.getBlockState(new BlockPos(x,
									entity.level.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0.5)), ClipContext.Block.OUTLINE,
											ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
									z))) == SuperMarioModBlocks.QUESTION_MARK_BLOCK.get().defaultBlockState()) {
				world.setBlock(
						new BlockPos(x, entity.level
								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0.5)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getBlockPos().getY(), z),
						SuperMarioModBlocks.HIT_BLOCK.get().defaultBlockState(), 3);
				{
					BlockEntity _ent = world
							.getBlockEntity(new BlockPos(x,
									entity.level.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0.5)), ClipContext.Block.OUTLINE,
											ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
									z));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(Blocks.AIR);
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
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
			if ((world.getBlockState(new BlockPos(x,
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
					z))).getBlock() == SuperMarioModBlocks.QUESTION_MARK_BLOCK.get()
					|| (world
							.getBlockState(new BlockPos(x,
									entity.level.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE,
											ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
									z))) == SuperMarioModBlocks.QUESTION_MARK_BLOCK.get().defaultBlockState()) {
				world.setBlock(new BlockPos(x,
						entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)),
								ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
						z), SuperMarioModBlocks.HIT_BLOCK.get().defaultBlockState(), 3);
				{
					BlockEntity _ent = world
							.getBlockEntity(new BlockPos(x,
									entity.level.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(0)), ClipContext.Block.OUTLINE,
											ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
									z));
					if (_ent != null) {
						final int _slotid = 0;
						final ItemStack _setstack = new ItemStack(Blocks.AIR);
						_setstack.setCount(1);
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
						});
					}
				}
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
