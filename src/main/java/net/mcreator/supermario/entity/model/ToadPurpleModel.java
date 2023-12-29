package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.supermario.entity.ToadPurpleEntity;

public class ToadPurpleModel extends AnimatedGeoModel<ToadPurpleEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(ToadPurpleEntity entity) {
		return new ResourceLocation("super_mario", "animations/toad.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ToadPurpleEntity entity) {
		return new ResourceLocation("super_mario", "geo/toad.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ToadPurpleEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ToadPurpleEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("head");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
	}
}
