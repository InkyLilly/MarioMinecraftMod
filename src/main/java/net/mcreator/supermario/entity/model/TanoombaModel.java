package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.TanoombaEntity;

public class TanoombaModel extends AnimatedGeoModel<TanoombaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(TanoombaEntity entity) {
		return new ResourceLocation("super_mario", "animations/newtanoomba.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(TanoombaEntity entity) {
		return new ResourceLocation("super_mario", "geo/newtanoomba.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(TanoombaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
