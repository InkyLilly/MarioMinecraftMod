
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.BootCarEntity;
import net.mcreator.supermario.client.model.ModelBootCar;

public class BootCarRenderer extends MobRenderer<BootCarEntity, ModelBootCar<BootCarEntity>> {
	public BootCarRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBootCar(context.bakeLayer(ModelBootCar.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BootCarEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/bootcartexture.png");
	}
}
