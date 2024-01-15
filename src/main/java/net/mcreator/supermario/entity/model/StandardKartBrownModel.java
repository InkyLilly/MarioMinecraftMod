package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.StandardKartBrownEntity;

public class StandardKartBrownModel extends AnimatedGeoModel<StandardKartBrownEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(StandardKartBrownEntity entity) {
		return new ResourceLocation("super_mario", "animations/standardkart.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(StandardKartBrownEntity entity) {
		return new ResourceLocation("super_mario", "geo/standardkart.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(StandardKartBrownEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
