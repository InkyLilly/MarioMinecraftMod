
package net.mcreator.supermario.client.gui;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.supermario.procedures.PowerUpHealthOverlayDisplayOverlayIngameProcedure;
import net.mcreator.supermario.procedures.PowerUpHealth3Procedure;
import net.mcreator.supermario.procedures.PowerUpHealth2Procedure;
import net.mcreator.supermario.procedures.PowerUpHealth1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class PowerUpHealthOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Pre event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
			int w = event.getWindow().getGuiScaledWidth();
			int h = event.getWindow().getGuiScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			Level world = null;
			double x = 0;
			double y = 0;
			double z = 0;
			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				world = entity.level;
				x = entity.getX();
				y = entity.getY();
				z = entity.getZ();
			}
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.enableBlend();
			RenderSystem.setShader(GameRenderer::getPositionTexShader);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.setShaderColor(1, 1, 1, 1);
			if (PowerUpHealthOverlayDisplayOverlayIngameProcedure.execute(entity)) {
				if (PowerUpHealth1Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/present_heart.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -210, posY + -45, 0, 0, 16, 16, 16, 16);
				}
				if (PowerUpHealth1Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/empty_heart.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -210, posY + -26, 0, 0, 16, 16, 16, 16);
				}
				if (PowerUpHealth2Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/present_heart.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -210, posY + -26, 0, 0, 16, 16, 16, 16);
				}
				if (PowerUpHealth1Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/empty_heart.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -210, posY + -6, 0, 0, 16, 16, 16, 16);
				}
				if (PowerUpHealth3Procedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("super_mario:textures/screens/present_heart.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -210, posY + -6, 0, 0, 16, 16, 16, 16);
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
