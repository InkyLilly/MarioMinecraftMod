package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.LakituEntity;

public class LakituModel extends AnimatedGeoModel<LakituEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(LakituEntity entity) {
		return new ResourceLocation("super_mario", "animations/lakitu.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(LakituEntity entity) {
		return new ResourceLocation("super_mario", "geo/lakitu.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(LakituEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
