package net.mcreator.supermario.entity.model;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.NinjiEntity;

public class NinjiModel extends AnimatedGeoModel<NinjiEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(NinjiEntity entity) {
		return new ResourceLocation("super_mario", "animations/ninji.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(NinjiEntity entity) {
		return new ResourceLocation("super_mario", "geo/ninji.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(NinjiEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
