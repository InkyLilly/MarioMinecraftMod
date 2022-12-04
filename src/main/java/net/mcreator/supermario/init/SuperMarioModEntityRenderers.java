
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.supermario.client.renderer.StretchBooRenderer;
import net.mcreator.supermario.client.renderer.ParaGoombaRenderer;
import net.mcreator.supermario.client.renderer.HuckitCrabRenderer;
import net.mcreator.supermario.client.renderer.HuckitClawRenderer;
import net.mcreator.supermario.client.renderer.GoombaRenderer;
import net.mcreator.supermario.client.renderer.FuzzyRenderer;
import net.mcreator.supermario.client.renderer.CooliganRenderer;
import net.mcreator.supermario.client.renderer.BooRenderer;
import net.mcreator.supermario.client.renderer.BobOmbRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SuperMarioModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SuperMarioModEntities.GOOMBA.get(), GoombaRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.PARA_GOOMBA.get(), ParaGoombaRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.BOB_OMB.get(), BobOmbRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.BOO.get(), BooRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.STRETCH_BOO.get(), StretchBooRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.COOLIGAN.get(), CooliganRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.HUCKIT_CRAB.get(), HuckitCrabRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.HUCKIT_CLAW.get(), HuckitClawRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.FUZZY.get(), FuzzyRenderer::new);
	}
}
