package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.HammerBroEntity;

public class HammerBroModel extends AnimatedGeoModel<HammerBroEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(HammerBroEntity entity) {
		return new ResourceLocation("super_mario", "animations/hammerbro.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(HammerBroEntity entity) {
		return new ResourceLocation("super_mario", "geo/hammerbro.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(HammerBroEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
