package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.StandardKartPinkEntity;

public class StandardKartPinkModel extends AnimatedGeoModel<StandardKartPinkEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(StandardKartPinkEntity entity) {
		return new ResourceLocation("super_mario", "animations/standardkart.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(StandardKartPinkEntity entity) {
		return new ResourceLocation("super_mario", "geo/standardkart.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(StandardKartPinkEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
