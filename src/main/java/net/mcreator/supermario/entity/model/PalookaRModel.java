package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.PalookaREntity;

public class PalookaRModel extends AnimatedGeoModel<PalookaREntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(PalookaREntity entity) {
		return new ResourceLocation("super_mario", "animations/palooka.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(PalookaREntity entity) {
		return new ResourceLocation("super_mario", "geo/palooka.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(PalookaREntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
