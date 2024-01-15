package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.SpinyEntity;

public class SpinyModel extends AnimatedGeoModel<SpinyEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(SpinyEntity entity) {
		return new ResourceLocation("super_mario", "animations/spiny.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(SpinyEntity entity) {
		return new ResourceLocation("super_mario", "geo/spiny.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SpinyEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
