package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.WalleyeEntity;

public class WalleyeModel extends AnimatedGeoModel<WalleyeEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(WalleyeEntity entity) {
		return new ResourceLocation("super_mario", "animations/walleye.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(WalleyeEntity entity) {
		return new ResourceLocation("super_mario", "geo/walleye.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(WalleyeEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
