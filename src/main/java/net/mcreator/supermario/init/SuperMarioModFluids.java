
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.supermario.fluid.WonderLavaFluid;
import net.mcreator.supermario.fluid.PoisonWaterFluid;
import net.mcreator.supermario.fluid.GoldWaterFluid;
import net.mcreator.supermario.SuperMarioMod;

public class SuperMarioModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, SuperMarioMod.MODID);
	public static final RegistryObject<Fluid> POISON_WATER = REGISTRY.register("poison_water", () -> new PoisonWaterFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_POISON_WATER = REGISTRY.register("flowing_poison_water", () -> new PoisonWaterFluid.Flowing());
	public static final RegistryObject<Fluid> GOLD_WATER = REGISTRY.register("gold_water", () -> new GoldWaterFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_GOLD_WATER = REGISTRY.register("flowing_gold_water", () -> new GoldWaterFluid.Flowing());
	public static final RegistryObject<Fluid> WONDER_LAVA = REGISTRY.register("wonder_lava", () -> new WonderLavaFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_WONDER_LAVA = REGISTRY.register("flowing_wonder_lava", () -> new WonderLavaFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(POISON_WATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_POISON_WATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(GOLD_WATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_GOLD_WATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(WONDER_LAVA.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_WONDER_LAVA.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
