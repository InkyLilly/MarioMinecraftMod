package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.ParaGoombaEntity;

public class ParaGoombaModel extends AnimatedGeoModel<ParaGoombaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(ParaGoombaEntity entity) {
		return new ResourceLocation("super_mario", "animations/paragoombav2.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ParaGoombaEntity entity) {
		return new ResourceLocation("super_mario", "geo/paragoombav2.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ParaGoombaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
