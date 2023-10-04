package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.FireBroEntity;

public class FireBroModel extends AnimatedGeoModel<FireBroEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(FireBroEntity entity) {
		return new ResourceLocation("super_mario", "animations/hammerbro.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(FireBroEntity entity) {
		return new ResourceLocation("super_mario", "geo/hammerbro.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(FireBroEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
