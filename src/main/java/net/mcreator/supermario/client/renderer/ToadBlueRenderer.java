
package net.mcreator.supermario.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.supermario.entity.model.ToadBlueModel;
import net.mcreator.supermario.entity.ToadBlueEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ToadBlueRenderer extends GeoEntityRenderer<ToadBlueEntity> {
	public ToadBlueRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ToadBlueModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(ToadBlueEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
