
package net.mcreator.supermario.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.supermario.entity.model.RetroGoombaBlueModel;
import net.mcreator.supermario.entity.RetroGoombaBlueEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RetroGoombaBlueRenderer extends GeoEntityRenderer<RetroGoombaBlueEntity> {
	public RetroGoombaBlueRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new RetroGoombaBlueModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(RetroGoombaBlueEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(RetroGoombaBlueEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
