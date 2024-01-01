package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.ProngoEntity;

public class ProngoModel extends AnimatedGeoModel<ProngoEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(ProngoEntity entity) {
		return new ResourceLocation("super_mario", "animations/prongo.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ProngoEntity entity) {
		return new ResourceLocation("super_mario", "geo/prongo.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ProngoEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
