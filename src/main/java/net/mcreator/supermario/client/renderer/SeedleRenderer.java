
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.SeedleEntity;
import net.mcreator.supermario.client.model.ModelSeedle;

public class SeedleRenderer extends MobRenderer<SeedleEntity, ModelSeedle<SeedleEntity>> {
	public SeedleRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSeedle(context.bakeLayer(ModelSeedle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeedleEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/seedletexture.png");
	}
}
