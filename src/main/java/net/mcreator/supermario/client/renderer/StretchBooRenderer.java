
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.StretchBooEntity;
import net.mcreator.supermario.client.model.ModelStretchBooDiddly;

public class StretchBooRenderer extends MobRenderer<StretchBooEntity, ModelStretchBooDiddly<StretchBooEntity>> {
	public StretchBooRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStretchBooDiddly(context.bakeLayer(ModelStretchBooDiddly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StretchBooEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/stretchbootexture.png");
	}
}
