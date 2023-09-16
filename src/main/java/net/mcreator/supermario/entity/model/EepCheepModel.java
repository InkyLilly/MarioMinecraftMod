package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.EepCheepEntity;

public class EepCheepModel extends AnimatedGeoModel<EepCheepEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(EepCheepEntity entity) {
		return new ResourceLocation("super_mario", "animations/cheepcheep.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(EepCheepEntity entity) {
		return new ResourceLocation("super_mario", "geo/cheepcheep.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(EepCheepEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
