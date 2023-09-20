
package net.mcreator.supermario.client.renderer;

public class ToadPurpleRenderer extends GeoEntityRenderer<ToadPurpleEntity> {
	public ToadPurpleRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ToadPurpleModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(ToadPurpleEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}