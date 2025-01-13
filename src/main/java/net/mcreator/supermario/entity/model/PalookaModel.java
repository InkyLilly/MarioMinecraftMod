package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.PalookaEntity;

public class PalookaModel extends AnimatedGeoModel<PalookaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(PalookaEntity entity) {
		return new ResourceLocation("super_mario", "animations/palooka.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(PalookaEntity entity) {
		return new ResourceLocation("super_mario", "geo/palooka.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(PalookaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
