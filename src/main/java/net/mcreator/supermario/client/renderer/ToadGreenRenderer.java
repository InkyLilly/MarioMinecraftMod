
package net.mcreator.supermario.client.renderer;

public class ToadGreenRenderer extends GeoEntityRenderer<ToadGreenEntity> {
	public ToadGreenRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ToadGreenModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(ToadGreenEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}