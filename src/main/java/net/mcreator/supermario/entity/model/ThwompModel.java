package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.ThwompEntity;

public class ThwompModel extends AnimatedGeoModel<ThwompEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(ThwompEntity entity) {
		return new ResourceLocation("super_mario", "animations/thwomp.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ThwompEntity entity) {
		return new ResourceLocation("super_mario", "geo/thwomp.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ThwompEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
