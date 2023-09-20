
package net.mcreator.supermario.client.renderer;

public class ToadRenderer extends GeoEntityRenderer<ToadEntity> {
	public ToadRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ToadModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(ToadEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}