package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.BlueShyGuyEntity;

public class BlueShyGuyModel extends AnimatedGeoModel<BlueShyGuyEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(BlueShyGuyEntity entity) {
		return new ResourceLocation("super_mario", "animations/shyguy.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(BlueShyGuyEntity entity) {
		return new ResourceLocation("super_mario", "geo/shyguy.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BlueShyGuyEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
