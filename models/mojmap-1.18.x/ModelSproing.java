// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSproing<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sproing"), "main");
	private final ModelPart footL;
	private final ModelPart footR;
	private final ModelPart bodyBottom;
	private final ModelPart bodyTop;

	public ModelSproing(ModelPart root) {
		this.footL = root.getChild("footL");
		this.footR = root.getChild("footR");
		this.bodyBottom = root.getChild("bodyBottom");
		this.bodyTop = root.getChild("bodyTop");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition footL = partdefinition.addOrReplaceChild("footL", CubeListBuilder.create().texOffs(24, 40)
				.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 22.0F, 0.0F));

		PartDefinition footR = partdefinition.addOrReplaceChild("footR", CubeListBuilder.create().texOffs(40, 32)
				.addBox(-2.0F, 0.0F, -4.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 22.0F, 0.0F));

		PartDefinition bodyBottom = partdefinition.addOrReplaceChild("bodyBottom",
				CubeListBuilder.create().texOffs(40, 14)
						.addBox(-4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-5.0F, -2.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-3.0F, -16.0F, -3.0F, 6.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition bodyTop = partdefinition.addOrReplaceChild("bodyTop",
				CubeListBuilder.create().texOffs(44, 40)
						.addBox(-1.0F, -9.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 23)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-5.0F, -7.0F, -5.0F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -2.0F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		footL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		footR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bodyBottom.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bodyTop.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.footR.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.footL.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}