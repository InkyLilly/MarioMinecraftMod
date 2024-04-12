package net.mcreator.supermario.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

import net.mcreator.supermario.network.SuperMarioModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpringMushroomPowerUpOnGroundProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SuperMarioModVariables.PlayerVariables())).Spring_Mushroom_Active == true) {
			if (entity.isOnGround()) {
				entity.setDeltaMovement(new Vec3(0, 1.1, 0));
			}
			entity.fallDistance = 0;
		}
	}
}
