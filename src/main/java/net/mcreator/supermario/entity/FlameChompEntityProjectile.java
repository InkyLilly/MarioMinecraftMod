
package net.mcreator.supermario.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class FlameChompEntityProjectile extends AbstractArrow implements ItemSupplier {

	public FlameChompEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(SuperMarioModEntities.FLAME_CHOMP_PROJECTILE.get(), world);
	}

	public FlameChompEntityProjectile(EntityType<? extends FlameChompEntityProjectile> type, Level world) {
		super(type, world);
	}

	public FlameChompEntityProjectile(EntityType<? extends FlameChompEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public FlameChompEntityProjectile(EntityType<? extends FlameChompEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.LAVA);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Blocks.LAVA);
	}
}
