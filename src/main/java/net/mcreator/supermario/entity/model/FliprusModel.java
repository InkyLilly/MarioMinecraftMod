package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.FliprusEntity;

public class FliprusModel extends AnimatedGeoModel<FliprusEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(FliprusEntity entity) {
		return new ResourceLocation("super_mario", "animations/fliprus.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(FliprusEntity entity) {
		return new ResourceLocation("super_mario", "geo/fliprus.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(FliprusEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
