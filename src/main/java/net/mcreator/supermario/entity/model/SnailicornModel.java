package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.SnailicornEntity;

public class SnailicornModel extends AnimatedGeoModel<SnailicornEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(SnailicornEntity entity) {
		return new ResourceLocation("super_mario", "animations/snailicorn.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(SnailicornEntity entity) {
		return new ResourceLocation("super_mario", "geo/snailicorn.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SnailicornEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
