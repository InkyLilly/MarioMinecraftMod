
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.ParaGoombaEntity;
import net.mcreator.supermario.client.model.ModelParaGoomba;

public class ParaGoombaRenderer extends MobRenderer<ParaGoombaEntity, ModelParaGoomba<ParaGoombaEntity>> {
	public ParaGoombaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelParaGoomba(context.bakeLayer(ModelParaGoomba.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ParaGoombaEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/paragoombatexture.png");
	}
}
