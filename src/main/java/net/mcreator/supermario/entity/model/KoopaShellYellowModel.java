package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.KoopaShellYellowEntity;

public class KoopaShellYellowModel extends AnimatedGeoModel<KoopaShellYellowEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(KoopaShellYellowEntity entity) {
		return new ResourceLocation("super_mario", "animations/koopashell.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(KoopaShellYellowEntity entity) {
		return new ResourceLocation("super_mario", "geo/koopashell.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(KoopaShellYellowEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
