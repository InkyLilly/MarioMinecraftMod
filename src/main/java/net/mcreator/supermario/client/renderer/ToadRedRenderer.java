
package net.mcreator.supermario.client.renderer;

public class ToadRedRenderer extends GeoEntityRenderer<ToadRedEntity> {
	public ToadRedRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ToadRedModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(ToadRedEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}