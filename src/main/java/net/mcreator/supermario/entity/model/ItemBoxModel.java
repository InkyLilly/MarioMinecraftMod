package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.ItemBoxEntity;

public class ItemBoxModel extends AnimatedGeoModel<ItemBoxEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(ItemBoxEntity entity) {
		return new ResourceLocation("super_mario", "animations/itembox.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ItemBoxEntity entity) {
		return new ResourceLocation("super_mario", "geo/itembox.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ItemBoxEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
