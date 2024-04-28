package net.mcreator.supermario.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.supermario.entity.SledgeHammerEntity;
import net.mcreator.supermario.client.model.ModelSledgeHammer_Converted;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SledgeHammerRenderer extends EntityRenderer<SledgeHammerEntity> {
	private static final ResourceLocation texture = new ResourceLocation("super_mario:textures/entities/sledgehammerjavatexture.png");
	private final ModelSledgeHammer_Converted model;

	public SledgeHammerRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelSledgeHammer_Converted(context.bakeLayer(ModelSledgeHammer_Converted.LAYER_LOCATION));
	}

	@Override
	public void render(SledgeHammerEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(SledgeHammerEntity entity) {
		return texture;
	}
}
