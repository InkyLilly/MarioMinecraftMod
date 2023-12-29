package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.WhiteClubbaEntity;

public class WhiteClubbaModel extends AnimatedGeoModel<WhiteClubbaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(WhiteClubbaEntity entity) {
		return new ResourceLocation("super_mario", "animations/clubba.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(WhiteClubbaEntity entity) {
		return new ResourceLocation("super_mario", "geo/clubba.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(WhiteClubbaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
