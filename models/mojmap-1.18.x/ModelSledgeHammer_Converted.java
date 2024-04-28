// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSledgeHammer_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sledgehammer_converted"), "main");
	private final ModelPart all;

	public ModelSledgeHammer_Converted(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.5F, 1.0F, -8.0F, 3.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(14, 11)
						.addBox(-0.5F, 0.0F, -4.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, 4.0F));

		PartDefinition cube_r1 = all.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 11).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}