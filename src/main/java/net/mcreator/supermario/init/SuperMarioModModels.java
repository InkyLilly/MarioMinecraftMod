
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.supermario.client.model.ModelStretchBooDiddly;
import net.mcreator.supermario.client.model.ModelRockThing;
import net.mcreator.supermario.client.model.ModelParaGoomba;
import net.mcreator.supermario.client.model.ModelHuckit_Crab;
import net.mcreator.supermario.client.model.ModelGoomba;
import net.mcreator.supermario.client.model.ModelFuzzy;
import net.mcreator.supermario.client.model.ModelCooligan;
import net.mcreator.supermario.client.model.ModelBooDiddly;
import net.mcreator.supermario.client.model.ModelBob_Omb;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SuperMarioModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelFuzzy.LAYER_LOCATION, ModelFuzzy::createBodyLayer);
		event.registerLayerDefinition(ModelStretchBooDiddly.LAYER_LOCATION, ModelStretchBooDiddly::createBodyLayer);
		event.registerLayerDefinition(ModelBooDiddly.LAYER_LOCATION, ModelBooDiddly::createBodyLayer);
		event.registerLayerDefinition(ModelGoomba.LAYER_LOCATION, ModelGoomba::createBodyLayer);
		event.registerLayerDefinition(ModelRockThing.LAYER_LOCATION, ModelRockThing::createBodyLayer);
		event.registerLayerDefinition(ModelCooligan.LAYER_LOCATION, ModelCooligan::createBodyLayer);
		event.registerLayerDefinition(ModelParaGoomba.LAYER_LOCATION, ModelParaGoomba::createBodyLayer);
		event.registerLayerDefinition(ModelHuckit_Crab.LAYER_LOCATION, ModelHuckit_Crab::createBodyLayer);
		event.registerLayerDefinition(ModelBob_Omb.LAYER_LOCATION, ModelBob_Omb::createBodyLayer);
	}
}