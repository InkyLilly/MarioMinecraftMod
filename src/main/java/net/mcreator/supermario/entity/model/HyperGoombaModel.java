package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.HyperGoombaEntity;

public class HyperGoombaModel extends AnimatedGeoModel<HyperGoombaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(HyperGoombaEntity entity) {
		return new ResourceLocation("super_mario", "animations/goombav2.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(HyperGoombaEntity entity) {
		return new ResourceLocation("super_mario", "geo/goombav2.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(HyperGoombaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
