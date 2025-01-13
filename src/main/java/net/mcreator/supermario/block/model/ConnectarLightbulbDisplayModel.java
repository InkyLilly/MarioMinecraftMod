package net.mcreator.supermario.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.block.display.ConnectarLightbulbDisplayItem;

public class ConnectarLightbulbDisplayModel extends AnimatedGeoModel<ConnectarLightbulbDisplayItem> {
	@Override
	public ResourceLocation getAnimationFileLocation(ConnectarLightbulbDisplayItem animatable) {
		return new ResourceLocation("super_mario", "animations/giantlightbulb.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ConnectarLightbulbDisplayItem animatable) {
		return new ResourceLocation("super_mario", "geo/giantlightbulb.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ConnectarLightbulbDisplayItem entity) {
		return new ResourceLocation("super_mario", "textures/blocks/giantlightbulbtexture.png");
	}
}
