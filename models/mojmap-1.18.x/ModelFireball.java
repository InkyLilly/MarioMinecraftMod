// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelFireball<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "fireball"), "main");
	private final ModelPart fireball;

	public ModelFireball(ModelPart root) {
		this.fireball = root.getChild("fireball");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fireball = partdefinition.addOrReplaceChild("fireball",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(0.0F, -6.0F, -1.0F, 0.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(12, 12)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		fireball.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}