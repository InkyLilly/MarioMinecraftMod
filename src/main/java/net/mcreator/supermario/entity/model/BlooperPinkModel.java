package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.BlooperPinkEntity;

public class BlooperPinkModel extends AnimatedGeoModel<BlooperPinkEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(BlooperPinkEntity entity) {
		return new ResourceLocation("super_mario", "animations/blooper.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(BlooperPinkEntity entity) {
		return new ResourceLocation("super_mario", "geo/blooper.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BlooperPinkEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
