
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.FireballEntity;
import net.mcreator.supermario.client.model.Modelcustom_model;

public class FireballRenderer extends MobRenderer<FireballEntity, Modelcustom_model<FireballEntity>> {
	public FireballRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FireballEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/fireballtexture.png");
	}
}
