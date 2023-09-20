
package net.mcreator.supermario.client.renderer;

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