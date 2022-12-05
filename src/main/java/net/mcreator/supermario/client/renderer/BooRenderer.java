
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.BooEntity;
import net.mcreator.supermario.client.model.ModelBooDiddly;

public class BooRenderer extends MobRenderer<BooEntity, ModelBooDiddly<BooEntity>> {
	public BooRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBooDiddly(context.bakeLayer(ModelBooDiddly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BooEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/bootexture.png");
	}
}
