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
public class ModelCooligan<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("super_mario", "model_cooligan"), "main");
	public final ModelPart armL;
	public final ModelPart ArmR;
	public final ModelPart all;

	public ModelCooligan(ModelPart root) {
		this.armL = root.getChild("armL");
		this.ArmR = root.getChild("ArmR");
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition armL = partdefinition.addOrReplaceChild("armL", CubeListBuilder.create().texOffs(0, 17).addBox(4.0F, -5.0F, -3.0F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition ArmR = partdefinition.addOrReplaceChild("ArmR", CubeListBuilder.create().texOffs(0, 17).addBox(-5.0F, -5.0F, -3.0F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition all = partdefinition.addOrReplaceChild("all",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -6.0F, -3.0F, 8.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(24, 17).addBox(-3.0F, -3.0F, -8.0F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 17)
						.addBox(-4.0F, -7.0F, -4.0F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(1.0F, -3.0F, 8.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-3.0F, -3.0F, 8.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		armL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ArmR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
