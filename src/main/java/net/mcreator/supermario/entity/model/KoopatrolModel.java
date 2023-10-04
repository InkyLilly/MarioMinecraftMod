package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.KoopatrolEntity;

public class KoopatrolModel extends AnimatedGeoModel<KoopatrolEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(KoopatrolEntity entity) {
		return new ResourceLocation("super_mario", "animations/koopatrol.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(KoopatrolEntity entity) {
		return new ResourceLocation("super_mario", "geo/koopatrol.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(KoopatrolEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
