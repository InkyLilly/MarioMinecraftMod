package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.GreenShyGuyEntity;

public class GreenShyGuyModel extends AnimatedGeoModel<GreenShyGuyEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(GreenShyGuyEntity entity) {
		return new ResourceLocation("super_mario", "animations/newshyguy.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(GreenShyGuyEntity entity) {
		return new ResourceLocation("super_mario", "geo/newshyguy.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(GreenShyGuyEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
