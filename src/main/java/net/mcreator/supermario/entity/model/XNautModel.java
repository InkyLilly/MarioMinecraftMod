package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.XNautEntity;

public class XNautModel extends AnimatedGeoModel<XNautEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(XNautEntity entity) {
		return new ResourceLocation("super_mario", "animations/xnaut.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(XNautEntity entity) {
		return new ResourceLocation("super_mario", "geo/xnaut.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(XNautEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
