package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.LumaEntity;

public class LumaModel extends AnimatedGeoModel<LumaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(LumaEntity entity) {
		return new ResourceLocation("super_mario", "animations/luma.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(LumaEntity entity) {
		return new ResourceLocation("super_mario", "geo/luma.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(LumaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
