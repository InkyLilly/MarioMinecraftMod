package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.GaloombaEntity;

public class GaloombaModel extends AnimatedGeoModel<GaloombaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(GaloombaEntity entity) {
		return new ResourceLocation("super_mario", "animations/galoomba.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(GaloombaEntity entity) {
		return new ResourceLocation("super_mario", "geo/galoomba.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(GaloombaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
