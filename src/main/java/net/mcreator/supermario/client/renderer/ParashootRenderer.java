
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.ParashootEntity;
import net.mcreator.supermario.client.model.ModelBumbleshoot;

public class ParashootRenderer extends MobRenderer<ParashootEntity, ModelBumbleshoot<ParashootEntity>> {
	public ParashootRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBumbleshoot(context.bakeLayer(ModelBumbleshoot.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ParashootEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/parashoottexture.png");
	}
}
