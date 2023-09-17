package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.KoopaRedEntity;

public class KoopaRedModel extends AnimatedGeoModel<KoopaRedEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(KoopaRedEntity entity) {
		return new ResourceLocation("super_mario", "animations/koopatroopa.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(KoopaRedEntity entity) {
		return new ResourceLocation("super_mario", "geo/koopatroopa.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(KoopaRedEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
