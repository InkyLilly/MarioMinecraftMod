package net.mcreator.supermario.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.supermario.block.model.ConnectarLightbulbBlockModel;
import net.mcreator.supermario.block.entity.ConnectarLightbulbTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ConnectarLightbulbTileRenderer extends GeoBlockRenderer<ConnectarLightbulbTileEntity> {
	public ConnectarLightbulbTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new ConnectarLightbulbBlockModel());
	}

	@Override
	public RenderType getRenderType(ConnectarLightbulbTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
