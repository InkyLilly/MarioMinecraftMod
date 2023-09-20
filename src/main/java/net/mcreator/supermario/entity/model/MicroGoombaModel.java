package net.mcreator.supermario.entity.model;

public class MicroGoombaModel extends AnimatedGeoModel<MicroGoombaEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(MicroGoombaEntity entity) {
		return new ResourceLocation("super_mario", "animations/microgoomba.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(MicroGoombaEntity entity) {
		return new ResourceLocation("super_mario", "geo/microgoomba.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(MicroGoombaEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}