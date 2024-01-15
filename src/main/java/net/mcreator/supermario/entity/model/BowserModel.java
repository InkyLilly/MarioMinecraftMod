package net.mcreator.supermario.entity.model;

public class BowserModel extends AnimatedGeoModel<BowserEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(BowserEntity entity) {
		return new ResourceLocation("super_mario", "animations/bowser.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(BowserEntity entity) {
		return new ResourceLocation("super_mario", "geo/bowser.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BowserEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BowserEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("head");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
	}
}