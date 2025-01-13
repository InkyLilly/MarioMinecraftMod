
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.InvisilizardREntity;
import net.mcreator.supermario.client.model.ModelInvisilizard;

public class InvisilizardRRenderer extends MobRenderer<InvisilizardREntity, ModelInvisilizard<InvisilizardREntity>> {
	public InvisilizardRRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelInvisilizard(context.bakeLayer(ModelInvisilizard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(InvisilizardREntity entity) {
		return new ResourceLocation("super_mario:textures/entities/invisilizardrtexture.png");
	}
}
