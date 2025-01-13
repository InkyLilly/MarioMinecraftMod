package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.BrolderEntity;

public class BrolderModel extends AnimatedGeoModel<BrolderEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(BrolderEntity entity) {
		return new ResourceLocation("super_mario", "animations/brolder.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(BrolderEntity entity) {
		return new ResourceLocation("super_mario", "geo/brolder.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BrolderEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
