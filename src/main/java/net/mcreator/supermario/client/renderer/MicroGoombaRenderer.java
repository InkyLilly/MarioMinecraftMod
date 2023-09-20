
package net.mcreator.supermario.client.renderer;

public class MicroGoombaRenderer extends GeoEntityRenderer<MicroGoombaEntity> {
	public MicroGoombaRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new MicroGoombaModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(MicroGoombaEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}