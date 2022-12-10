
package net.mcreator.supermario.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class RedPowBlockEntity extends AbstractArrow implements ItemSupplier {

	public RedPowBlockEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(SuperMarioModEntities.RED_POW_BLOCK.get(), world);
	}

	public RedPowBlockEntity(EntityType<? extends RedPowBlockEntity> type, Level world) {
		super(type, world);
	}

	public RedPowBlockEntity(EntityType<? extends RedPowBlockEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public RedPowBlockEntity(EntityType<? extends RedPowBlockEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		RedPowBlockProjectileHitsBlockProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(),
				blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();

		if (this.inGround)
			this.discard();
	}

	public static RedPowBlockEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		RedPowBlockEntity entityarrow = new RedPowBlockEntity(SuperMarioModEntities.RED_POW_BLOCK.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);

		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));

		return entityarrow;
	}

	public static RedPowBlockEntity shoot(LivingEntity entity, LivingEntity target) {
		RedPowBlockEntity entityarrow = new RedPowBlockEntity(SuperMarioModEntities.RED_POW_BLOCK.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 0.9f * 2, 12.0F);

		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(7.5);
		entityarrow.setKnockback(1);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));

		return entityarrow;
	}

}
