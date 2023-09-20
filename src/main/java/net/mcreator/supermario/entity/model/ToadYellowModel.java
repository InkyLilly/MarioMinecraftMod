package net.mcreator.supermario.entity.model;

public class ToadYellowModel extends AnimatedGeoModel<ToadYellowEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(ToadYellowEntity entity) {
		return new ResourceLocation("super_mario", "animations/toad.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ToadYellowEntity entity) {
		return new ResourceLocation("super_mario", "geo/toad.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ToadYellowEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ToadYellowEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("head");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
	}
}