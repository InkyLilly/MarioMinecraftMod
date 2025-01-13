package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.DrillbyEntity;

public class DrillbyModel extends AnimatedGeoModel<DrillbyEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(DrillbyEntity entity) {
		return new ResourceLocation("super_mario", "animations/drillby.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(DrillbyEntity entity) {
		return new ResourceLocation("super_mario", "geo/drillby.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(DrillbyEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
