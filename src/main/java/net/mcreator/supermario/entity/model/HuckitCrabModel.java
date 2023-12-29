package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.HuckitCrabEntity;

public class HuckitCrabModel extends AnimatedGeoModel<HuckitCrabEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(HuckitCrabEntity entity) {
		return new ResourceLocation("super_mario", "animations/huckitcrabv2.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(HuckitCrabEntity entity) {
		return new ResourceLocation("super_mario", "geo/huckitcrabv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(HuckitCrabEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
