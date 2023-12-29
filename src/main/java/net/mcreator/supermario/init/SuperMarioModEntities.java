
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
import net.mcreator.supermario.entity.WubbaEntity;
import net.mcreator.supermario.entity.WhiteClubbaSleepingEntity;
import net.mcreator.supermario.entity.WhiteClubbaEntity;
import net.mcreator.supermario.entity.WendysWandEntity;
import net.mcreator.supermario.entity.ToadYellowEntity;
import net.mcreator.supermario.entity.ToadRedEntity;
import net.mcreator.supermario.entity.ToadPurpleEntity;
import net.mcreator.supermario.entity.ToadGreenEntity;
import net.mcreator.supermario.entity.ToadEntity;
import net.mcreator.supermario.entity.ToadBlueEntity;
import net.mcreator.supermario.entity.ThwompEntity;
import net.mcreator.supermario.entity.StretchBooEntity;
import net.mcreator.supermario.entity.StandardKartYellowEntity;
import net.mcreator.supermario.entity.StandardKartWhiteEntity;
import net.mcreator.supermario.entity.StandardKartRedEntity;
import net.mcreator.supermario.entity.StandardKartPurpleEntity;
import net.mcreator.supermario.entity.StandardKartPinkEntity;
import net.mcreator.supermario.entity.StandardKartGreenEntity;
import net.mcreator.supermario.entity.StandardKartBrownEntity;
import net.mcreator.supermario.entity.StandardKartBlueEntity;
import net.mcreator.supermario.entity.SpinyEntity;
import net.mcreator.supermario.entity.SpinyEggEntity;
import net.mcreator.supermario.entity.SledgeHammerEntity;
import net.mcreator.supermario.entity.SkedaddlerEntity;
import net.mcreator.supermario.entity.RoysWandEntity;
import net.mcreator.supermario.entity.RexEntity;
import net.mcreator.supermario.entity.RetroGoombaGrayEntity;
import net.mcreator.supermario.entity.RetroGoombaBrownEntity;
import net.mcreator.supermario.entity.RetroGoombaBlueEntity;
import net.mcreator.supermario.entity.RedShyGuyEntity;
import net.mcreator.supermario.entity.RedPowBlockEntity;
import net.mcreator.supermario.entity.PowBlockEntity;
import net.mcreator.supermario.entity.ParaKoopaRedEntity;
import net.mcreator.supermario.entity.ParaKoopaGreenEntity;
import net.mcreator.supermario.entity.ParaGoombaEntity;
import net.mcreator.supermario.entity.NinjiEntity;
import net.mcreator.supermario.entity.MortonsWandEntity;
import net.mcreator.supermario.entity.MicroGoombaEntity;
import net.mcreator.supermario.entity.MechaKoopaRangedItemEntity;
import net.mcreator.supermario.entity.MechaKoopaEntity;
import net.mcreator.supermario.entity.MagikoopaWandEntity;
import net.mcreator.supermario.entity.MagikoopaEntity;
import net.mcreator.supermario.entity.LudwigsWandEntity;
import net.mcreator.supermario.entity.LightBlueShyGuyEntity;
import net.mcreator.supermario.entity.LemmysWandEntity;
import net.mcreator.supermario.entity.LarrysWandEntity;
import net.mcreator.supermario.entity.LanternGhostEntity;
import net.mcreator.supermario.entity.LakituEntity;
import net.mcreator.supermario.entity.KoopatrolEntity;
import net.mcreator.supermario.entity.KoopaYellowEntity;
import net.mcreator.supermario.entity.KoopaShellGreenEntity;
import net.mcreator.supermario.entity.KoopaRedEntity;
import net.mcreator.supermario.entity.KoopaGreenEntity;
import net.mcreator.supermario.entity.KoopaBlueEntity;
import net.mcreator.supermario.entity.KamekEntity;
import net.mcreator.supermario.entity.IggysWandEntity;
import net.mcreator.supermario.entity.IceBroEntityProjectile;
import net.mcreator.supermario.entity.IceBroEntity;
import net.mcreator.supermario.entity.IceBrickItemEntity;
import net.mcreator.supermario.entity.HyperGoombaEntity;
import net.mcreator.supermario.entity.HurlHammerEntity;
import net.mcreator.supermario.entity.HuckitCrabEntity;
import net.mcreator.supermario.entity.HuckitClawEntity;
import net.mcreator.supermario.entity.HammerBroEntity;
import net.mcreator.supermario.entity.GreenShyGuyEntity;
import net.mcreator.supermario.entity.GoombaEntity;
import net.mcreator.supermario.entity.GoldGoombaEntity;
import net.mcreator.supermario.entity.GoldBallEntity;
import net.mcreator.supermario.entity.GloombaEntity;
import net.mcreator.supermario.entity.GaloombaEntity;
import net.mcreator.supermario.entity.FuzzyEntity;
import net.mcreator.supermario.entity.FireballEntity;
import net.mcreator.supermario.entity.FireBroEntityProjectile;
import net.mcreator.supermario.entity.FireBroEntity;
import net.mcreator.supermario.entity.EliteXNautEntity;
import net.mcreator.supermario.entity.EerieEntity;
import net.mcreator.supermario.entity.EepCheepEntity;
import net.mcreator.supermario.entity.DuplighostEntity;
import net.mcreator.supermario.entity.DryBonesEntity;
import net.mcreator.supermario.entity.DryBonesDeadEntity;
import net.mcreator.supermario.entity.DeepCheepEntity;
import net.mcreator.supermario.entity.CooliganEntity;
import net.mcreator.supermario.entity.ClubbaSleepingEntity;
import net.mcreator.supermario.entity.ClubbaEntity;
import net.mcreator.supermario.entity.CheepCheepEntity;
import net.mcreator.supermario.entity.BulletBillEntity;
import net.mcreator.supermario.entity.BoomerangBroEntityProjectile;
import net.mcreator.supermario.entity.BoomerangBroEntity;
import net.mcreator.supermario.entity.BooEntity;
import net.mcreator.supermario.entity.BoneGoombaEntity;
import net.mcreator.supermario.entity.BobOmbLitEntity;
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
	public static final RegistryObject<EntityType<GoombaEntity>> GOOMBA = register("goomba",
			EntityType.Builder.<GoombaEntity>of(GoombaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoombaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KoopaGreenEntity>> KOOPA_GREEN = register("koopa_green",
			EntityType.Builder.<KoopaGreenEntity>of(KoopaGreenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopaGreenEntity::new)

					.sized(0.6f, 1.8f));
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
	public static final RegistryObject<EntityType<XNautPHDEntity>> X_NAUT_PHD = register("x_naut_phd",
			EntityType.Builder.<XNautPHDEntity>of(XNautPHDEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(XNautPHDEntity::new)

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
	public static final RegistryObject<EntityType<XNautEntity>> X_NAUT = register("x_naut",
			EntityType.Builder.<XNautEntity>of(XNautEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(XNautEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EliteXNautEntity>> ELITE_X_NAUT = register("elite_x_naut",
			EntityType.Builder.<EliteXNautEntity>of(EliteXNautEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EliteXNautEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YoshiEntity>> YOSHI = register("yoshi",
			EntityType.Builder.<YoshiEntity>of(YoshiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YoshiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MicroGoombaEntity>> MICRO_GOOMBA = register("micro_goomba",
			EntityType.Builder.<MicroGoombaEntity>of(MicroGoombaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MicroGoombaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MagikoopaEntity>> MAGIKOOPA = register("magikoopa",
			EntityType.Builder.<MagikoopaEntity>of(MagikoopaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MagikoopaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KamekEntity>> KAMEK = register("kamek",
			EntityType.Builder.<KamekEntity>of(KamekEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KamekEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DryBonesEntity>> DRY_BONES = register("dry_bones",
			EntityType.Builder.<DryBonesEntity>of(DryBonesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DryBonesEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ParaKoopaGreenEntity>> PARA_KOOPA_GREEN = register("para_koopa_green",
			EntityType.Builder.<ParaKoopaGreenEntity>of(ParaKoopaGreenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ParaKoopaGreenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ParaKoopaRedEntity>> PARA_KOOPA_RED = register("para_koopa_red",
			EntityType.Builder.<ParaKoopaRedEntity>of(ParaKoopaRedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ParaKoopaRedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KoopatrolEntity>> KOOPATROL = register("koopatrol",
			EntityType.Builder.<KoopatrolEntity>of(KoopatrolEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopatrolEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HammerBroEntity>> HAMMER_BRO = register("hammer_bro",
			EntityType.Builder.<HammerBroEntity>of(HammerBroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HammerBroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FireBroEntity>> FIRE_BRO = register("fire_bro",
			EntityType.Builder.<FireBroEntity>of(FireBroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireBroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FireBroEntityProjectile>> FIRE_BRO_PROJECTILE = register("projectile_fire_bro", EntityType.Builder.<FireBroEntityProjectile>of(FireBroEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(FireBroEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IceBroEntity>> ICE_BRO = register("ice_bro",
			EntityType.Builder.<IceBroEntity>of(IceBroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IceBroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IceBroEntityProjectile>> ICE_BRO_PROJECTILE = register("projectile_ice_bro", EntityType.Builder.<IceBroEntityProjectile>of(IceBroEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(IceBroEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BoomerangBroEntity>> BOOMERANG_BRO = register("boomerang_bro",
			EntityType.Builder.<BoomerangBroEntity>of(BoomerangBroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BoomerangBroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BoomerangBroEntityProjectile>> BOOMERANG_BRO_PROJECTILE = register("projectile_boomerang_bro", EntityType.Builder.<BoomerangBroEntityProjectile>of(BoomerangBroEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(BoomerangBroEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LanternGhostEntity>> LANTERN_GHOST = register("lantern_ghost",
			EntityType.Builder.<LanternGhostEntity>of(LanternGhostEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LanternGhostEntity::new)

					.sized(0.6f, 1.0999999999999999f));
	public static final RegistryObject<EntityType<SpinyEntity>> SPINY = register("spiny",
			EntityType.Builder.<SpinyEntity>of(SpinyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpinyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpinyEggEntity>> SPINY_EGG = register("projectile_spiny_egg",
			EntityType.Builder.<SpinyEggEntity>of(SpinyEggEntity::new, MobCategory.MISC).setCustomClientFactory(SpinyEggEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LakituEntity>> LAKITU = register("lakitu",
			EntityType.Builder.<LakituEntity>of(LakituEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LakituEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ClubbaSleepingEntity>> CLUBBA_SLEEPING = register("clubba_sleeping",
			EntityType.Builder.<ClubbaSleepingEntity>of(ClubbaSleepingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ClubbaSleepingEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ClubbaEntity>> CLUBBA = register("clubba",
			EntityType.Builder.<ClubbaEntity>of(ClubbaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ClubbaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WhiteClubbaSleepingEntity>> WHITE_CLUBBA_SLEEPING = register("white_clubba_sleeping",
			EntityType.Builder.<WhiteClubbaSleepingEntity>of(WhiteClubbaSleepingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WhiteClubbaSleepingEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WhiteClubbaEntity>> WHITE_CLUBBA = register("white_clubba",
			EntityType.Builder.<WhiteClubbaEntity>of(WhiteClubbaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WhiteClubbaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RetroGoombaBrownEntity>> RETRO_GOOMBA_BROWN = register("retro_goomba_brown",
			EntityType.Builder.<RetroGoombaBrownEntity>of(RetroGoombaBrownEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RetroGoombaBrownEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RetroGoombaBlueEntity>> RETRO_GOOMBA_BLUE = register("retro_goomba_blue",
			EntityType.Builder.<RetroGoombaBlueEntity>of(RetroGoombaBlueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RetroGoombaBlueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RetroGoombaGrayEntity>> RETRO_GOOMBA_GRAY = register("retro_goomba_gray",
			EntityType.Builder.<RetroGoombaGrayEntity>of(RetroGoombaGrayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RetroGoombaGrayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BoneGoombaEntity>> BONE_GOOMBA = register("bone_goomba",
			EntityType.Builder.<BoneGoombaEntity>of(BoneGoombaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BoneGoombaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GoldGoombaEntity>> GOLD_GOOMBA = register("gold_goomba",
			EntityType.Builder.<GoldGoombaEntity>of(GoldGoombaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoldGoombaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GloombaEntity>> GLOOMBA = register("gloomba",
			EntityType.Builder.<GloombaEntity>of(GloombaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GloombaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HyperGoombaEntity>> HYPER_GOOMBA = register("hyper_goomba",
			EntityType.Builder.<HyperGoombaEntity>of(HyperGoombaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HyperGoombaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SkedaddlerEntity>> SKEDADDLER = register("skedaddler",
			EntityType.Builder.<SkedaddlerEntity>of(SkedaddlerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkedaddlerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WubbaEntity>> WUBBA = register("wubba",
			EntityType.Builder.<WubbaEntity>of(WubbaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WubbaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThwompEntity>> THWOMP = register("thwomp",
			EntityType.Builder.<ThwompEntity>of(ThwompEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThwompEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GaloombaEntity>> GALOOMBA = register("galoomba",
			EntityType.Builder.<GaloombaEntity>of(GaloombaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GaloombaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BobOmbLitEntity>> BOB_OMB_LIT = register("bob_omb_lit",
			EntityType.Builder.<BobOmbLitEntity>of(BobOmbLitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BobOmbLitEntity::new)

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
	public static final RegistryObject<EntityType<StandardKartRedEntity>> STANDARD_KART_RED = register("standard_kart_red",
			EntityType.Builder.<StandardKartRedEntity>of(StandardKartRedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StandardKartRedEntity::new)

					.sized(0.6f, 0.4f));
	public static final RegistryObject<EntityType<StandardKartGreenEntity>> STANDARD_KART_GREEN = register("standard_kart_green",
			EntityType.Builder.<StandardKartGreenEntity>of(StandardKartGreenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StandardKartGreenEntity::new)

					.sized(0.6f, 0.4f));
	public static final RegistryObject<EntityType<StandardKartBlueEntity>> STANDARD_KART_BLUE = register("standard_kart_blue",
			EntityType.Builder.<StandardKartBlueEntity>of(StandardKartBlueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StandardKartBlueEntity::new)

					.sized(0.6f, 0.4f));
	public static final RegistryObject<EntityType<StandardKartYellowEntity>> STANDARD_KART_YELLOW = register("standard_kart_yellow",
			EntityType.Builder.<StandardKartYellowEntity>of(StandardKartYellowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StandardKartYellowEntity::new)

					.sized(0.6f, 0.4f));
	public static final RegistryObject<EntityType<StandardKartPinkEntity>> STANDARD_KART_PINK = register("standard_kart_pink",
			EntityType.Builder.<StandardKartPinkEntity>of(StandardKartPinkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StandardKartPinkEntity::new)

					.sized(0.6f, 0.4f));
	public static final RegistryObject<EntityType<StandardKartPurpleEntity>> STANDARD_KART_PURPLE = register("standard_kart_purple",
			EntityType.Builder.<StandardKartPurpleEntity>of(StandardKartPurpleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StandardKartPurpleEntity::new)

					.sized(0.6f, 0.4f));
	public static final RegistryObject<EntityType<StandardKartBrownEntity>> STANDARD_KART_BROWN = register("standard_kart_brown",
			EntityType.Builder.<StandardKartBrownEntity>of(StandardKartBrownEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StandardKartBrownEntity::new)

					.sized(0.6f, 0.4f));
	public static final RegistryObject<EntityType<StandardKartWhiteEntity>> STANDARD_KART_WHITE = register("standard_kart_white",
			EntityType.Builder.<StandardKartWhiteEntity>of(StandardKartWhiteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StandardKartWhiteEntity::new)

					.sized(0.6f, 0.4f));
	public static final RegistryObject<EntityType<FireballEntity>> FIREBALL = register("fireball",
			EntityType.Builder.<FireballEntity>of(FireballEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireballEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GoldBallEntity>> GOLD_BALL = register("gold_ball",
			EntityType.Builder.<GoldBallEntity>of(GoldBallEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoldBallEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DryBonesDeadEntity>> DRY_BONES_DEAD = register("dry_bones_dead", EntityType.Builder.<DryBonesDeadEntity>of(DryBonesDeadEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DryBonesDeadEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RexEntity>> REX = register("rex",
			EntityType.Builder.<RexEntity>of(RexEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RexEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NinjiEntity>> NINJI = register("ninji",
			EntityType.Builder.<NinjiEntity>of(NinjiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NinjiEntity::new)

					.sized(0.6f, 0.8f));

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
			GoombaEntity.init();
			KoopaGreenEntity.init();
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
			XNautPHDEntity.init();
			ToadEntity.init();
			ToadRedEntity.init();
			ToadBlueEntity.init();
			ToadYellowEntity.init();
			ToadGreenEntity.init();
			ToadPurpleEntity.init();
			XNautEntity.init();
			EliteXNautEntity.init();
			YoshiEntity.init();
			MicroGoombaEntity.init();
			MagikoopaEntity.init();
			KamekEntity.init();
			DryBonesEntity.init();
			ParaKoopaGreenEntity.init();
			ParaKoopaRedEntity.init();
			KoopatrolEntity.init();
			HammerBroEntity.init();
			FireBroEntity.init();
			IceBroEntity.init();
			BoomerangBroEntity.init();
			LanternGhostEntity.init();
			SpinyEntity.init();
			LakituEntity.init();
			ClubbaSleepingEntity.init();
			ClubbaEntity.init();
			WhiteClubbaSleepingEntity.init();
			WhiteClubbaEntity.init();
			RetroGoombaBrownEntity.init();
			RetroGoombaBlueEntity.init();
			RetroGoombaGrayEntity.init();
			BoneGoombaEntity.init();
			GoldGoombaEntity.init();
			GloombaEntity.init();
			HyperGoombaEntity.init();
			SkedaddlerEntity.init();
			WubbaEntity.init();
			ThwompEntity.init();
			GaloombaEntity.init();
			BobOmbLitEntity.init();
			StandardKartRedEntity.init();
			StandardKartGreenEntity.init();
			StandardKartBlueEntity.init();
			StandardKartYellowEntity.init();
			StandardKartPinkEntity.init();
			StandardKartPurpleEntity.init();
			StandardKartBrownEntity.init();
			StandardKartWhiteEntity.init();
			FireballEntity.init();
			GoldBallEntity.init();
			DryBonesDeadEntity.init();
			RexEntity.init();
			NinjiEntity.init();
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
		event.put(GOOMBA.get(), GoombaEntity.createAttributes().build());
		event.put(KOOPA_GREEN.get(), KoopaGreenEntity.createAttributes().build());
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
		event.put(X_NAUT_PHD.get(), XNautPHDEntity.createAttributes().build());
		event.put(TOAD.get(), ToadEntity.createAttributes().build());
		event.put(TOAD_RED.get(), ToadRedEntity.createAttributes().build());
		event.put(TOAD_BLUE.get(), ToadBlueEntity.createAttributes().build());
		event.put(TOAD_YELLOW.get(), ToadYellowEntity.createAttributes().build());
		event.put(TOAD_GREEN.get(), ToadGreenEntity.createAttributes().build());
		event.put(TOAD_PURPLE.get(), ToadPurpleEntity.createAttributes().build());
		event.put(X_NAUT.get(), XNautEntity.createAttributes().build());
		event.put(ELITE_X_NAUT.get(), EliteXNautEntity.createAttributes().build());
		event.put(YOSHI.get(), YoshiEntity.createAttributes().build());
		event.put(MICRO_GOOMBA.get(), MicroGoombaEntity.createAttributes().build());
		event.put(MAGIKOOPA.get(), MagikoopaEntity.createAttributes().build());
		event.put(KAMEK.get(), KamekEntity.createAttributes().build());
		event.put(DRY_BONES.get(), DryBonesEntity.createAttributes().build());
		event.put(PARA_KOOPA_GREEN.get(), ParaKoopaGreenEntity.createAttributes().build());
		event.put(PARA_KOOPA_RED.get(), ParaKoopaRedEntity.createAttributes().build());
		event.put(KOOPATROL.get(), KoopatrolEntity.createAttributes().build());
		event.put(HAMMER_BRO.get(), HammerBroEntity.createAttributes().build());
		event.put(FIRE_BRO.get(), FireBroEntity.createAttributes().build());
		event.put(ICE_BRO.get(), IceBroEntity.createAttributes().build());
		event.put(BOOMERANG_BRO.get(), BoomerangBroEntity.createAttributes().build());
		event.put(LANTERN_GHOST.get(), LanternGhostEntity.createAttributes().build());
		event.put(SPINY.get(), SpinyEntity.createAttributes().build());
		event.put(LAKITU.get(), LakituEntity.createAttributes().build());
		event.put(CLUBBA_SLEEPING.get(), ClubbaSleepingEntity.createAttributes().build());
		event.put(CLUBBA.get(), ClubbaEntity.createAttributes().build());
		event.put(WHITE_CLUBBA_SLEEPING.get(), WhiteClubbaSleepingEntity.createAttributes().build());
		event.put(WHITE_CLUBBA.get(), WhiteClubbaEntity.createAttributes().build());
		event.put(RETRO_GOOMBA_BROWN.get(), RetroGoombaBrownEntity.createAttributes().build());
		event.put(RETRO_GOOMBA_BLUE.get(), RetroGoombaBlueEntity.createAttributes().build());
		event.put(RETRO_GOOMBA_GRAY.get(), RetroGoombaGrayEntity.createAttributes().build());
		event.put(BONE_GOOMBA.get(), BoneGoombaEntity.createAttributes().build());
		event.put(GOLD_GOOMBA.get(), GoldGoombaEntity.createAttributes().build());
		event.put(GLOOMBA.get(), GloombaEntity.createAttributes().build());
		event.put(HYPER_GOOMBA.get(), HyperGoombaEntity.createAttributes().build());
		event.put(SKEDADDLER.get(), SkedaddlerEntity.createAttributes().build());
		event.put(WUBBA.get(), WubbaEntity.createAttributes().build());
		event.put(THWOMP.get(), ThwompEntity.createAttributes().build());
		event.put(GALOOMBA.get(), GaloombaEntity.createAttributes().build());
		event.put(BOB_OMB_LIT.get(), BobOmbLitEntity.createAttributes().build());
		event.put(STANDARD_KART_RED.get(), StandardKartRedEntity.createAttributes().build());
		event.put(STANDARD_KART_GREEN.get(), StandardKartGreenEntity.createAttributes().build());
		event.put(STANDARD_KART_BLUE.get(), StandardKartBlueEntity.createAttributes().build());
		event.put(STANDARD_KART_YELLOW.get(), StandardKartYellowEntity.createAttributes().build());
		event.put(STANDARD_KART_PINK.get(), StandardKartPinkEntity.createAttributes().build());
		event.put(STANDARD_KART_PURPLE.get(), StandardKartPurpleEntity.createAttributes().build());
		event.put(STANDARD_KART_BROWN.get(), StandardKartBrownEntity.createAttributes().build());
		event.put(STANDARD_KART_WHITE.get(), StandardKartWhiteEntity.createAttributes().build());
		event.put(FIREBALL.get(), FireballEntity.createAttributes().build());
		event.put(GOLD_BALL.get(), GoldBallEntity.createAttributes().build());
		event.put(DRY_BONES_DEAD.get(), DryBonesDeadEntity.createAttributes().build());
		event.put(REX.get(), RexEntity.createAttributes().build());
		event.put(NINJI.get(), NinjiEntity.createAttributes().build());
	}
}
