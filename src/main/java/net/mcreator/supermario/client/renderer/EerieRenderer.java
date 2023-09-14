
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.supermario.entity.EerieEntity;
import net.mcreator.supermario.client.model.ModelEerie;

public class EerieRenderer extends MobRenderer<EerieEntity, ModelEerie<EerieEntity>> {
	public EerieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEerie(context.bakeLayer(ModelEerie.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<EerieEntity, ModelEerie<EerieEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("super_mario:textures/entities/eerietexture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EerieEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/eerietexture.png");
	}
}
