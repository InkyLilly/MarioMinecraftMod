package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.LightBlueShyGuyEntity;

public class LightBlueShyGuyModel extends AnimatedGeoModel<LightBlueShyGuyEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(LightBlueShyGuyEntity entity) {
		return new ResourceLocation("super_mario", "animations/shyguy.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(LightBlueShyGuyEntity entity) {
		return new ResourceLocation("super_mario", "geo/shyguy.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(LightBlueShyGuyEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
