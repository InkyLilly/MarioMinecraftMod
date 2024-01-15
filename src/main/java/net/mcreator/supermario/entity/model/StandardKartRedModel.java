package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.StandardKartRedEntity;

public class StandardKartRedModel extends AnimatedGeoModel<StandardKartRedEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(StandardKartRedEntity entity) {
		return new ResourceLocation("super_mario", "animations/standardkart.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(StandardKartRedEntity entity) {
		return new ResourceLocation("super_mario", "geo/standardkart.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(StandardKartRedEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
