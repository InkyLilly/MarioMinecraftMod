package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.GoombaEntity;

public class GoombaModel extends AnimatedGeoModel<GoombaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(GoombaEntity entity) {
		return new ResourceLocation("super_mario", "animations/goombav2.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(GoombaEntity entity) {
		return new ResourceLocation("super_mario", "geo/goombav2.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(GoombaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
