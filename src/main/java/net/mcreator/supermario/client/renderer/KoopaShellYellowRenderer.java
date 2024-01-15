
package net.mcreator.supermario.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.supermario.entity.model.KoopaShellYellowModel;
import net.mcreator.supermario.entity.KoopaShellYellowEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class KoopaShellYellowRenderer extends GeoEntityRenderer<KoopaShellYellowEntity> {
	public KoopaShellYellowRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new KoopaShellYellowModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(KoopaShellYellowEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
