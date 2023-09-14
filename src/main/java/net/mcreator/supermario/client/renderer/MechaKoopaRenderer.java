
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.MechaKoopaEntity;
import net.mcreator.supermario.client.model.ModelMechaKoopa;

public class MechaKoopaRenderer extends MobRenderer<MechaKoopaEntity, ModelMechaKoopa<MechaKoopaEntity>> {
	public MechaKoopaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMechaKoopa(context.bakeLayer(ModelMechaKoopa.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MechaKoopaEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/mechakooopatexture.png");
	}
}
