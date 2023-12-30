package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.ClubbaSleepingEntity;

public class ClubbaSleepingModel extends AnimatedGeoModel<ClubbaSleepingEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(ClubbaSleepingEntity entity) {
		return new ResourceLocation("super_mario", "animations/clubba.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ClubbaSleepingEntity entity) {
		return new ResourceLocation("super_mario", "geo/clubba.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ClubbaSleepingEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
