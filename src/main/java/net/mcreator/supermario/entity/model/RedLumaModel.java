package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.RedLumaEntity;

public class RedLumaModel extends AnimatedGeoModel<RedLumaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(RedLumaEntity entity) {
		return new ResourceLocation("super_mario", "animations/luma.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(RedLumaEntity entity) {
		return new ResourceLocation("super_mario", "geo/luma.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(RedLumaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
