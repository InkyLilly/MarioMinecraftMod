
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.SnailicornEntity;
import net.mcreator.supermario.client.model.ModelNewSnailicorn;

public class SnailicornRenderer extends MobRenderer<SnailicornEntity, ModelNewSnailicorn<SnailicornEntity>> {
	public SnailicornRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNewSnailicorn(context.bakeLayer(ModelNewSnailicorn.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnailicornEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/newsnailicorntexture.png");
	}
}
