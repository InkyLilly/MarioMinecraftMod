package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.CatGoombaEntity;

public class CatGoombaModel extends AnimatedGeoModel<CatGoombaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(CatGoombaEntity entity) {
		return new ResourceLocation("super_mario", "animations/newcatgoomba.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(CatGoombaEntity entity) {
		return new ResourceLocation("super_mario", "geo/newcatgoomba.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(CatGoombaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
