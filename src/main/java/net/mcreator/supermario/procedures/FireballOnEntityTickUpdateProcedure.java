package net.mcreator.supermario.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FireballOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isOnGround()) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.3, (entity.getDeltaMovement().z())));
		}
		entity.setDeltaMovement(new Vec3(0.5, (entity.getDeltaMovement().y()), 0));
	}
}
