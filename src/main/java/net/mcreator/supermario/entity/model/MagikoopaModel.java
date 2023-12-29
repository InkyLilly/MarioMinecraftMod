package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.supermario.entity.MagikoopaEntity;

public class MagikoopaModel extends AnimatedGeoModel<MagikoopaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(MagikoopaEntity entity) {
		return new ResourceLocation("super_mario", "animations/kamek.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(MagikoopaEntity entity) {
		return new ResourceLocation("super_mario", "geo/kamek.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(MagikoopaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(MagikoopaEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("head");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
	}
}
