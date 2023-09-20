
package net.mcreator.supermario.item;

public class MushroomWorldDimensionItem extends Item {

	public MushroomWorldDimensionItem() {
		super(new Item.Properties().tab(SuperMarioModTabs.TAB_MARIO_ITEMS).durability(64));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		Player entity = context.getPlayer();
		BlockPos pos = context.getClickedPos().relative(context.getClickedFace());
		ItemStack itemstack = context.getItemInHand();
		Level world = context.getLevel();
		if (!entity.mayUseItemAt(pos, context.getClickedFace(), itemstack)) {
			return InteractionResult.FAIL;
		} else {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			boolean success = false;

			if (world.isEmptyBlock(pos) && true) {
				MushroomWorldDimensionPortalBlock.portalSpawn(world, pos);
				itemstack.hurtAndBreak(1, entity, c -> c.broadcastBreakEvent(context.getHand()));
				success = true;
			}

			return success ? InteractionResult.SUCCESS : InteractionResult.FAIL;
		}
	}
}
