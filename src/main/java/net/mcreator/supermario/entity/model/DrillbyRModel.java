package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.DrillbyREntity;

public class DrillbyRModel extends AnimatedGeoModel<DrillbyREntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(DrillbyREntity entity) {
		return new ResourceLocation("super_mario", "animations/drillby.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(DrillbyREntity entity) {
		return new ResourceLocation("super_mario", "geo/drillby.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(DrillbyREntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
