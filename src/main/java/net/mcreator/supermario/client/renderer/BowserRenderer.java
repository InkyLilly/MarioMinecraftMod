
package net.mcreator.supermario.client.renderer;

public class BowserRenderer extends GeoEntityRenderer<BowserEntity> {
	public BowserRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BowserModel());
		this.shadowRadius = 1f;
	}

	@Override
	public RenderType getRenderType(BowserEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}