package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.IceBroEntity;

public class IceBroModel extends AnimatedGeoModel<IceBroEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(IceBroEntity entity) {
		return new ResourceLocation("super_mario", "animations/hammerbro.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(IceBroEntity entity) {
		return new ResourceLocation("super_mario", "geo/hammerbro.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(IceBroEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
