
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SuperMarioModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("super_mario", "powerdown"), new SoundEvent(new ResourceLocation("super_mario", "powerdown")));
		REGISTRY.put(new ResourceLocation("super_mario", "powerup"), new SoundEvent(new ResourceLocation("super_mario", "powerup")));
		REGISTRY.put(new ResourceLocation("super_mario", "getleaf"), new SoundEvent(new ResourceLocation("super_mario", "getleaf")));
		REGISTRY.put(new ResourceLocation("super_mario", "powerupappear"), new SoundEvent(new ResourceLocation("super_mario", "powerupappear")));
		REGISTRY.put(new ResourceLocation("super_mario", "oneup"), new SoundEvent(new ResourceLocation("super_mario", "oneup")));
		REGISTRY.put(new ResourceLocation("super_mario", "blockbreaking"), new SoundEvent(new ResourceLocation("super_mario", "blockbreaking")));
		REGISTRY.put(new ResourceLocation("super_mario", "bulletshoot"), new SoundEvent(new ResourceLocation("super_mario", "bulletshoot")));
		REGISTRY.put(new ResourceLocation("super_mario", "blockbump"), new SoundEvent(new ResourceLocation("super_mario", "blockbump")));
		REGISTRY.put(new ResourceLocation("super_mario", "getcape"), new SoundEvent(new ResourceLocation("super_mario", "getcape")));
		REGISTRY.put(new ResourceLocation("super_mario", "flycape"), new SoundEvent(new ResourceLocation("super_mario", "flycape")));
		REGISTRY.put(new ResourceLocation("super_mario", "coinsss"), new SoundEvent(new ResourceLocation("super_mario", "coinsss")));
		REGISTRY.put(new ResourceLocation("super_mario", "yoshihurt"), new SoundEvent(new ResourceLocation("super_mario", "yoshihurt")));
		REGISTRY.put(new ResourceLocation("super_mario", "fireball"), new SoundEvent(new ResourceLocation("super_mario", "fireball")));
		REGISTRY.put(new ResourceLocation("super_mario", "itemout"), new SoundEvent(new ResourceLocation("super_mario", "itemout")));
		REGISTRY.put(new ResourceLocation("super_mario", "usepipe"), new SoundEvent(new ResourceLocation("super_mario", "usepipe")));
		REGISTRY.put(new ResourceLocation("super_mario", "kickshell"), new SoundEvent(new ResourceLocation("super_mario", "kickshell")));
		REGISTRY.put(new ResourceLocation("super_mario", "enemykill"), new SoundEvent(new ResourceLocation("super_mario", "enemykill")));
		REGISTRY.put(new ResourceLocation("super_mario", "warpwhistle"), new SoundEvent(new ResourceLocation("super_mario", "warpwhistle")));
		REGISTRY.put(new ResourceLocation("super_mario", "hammerthrow"), new SoundEvent(new ResourceLocation("super_mario", "hammerthrow")));
		REGISTRY.put(new ResourceLocation("super_mario", "flyprepare"), new SoundEvent(new ResourceLocation("super_mario", "flyprepare")));
		REGISTRY.put(new ResourceLocation("super_mario", "boolaugh1"), new SoundEvent(new ResourceLocation("super_mario", "boolaugh1")));
		REGISTRY.put(new ResourceLocation("super_mario", "boolaugh2"), new SoundEvent(new ResourceLocation("super_mario", "boolaugh2")));
		REGISTRY.put(new ResourceLocation("super_mario", "bowsermessage"), new SoundEvent(new ResourceLocation("super_mario", "bowsermessage")));
		REGISTRY.put(new ResourceLocation("super_mario", "spring"), new SoundEvent(new ResourceLocation("super_mario", "spring")));
		REGISTRY.put(new ResourceLocation("super_mario", "pswitch"), new SoundEvent(new ResourceLocation("super_mario", "pswitch")));
		REGISTRY.put(new ResourceLocation("super_mario", "starcoin"), new SoundEvent(new ResourceLocation("super_mario", "starcoin")));
		REGISTRY.put(new ResourceLocation("super_mario", "propellersuitfly"), new SoundEvent(new ResourceLocation("super_mario", "propellersuitfly")));
		REGISTRY.put(new ResourceLocation("super_mario", "thwomp"), new SoundEvent(new ResourceLocation("super_mario", "thwomp")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
