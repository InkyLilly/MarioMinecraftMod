// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelEerie<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "eerie"), "main");
	private final ModelPart ArmL;
	private final ModelPart Body;
	private final ModelPart ArmR;

	public ModelEerie(ModelPart root) {
		this.ArmL = root.getChild("ArmL");
		this.Body = root.getChild("Body");
		this.ArmR = root.getChild("ArmR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition ArmL = partdefinition.addOrReplaceChild("ArmL",
				CubeListBuilder.create().texOffs(12, 22)
						.addBox(4.0F, -3.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0F, -4.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 15)
						.addBox(-3.0F, -12.0F, -2.0F, 7.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(17, 20)
						.addBox(-1.5F, -3.0F, 4.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -8.0F, -4.0F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(20, 15)
						.addBox(-2.5F, -7.5F, -6.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-1.5F, -4.5F, -5.25F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(0.5F, -12.0F, 0.0F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition ArmR = partdefinition.addOrReplaceChild("ArmR",
				CubeListBuilder.create().texOffs(12, 22)
						.addBox(3.0F, -3.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, -4.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		ArmL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ArmR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.ArmR.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.ArmL.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}