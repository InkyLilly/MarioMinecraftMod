package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.MechaKoopaEntity;

public class MechaKoopaModel extends AnimatedGeoModel<MechaKoopaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(MechaKoopaEntity entity) {
		return new ResourceLocation("super_mario", "animations/mechakoopav2.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(MechaKoopaEntity entity) {
		return new ResourceLocation("super_mario", "geo/mechakoopav2.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(MechaKoopaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
