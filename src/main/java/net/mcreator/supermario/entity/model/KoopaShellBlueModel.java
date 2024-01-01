package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.KoopaShellBlueEntity;

public class KoopaShellBlueModel extends AnimatedGeoModel<KoopaShellBlueEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(KoopaShellBlueEntity entity) {
		return new ResourceLocation("super_mario", "animations/koopashell.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(KoopaShellBlueEntity entity) {
		return new ResourceLocation("super_mario", "geo/koopashell.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(KoopaShellBlueEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
