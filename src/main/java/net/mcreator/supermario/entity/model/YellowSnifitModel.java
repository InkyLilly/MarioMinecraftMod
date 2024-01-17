package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.YellowSnifitEntity;

public class YellowSnifitModel extends AnimatedGeoModel<YellowSnifitEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(YellowSnifitEntity entity) {
		return new ResourceLocation("super_mario", "animations/snifit.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(YellowSnifitEntity entity) {
		return new ResourceLocation("super_mario", "geo/snifit.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(YellowSnifitEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
