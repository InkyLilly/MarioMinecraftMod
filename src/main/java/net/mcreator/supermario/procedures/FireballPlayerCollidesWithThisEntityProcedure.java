package net.mcreator.supermario.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

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
