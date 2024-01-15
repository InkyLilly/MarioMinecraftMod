
package net.mcreator.supermario.client.renderer;

public class FlameChompRenderer extends GeoEntityRenderer<FlameChompEntity> {
	public FlameChompRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FlameChompModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(FlameChompEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}