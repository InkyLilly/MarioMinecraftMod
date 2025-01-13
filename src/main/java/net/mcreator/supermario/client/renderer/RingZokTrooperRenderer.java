
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.supermario.entity.RingZokTrooperEntity;
import net.mcreator.supermario.client.model.ModelRingZokTrooper;

public class RingZokTrooperRenderer extends MobRenderer<RingZokTrooperEntity, ModelRingZokTrooper<RingZokTrooperEntity>> {
	public RingZokTrooperRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRingZokTrooper(context.bakeLayer(ModelRingZokTrooper.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<RingZokTrooperEntity, ModelRingZokTrooper<RingZokTrooperEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("super_mario:textures/entities/ringzoktrooperglowtexture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(RingZokTrooperEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/ringzoktroopertexture.png");
	}
}
