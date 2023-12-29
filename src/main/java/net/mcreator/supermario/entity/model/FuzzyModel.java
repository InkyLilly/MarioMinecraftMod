package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.FuzzyEntity;

public class FuzzyModel extends AnimatedGeoModel<FuzzyEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(FuzzyEntity entity) {
		return new ResourceLocation("super_mario", "animations/fuzzyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(FuzzyEntity entity) {
		return new ResourceLocation("super_mario", "geo/fuzzyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(FuzzyEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
