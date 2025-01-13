package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.SnifitEntity;

public class SnifitModel extends AnimatedGeoModel<SnifitEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(SnifitEntity entity) {
		return new ResourceLocation("super_mario", "animations/newsnifit.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(SnifitEntity entity) {
		return new ResourceLocation("super_mario", "geo/newsnifit.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SnifitEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
