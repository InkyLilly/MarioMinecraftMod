
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.ShowerFishDryEntity;
import net.mcreator.supermario.client.model.ModelShowerFishDry;

public class ShowerFishDryRenderer extends MobRenderer<ShowerFishDryEntity, ModelShowerFishDry<ShowerFishDryEntity>> {
	public ShowerFishDryRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelShowerFishDry(context.bakeLayer(ModelShowerFishDry.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShowerFishDryEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/showerfishdrytexture.png");
	}
}
