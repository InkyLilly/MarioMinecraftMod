package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.KrodeEntity;

public class KrodeModel extends AnimatedGeoModel<KrodeEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(KrodeEntity entity) {
		return new ResourceLocation("super_mario", "animations/krode.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(KrodeEntity entity) {
		return new ResourceLocation("super_mario", "geo/krode.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(KrodeEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
