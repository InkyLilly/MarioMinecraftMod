package net.mcreator.supermario.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FireFlowerRightclickedProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity,
ItemStack itemstack
) {
if(
entity == null
) return ;
if (==false) {if (entity instanceof Player _player) {
ItemStack _stktoremove = itemstack;
_player.getInventory()
.clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
}if ((entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new SuperMarioModVariables.PlayerVariables())).Propeller_Mushroom_Falling==true) {if (entity instanceof LivingEntity _entity) _entity.removeEffect(MobEffects.SLOW_FALLING);}if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, new BlockPos(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("super_mario:powerup")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("super_mario:powerup")),
SoundSource.NEUTRAL, 1, 1, false);
}
}{
double _setval = 3;
entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.PowerUp_Health = _setval;
capability.syncPlayerVariables(entity);
});
}{
boolean _setval = false;
entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.Super_Leaf_Flight_Active = _setval;
capability.syncPlayerVariables(entity);
});
}{
boolean _setval = false;
entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.Super_Leaf_Active = _setval;
capability.syncPlayerVariables(entity);
});
}{
boolean _setval = false;
entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.PowerUp_Running_Able = _setval;
capability.syncPlayerVariables(entity);
});
}{
boolean _setval = false;
entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.Propeller_Mushroom_Active = _setval;
capability.syncPlayerVariables(entity);
});
}{
boolean _setval = false;
entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.Propeller_Mushroom_Flight_Active = _setval;
capability.syncPlayerVariables(entity);
});
}{
boolean _setval = false;
entity.getCapability(SuperMarioModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.Propeller_Mushroom_Falling = _setval;
capability.syncPlayerVariables(entity);
});
}}
}
}
