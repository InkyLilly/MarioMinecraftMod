package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.AmpEntity;

public class AmpModel extends AnimatedGeoModel<AmpEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(AmpEntity entity) {
		return new ResourceLocation("super_mario", "animations/amp.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(AmpEntity entity) {
		return new ResourceLocation("super_mario", "geo/amp.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(AmpEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
