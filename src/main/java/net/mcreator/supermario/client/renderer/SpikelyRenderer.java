
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.SpikelyEntity;
import net.mcreator.supermario.client.model.ModelSpikely;

public class SpikelyRenderer extends MobRenderer<SpikelyEntity, ModelSpikely<SpikelyEntity>> {
	public SpikelyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSpikely(context.bakeLayer(ModelSpikely.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpikelyEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/spikelytexture.png");
	}
}
