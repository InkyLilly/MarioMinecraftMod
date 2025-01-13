package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.DryBonesDeadEntity;

public class DryBonesDeadModel extends AnimatedGeoModel<DryBonesDeadEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(DryBonesDeadEntity entity) {
		return new ResourceLocation("super_mario", "animations/newdrybones.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(DryBonesDeadEntity entity) {
		return new ResourceLocation("super_mario", "geo/newdrybones.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(DryBonesDeadEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
