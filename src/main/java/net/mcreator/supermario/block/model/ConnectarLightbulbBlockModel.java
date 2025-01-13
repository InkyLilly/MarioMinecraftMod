package net.mcreator.supermario.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.block.entity.ConnectarLightbulbTileEntity;

public class ConnectarLightbulbBlockModel extends AnimatedGeoModel<ConnectarLightbulbTileEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(ConnectarLightbulbTileEntity animatable) {
		return new ResourceLocation("super_mario", "animations/giantlightbulb.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ConnectarLightbulbTileEntity animatable) {
		return new ResourceLocation("super_mario", "geo/giantlightbulb.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ConnectarLightbulbTileEntity entity) {
		return new ResourceLocation("super_mario", "textures/blocks/giantlightbulbtexture.png");
	}
}
