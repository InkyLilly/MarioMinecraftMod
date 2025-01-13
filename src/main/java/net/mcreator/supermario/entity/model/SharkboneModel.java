package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.SharkboneEntity;

public class SharkboneModel extends AnimatedGeoModel<SharkboneEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(SharkboneEntity entity) {
		return new ResourceLocation("super_mario", "animations/sharkbone.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(SharkboneEntity entity) {
		return new ResourceLocation("super_mario", "geo/sharkbone.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SharkboneEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
