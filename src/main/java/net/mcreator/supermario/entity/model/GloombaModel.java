package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.GloombaEntity;

public class GloombaModel extends AnimatedGeoModel<GloombaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(GloombaEntity entity) {
		return new ResourceLocation("super_mario", "animations/goombav2.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(GloombaEntity entity) {
		return new ResourceLocation("super_mario", "geo/goombav2.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(GloombaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
