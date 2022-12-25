// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelMechaKoopa<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mechakoopa"), "main");
	private final ModelPart legR;
	private final ModelPart legL;
	private final ModelPart body;
	private final ModelPart key;
	private final ModelPart head;

	public ModelMechaKoopa(ModelPart root) {
		this.legR = root.getChild("legR");
		this.legL = root.getChild("legL");
		this.body = root.getChild("body");
		this.key = root.getChild("key");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition legR = partdefinition.addOrReplaceChild("legR",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 31)
						.addBox(-1.5F, 7.0F, -5.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.5F, 14.0F, 0.0F));

		PartDefinition legL = partdefinition.addOrReplaceChild("legL",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 31)
						.addBox(-1.5F, 7.0F, -5.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.5F, 14.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.0F, -4.0F, -6.0F, 10.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition key = partdefinition.addOrReplaceChild("key", CubeListBuilder.create(),
				PartPose.offset(0.0F, 11.0F, 2.5F));

		PartDefinition cube_r1 = key.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(26, 25).addBox(0.0F, -20.0F, -2.0F, 0.0F, 7.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -2.5F, 0.0F, -0.0436F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 34)
						.addBox(-4.5F, -8.25F, -7.25F, 9.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-3.5F, -7.0F, -7.5F, 7.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 35)
						.addBox(0.0F, -13.0F, -6.0F, 0.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-5.0F, -3.0F, -10.0F, 10.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 13.0F, -6.0F));

		PartDefinition cube_r2 = head
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(31, 20).addBox(-4.5F, -0.25F, -9.5F, 9.0F, 1.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		legR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		key.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legR.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legL.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.key.yRot = ageInTicks / 20.f;
	}
}