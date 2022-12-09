
package net.mcreator.supermario.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class SledgeHammerEntity extends AbstractArrow implements ItemSupplier {

	public SledgeHammerEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(SuperMarioModEntities.SLEDGE_HAMMER.get(), world);
	}

	public SledgeHammerEntity(EntityType<? extends SledgeHammerEntity> type, Level world) {
		super(type, world);
	}

	public SledgeHammerEntity(EntityType<? extends SledgeHammerEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public SledgeHammerEntity(EntityType<? extends SledgeHammerEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(SuperMarioModItems.SLEDGE_HAMMER.get());
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
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		SledgeHammerProjectileHitsProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		SledgeHammerProjectileHitsProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(),
				blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();

		if (this.inGround)
			this.discard();
	}

	public static SledgeHammerEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		SledgeHammerEntity entityarrow = new SledgeHammerEntity(SuperMarioModEntities.SLEDGE_HAMMER.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);

		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bamboo.step")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));

		return entityarrow;
	}

	public static SledgeHammerEntity shoot(LivingEntity entity, LivingEntity target) {
		SledgeHammerEntity entityarrow = new SledgeHammerEntity(SuperMarioModEntities.SLEDGE_HAMMER.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1.2000000000000002f * 2, 12.0F);

		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(6);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bamboo.step")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));

		return entityarrow;
	}

}
