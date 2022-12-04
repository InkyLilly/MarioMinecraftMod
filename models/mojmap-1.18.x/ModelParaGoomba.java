// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelParaGoomba<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "paragoomba"), "main");
	private final ModelPart head;
	private final ModelPart leglL;
	private final ModelPart leglR;
	private final ModelPart body;
	private final ModelPart wingR;
	private final ModelPart wingL;

	public ModelParaGoomba(ModelPart root) {
		this.head = root.getChild("head");
		this.leglL = root.getChild("leglL");
		this.leglR = root.getChild("leglR");
		this.body = root.getChild("body");
		this.wingR = root.getChild("wingR");
		this.wingL = root.getChild("wingL");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.5F, -19.0F, -7.5F, 13.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(71, 0)
						.addBox(-7.0F, -21.0F, -8.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leglL = partdefinition.addOrReplaceChild("leglL", CubeListBuilder.create().texOffs(0, 26).addBox(
				1.0F, -3.0F, -6.0F, 7.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leglR = partdefinition.addOrReplaceChild("leglR", CubeListBuilder.create().texOffs(0, 26).addBox(
				-8.0F, -3.0F, -6.0F, 7.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(39, 0).addBox(
				-5.0F, -6.0F, -4.0F, 10.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition wingR = partdefinition.addOrReplaceChild("wingR", CubeListBuilder.create(),
				PartPose.offset(0.0F, 10.0F, 6.0F));

		PartDefinition cube_r1 = wingR
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 42).addBox(0.0F, -5.0F, 0.0F, 11.0F, 9.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition wingL = partdefinition.addOrReplaceChild("wingL", CubeListBuilder.create().texOffs(0, 42).addBox(
				0.0F, -5.0F, 0.0F, 11.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, 6.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leglL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leglR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leglR.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.wingR.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leglL.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.wingL.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}