// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelJetZokTrooper<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "jetzoktrooper"), "main");
	private final ModelPart body;
	private final ModelPart armL;
	private final ModelPart armR;

	public ModelJetZokTrooper(ModelPart root) {
		this.body = root.getChild("body");
		this.armL = root.getChild("armL");
		this.armR = root.getChild("armR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 20)
						.addBox(-4.0F, -14.0F, -1.5F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 20)
						.addBox(-2.0F, -3.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -9.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-5.0F, -11.0F, -3.0F, 10.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(47, 1)
						.addBox(-2.0F, -10.0F, 3.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 58)
						.addBox(-2.0F, -2.0F, 5.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition armL = partdefinition.addOrReplaceChild("armL",
				CubeListBuilder.create().texOffs(14, 27)
						.addBox(-1.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(6.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(6.0F, 1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 19.0F, 0.0F, 0.7459F, 1.0228F, 0.8249F));

		PartDefinition armR = partdefinition.addOrReplaceChild("armR", CubeListBuilder.create().texOffs(14, 27).mirror()
				.addBox(-5.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 0)
				.mirror().addBox(-8.0F, 1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-6.0F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(40, 0).mirror()
				.addBox(-8.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 19.0F, 0.0F, 0.7459F, -1.0228F, -0.8249F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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
	}
}