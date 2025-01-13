// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelMillton<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "millton"), "main");
	private final ModelPart seg1;
	private final ModelPart seg2;
	private final ModelPart seg3;
	private final ModelPart seg4;
	private final ModelPart head;

	public ModelMillton(ModelPart root) {
		this.seg1 = root.getChild("seg1");
		this.seg2 = root.getChild("seg2");
		this.seg3 = root.getChild("seg3");
		this.seg4 = root.getChild("seg4");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition seg1 = partdefinition.addOrReplaceChild("seg1", CubeListBuilder.create().texOffs(0, 56)
				.addBox(-8.0F, -10.0F, -8.0F, 16.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition seg2 = partdefinition.addOrReplaceChild("seg2", CubeListBuilder.create().texOffs(0, 56)
				.addBox(-8.0F, -10.0F, -8.0F, 16.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.0F, 0.0F));

		PartDefinition seg3 = partdefinition.addOrReplaceChild("seg3", CubeListBuilder.create().texOffs(0, 56)
				.addBox(-8.0F, -10.0F, -8.0F, 16.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition seg4 = partdefinition.addOrReplaceChild("seg4", CubeListBuilder.create().texOffs(0, 56)
				.addBox(-8.0F, -10.0F, -8.0F, 16.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(64, 74)
						.addBox(-19.0F, -16.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-9.0F, -2.0F, -9.0F, 18.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.0F, -16.0F, -11.0F, 22.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(64, 56)
						.addBox(-4.0F, -18.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(80, 74)
						.addBox(-2.0F, -21.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 81)
						.addBox(-1.0F, -24.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 66)
						.addBox(11.0F, -10.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 36)
						.addBox(-19.0F, -10.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 44)
						.addBox(15.0F, -16.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -16.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		seg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		seg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		seg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		seg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
	}
}