
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.supermario.entity.SpiteBulbEntity;
import net.mcreator.supermario.client.model.ModelSpiteBulb;

public class SpiteBulbRenderer extends MobRenderer<SpiteBulbEntity, ModelSpiteBulb<SpiteBulbEntity>> {
	public SpiteBulbRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSpiteBulb(context.bakeLayer(ModelSpiteBulb.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<SpiteBulbEntity, ModelSpiteBulb<SpiteBulbEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("super_mario:textures/entities/spitebulbglowtexture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SpiteBulbEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/spitebulbtexture.png");
	}
}
