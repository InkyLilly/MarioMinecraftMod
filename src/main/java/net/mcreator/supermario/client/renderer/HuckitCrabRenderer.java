
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.HuckitCrabEntity;
import net.mcreator.supermario.client.model.ModelHuckit_Crab;

public class HuckitCrabRenderer extends MobRenderer<HuckitCrabEntity, ModelHuckit_Crab<HuckitCrabEntity>> {
	public HuckitCrabRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHuckit_Crab(context.bakeLayer(ModelHuckit_Crab.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HuckitCrabEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/huckittexture.png");
	}
}
