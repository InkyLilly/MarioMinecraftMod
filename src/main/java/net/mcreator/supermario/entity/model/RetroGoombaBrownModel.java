package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.RetroGoombaBrownEntity;

public class RetroGoombaBrownModel extends AnimatedGeoModel<RetroGoombaBrownEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(RetroGoombaBrownEntity entity) {
		return new ResourceLocation("super_mario", "animations/goombav2.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(RetroGoombaBrownEntity entity) {
		return new ResourceLocation("super_mario", "geo/goombav2.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(RetroGoombaBrownEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
