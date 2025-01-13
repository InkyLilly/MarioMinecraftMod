package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.RetroGoombaBlueEntity;

public class RetroGoombaBlueModel extends AnimatedGeoModel<RetroGoombaBlueEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(RetroGoombaBlueEntity entity) {
		return new ResourceLocation("super_mario", "animations/newgoomba.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(RetroGoombaBlueEntity entity) {
		return new ResourceLocation("super_mario", "geo/newgoomba.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(RetroGoombaBlueEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
