package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.EliteXNautEntity;

public class EliteXNautModel extends AnimatedGeoModel<EliteXNautEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(EliteXNautEntity entity) {
		return new ResourceLocation("super_mario", "animations/xnaut.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(EliteXNautEntity entity) {
		return new ResourceLocation("super_mario", "geo/xnaut.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(EliteXNautEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
