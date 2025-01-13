
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.InvisilizardEntity;
import net.mcreator.supermario.client.model.ModelInvisilizard;

public class InvisilizardRenderer extends MobRenderer<InvisilizardEntity, ModelInvisilizard<InvisilizardEntity>> {
	public InvisilizardRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelInvisilizard(context.bakeLayer(ModelInvisilizard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(InvisilizardEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/invisilizardtexture.png");
	}
}
