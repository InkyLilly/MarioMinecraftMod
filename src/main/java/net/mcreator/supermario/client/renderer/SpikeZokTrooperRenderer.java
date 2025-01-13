
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.supermario.entity.SpikeZokTrooperEntity;
import net.mcreator.supermario.client.model.ModelSpikeZokTrooper;

public class SpikeZokTrooperRenderer extends MobRenderer<SpikeZokTrooperEntity, ModelSpikeZokTrooper<SpikeZokTrooperEntity>> {
	public SpikeZokTrooperRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSpikeZokTrooper(context.bakeLayer(ModelSpikeZokTrooper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpikeZokTrooperEntity entity) {
		return new ResourceLocation("super_mario:textures/entities/spikezoktroopertexture.png");
	}
}
