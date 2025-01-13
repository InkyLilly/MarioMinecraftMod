
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.MilltonEntity;
import net.mcreator.supermario.client.model.ModelMillton;

public class MilltonRenderer extends MobRenderer<MilltonEntity, ModelMillton<MilltonEntity>> {
	public MilltonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMillton(context.bakeLayer(ModelMillton.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MilltonEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/milltontexture.png");
	}
}
