package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.LanternGhostEntity;

public class LanternGhostModel extends AnimatedGeoModel<LanternGhostEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(LanternGhostEntity entity) {
		return new ResourceLocation("super_mario", "animations/lanternghost.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(LanternGhostEntity entity) {
		return new ResourceLocation("super_mario", "geo/lanternghost.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(LanternGhostEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
