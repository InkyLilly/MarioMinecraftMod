
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.SeedleREntity;
import net.mcreator.supermario.client.model.ModelSeedle;

public class SeedleRRenderer extends MobRenderer<SeedleREntity, ModelSeedle<SeedleREntity>> {
	public SeedleRRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSeedle(context.bakeLayer(ModelSeedle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeedleREntity entity) {
		return new ResourceLocation("super_mario:textures/entities/seedlertexture.png");
	}
}
