package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.KoopaYellowEntity;

public class KoopaYellowModel extends AnimatedGeoModel<KoopaYellowEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(KoopaYellowEntity entity) {
		return new ResourceLocation("super_mario", "animations/koopatroopa.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(KoopaYellowEntity entity) {
		return new ResourceLocation("super_mario", "geo/koopatroopa.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(KoopaYellowEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
