package net.mcreator.supermario.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.supermario.init.SuperMarioModBlockEntities;
import net.mcreator.supermario.block.renderer.ConnectarLightbulbTileRenderer;
import net.mcreator.supermario.SuperMarioMod;

@Mod.EventBusSubscriber(modid = SuperMarioMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(SuperMarioModBlockEntities.CONNECTAR_LIGHTBULB.get(), ConnectarLightbulbTileRenderer::new);
	}
}
