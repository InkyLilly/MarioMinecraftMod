
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.GoombaEntity;
import net.mcreator.supermario.client.model.ModelGoomba;

public class GoombaRenderer extends MobRenderer<GoombaEntity, ModelGoomba<GoombaEntity>> {
	public GoombaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGoomba(context.bakeLayer(ModelGoomba.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoombaEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/goombatexture.png");
	}
}
