
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.BobOmbEntity;
import net.mcreator.supermario.client.model.ModelBob_Omb;

public class BobOmbRenderer extends MobRenderer<BobOmbEntity, ModelBob_Omb<BobOmbEntity>> {
	public BobOmbRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBob_Omb(context.bakeLayer(ModelBob_Omb.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BobOmbEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/bobombtexture.png");
	}
}
