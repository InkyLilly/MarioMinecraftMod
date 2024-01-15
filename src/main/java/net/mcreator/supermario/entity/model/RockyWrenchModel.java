package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.RockyWrenchEntity;

public class RockyWrenchModel extends AnimatedGeoModel<RockyWrenchEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(RockyWrenchEntity entity) {
		return new ResourceLocation("super_mario", "animations/rockywrench.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(RockyWrenchEntity entity) {
		return new ResourceLocation("super_mario", "geo/rockywrench.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(RockyWrenchEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
