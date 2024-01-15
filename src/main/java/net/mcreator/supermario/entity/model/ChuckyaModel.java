package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.ChuckyaEntity;

public class ChuckyaModel extends AnimatedGeoModel<ChuckyaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(ChuckyaEntity entity) {
		return new ResourceLocation("super_mario", "animations/chuckya.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ChuckyaEntity entity) {
		return new ResourceLocation("super_mario", "geo/chuckya.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ChuckyaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
