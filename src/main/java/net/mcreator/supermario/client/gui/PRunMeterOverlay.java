
package net.mcreator.supermario.client.gui;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class PRunMeterOverlay {

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Pre event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
			int w = event.getWindow().getGuiScaledWidth();
			int h = event.getWindow().getGuiScaledHeight();

			int posX = w / 2;
			int posY = h / 2;

			Level _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;

			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.level;
				_x = entity.getX();
				_y = entity.getY();
				_z = entity.getZ();
			}

			Level world = _world;
			double x = _x;
			double y = _y;
			double z = _z;

			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.enableBlend();
			RenderSystem.setShader(GameRenderer::getPositionTexShader);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.setShaderColor(1, 1, 1, 1);

			if (

			PRunMeterDisplayOverlayIngameProcedure.execute(entity)) {

				RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/p_arrow_uncharged.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 91, posY + 98, 0, 0, 16, 16, 16, 16);

				RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/p_arrow_uncharged.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 99, posY + 98, 0, 0, 16, 16, 16, 16);

				RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/p_arrow_uncharged.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 107, posY + 98, 0, 0, 16, 16, 16, 16);

				RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/p_arrow_uncharged.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 115, posY + 98, 0, 0, 16, 16, 16, 16);

				RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/p_arrow_uncharged.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 123, posY + 98, 0, 0, 16, 16, 16, 16);

				RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/p_circle_uncharged.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 136, posY + 98, 0, 0, 16, 16, 16, 16);

				if (

				PMarker1Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/p_arrow_charged.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 91, posY + 98, 0, 0, 16, 16, 16, 16);

				}
				if (

				PMarker2Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/p_arrow_charged.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 99, posY + 98, 0, 0, 16, 16, 16, 16);

				}
				if (

				PMarker3Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/p_arrow_charged.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 107, posY + 98, 0, 0, 16, 16, 16, 16);

				}
				if (

				PMarker4Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/p_arrow_charged.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 115, posY + 98, 0, 0, 16, 16, 16, 16);

				}
				if (

				PMarker5Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/p_arrow_charged.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 123, posY + 98, 0, 0, 16, 16, 16, 16);

				}
				if (

				PMarker6Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/p_circle_charged.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 136, posY + 98, 0, 0, 16, 16, 16, 16);

				}
				if (

				PowerUpHealth1Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/present_heart.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -210, posY + -45, 0, 0, 16, 16, 16, 16);

				}
				if (

				PowerUpHealth1Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/empty_heart.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -210, posY + -26, 0, 0, 16, 16, 16, 16);

				}
				if (

				PowerUpHealth2Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/present_heart.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -210, posY + -26, 0, 0, 16, 16, 16, 16);

				}
			}

			RenderSystem.depthMask(true);
			RenderSystem.defaultBlendFunc();
			RenderSystem.enableDepthTest();
			RenderSystem.disableBlend();
			RenderSystem.setShaderColor(1, 1, 1, 1);
		}
	}

}
