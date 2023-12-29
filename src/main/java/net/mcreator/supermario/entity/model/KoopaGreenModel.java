package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.KoopaGreenEntity;

public class KoopaGreenModel extends AnimatedGeoModel<KoopaGreenEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(KoopaGreenEntity entity) {
		return new ResourceLocation("super_mario", "animations/koopatroopa.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(KoopaGreenEntity entity) {
		return new ResourceLocation("super_mario", "geo/koopatroopa.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(KoopaGreenEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
