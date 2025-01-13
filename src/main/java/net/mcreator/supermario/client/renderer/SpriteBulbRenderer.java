
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.supermario.entity.SpriteBulbEntity;
import net.mcreator.supermario.client.model.ModelSpriteBulb;

public class SpriteBulbRenderer extends MobRenderer<SpriteBulbEntity, ModelSpriteBulb<SpriteBulbEntity>> {
	public SpriteBulbRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSpriteBulb(context.bakeLayer(ModelSpriteBulb.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<SpriteBulbEntity, ModelSpriteBulb<SpriteBulbEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("super_mario:textures/entities/spritebulbglowtexture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SpriteBulbEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/spritebulbtexture.png");
	}
}
