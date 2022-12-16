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

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbulletbill<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("super_mario", "modelbulletbill"), "main");
	public final ModelPart bbbody;
	public final ModelPart armR;
	public final ModelPart armL;

	public Modelbulletbill(ModelPart root) {
		this.bbbody = root.getChild("bbbody");
		this.armR = root.getChild("armR");
		this.armL = root.getChild("armL");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bbbody = partdefinition.addOrReplaceChild("bbbody",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -6.0F, -8.0F, 10.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(4, 33)
						.addBox(-6.0F, 0.0F, -2.0F, 12.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-4.5F, -5.5F, 4.0F, 9.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 22)
						.addBox(-5.0F, -6.0F, 6.0F, 10.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(4.0F, -6.0F, 7.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-5.0F, -6.0F, 7.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 7)
						.addBox(-4.0F, -6.0F, 7.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 7)
						.addBox(-4.0F, 3.0F, 7.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition armR = partdefinition.addOrReplaceChild("armR",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -1.5F, -8.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-2.0F, -1.0F, -5.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 22.0F, -1.0F, 0.4215F, 0.3614F, 0.1572F));
		PartDefinition armL = partdefinition.addOrReplaceChild("armL",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.5F, -8.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(0.0F, -1.0F, -5.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 22.0F, -1.0F, 0.4215F, -0.3614F, -0.1572F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bbbody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.armR.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.armL.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
