package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.DeepCheepEntity;

public class DeepCheepModel extends AnimatedGeoModel<DeepCheepEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(DeepCheepEntity entity) {
		return new ResourceLocation("super_mario", "animations/cheepcheep.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(DeepCheepEntity entity) {
		return new ResourceLocation("super_mario", "geo/cheepcheep.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(DeepCheepEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
