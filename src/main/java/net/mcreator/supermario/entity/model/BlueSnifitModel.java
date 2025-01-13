package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.BlueSnifitEntity;

public class BlueSnifitModel extends AnimatedGeoModel<BlueSnifitEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(BlueSnifitEntity entity) {
		return new ResourceLocation("super_mario", "animations/newsnifit.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(BlueSnifitEntity entity) {
		return new ResourceLocation("super_mario", "geo/newsnifit.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BlueSnifitEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
