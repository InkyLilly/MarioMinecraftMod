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

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelWeepingTrooper<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("super_mario", "model_weeping_trooper"), "main");
	public final ModelPart legL;
	public final ModelPart legR;
	public final ModelPart body;
	public final ModelPart armL;
	public final ModelPart armR;

	public ModelWeepingTrooper(ModelPart root) {
		this.legL = root.getChild("legL");
		this.legR = root.getChild("legR");
		this.body = root.getChild("body");
		this.armL = root.getChild("armL");
		this.armR = root.getChild("armR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition legL = partdefinition.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(12, 54).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 18.0F, 0.0F));
		PartDefinition legR = partdefinition.addOrReplaceChild("legR", CubeListBuilder.create().texOffs(20, 54).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 18.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(48, 59).addBox(-0.5F, -6.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(-3.5F, 18.0F, -3.5F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.5F, 2.0F, -6.5F, 24.0F, 16.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(28, 44).addBox(-2.5F, 0.0F, -2.5F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(-1.0F, -4.0F, -1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, -2.0F, -0.5F));
		PartDefinition armL = partdefinition.addOrReplaceChild("armL",
				CubeListBuilder.create().texOffs(32, 30).addBox(-1.0F, -1.0F, -11.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(28, 52).addBox(-2.0F, -2.0F, -17.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 54)
						.addBox(-1.0F, -1.0F, -20.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 40).addBox(-0.5F, -0.5F, -21.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(13.0F, 8.0F, 0.0F));
		PartDefinition armR = partdefinition
				.addOrReplaceChild(
						"armR", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, -1.0F, -11.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(52, 44).addBox(-2.0F, -2.0F, -17.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
								.texOffs(58, 54).addBox(-1.0F, -1.0F, -20.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 42).addBox(-0.5F, -0.5F, -21.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-13.0F, 8.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		legL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.legR.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.armR.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.legL.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.armL.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
