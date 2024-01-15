package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.PinkLumaEntity;

public class PinkLumaModel extends AnimatedGeoModel<PinkLumaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(PinkLumaEntity entity) {
		return new ResourceLocation("super_mario", "animations/luma.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(PinkLumaEntity entity) {
		return new ResourceLocation("super_mario", "geo/luma.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(PinkLumaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
