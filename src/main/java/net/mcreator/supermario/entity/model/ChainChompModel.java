package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.ChainChompEntity;

public class ChainChompModel extends AnimatedGeoModel<ChainChompEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(ChainChompEntity entity) {
		return new ResourceLocation("super_mario", "animations/chainchomp.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ChainChompEntity entity) {
		return new ResourceLocation("super_mario", "geo/chainchomp.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ChainChompEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
