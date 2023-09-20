package net.mcreator.supermario.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FireBallRechargeProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event);
		}
	}

	public static void execute() {
		execute(null);
	}

private static void execute(
@Nullable Event event
) {
if (==0) {}if (==0) {if (>0) {}}
}
}
