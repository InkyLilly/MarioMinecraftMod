package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.BullyEntity;

public class BullyModel extends AnimatedGeoModel<BullyEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(BullyEntity entity) {
		return new ResourceLocation("super_mario", "animations/bully.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(BullyEntity entity) {
		return new ResourceLocation("super_mario", "geo/bully.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BullyEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
