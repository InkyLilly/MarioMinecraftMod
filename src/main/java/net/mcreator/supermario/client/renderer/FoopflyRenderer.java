
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.FoopflyEntity;
import net.mcreator.supermario.client.model.ModelFoopfly;

public class FoopflyRenderer extends MobRenderer<FoopflyEntity, ModelFoopfly<FoopflyEntity>> {
	public FoopflyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFoopfly(context.bakeLayer(ModelFoopfly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FoopflyEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/foopflytexture.png");
	}
}
