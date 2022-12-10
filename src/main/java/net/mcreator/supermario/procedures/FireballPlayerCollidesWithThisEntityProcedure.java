package net.mcreator.supermario.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FireballPlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (!(sourceentity instanceof Player)) {
			sourceentity.hurt(DamageSource.GENERIC, 3);
			sourceentity.setSecondsOnFire(5);
		}
	}
}
