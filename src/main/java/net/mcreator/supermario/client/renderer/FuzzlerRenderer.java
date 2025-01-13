
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.FuzzlerEntity;
import net.mcreator.supermario.client.model.ModelFuzzler;

public class FuzzlerRenderer extends MobRenderer<FuzzlerEntity, ModelFuzzler<FuzzlerEntity>> {
	public FuzzlerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFuzzler(context.bakeLayer(ModelFuzzler.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FuzzlerEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/fuzzlertexture.png");
	}
}
