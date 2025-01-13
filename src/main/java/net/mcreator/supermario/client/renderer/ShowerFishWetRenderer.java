
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.ShowerFishWetEntity;
import net.mcreator.supermario.client.model.ModelShowerFishWet;

public class ShowerFishWetRenderer extends MobRenderer<ShowerFishWetEntity, ModelShowerFishWet<ShowerFishWetEntity>> {
	public ShowerFishWetRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelShowerFishWet(context.bakeLayer(ModelShowerFishWet.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShowerFishWetEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/showerfishwettexture.png");
	}
}
