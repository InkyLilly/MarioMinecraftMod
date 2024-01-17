package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.MontyMoleEntity;

public class MontyMoleModel extends AnimatedGeoModel<MontyMoleEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(MontyMoleEntity entity) {
		return new ResourceLocation("super_mario", "animations/montymole.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(MontyMoleEntity entity) {
		return new ResourceLocation("super_mario", "geo/montymole.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(MontyMoleEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
