
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.SproingEntity;
import net.mcreator.supermario.client.model.ModelSproing;

public class SproingRenderer extends MobRenderer<SproingEntity, ModelSproing<SproingEntity>> {
	public SproingRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSproing(context.bakeLayer(ModelSproing.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SproingEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/sproingtexture.png");
	}
}
