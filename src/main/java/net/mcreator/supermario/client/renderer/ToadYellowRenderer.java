
package net.mcreator.supermario.client.renderer;

public class ToadYellowRenderer extends GeoEntityRenderer<ToadYellowEntity> {
	public ToadYellowRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ToadYellowModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(ToadYellowEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}