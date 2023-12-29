package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.RedShyGuyEntity;

public class RedShyGuyModel extends AnimatedGeoModel<RedShyGuyEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(RedShyGuyEntity entity) {
		return new ResourceLocation("super_mario", "animations/shyguy.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(RedShyGuyEntity entity) {
		return new ResourceLocation("super_mario", "geo/shyguy.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(RedShyGuyEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
