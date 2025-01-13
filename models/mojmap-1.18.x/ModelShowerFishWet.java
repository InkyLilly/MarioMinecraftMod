// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelShowerFishWet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "showerfishwet"), "main");
	private final ModelPart body;
	private final ModelPart armL;
	private final ModelPart armR;

	public ModelShowerFishWet(ModelPart root) {
		this.body = root.getChild("body");
		this.armL = root.getChild("armL");
		this.armR = root.getChild("armR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(64, 30)
						.addBox(-5.0F, -22.0F, -7.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 26)
						.addBox(-4.0F, -23.0F, -7.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 46)
						.addBox(-2.0F, -18.0F, -7.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 64)
						.addBox(-4.0F, -19.0F, -7.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 48)
						.addBox(1.0F, -23.0F, -7.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(-4.0F, -29.0F, -5.0F, 8.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 60)
						.addBox(-6.0F, -8.0F, -6.0F, 12.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 26)
						.addBox(-6.0F, -8.0F, 6.0F, 12.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 28)
						.addBox(-6.0F, -8.0F, -6.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(40, 44)
						.addBox(6.0F, -8.0F, -6.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(64, 34)
						.addBox(-1.0F, -38.0F, 4.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 6)
						.addBox(-1.0F, -40.0F, -4.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 18)
						.addBox(-3.0F, -38.0F, -6.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-5.0F, -2.0F, 11.0F, 10.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -24.0F, -6.0F, 12.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
						.addBox(-2.0F, -4.0F, 5.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-5.0F, -8.0F, -5.0F, 10.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition armL = partdefinition.addOrReplaceChild("armL", CubeListBuilder.create().texOffs(20, 57).addBox(
				0.0F, -1.0F, -3.0F, 1.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 12.0F, 0.0F));

		PartDefinition armR = partdefinition.addOrReplaceChild("armR", CubeListBuilder.create().texOffs(34, 60)
				.addBox(-1.0F, -1.0F, -3.0F, 1.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.armR.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.armL.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}