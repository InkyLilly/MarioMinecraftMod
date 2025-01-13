package net.mcreator.supermario.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.supermario.block.model.ConnectarLightbulbDisplayModel;
import net.mcreator.supermario.block.display.ConnectarLightbulbDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ConnectarLightbulbDisplayItemRenderer extends GeoItemRenderer<ConnectarLightbulbDisplayItem> {
	public ConnectarLightbulbDisplayItemRenderer() {
		super(new ConnectarLightbulbDisplayModel());
	}

	@Override
	public RenderType getRenderType(ConnectarLightbulbDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
