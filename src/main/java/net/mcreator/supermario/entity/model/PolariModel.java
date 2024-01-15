package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.PolariEntity;

public class PolariModel extends AnimatedGeoModel<PolariEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(PolariEntity entity) {
		return new ResourceLocation("super_mario", "animations/luma.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(PolariEntity entity) {
		return new ResourceLocation("super_mario", "geo/luma.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(PolariEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
