package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.KoopaShellRedEntity;

public class KoopaShellRedModel extends AnimatedGeoModel<KoopaShellRedEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(KoopaShellRedEntity entity) {
		return new ResourceLocation("super_mario", "animations/koopashell.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(KoopaShellRedEntity entity) {
		return new ResourceLocation("super_mario", "geo/koopashell.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(KoopaShellRedEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
