package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.MartyEntity;

public class MartyModel extends AnimatedGeoModel<MartyEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(MartyEntity entity) {
		return new ResourceLocation("super_mario", "animations/thwomp.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(MartyEntity entity) {
		return new ResourceLocation("super_mario", "geo/thwomp.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(MartyEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
