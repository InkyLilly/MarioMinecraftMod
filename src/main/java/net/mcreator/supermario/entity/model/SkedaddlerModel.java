package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.SkedaddlerEntity;

public class SkedaddlerModel extends AnimatedGeoModel<SkedaddlerEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(SkedaddlerEntity entity) {
		return new ResourceLocation("super_mario", "animations/skedaddler.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(SkedaddlerEntity entity) {
		return new ResourceLocation("super_mario", "geo/skedaddler.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SkedaddlerEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
