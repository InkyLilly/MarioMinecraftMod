
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.ZokkarangTrooperEntity;
import net.mcreator.supermario.client.model.ModelZokkarangTrooper;

public class ZokkarangTrooperRenderer extends MobRenderer<ZokkarangTrooperEntity, ModelZokkarangTrooper<ZokkarangTrooperEntity>> {
	public ZokkarangTrooperRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelZokkarangTrooper(context.bakeLayer(ModelZokkarangTrooper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ZokkarangTrooperEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/zokkarangtroopertexture.png");
	}
}
