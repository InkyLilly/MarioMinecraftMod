package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.DuplighostEntity;

public class DuplighostModel extends AnimatedGeoModel<DuplighostEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(DuplighostEntity entity) {
		return new ResourceLocation("super_mario", "animations/duplighost.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(DuplighostEntity entity) {
		return new ResourceLocation("super_mario", "geo/duplighost.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(DuplighostEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
