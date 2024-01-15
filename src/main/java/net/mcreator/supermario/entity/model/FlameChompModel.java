package net.mcreator.supermario.entity.model;

public class FlameChompModel extends AnimatedGeoModel<FlameChompEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(FlameChompEntity entity) {
		return new ResourceLocation("super_mario", "animations/flamechomp.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(FlameChompEntity entity) {
		return new ResourceLocation("super_mario", "geo/flamechomp.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(FlameChompEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}