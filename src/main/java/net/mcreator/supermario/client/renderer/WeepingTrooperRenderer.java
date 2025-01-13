
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.WeepingTrooperEntity;
import net.mcreator.supermario.client.model.ModelWeepingTrooper;

public class WeepingTrooperRenderer extends MobRenderer<WeepingTrooperEntity, ModelWeepingTrooper<WeepingTrooperEntity>> {
	public WeepingTrooperRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWeepingTrooper(context.bakeLayer(ModelWeepingTrooper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeepingTrooperEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/weepingtroopertexture.png");
	}
}
