package net.mcreator.supermario.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.entity.BulletBillEntity;

public class BulletBillModel extends AnimatedGeoModel<BulletBillEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(BulletBillEntity entity) {
		return new ResourceLocation("super_mario", "animations/bulletbillv2.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(BulletBillEntity entity) {
		return new ResourceLocation("super_mario", "geo/bulletbillv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BulletBillEntity entity) {
		return new ResourceLocation("super_mario", "textures/entities/" + entity.getTexture() + ".png");
	}

}
