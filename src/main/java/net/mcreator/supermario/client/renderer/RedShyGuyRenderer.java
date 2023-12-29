
package net.mcreator.supermario.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.supermario.entity.model.RedShyGuyModel;
import net.mcreator.supermario.entity.RedShyGuyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RedShyGuyRenderer extends GeoEntityRenderer<RedShyGuyEntity> {
	public RedShyGuyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new RedShyGuyModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(RedShyGuyEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
