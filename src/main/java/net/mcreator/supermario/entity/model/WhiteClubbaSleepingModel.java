package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.WhiteClubbaSleepingEntity;

public class WhiteClubbaSleepingModel extends AnimatedGeoModel<WhiteClubbaSleepingEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(WhiteClubbaSleepingEntity entity) {
		return new ResourceLocation("super_mario", "animations/clubba.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(WhiteClubbaSleepingEntity entity) {
		return new ResourceLocation("super_mario", "geo/clubba.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(WhiteClubbaSleepingEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
