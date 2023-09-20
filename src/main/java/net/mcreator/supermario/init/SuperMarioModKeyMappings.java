
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.supermario.network.SuperLeafFlightMessage;
import net.mcreator.supermario.network.ProjectilePowerUpKeyMessage;
import net.mcreator.supermario.SuperMarioMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SuperMarioModKeyMappings {
	public static final KeyMapping SUPER_LEAF_FLIGHT = new KeyMapping("key.super_mario.super_leaf_flight", GLFW.GLFW_KEY_SPACE, "key.categories.movement");
	public static final KeyMapping PROJECTILE_POWER_UP_KEY = new KeyMapping("key.super_mario.projectile_power_up_key", GLFW.GLFW_KEY_G, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(SUPER_LEAF_FLIGHT);
		ClientRegistry.registerKeyBinding(PROJECTILE_POWER_UP_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == SUPER_LEAF_FLIGHT.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						SuperMarioMod.PACKET_HANDLER.sendToServer(new SuperLeafFlightMessage(0, 0));
						SuperLeafFlightMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == PROJECTILE_POWER_UP_KEY.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						SuperMarioMod.PACKET_HANDLER.sendToServer(new ProjectilePowerUpKeyMessage(0, 0));
						ProjectilePowerUpKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
