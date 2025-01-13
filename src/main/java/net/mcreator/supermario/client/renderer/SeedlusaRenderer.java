
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.SeedlusaEntity;
import net.mcreator.supermario.client.model.ModelSeedlusa;

public class SeedlusaRenderer extends MobRenderer<SeedlusaEntity, ModelSeedlusa<SeedlusaEntity>> {
	public SeedlusaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSeedlusa(context.bakeLayer(ModelSeedlusa.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeedlusaEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/seedlusatexture.png");
	}
}
