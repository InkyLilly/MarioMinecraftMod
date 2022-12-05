
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.CooliganEntity;
import net.mcreator.supermario.client.model.ModelCooligan;

public class CooliganRenderer extends MobRenderer<CooliganEntity, ModelCooligan<CooliganEntity>> {
	public CooliganRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCooligan(context.bakeLayer(ModelCooligan.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CooliganEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/cooligantexture.png");
	}
}
