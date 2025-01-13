
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.BumbleshootEntity;
import net.mcreator.supermario.client.model.ModelBumbleshoot;

public class BumbleshootRenderer extends MobRenderer<BumbleshootEntity, ModelBumbleshoot<BumbleshootEntity>> {
	public BumbleshootRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBumbleshoot(context.bakeLayer(ModelBumbleshoot.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BumbleshootEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/bumbleshoottexture.png");
	}
}
