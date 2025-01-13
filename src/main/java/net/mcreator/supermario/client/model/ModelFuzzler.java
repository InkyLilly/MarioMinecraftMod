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

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelFuzzler<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("super_mario", "model_fuzzler"), "main");
	public final ModelPart segment1;
	public final ModelPart segment3;
	public final ModelPart segment2;
	public final ModelPart segment4;
	public final ModelPart head;

	public ModelFuzzler(ModelPart root) {
		this.segment1 = root.getChild("segment1");
		this.segment3 = root.getChild("segment3");
		this.segment2 = root.getChild("segment2");
		this.segment4 = root.getChild("segment4");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition segment1 = partdefinition.addOrReplaceChild("segment1",
				CubeListBuilder.create().texOffs(0, 32).addBox(-8.0F, -8.0F, -4.0F, 16.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 64).addBox(-12.0F, -8.0F, 2.0F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 64)
						.addBox(-12.0F, -8.0F, -2.0F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 64).addBox(8.0F, -8.0F, 2.0F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(48, 64)
						.addBox(8.0F, -8.0F, -2.0F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 56).addBox(-8.0F, -12.0F, -2.0F, 16.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 56)
						.addBox(-8.0F, -12.0F, 2.0F, 16.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 60).addBox(-8.0F, 8.0F, -2.0F, 16.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
						.addBox(-8.0F, 8.0F, 2.0F, 16.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition segment3 = partdefinition.addOrReplaceChild("segment3",
				CubeListBuilder.create().texOffs(0, 32).addBox(-8.0F, -8.0F, -4.0F, 16.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 64).addBox(-12.0F, -8.0F, 2.0F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 64)
						.addBox(-12.0F, -8.0F, -2.0F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 64).addBox(8.0F, -8.0F, 2.0F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(48, 64)
						.addBox(8.0F, -8.0F, -2.0F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 56).addBox(-8.0F, -12.0F, -2.0F, 16.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 56)
						.addBox(-8.0F, -12.0F, 2.0F, 16.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 60).addBox(-8.0F, 8.0F, -2.0F, 16.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
						.addBox(-8.0F, 8.0F, 2.0F, 16.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 16.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition segment2 = partdefinition.addOrReplaceChild("segment2",
				CubeListBuilder.create().texOffs(48, 32).addBox(-8.0F, -8.0F, -4.0F, 16.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 56).addBox(-12.0F, -8.0F, 2.0F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 68)
						.addBox(-12.0F, -8.0F, -2.0F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 68).addBox(8.0F, -8.0F, 2.0F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 68)
						.addBox(8.0F, -8.0F, -2.0F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 64).addBox(-8.0F, -12.0F, -2.0F, 16.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
						.addBox(-8.0F, -12.0F, 2.0F, 16.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 4).addBox(-8.0F, 8.0F, -2.0F, 16.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 8)
						.addBox(-8.0F, 8.0F, 2.0F, 16.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 8.0F));
		PartDefinition segment4 = partdefinition.addOrReplaceChild("segment4",
				CubeListBuilder.create().texOffs(48, 32).addBox(-8.0F, -8.0F, -4.0F, 16.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 56).addBox(-12.0F, -8.0F, 2.0F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 68)
						.addBox(-12.0F, -8.0F, -2.0F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 68).addBox(8.0F, -8.0F, 2.0F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 68)
						.addBox(8.0F, -8.0F, -2.0F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 64).addBox(-8.0F, -12.0F, -2.0F, 16.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
						.addBox(-8.0F, -12.0F, 2.0F, 16.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 4).addBox(-8.0F, 8.0F, -2.0F, 16.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 8)
						.addBox(-8.0F, 8.0F, 2.0F, 16.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 24.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -12.0F, 1.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(64, 12).addBox(-4.0F, -3.0F, -2.0F, 8.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, -21.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		segment1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		segment4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
