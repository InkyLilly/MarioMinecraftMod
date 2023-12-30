package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.KoopaBlueEntity;

public class KoopaBlueModel extends AnimatedGeoModel<KoopaBlueEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(KoopaBlueEntity entity) {
		return new ResourceLocation("super_mario", "animations/koopatroopa.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(KoopaBlueEntity entity) {
		return new ResourceLocation("super_mario", "geo/koopatroopa.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(KoopaBlueEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
