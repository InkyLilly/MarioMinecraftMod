package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.GuardarmEntity;

public class GuardarmModel extends AnimatedGeoModel<GuardarmEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(GuardarmEntity entity) {
		return new ResourceLocation("super_mario", "animations/guardarm.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(GuardarmEntity entity) {
		return new ResourceLocation("super_mario", "geo/guardarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(GuardarmEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
