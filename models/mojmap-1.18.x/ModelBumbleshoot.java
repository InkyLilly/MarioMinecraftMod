// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBumbleshoot<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bumbleshoot"), "main");
	private final ModelPart body;

	public ModelBumbleshoot(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.0F, -9.0F, -6.0F, 12.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-6.0F, 0.0F, -6.0F, 12.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 35)
						.addBox(-6.0F, 0.0F, 6.0F, 12.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(6.0F, 0.0F, -6.0F, 0.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(24, 21)
						.addBox(-6.0F, 0.0F, -6.0F, 0.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(32, 37)
						.addBox(-3.25F, -8.0F, -7.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 37)
						.addBox(0.25F, -8.0F, -7.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 42)
						.addBox(0.0F, -12.0F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(16, 37).addBox(0.0F, -3.0F, -2.0F, 0.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(24, 37).addBox(0.0F, -3.0F, -2.0F, 0.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1481F, -14.7716F, 0.0F, 0.0F, 0.0F, 1.1781F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 37).addBox(0.0F, -3.0F, -2.0F, 0.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1481F, -14.7716F, 0.0F, 0.0F, 0.0F, -1.1781F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(38, 40).addBox(0.0F, -3.0F, -2.0F, 0.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.body.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.body.xRot = headPitch / (180F / (float) Math.PI);
	}
}