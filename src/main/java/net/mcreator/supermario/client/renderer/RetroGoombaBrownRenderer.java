
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.supermario.entity.model.RetroGoombaBrownModel;
import net.mcreator.supermario.entity.RetroGoombaBrownEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RetroGoombaBrownRenderer extends GeoEntityRenderer<RetroGoombaBrownEntity> {
	public RetroGoombaBrownRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new RetroGoombaBrownModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(RetroGoombaBrownEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(RetroGoombaBrownEntity entityLivingBaseIn) {
		return 0.0F;
	}
}