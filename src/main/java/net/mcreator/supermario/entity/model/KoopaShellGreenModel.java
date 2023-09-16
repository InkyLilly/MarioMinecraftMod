package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.KoopaShellGreenEntity;

public class KoopaShellGreenModel extends AnimatedGeoModel<KoopaShellGreenEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(KoopaShellGreenEntity entity) {
		return new ResourceLocation("super_mario", "animations/koopashell.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(KoopaShellGreenEntity entity) {
		return new ResourceLocation("super_mario", "geo/koopashell.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(KoopaShellGreenEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
