package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.GreenShyGuyEntity;

public class GreenShyGuyModel extends AnimatedGeoModel<GreenShyGuyEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(GreenShyGuyEntity entity) {
		return new ResourceLocation("super_mario", "animations/shyguy.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(GreenShyGuyEntity entity) {
		return new ResourceLocation("super_mario", "geo/shyguy.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(GreenShyGuyEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
