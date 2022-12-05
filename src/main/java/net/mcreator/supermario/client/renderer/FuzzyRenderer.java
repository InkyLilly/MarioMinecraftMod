
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.FuzzyEntity;
import net.mcreator.supermario.client.model.ModelFuzzy;

public class FuzzyRenderer extends MobRenderer<FuzzyEntity, ModelFuzzy<FuzzyEntity>> {
	public FuzzyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFuzzy(context.bakeLayer(ModelFuzzy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FuzzyEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/fuzzytexture.png");
	}
}
