package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.DragletEntity;

public class DragletModel extends AnimatedGeoModel<DragletEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(DragletEntity entity) {
		return new ResourceLocation("super_mario", "animations/draglet.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(DragletEntity entity) {
		return new ResourceLocation("super_mario", "geo/draglet.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(DragletEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
