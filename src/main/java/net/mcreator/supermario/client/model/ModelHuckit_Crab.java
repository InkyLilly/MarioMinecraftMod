package net.mcreator.supermario.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelHuckit_Crab<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("super_mario", "model_huckit_crab"), "main");
	public final ModelPart legL;
	public final ModelPart legR;
	public final ModelPart body;
	public final ModelPart ArmR;

	public ModelHuckit_Crab(ModelPart root) {
		this.legL = root.getChild("legL");
		this.legR = root.getChild("legR");
		this.body = root.getChild("body");
		this.ArmR = root.getChild("ArmR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition legL = partdefinition.addOrReplaceChild("legL",
				CubeListBuilder.create().texOffs(0, 42).addBox(0.5F, -2.0F, -5.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 34).addBox(0.5F, -3.0F, -2.0F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition legR = partdefinition.addOrReplaceChild("legR",
				CubeListBuilder.create().texOffs(0, 42).addBox(1.0F, -2.0F, -5.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 34).addBox(1.0F, -3.0F, -2.0F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.5F, 24.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(30, 20).addBox(-3.0F, -19.0F, -2.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-6.0F, -11.0F, -6.0F, 12.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-5.0F, -15.0F, -5.0F, 10.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition ArmR = partdefinition.addOrReplaceChild("ArmR",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -5.5F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 0).addBox(-12.0F, -9.0F, -3.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 39)
						.addBox(-15.0F, -8.0F, -3.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 34).addBox(-14.0F, -4.0F, -3.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		legL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ArmR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.legR.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.ArmR.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.legL.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
