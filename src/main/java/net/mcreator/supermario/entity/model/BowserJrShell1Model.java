package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.BowserJrShell1Entity;

public class BowserJrShell1Model extends AnimatedGeoModel<BowserJrShell1Entity> {
	@Override
	public ResourceLocation getAnimationFileLocation(BowserJrShell1Entity entity) {
		return new ResourceLocation("super_mario", "animations/bowserjr.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(BowserJrShell1Entity entity) {
		return new ResourceLocation("super_mario", "geo/bowserjr.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BowserJrShell1Entity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
