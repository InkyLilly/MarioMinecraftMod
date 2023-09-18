package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.XNautPHDEntity;

public class XNautPHDModel extends AnimatedGeoModel<XNautPHDEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(XNautPHDEntity entity) {
		return new ResourceLocation("super_mario", "animations/xnaut.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(XNautPHDEntity entity) {
		return new ResourceLocation("super_mario", "geo/xnaut.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(XNautPHDEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
