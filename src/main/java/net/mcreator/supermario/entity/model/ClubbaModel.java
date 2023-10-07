package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.ClubbaEntity;

public class ClubbaModel extends AnimatedGeoModel<ClubbaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(ClubbaEntity entity) {
		return new ResourceLocation("super_mario", "animations/clubba.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ClubbaEntity entity) {
		return new ResourceLocation("super_mario", "geo/clubba.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ClubbaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
