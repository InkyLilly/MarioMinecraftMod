package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.CurlupEntity;

public class CurlupModel extends AnimatedGeoModel<CurlupEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(CurlupEntity entity) {
		return new ResourceLocation("super_mario", "animations/curlup.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(CurlupEntity entity) {
		return new ResourceLocation("super_mario", "geo/curlup.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(CurlupEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
