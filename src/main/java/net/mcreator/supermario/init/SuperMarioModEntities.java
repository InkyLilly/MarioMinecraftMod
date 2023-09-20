
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.supermario.entity.YoshiEntity;
import net.mcreator.supermario.entity.YoshiEggYellowEntity;
import net.mcreator.supermario.entity.YoshiEggWhiteEntity;
import net.mcreator.supermario.entity.YoshiEggRedEntity;
import net.mcreator.supermario.entity.YoshiEggPurpleEntity;
import net.mcreator.supermario.entity.YoshiEggPinkEntity;
import net.mcreator.supermario.entity.YoshiEggOrangeEntity;
import net.mcreator.supermario.entity.YoshiEggLightBlueEntity;
import net.mcreator.supermario.entity.YoshiEggGreenEntity;
import net.mcreator.supermario.entity.YoshiEggBrownEntity;
import net.mcreator.supermario.entity.YoshiEggBlueEntity;
import net.mcreator.supermario.entity.YoshiEggBlackEntity;
import net.mcreator.supermario.entity.XNautPHDEntity;
import net.mcreator.supermario.entity.XNautEntity;
import net.mcreator.supermario.entity.WendysWandEntity;
import net.mcreator.supermario.entity.ToadYellowEntity;
import net.mcreator.supermario.entity.ToadRedEntity;
import net.mcreator.supermario.entity.ToadPurpleEntity;
import net.mcreator.supermario.entity.ToadGreenEntity;
import net.mcreator.supermario.entity.ToadEntity;
import net.mcreator.supermario.entity.ToadBlueEntity;
import net.mcreator.supermario.entity.StretchBooEntity;
import net.mcreator.supermario.entity.SledgeHammerEntity;
import net.mcreator.supermario.entity.RoysWandEntity;
import net.mcreator.supermario.entity.RedShyGuyEntity;
import net.mcreator.supermario.entity.RedPowBlockEntity;
import net.mcreator.supermario.entity.PowBlockEntity;
import net.mcreator.supermario.entity.ParaGoombaEntity;
import net.mcreator.supermario.entity.MortonsWandEntity;
import net.mcreator.supermario.entity.MechaKoopaRangedItemEntity;
import net.mcreator.supermario.entity.MechaKoopaEntity;
import net.mcreator.supermario.entity.MagikoopaWandEntity;
import net.mcreator.supermario.entity.LudwigsWandEntity;
import net.mcreator.supermario.entity.LightBlueShyGuyEntity;
import net.mcreator.supermario.entity.LemmysWandEntity;
import net.mcreator.supermario.entity.LarrysWandEntity;
import net.mcreator.supermario.entity.KoopaYellowEntity;
import net.mcreator.supermario.entity.KoopaShellGreenEntity;
import net.mcreator.supermario.entity.KoopaRedEntity;
import net.mcreator.supermario.entity.KoopaGreenEntity;
import net.mcreator.supermario.entity.KoopaBlueEntity;
import net.mcreator.supermario.entity.IggysWandEntity;
import net.mcreator.supermario.entity.IceBroEntityProjectile;
import net.mcreator.supermario.entity.IceBroEntity;
import net.mcreator.supermario.entity.IceBrickItemEntity;
import net.mcreator.supermario.entity.HurlHammerEntity;
import net.mcreator.supermario.entity.HuckitCrabEntity;
import net.mcreator.supermario.entity.HuckitClawEntity;
import net.mcreator.supermario.entity.HammerBroEntity;
import net.mcreator.supermario.entity.GreenShyGuyEntity;
import net.mcreator.supermario.entity.GoombaEntity;
import net.mcreator.supermario.entity.GoldBallEntity;
import net.mcreator.supermario.entity.FuzzyEntity;
import net.mcreator.supermario.entity.FireballEntity;
import net.mcreator.supermario.entity.FireBroEntityProjectile;
import net.mcreator.supermario.entity.FireBroEntity;
import net.mcreator.supermario.entity.EliteXNautEntity;
import net.mcreator.supermario.entity.EerieEntity;
import net.mcreator.supermario.entity.EepCheepEntity;
import net.mcreator.supermario.entity.DuplighostEntity;
import net.mcreator.supermario.entity.DeepCheepEntity;
import net.mcreator.supermario.entity.CooliganEntity;
import net.mcreator.supermario.entity.CheepCheepEntity;
import net.mcreator.supermario.entity.BulletBillEntity;
import net.mcreator.supermario.entity.BoomerangBroEntityProjectile;
import net.mcreator.supermario.entity.BoomerangBroEntity;
import net.mcreator.supermario.entity.BooEntity;
import net.mcreator.supermario.entity.BobOmbEntity;
import net.mcreator.supermario.SuperMarioMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SuperMarioModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, SuperMarioMod.MODID);
	public static final RegistryObject<EntityType<BobOmbEntity>> BOB_OMB = register("bob_omb",
			EntityType.Builder.<BobOmbEntity>of(BobOmbEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BobOmbEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BooEntity>> BOO = register("boo",
			EntityType.Builder.<BooEntity>of(BooEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BooEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StretchBooEntity>> STRETCH_BOO = register("stretch_boo", EntityType.Builder.<StretchBooEntity>of(StretchBooEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(StretchBooEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CooliganEntity>> COOLIGAN = register("cooligan",
			EntityType.Builder.<CooliganEntity>of(CooliganEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CooliganEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HuckitClawEntity>> HUCKIT_CLAW = register("projectile_huckit_claw",
			EntityType.Builder.<HuckitClawEntity>of(HuckitClawEntity::new, MobCategory.MISC).setCustomClientFactory(HuckitClawEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ParaGoombaEntity>> PARA_GOOMBA = register("para_goomba",
			EntityType.Builder.<ParaGoombaEntity>of(ParaGoombaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ParaGoombaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HuckitCrabEntity>> HUCKIT_CRAB = register("huckit_crab",
			EntityType.Builder.<HuckitCrabEntity>of(HuckitCrabEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HuckitCrabEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MechaKoopaRangedItemEntity>> MECHA_KOOPA_RANGED_ITEM = register("projectile_mecha_koopa_ranged_item", EntityType.Builder
			.<MechaKoopaRangedItemEntity>of(MechaKoopaRangedItemEntity::new, MobCategory.MISC).setCustomClientFactory(MechaKoopaRangedItemEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EerieEntity>> EERIE = register("eerie",
			EntityType.Builder.<EerieEntity>of(EerieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EerieEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FuzzyEntity>> FUZZY = register("fuzzy",
			EntityType.Builder.<FuzzyEntity>of(FuzzyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FuzzyEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<HammerBroEntity>> HAMMER_BRO = register("hammer_bro",
			EntityType.Builder.<HammerBroEntity>of(HammerBroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HammerBroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FireBroEntity>> FIRE_BRO = register("fire_bro",
			EntityType.Builder.<FireBroEntity>of(FireBroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireBroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FireBroEntityProjectile>> FIRE_BRO_PROJECTILE = register("projectile_fire_bro", EntityType.Builder.<FireBroEntityProjectile>of(FireBroEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(FireBroEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GoombaEntity>> GOOMBA = register("goomba",
			EntityType.Builder.<GoombaEntity>of(GoombaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoombaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IceBroEntity>> ICE_BRO = register("ice_bro",
			EntityType.Builder.<IceBroEntity>of(IceBroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IceBroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IceBroEntityProjectile>> ICE_BRO_PROJECTILE = register("projectile_ice_bro", EntityType.Builder.<IceBroEntityProjectile>of(IceBroEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(IceBroEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KoopaGreenEntity>> KOOPA_GREEN = register("koopa_green",
			EntityType.Builder.<KoopaGreenEntity>of(KoopaGreenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopaGreenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BoomerangBroEntity>> BOOMERANG_BRO = register("boomerang_bro",
			EntityType.Builder.<BoomerangBroEntity>of(BoomerangBroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BoomerangBroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BoomerangBroEntityProjectile>> BOOMERANG_BRO_PROJECTILE = register("projectile_boomerang_bro", EntityType.Builder.<BoomerangBroEntityProjectile>of(BoomerangBroEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(BoomerangBroEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KoopaRedEntity>> KOOPA_RED = register("koopa_red",
			EntityType.Builder.<KoopaRedEntity>of(KoopaRedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopaRedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KoopaYellowEntity>> KOOPA_YELLOW = register("koopa_yellow",
			EntityType.Builder.<KoopaYellowEntity>of(KoopaYellowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopaYellowEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KoopaBlueEntity>> KOOPA_BLUE = register("koopa_blue",
			EntityType.Builder.<KoopaBlueEntity>of(KoopaBlueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopaBlueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BulletBillEntity>> BULLET_BILL = register("bullet_bill",
			EntityType.Builder.<BulletBillEntity>of(BulletBillEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BulletBillEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MechaKoopaEntity>> MECHA_KOOPA = register("mecha_koopa", EntityType.Builder.<MechaKoopaEntity>of(MechaKoopaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(MechaKoopaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DuplighostEntity>> DUPLIGHOST = register("duplighost",
			EntityType.Builder.<DuplighostEntity>of(DuplighostEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DuplighostEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RedShyGuyEntity>> RED_SHY_GUY = register("red_shy_guy",
			EntityType.Builder.<RedShyGuyEntity>of(RedShyGuyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RedShyGuyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GreenShyGuyEntity>> GREEN_SHY_GUY = register("green_shy_guy",
			EntityType.Builder.<GreenShyGuyEntity>of(GreenShyGuyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GreenShyGuyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LightBlueShyGuyEntity>> LIGHT_BLUE_SHY_GUY = register("light_blue_shy_guy",
			EntityType.Builder.<LightBlueShyGuyEntity>of(LightBlueShyGuyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LightBlueShyGuyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CheepCheepEntity>> CHEEP_CHEEP = register("cheep_cheep",
			EntityType.Builder.<CheepCheepEntity>of(CheepCheepEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CheepCheepEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DeepCheepEntity>> DEEP_CHEEP = register("deep_cheep",
			EntityType.Builder.<DeepCheepEntity>of(DeepCheepEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DeepCheepEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EepCheepEntity>> EEP_CHEEP = register("eep_cheep",
			EntityType.Builder.<EepCheepEntity>of(EepCheepEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EepCheepEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KoopaShellGreenEntity>> KOOPA_SHELL_GREEN = register("koopa_shell_green",
			EntityType.Builder.<KoopaShellGreenEntity>of(KoopaShellGreenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopaShellGreenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToadEntity>> TOAD = register("toad",
			EntityType.Builder.<ToadEntity>of(ToadEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToadEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToadRedEntity>> TOAD_RED = register("toad_red",
			EntityType.Builder.<ToadRedEntity>of(ToadRedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToadRedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToadBlueEntity>> TOAD_BLUE = register("toad_blue",
			EntityType.Builder.<ToadBlueEntity>of(ToadBlueEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToadBlueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToadYellowEntity>> TOAD_YELLOW = register("toad_yellow",
			EntityType.Builder.<ToadYellowEntity>of(ToadYellowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToadYellowEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToadGreenEntity>> TOAD_GREEN = register("toad_green",
			EntityType.Builder.<ToadGreenEntity>of(ToadGreenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToadGreenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToadPurpleEntity>> TOAD_PURPLE = register("toad_purple",
			EntityType.Builder.<ToadPurpleEntity>of(ToadPurpleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToadPurpleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SledgeHammerEntity>> SLEDGE_HAMMER = register("projectile_sledge_hammer",
			EntityType.Builder.<SledgeHammerEntity>of(SledgeHammerEntity::new, MobCategory.MISC).setCustomClientFactory(SledgeHammerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HurlHammerEntity>> HURL_HAMMER = register("projectile_hurl_hammer",
			EntityType.Builder.<HurlHammerEntity>of(HurlHammerEntity::new, MobCategory.MISC).setCustomClientFactory(HurlHammerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PowBlockEntity>> POW_BLOCK = register("projectile_pow_block",
			EntityType.Builder.<PowBlockEntity>of(PowBlockEntity::new, MobCategory.MISC).setCustomClientFactory(PowBlockEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RedPowBlockEntity>> RED_POW_BLOCK = register("projectile_red_pow_block",
			EntityType.Builder.<RedPowBlockEntity>of(RedPowBlockEntity::new, MobCategory.MISC).setCustomClientFactory(RedPowBlockEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IceBrickItemEntity>> ICE_BRICK_ITEM = register("projectile_ice_brick_item",
			EntityType.Builder.<IceBrickItemEntity>of(IceBrickItemEntity::new, MobCategory.MISC).setCustomClientFactory(IceBrickItemEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggGreenEntity>> YOSHI_EGG_GREEN = register("projectile_yoshi_egg_green",
			EntityType.Builder.<YoshiEggGreenEntity>of(YoshiEggGreenEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggGreenEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggRedEntity>> YOSHI_EGG_RED = register("projectile_yoshi_egg_red",
			EntityType.Builder.<YoshiEggRedEntity>of(YoshiEggRedEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggRedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggBlueEntity>> YOSHI_EGG_BLUE = register("projectile_yoshi_egg_blue",
			EntityType.Builder.<YoshiEggBlueEntity>of(YoshiEggBlueEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggBlueEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggYellowEntity>> YOSHI_EGG_YELLOW = register("projectile_yoshi_egg_yellow",
			EntityType.Builder.<YoshiEggYellowEntity>of(YoshiEggYellowEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggYellowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggPinkEntity>> YOSHI_EGG_PINK = register("projectile_yoshi_egg_pink",
			EntityType.Builder.<YoshiEggPinkEntity>of(YoshiEggPinkEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggPinkEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggLightBlueEntity>> YOSHI_EGG_LIGHT_BLUE = register("projectile_yoshi_egg_light_blue", EntityType.Builder.<YoshiEggLightBlueEntity>of(YoshiEggLightBlueEntity::new, MobCategory.MISC)
			.setCustomClientFactory(YoshiEggLightBlueEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggPurpleEntity>> YOSHI_EGG_PURPLE = register("projectile_yoshi_egg_purple",
			EntityType.Builder.<YoshiEggPurpleEntity>of(YoshiEggPurpleEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggPurpleEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggBlackEntity>> YOSHI_EGG_BLACK = register("projectile_yoshi_egg_black",
			EntityType.Builder.<YoshiEggBlackEntity>of(YoshiEggBlackEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggBlackEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggWhiteEntity>> YOSHI_EGG_WHITE = register("projectile_yoshi_egg_white",
			EntityType.Builder.<YoshiEggWhiteEntity>of(YoshiEggWhiteEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggWhiteEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggOrangeEntity>> YOSHI_EGG_ORANGE = register("projectile_yoshi_egg_orange",
			EntityType.Builder.<YoshiEggOrangeEntity>of(YoshiEggOrangeEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggOrangeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggBrownEntity>> YOSHI_EGG_BROWN = register("projectile_yoshi_egg_brown",
			EntityType.Builder.<YoshiEggBrownEntity>of(YoshiEggBrownEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggBrownEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MagikoopaWandEntity>> MAGIKOOPA_WAND = register("projectile_magikoopa_wand",
			EntityType.Builder.<MagikoopaWandEntity>of(MagikoopaWandEntity::new, MobCategory.MISC).setCustomClientFactory(MagikoopaWandEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LarrysWandEntity>> LARRYS_WAND = register("projectile_larrys_wand",
			EntityType.Builder.<LarrysWandEntity>of(LarrysWandEntity::new, MobCategory.MISC).setCustomClientFactory(LarrysWandEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RoysWandEntity>> ROYS_WAND = register("projectile_roys_wand",
			EntityType.Builder.<RoysWandEntity>of(RoysWandEntity::new, MobCategory.MISC).setCustomClientFactory(RoysWandEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WendysWandEntity>> WENDYS_WAND = register("projectile_wendys_wand",
			EntityType.Builder.<WendysWandEntity>of(WendysWandEntity::new, MobCategory.MISC).setCustomClientFactory(WendysWandEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LemmysWandEntity>> LEMMYS_WAND = register("projectile_lemmys_wand",
			EntityType.Builder.<LemmysWandEntity>of(LemmysWandEntity::new, MobCategory.MISC).setCustomClientFactory(LemmysWandEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LudwigsWandEntity>> LUDWIGS_WAND = register("projectile_ludwigs_wand",
			EntityType.Builder.<LudwigsWandEntity>of(LudwigsWandEntity::new, MobCategory.MISC).setCustomClientFactory(LudwigsWandEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IggysWandEntity>> IGGYS_WAND = register("projectile_iggys_wand",
			EntityType.Builder.<IggysWandEntity>of(IggysWandEntity::new, MobCategory.MISC).setCustomClientFactory(IggysWandEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MortonsWandEntity>> MORTONS_WAND = register("projectile_mortons_wand",
			EntityType.Builder.<MortonsWandEntity>of(MortonsWandEntity::new, MobCategory.MISC).setCustomClientFactory(MortonsWandEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<XNautEntity>> X_NAUT = register("x_naut",
			EntityType.Builder.<XNautEntity>of(XNautEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(XNautEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EliteXNautEntity>> ELITE_X_NAUT = register("elite_x_naut",
			EntityType.Builder.<EliteXNautEntity>of(EliteXNautEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EliteXNautEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<XNautPHDEntity>> X_NAUT_PHD = register("x_naut_phd",
			EntityType.Builder.<XNautPHDEntity>of(XNautPHDEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(XNautPHDEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FireballEntity>> FIREBALL = register("fireball",
			EntityType.Builder.<FireballEntity>of(FireballEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireballEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YoshiEntity>> YOSHI = register("yoshi",
			EntityType.Builder.<YoshiEntity>of(YoshiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YoshiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GoldBallEntity>> GOLD_BALL = register("gold_ball",
			EntityType.Builder.<GoldBallEntity>of(GoldBallEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoldBallEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BobOmbEntity.init();
			BooEntity.init();
			StretchBooEntity.init();
			CooliganEntity.init();
			ParaGoombaEntity.init();
			HuckitCrabEntity.init();
			EerieEntity.init();
			FuzzyEntity.init();
			HammerBroEntity.init();
			FireBroEntity.init();
			GoombaEntity.init();
			IceBroEntity.init();
			KoopaGreenEntity.init();
			BoomerangBroEntity.init();
			KoopaRedEntity.init();
			KoopaYellowEntity.init();
			KoopaBlueEntity.init();
			BulletBillEntity.init();
			MechaKoopaEntity.init();
			DuplighostEntity.init();
			RedShyGuyEntity.init();
			GreenShyGuyEntity.init();
			LightBlueShyGuyEntity.init();
			CheepCheepEntity.init();
			DeepCheepEntity.init();
			EepCheepEntity.init();
			KoopaShellGreenEntity.init();
			ToadEntity.init();
			ToadRedEntity.init();
			ToadBlueEntity.init();
			ToadYellowEntity.init();
			ToadGreenEntity.init();
			ToadPurpleEntity.init();
			XNautEntity.init();
			EliteXNautEntity.init();
			XNautPHDEntity.init();
			FireballEntity.init();
			YoshiEntity.init();
			GoldBallEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BOB_OMB.get(), BobOmbEntity.createAttributes().build());
		event.put(BOO.get(), BooEntity.createAttributes().build());
		event.put(STRETCH_BOO.get(), StretchBooEntity.createAttributes().build());
		event.put(COOLIGAN.get(), CooliganEntity.createAttributes().build());
		event.put(PARA_GOOMBA.get(), ParaGoombaEntity.createAttributes().build());
		event.put(HUCKIT_CRAB.get(), HuckitCrabEntity.createAttributes().build());
		event.put(EERIE.get(), EerieEntity.createAttributes().build());
		event.put(FUZZY.get(), FuzzyEntity.createAttributes().build());
		event.put(HAMMER_BRO.get(), HammerBroEntity.createAttributes().build());
		event.put(FIRE_BRO.get(), FireBroEntity.createAttributes().build());
		event.put(GOOMBA.get(), GoombaEntity.createAttributes().build());
		event.put(ICE_BRO.get(), IceBroEntity.createAttributes().build());
		event.put(KOOPA_GREEN.get(), KoopaGreenEntity.createAttributes().build());
		event.put(BOOMERANG_BRO.get(), BoomerangBroEntity.createAttributes().build());
		event.put(KOOPA_RED.get(), KoopaRedEntity.createAttributes().build());
		event.put(KOOPA_YELLOW.get(), KoopaYellowEntity.createAttributes().build());
		event.put(KOOPA_BLUE.get(), KoopaBlueEntity.createAttributes().build());
		event.put(BULLET_BILL.get(), BulletBillEntity.createAttributes().build());
		event.put(MECHA_KOOPA.get(), MechaKoopaEntity.createAttributes().build());
		event.put(DUPLIGHOST.get(), DuplighostEntity.createAttributes().build());
		event.put(RED_SHY_GUY.get(), RedShyGuyEntity.createAttributes().build());
		event.put(GREEN_SHY_GUY.get(), GreenShyGuyEntity.createAttributes().build());
		event.put(LIGHT_BLUE_SHY_GUY.get(), LightBlueShyGuyEntity.createAttributes().build());
		event.put(CHEEP_CHEEP.get(), CheepCheepEntity.createAttributes().build());
		event.put(DEEP_CHEEP.get(), DeepCheepEntity.createAttributes().build());
		event.put(EEP_CHEEP.get(), EepCheepEntity.createAttributes().build());
		event.put(KOOPA_SHELL_GREEN.get(), KoopaShellGreenEntity.createAttributes().build());
		event.put(TOAD.get(), ToadEntity.createAttributes().build());
		event.put(TOAD_RED.get(), ToadRedEntity.createAttributes().build());
		event.put(TOAD_BLUE.get(), ToadBlueEntity.createAttributes().build());
		event.put(TOAD_YELLOW.get(), ToadYellowEntity.createAttributes().build());
		event.put(TOAD_GREEN.get(), ToadGreenEntity.createAttributes().build());
		event.put(TOAD_PURPLE.get(), ToadPurpleEntity.createAttributes().build());
		event.put(X_NAUT.get(), XNautEntity.createAttributes().build());
		event.put(ELITE_X_NAUT.get(), EliteXNautEntity.createAttributes().build());
		event.put(X_NAUT_PHD.get(), XNautPHDEntity.createAttributes().build());
		event.put(FIREBALL.get(), FireballEntity.createAttributes().build());
		event.put(YOSHI.get(), YoshiEntity.createAttributes().build());
		event.put(GOLD_BALL.get(), GoldBallEntity.createAttributes().build());
	}
}
