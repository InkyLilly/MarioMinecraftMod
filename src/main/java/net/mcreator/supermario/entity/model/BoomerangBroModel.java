package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.BoomerangBroEntity;

public class BoomerangBroModel extends AnimatedGeoModel<BoomerangBroEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(BoomerangBroEntity entity) {
		return new ResourceLocation("super_mario", "animations/hammerbro.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(BoomerangBroEntity entity) {
		return new ResourceLocation("super_mario", "geo/hammerbro.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BoomerangBroEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
