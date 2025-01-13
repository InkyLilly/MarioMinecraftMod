
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.supermario.client.model.Modelpow;
import net.mcreator.supermario.client.model.Modelcustom_model;
import net.mcreator.supermario.client.model.Modelbulletbill;
import net.mcreator.supermario.client.model.ModelZokkarangTrooper;
import net.mcreator.supermario.client.model.ModelWeepingTrooper;
import net.mcreator.supermario.client.model.ModelStretchBooDiddly;
import net.mcreator.supermario.client.model.ModelSproing;
import net.mcreator.supermario.client.model.ModelSpriteBulb;
import net.mcreator.supermario.client.model.ModelSpiteBulb;
import net.mcreator.supermario.client.model.ModelSpikely;
import net.mcreator.supermario.client.model.ModelSpikeZokTrooper;
import net.mcreator.supermario.client.model.ModelSoreboar;
import net.mcreator.supermario.client.model.ModelSledgeHammer_Converted;
import net.mcreator.supermario.client.model.ModelShowerFishWet;
import net.mcreator.supermario.client.model.ModelShowerFishDry;
import net.mcreator.supermario.client.model.ModelSeedlusa;
import net.mcreator.supermario.client.model.ModelSeedle;
import net.mcreator.supermario.client.model.ModelRockThing;
import net.mcreator.supermario.client.model.ModelRingZokTrooper;
import net.mcreator.supermario.client.model.ModelParaGoomba;
import net.mcreator.supermario.client.model.ModelNewSnailicorn;
import net.mcreator.supermario.client.model.ModelMillton;
import net.mcreator.supermario.client.model.ModelMechaKoopa;
import net.mcreator.supermario.client.model.ModelJetZokTrooper;
import net.mcreator.supermario.client.model.ModelInvisilizard;
import net.mcreator.supermario.client.model.ModelHuckit_Crab;
import net.mcreator.supermario.client.model.ModelHelmetZokTrooper;
import net.mcreator.supermario.client.model.ModelGoomba;
import net.mcreator.supermario.client.model.ModelFuzzy;
import net.mcreator.supermario.client.model.ModelFuzzler;
import net.mcreator.supermario.client.model.ModelFoopfly;
import net.mcreator.supermario.client.model.ModelFireball;
import net.mcreator.supermario.client.model.ModelEerie;
import net.mcreator.supermario.client.model.ModelCooligan;
import net.mcreator.supermario.client.model.ModelBumbleshoot;
import net.mcreator.supermario.client.model.ModelBootCar;
import net.mcreator.supermario.client.model.ModelBooDiddly;
import net.mcreator.supermario.client.model.ModelBob_Omb;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SuperMarioModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelRockThing.LAYER_LOCATION, ModelRockThing::createBodyLayer);
		event.registerLayerDefinition(ModelFoopfly.LAYER_LOCATION, ModelFoopfly::createBodyLayer);
		event.registerLayerDefinition(ModelSeedlusa.LAYER_LOCATION, ModelSeedlusa::createBodyLayer);
		event.registerLayerDefinition(ModelHuckit_Crab.LAYER_LOCATION, ModelHuckit_Crab::createBodyLayer);
		event.registerLayerDefinition(ModelStretchBooDiddly.LAYER_LOCATION, ModelStretchBooDiddly::createBodyLayer);
		event.registerLayerDefinition(ModelBooDiddly.LAYER_LOCATION, ModelBooDiddly::createBodyLayer);
		event.registerLayerDefinition(ModelBootCar.LAYER_LOCATION, ModelBootCar::createBodyLayer);
		event.registerLayerDefinition(ModelFireball.LAYER_LOCATION, ModelFireball::createBodyLayer);
		event.registerLayerDefinition(ModelSproing.LAYER_LOCATION, ModelSproing::createBodyLayer);
		event.registerLayerDefinition(ModelSpikely.LAYER_LOCATION, ModelSpikely::createBodyLayer);
		event.registerLayerDefinition(ModelGoomba.LAYER_LOCATION, ModelGoomba::createBodyLayer);
		event.registerLayerDefinition(ModelShowerFishDry.LAYER_LOCATION, ModelShowerFishDry::createBodyLayer);
		event.registerLayerDefinition(ModelEerie.LAYER_LOCATION, ModelEerie::createBodyLayer);
		event.registerLayerDefinition(ModelMechaKoopa.LAYER_LOCATION, ModelMechaKoopa::createBodyLayer);
		event.registerLayerDefinition(Modelpow.LAYER_LOCATION, Modelpow::createBodyLayer);
		event.registerLayerDefinition(ModelFuzzy.LAYER_LOCATION, ModelFuzzy::createBodyLayer);
		event.registerLayerDefinition(ModelSpiteBulb.LAYER_LOCATION, ModelSpiteBulb::createBodyLayer);
		event.registerLayerDefinition(ModelInvisilizard.LAYER_LOCATION, ModelInvisilizard::createBodyLayer);
		event.registerLayerDefinition(ModelMillton.LAYER_LOCATION, ModelMillton::createBodyLayer);
		event.registerLayerDefinition(ModelJetZokTrooper.LAYER_LOCATION, ModelJetZokTrooper::createBodyLayer);
		event.registerLayerDefinition(ModelSpriteBulb.LAYER_LOCATION, ModelSpriteBulb::createBodyLayer);
		event.registerLayerDefinition(ModelParaGoomba.LAYER_LOCATION, ModelParaGoomba::createBodyLayer);
		event.registerLayerDefinition(ModelBob_Omb.LAYER_LOCATION, ModelBob_Omb::createBodyLayer);
		event.registerLayerDefinition(ModelZokkarangTrooper.LAYER_LOCATION, ModelZokkarangTrooper::createBodyLayer);
		event.registerLayerDefinition(ModelSledgeHammer_Converted.LAYER_LOCATION, ModelSledgeHammer_Converted::createBodyLayer);
		event.registerLayerDefinition(ModelBumbleshoot.LAYER_LOCATION, ModelBumbleshoot::createBodyLayer);
		event.registerLayerDefinition(ModelCooligan.LAYER_LOCATION, ModelCooligan::createBodyLayer);
		event.registerLayerDefinition(ModelSeedle.LAYER_LOCATION, ModelSeedle::createBodyLayer);
		event.registerLayerDefinition(ModelWeepingTrooper.LAYER_LOCATION, ModelWeepingTrooper::createBodyLayer);
		event.registerLayerDefinition(ModelNewSnailicorn.LAYER_LOCATION, ModelNewSnailicorn::createBodyLayer);
		event.registerLayerDefinition(Modelbulletbill.LAYER_LOCATION, Modelbulletbill::createBodyLayer);
		event.registerLayerDefinition(ModelSoreboar.LAYER_LOCATION, ModelSoreboar::createBodyLayer);
		event.registerLayerDefinition(ModelShowerFishWet.LAYER_LOCATION, ModelShowerFishWet::createBodyLayer);
		event.registerLayerDefinition(ModelHelmetZokTrooper.LAYER_LOCATION, ModelHelmetZokTrooper::createBodyLayer);
		event.registerLayerDefinition(ModelSpikeZokTrooper.LAYER_LOCATION, ModelSpikeZokTrooper::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(ModelFuzzler.LAYER_LOCATION, ModelFuzzler::createBodyLayer);
		event.registerLayerDefinition(ModelRingZokTrooper.LAYER_LOCATION, ModelRingZokTrooper::createBodyLayer);
	}
}
