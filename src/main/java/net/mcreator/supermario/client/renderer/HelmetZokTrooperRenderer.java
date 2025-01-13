
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.HelmetZokTrooperEntity;
import net.mcreator.supermario.client.model.ModelHelmetZokTrooper;

public class HelmetZokTrooperRenderer extends MobRenderer<HelmetZokTrooperEntity, ModelHelmetZokTrooper<HelmetZokTrooperEntity>> {
	public HelmetZokTrooperRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHelmetZokTrooper(context.bakeLayer(ModelHelmetZokTrooper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HelmetZokTrooperEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/helmetzoktroopertexture.png");
	}
}
