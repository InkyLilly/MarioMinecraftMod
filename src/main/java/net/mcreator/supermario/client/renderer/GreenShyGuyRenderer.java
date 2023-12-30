
package net.mcreator.supermario.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.supermario.entity.model.GreenShyGuyModel;
import net.mcreator.supermario.entity.GreenShyGuyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GreenShyGuyRenderer extends GeoEntityRenderer<GreenShyGuyEntity> {
	public GreenShyGuyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GreenShyGuyModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(GreenShyGuyEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
