package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.WubbaEntity;

public class WubbaModel extends AnimatedGeoModel<WubbaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(WubbaEntity entity) {
		return new ResourceLocation("super_mario", "animations/wubba.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(WubbaEntity entity) {
		return new ResourceLocation("super_mario", "geo/wubba.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(WubbaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
