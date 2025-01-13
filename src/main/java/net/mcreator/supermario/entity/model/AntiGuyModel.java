package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.AntiGuyEntity;

public class AntiGuyModel extends AnimatedGeoModel<AntiGuyEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(AntiGuyEntity entity) {
		return new ResourceLocation("super_mario", "animations/newshyguy.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(AntiGuyEntity entity) {
		return new ResourceLocation("super_mario", "geo/newshyguy.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(AntiGuyEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
