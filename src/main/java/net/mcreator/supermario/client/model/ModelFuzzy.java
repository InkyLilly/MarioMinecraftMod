package net.mcreator.supermario.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelFuzzy<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("super_mario", "model_fuzzy"), "main");
	public final ModelPart spines;
	public final ModelPart spines2;
	public final ModelPart spines3;
	public final ModelPart spines4;
	public final ModelPart bb_main;

	public ModelFuzzy(ModelPart root) {
		this.spines = root.getChild("spines");
		this.spines2 = root.getChild("spines2");
		this.spines3 = root.getChild("spines3");
		this.spines4 = root.getChild("spines4");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition spines = partdefinition.addOrReplaceChild("spines",
				CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -16.0F, -6.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(4.0F, -16.0F, -6.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-4.0F, -16.0F, -6.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition spines2 = partdefinition.addOrReplaceChild("spines2",
				CubeListBuilder.create().texOffs(0, 24).addBox(0.0F, -16.0F, -6.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(4.0F, -16.0F, -6.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-4.0F, -16.0F, -6.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 40.0F, 0.0F));
		PartDefinition spines3 = partdefinition.addOrReplaceChild("spines3",
				CubeListBuilder.create().texOffs(12, 24).addBox(2.0F, -22.0F, -6.0F, 3.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(12, 24)
						.addBox(2.0F, -18.0F, -6.0F, 3.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(12, 24)
						.addBox(2.0F, -26.0F, -6.0F, 3.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-11.0F, 40.0F, 0.0F));
		PartDefinition spines4 = partdefinition.addOrReplaceChild("spines4",
				CubeListBuilder.create().texOffs(0, 24).addBox(2.0F, -22.0F, -6.0F, 3.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(2.0F, -18.0F, -6.0F, 3.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(2.0F, -26.0F, -6.0F, 3.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 40.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(-5.0F, -8.0F, -8.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-3.5F, -9.0F, -8.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(0.5F, -9.0F, -8.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 24)
						.addBox(-4.5F, -3.0F, -7.0F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.25F, -11.75F, -7.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 4)
						.addBox(-4.0F, -12.75F, -7.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-3.5F, -6.0F, -8.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(1.5F, -6.0F, -8.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(1.0F, -4.0F, -7.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-3.0F, -4.0F, -7.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		spines.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spines2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spines3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		spines4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
