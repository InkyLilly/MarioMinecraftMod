
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.JetZokTrooperEntity;
import net.mcreator.supermario.client.model.ModelJetZokTrooper;

public class JetZokTrooperRenderer extends MobRenderer<JetZokTrooperEntity, ModelJetZokTrooper<JetZokTrooperEntity>> {
	public JetZokTrooperRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelJetZokTrooper(context.bakeLayer(ModelJetZokTrooper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JetZokTrooperEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/jetzoktroopertexture.png");
	}
}
