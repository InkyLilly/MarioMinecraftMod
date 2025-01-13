package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.ReclusiffEntity;

public class ReclusiffModel extends AnimatedGeoModel<ReclusiffEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(ReclusiffEntity entity) {
		return new ResourceLocation("super_mario", "animations/reclusiff.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ReclusiffEntity entity) {
		return new ResourceLocation("super_mario", "geo/reclusiff.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ReclusiffEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
