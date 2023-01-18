
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.supermario.client.renderer.StretchBooRenderer;
import net.mcreator.supermario.client.renderer.RedPowBlockRenderer;
import net.mcreator.supermario.client.renderer.PowBlockRenderer;
import net.mcreator.supermario.client.renderer.ParaGoombaRenderer;
import net.mcreator.supermario.client.renderer.MechaKoopaRenderer;
import net.mcreator.supermario.client.renderer.MechaKoopaRangedItemRenderer;
import net.mcreator.supermario.client.renderer.IceBroRenderer;
import net.mcreator.supermario.client.renderer.HuckitCrabRenderer;
import net.mcreator.supermario.client.renderer.HuckitClawRenderer;
import net.mcreator.supermario.client.renderer.HammerBroRenderer;
import net.mcreator.supermario.client.renderer.GoombaRenderer;
import net.mcreator.supermario.client.renderer.FuzzyRenderer;
import net.mcreator.supermario.client.renderer.FireBroRenderer;
import net.mcreator.supermario.client.renderer.EerieRenderer;
import net.mcreator.supermario.client.renderer.CooliganRenderer;
import net.mcreator.supermario.client.renderer.BulletBillRenderer;
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
		event.registerEntityRenderer(SuperMarioModEntities.BULLET_BILL.get(), BulletBillRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.MECHA_KOOPA.get(), MechaKoopaRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.MECHA_KOOPA_RANGED_ITEM.get(), MechaKoopaRangedItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.EERIE.get(), EerieRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.HAMMER_BRO.get(), HammerBroRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.FIRE_BRO.get(), FireBroRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.FIRE_BRO_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.ICE_BRO.get(), IceBroRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.ICE_BRO_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.SLEDGE_HAMMER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.HURL_HAMMER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.POW_BLOCK.get(), PowBlockRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.RED_POW_BLOCK.get(), RedPowBlockRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.ICE_BRICK_ITEM.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.YOSHI_EGG_GREEN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.YOSHI_EGG_RED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.YOSHI_EGG_BLUE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.YOSHI_EGG_YELLOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.YOSHI_EGG_PINK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.YOSHI_EGG_LIGHT_BLUE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.YOSHI_EGG_PURPLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.YOSHI_EGG_BLACK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.YOSHI_EGG_WHITE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.YOSHI_EGG_ORANGE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.YOSHI_EGG_BROWN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.MAGIKOOPA_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.LARRYS_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.ROYS_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.WENDYS_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.LEMMYS_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.LUDWIGS_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.IGGYS_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(SuperMarioModEntities.MORTONS_WAND.get(), ThrownItemRenderer::new);
	}
}
