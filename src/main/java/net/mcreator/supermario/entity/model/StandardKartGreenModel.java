package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.StandardKartGreenEntity;

public class StandardKartGreenModel extends AnimatedGeoModel<StandardKartGreenEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(StandardKartGreenEntity entity) {
		return new ResourceLocation("super_mario", "animations/standardkart.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(StandardKartGreenEntity entity) {
		return new ResourceLocation("super_mario", "geo/standardkart.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(StandardKartGreenEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
