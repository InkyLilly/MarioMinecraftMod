package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.BowserJrShell2Entity;

public class BowserJrShell2Model extends AnimatedGeoModel<BowserJrShell2Entity> {
	@Override
	public ResourceLocation getAnimationFileLocation(BowserJrShell2Entity entity) {
		return new ResourceLocation("super_mario", "animations/bowserjr.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(BowserJrShell2Entity entity) {
		return new ResourceLocation("super_mario", "geo/bowserjr.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BowserJrShell2Entity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
