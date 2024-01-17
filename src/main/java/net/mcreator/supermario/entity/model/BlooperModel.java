package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.BlooperEntity;

public class BlooperModel extends AnimatedGeoModel<BlooperEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(BlooperEntity entity) {
		return new ResourceLocation("super_mario", "animations/blooper.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(BlooperEntity entity) {
		return new ResourceLocation("super_mario", "geo/blooper.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BlooperEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
