package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.RetroGoombaGrayEntity;

public class RetroGoombaGrayModel extends AnimatedGeoModel<RetroGoombaGrayEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(RetroGoombaGrayEntity entity) {
		return new ResourceLocation("super_mario", "animations/newgoomba.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(RetroGoombaGrayEntity entity) {
		return new ResourceLocation("super_mario", "geo/newgoomba.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(RetroGoombaGrayEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
