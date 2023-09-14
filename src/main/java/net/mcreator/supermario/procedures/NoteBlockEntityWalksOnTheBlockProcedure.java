package net.mcreator.supermario.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class NoteBlockEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 1.5, (entity.getDeltaMovement().z())));
		entity.fallDistance = 0;
	}
}
