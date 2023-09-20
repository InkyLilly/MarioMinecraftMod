
package net.mcreator.supermario.client.renderer;

public class YoshiRenderer extends GeoEntityRenderer<YoshiEntity> {
	public YoshiRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new YoshiModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(YoshiEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}