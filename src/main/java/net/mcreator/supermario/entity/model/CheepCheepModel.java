package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.CheepCheepEntity;

public class CheepCheepModel extends AnimatedGeoModel<CheepCheepEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(CheepCheepEntity entity) {
		return new ResourceLocation("super_mario", "animations/cheepcheep.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(CheepCheepEntity entity) {
		return new ResourceLocation("super_mario", "geo/cheepcheep.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(CheepCheepEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
