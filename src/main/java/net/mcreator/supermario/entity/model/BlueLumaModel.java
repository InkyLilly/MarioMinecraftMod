package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.BlueLumaEntity;

public class BlueLumaModel extends AnimatedGeoModel<BlueLumaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(BlueLumaEntity entity) {
		return new ResourceLocation("super_mario", "animations/luma.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(BlueLumaEntity entity) {
		return new ResourceLocation("super_mario", "geo/luma.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BlueLumaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
