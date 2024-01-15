
package net.mcreator.supermario.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class BowserEntityProjectile extends AbstractArrow implements ItemSupplier {

	public BowserEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(SuperMarioModEntities.BOWSER_PROJECTILE.get(), world);
	}

	public BowserEntityProjectile(EntityType<? extends BowserEntityProjectile> type, Level world) {
		super(type, world);
	}

	public BowserEntityProjectile(EntityType<? extends BowserEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public BowserEntityProjectile(EntityType<? extends BowserEntityProjectile> type, LivingEntity entity, Level world) {
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
