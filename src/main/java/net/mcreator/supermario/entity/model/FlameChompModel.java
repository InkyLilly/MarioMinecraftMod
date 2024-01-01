package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.FlameChompEntity;

public class FlameChompModel extends AnimatedGeoModel<FlameChompEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(FlameChompEntity entity) {
		return new ResourceLocation("super_mario", "animations/flamechomp.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(FlameChompEntity entity) {
		return new ResourceLocation("super_mario", "geo/flamechomp.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(FlameChompEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
