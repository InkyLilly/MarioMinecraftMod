
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.SoreboarEntity;
import net.mcreator.supermario.client.model.ModelSoreboar;

public class SoreboarRenderer extends MobRenderer<SoreboarEntity, ModelSoreboar<SoreboarEntity>> {
	public SoreboarRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSoreboar(context.bakeLayer(ModelSoreboar.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SoreboarEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/soreboartexture.png");
	}
}
