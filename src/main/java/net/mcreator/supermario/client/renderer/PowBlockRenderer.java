package net.mcreator.supermario.client.renderer;

public class PowBlockRenderer extends EntityRenderer<PowBlockEntity> {

	private static final ResourceLocation texture = new ResourceLocation("super_mario:textures/entities/pow.png");

	private final Modelpow model;

	public PowBlockRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelpow(context.bakeLayer(Modelpow.LAYER_LOCATION));
	}

	@Override
	public void render(PowBlockEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn,
			int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(PowBlockEntity entity) {
		return texture;
	}

}
