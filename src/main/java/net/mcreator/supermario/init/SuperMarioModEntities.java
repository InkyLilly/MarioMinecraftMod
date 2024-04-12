
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

import net.mcreator.supermario.entity.YoshiYellowEntity;
import net.mcreator.supermario.entity.YoshiWhiteEntity;
import net.mcreator.supermario.entity.YoshiRedEntity;
import net.mcreator.supermario.entity.YoshiPurpleEntity;
import net.mcreator.supermario.entity.YoshiPinkEntity;
import net.mcreator.supermario.entity.YoshiOrangeEntity;
import net.mcreator.supermario.entity.YoshiLightBlueEntity;
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
import net.mcreator.supermario.entity.YoshiBrownEntity;
import net.mcreator.supermario.entity.YoshiBlueEntity;
import net.mcreator.supermario.entity.YoshiBlackEntity;
import net.mcreator.supermario.entity.YellowSnifitEntityProjectile;
import net.mcreator.supermario.entity.YellowSnifitEntity;
import net.mcreator.supermario.entity.YellowShyGuyEntity;
import net.mcreator.supermario.entity.XNautPHDEntity;
import net.mcreator.supermario.entity.XNautEntity;
import net.mcreator.supermario.entity.WubbaEntity;
import net.mcreator.supermario.entity.WrenchEntity;
import net.mcreator.supermario.entity.WhiteClubbaSleepingEntity;
import net.mcreator.supermario.entity.WhiteClubbaEntity;
import net.mcreator.supermario.entity.WendysWandEntity;
import net.mcreator.supermario.entity.WalleyeEntity;
import net.mcreator.supermario.entity.ToadsworthEntity;
import net.mcreator.supermario.entity.ToadetteEntity;
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
import net.mcreator.supermario.entity.SnifitEntityProjectile;
import net.mcreator.supermario.entity.SnifitEntity;
import net.mcreator.supermario.entity.SnailicornEntity;
import net.mcreator.supermario.entity.SledgeHammerEntity;
import net.mcreator.supermario.entity.SkedaddlerEntity;
import net.mcreator.supermario.entity.RoysWandEntity;
import net.mcreator.supermario.entity.RockyWrenchEntity;
import net.mcreator.supermario.entity.RexEntity;
import net.mcreator.supermario.entity.RetroGoombaGrayEntity;
import net.mcreator.supermario.entity.RetroGoombaBrownEntity;
import net.mcreator.supermario.entity.RetroGoombaBlueEntity;
import net.mcreator.supermario.entity.RedShyGuyEntity;
import net.mcreator.supermario.entity.RedPowBlockEntity;
import net.mcreator.supermario.entity.RedLumaEntity;
import net.mcreator.supermario.entity.ProngoEntity;
import net.mcreator.supermario.entity.PowBlockEntity;
import net.mcreator.supermario.entity.PolariEntity;
import net.mcreator.supermario.entity.PinkLumaEntity;
import net.mcreator.supermario.entity.PenguinEntity;
import net.mcreator.supermario.entity.ParaKoopaRedEntity;
import net.mcreator.supermario.entity.ParaKoopaGreenEntity;
import net.mcreator.supermario.entity.ParaGoombaEntity;
import net.mcreator.supermario.entity.NoshiYellowEntity;
import net.mcreator.supermario.entity.NoshiPinkEntity;
import net.mcreator.supermario.entity.NoshiBlueEntity;
import net.mcreator.supermario.entity.NinjiEntity;
import net.mcreator.supermario.entity.MortonsWandEntity;
import net.mcreator.supermario.entity.MontyMoleEntity;
import net.mcreator.supermario.entity.MicroGoombaEntity;
import net.mcreator.supermario.entity.MechaKoopaRangedItemEntity;
import net.mcreator.supermario.entity.MechaKoopaEntity;
import net.mcreator.supermario.entity.MartyEntity;
import net.mcreator.supermario.entity.MagikoopaWandEntity;
import net.mcreator.supermario.entity.MagikoopaEntity;
import net.mcreator.supermario.entity.LumaEntity;
import net.mcreator.supermario.entity.LudwigsWandEntity;
import net.mcreator.supermario.entity.LightBlueShyGuyEntity;
import net.mcreator.supermario.entity.LemmysWandEntity;
import net.mcreator.supermario.entity.LarrysWandEntity;
import net.mcreator.supermario.entity.LanternGhostEntity;
import net.mcreator.supermario.entity.LakituEntity;
import net.mcreator.supermario.entity.KoopatrolEntity;
import net.mcreator.supermario.entity.KoopaYellowEntity;
import net.mcreator.supermario.entity.KoopaShellYellowEntity;
import net.mcreator.supermario.entity.KoopaShellRedEntity;
import net.mcreator.supermario.entity.KoopaShellGreenEntity;
import net.mcreator.supermario.entity.KoopaShellBlueEntity;
import net.mcreator.supermario.entity.KoopaRedEntity;
import net.mcreator.supermario.entity.KoopaKidRedEntity;
import net.mcreator.supermario.entity.KoopaKidGreenEntity;
import net.mcreator.supermario.entity.KoopaKidBlueEntity;
import net.mcreator.supermario.entity.KoopaGreenEntity;
import net.mcreator.supermario.entity.KoopaBlueEntity;
import net.mcreator.supermario.entity.KamekEntity;
import net.mcreator.supermario.entity.ItemBoxEntity;
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
import net.mcreator.supermario.entity.GreenLumaEntity;
import net.mcreator.supermario.entity.GoombaEntity;
import net.mcreator.supermario.entity.GoldGoombaEntity;
import net.mcreator.supermario.entity.GoldBallEntity;
import net.mcreator.supermario.entity.GloombaEntity;
import net.mcreator.supermario.entity.GaloombaEntity;
import net.mcreator.supermario.entity.FuzzyEntity;
import net.mcreator.supermario.entity.FlameChompEntityProjectile;
import net.mcreator.supermario.entity.FlameChompEntity;
import net.mcreator.supermario.entity.FireballEntity;
import net.mcreator.supermario.entity.FireBroEntityProjectile;
import net.mcreator.supermario.entity.FireBroEntity;
import net.mcreator.supermario.entity.EliteXNautEntity;
import net.mcreator.supermario.entity.EerieEntity;
import net.mcreator.supermario.entity.EepCheepEntity;
import net.mcreator.supermario.entity.DuplighostEntity;
import net.mcreator.supermario.entity.DryBonesEntity;
import net.mcreator.supermario.entity.DryBonesDeadEntity;
import net.mcreator.supermario.entity.DragletEntity;
import net.mcreator.supermario.entity.DeepCheepEntity;
import net.mcreator.supermario.entity.CooliganEntity;
import net.mcreator.supermario.entity.ClubbaSleepingEntity;
import net.mcreator.supermario.entity.ClubbaEntity;
import net.mcreator.supermario.entity.ChuckyaEntity;
import net.mcreator.supermario.entity.CheepCheepEntity;
import net.mcreator.supermario.entity.ChainChompEntity;
import net.mcreator.supermario.entity.CaptainToadEntity;
import net.mcreator.supermario.entity.BulletBillEntity;
import net.mcreator.supermario.entity.BowserJrShell2Entity;
import net.mcreator.supermario.entity.BowserJrShell1Entity;
import net.mcreator.supermario.entity.BowserJrPhase3Entity;
import net.mcreator.supermario.entity.BowserJrPhase2Entity;
import net.mcreator.supermario.entity.BowserJrPhase1Entity;
import net.mcreator.supermario.entity.BowserEntityProjectile;
import net.mcreator.supermario.entity.BowserEntity;
import net.mcreator.supermario.entity.BoomerangEntity;
import net.mcreator.supermario.entity.BoomerangBroEntity;
import net.mcreator.supermario.entity.BoomBoomEntity;
import net.mcreator.supermario.entity.BooEntity;
import net.mcreator.supermario.entity.BoneGoombaEntity;
import net.mcreator.supermario.entity.BobOmbLitEntity;
import net.mcreator.supermario.entity.BobOmbEntity;
import net.mcreator.supermario.entity.BlueSnifitEntityProjectile;
import net.mcreator.supermario.entity.BlueSnifitEntity;
import net.mcreator.supermario.entity.BlueShyGuyEntity;
import net.mcreator.supermario.entity.BlueLumaEntity;
import net.mcreator.supermario.entity.BlooperPinkEntity;
import net.mcreator.supermario.entity.BlooperEntity;
import net.mcreator.supermario.entity.AntiGuyEntity;
import net.mcreator.supermario.entity.AntTrooperEntity;
import net.mcreator.supermario.SuperMarioMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SuperMarioModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, SuperMarioMod.MODID);
	public static final RegistryObject<EntityType<BobOmbEntity>> BOB_OMB = register("bob_omb",
			EntityType.Builder.<BobOmbEntity>of(BobOmbEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BobOmbEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GoombaEntity>> GOOMBA = register("goomba",
			EntityType.Builder.<GoombaEntity>of(GoombaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoombaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BooEntity>> BOO = register("boo",
			EntityType.Builder.<BooEntity>of(BooEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BooEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ParaGoombaEntity>> PARA_GOOMBA = register("para_goomba",
			EntityType.Builder.<ParaGoombaEntity>of(ParaGoombaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ParaGoombaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StretchBooEntity>> STRETCH_BOO = register("stretch_boo",
			EntityType.Builder.<StretchBooEntity>of(StretchBooEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StretchBooEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CooliganEntity>> COOLIGAN = register("cooligan",
			EntityType.Builder.<CooliganEntity>of(CooliganEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CooliganEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HuckitClawEntity>> HUCKIT_CLAW = register("projectile_huckit_claw",
			EntityType.Builder.<HuckitClawEntity>of(HuckitClawEntity::new, MobCategory.MISC).setCustomClientFactory(HuckitClawEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HuckitCrabEntity>> HUCKIT_CRAB = register("huckit_crab",
			EntityType.Builder.<HuckitCrabEntity>of(HuckitCrabEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HuckitCrabEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MechaKoopaRangedItemEntity>> MECHA_KOOPA_RANGED_ITEM = register("projectile_mecha_koopa_ranged_item", EntityType.Builder
			.<MechaKoopaRangedItemEntity>of(MechaKoopaRangedItemEntity::new, MobCategory.MISC).setCustomClientFactory(MechaKoopaRangedItemEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EerieEntity>> EERIE = register("eerie",
			EntityType.Builder.<EerieEntity>of(EerieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EerieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FuzzyEntity>> FUZZY = register("fuzzy",
			EntityType.Builder.<FuzzyEntity>of(FuzzyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FuzzyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BulletBillEntity>> BULLET_BILL = register("bullet_bill",
			EntityType.Builder.<BulletBillEntity>of(BulletBillEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BulletBillEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MechaKoopaEntity>> MECHA_KOOPA = register("mecha_koopa", EntityType.Builder.<MechaKoopaEntity>of(MechaKoopaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(MechaKoopaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KoopaGreenEntity>> KOOPA_GREEN = register("koopa_green",
			EntityType.Builder.<KoopaGreenEntity>of(KoopaGreenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopaGreenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KoopaRedEntity>> KOOPA_RED = register("koopa_red",
			EntityType.Builder.<KoopaRedEntity>of(KoopaRedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopaRedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KoopaYellowEntity>> KOOPA_YELLOW = register("koopa_yellow",
			EntityType.Builder.<KoopaYellowEntity>of(KoopaYellowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopaYellowEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HammerBroEntity>> HAMMER_BRO = register("hammer_bro",
			EntityType.Builder.<HammerBroEntity>of(HammerBroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HammerBroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KoopaBlueEntity>> KOOPA_BLUE = register("koopa_blue",
			EntityType.Builder.<KoopaBlueEntity>of(KoopaBlueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopaBlueEntity::new)

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
	public static final RegistryObject<EntityType<RexEntity>> REX = register("rex",
			EntityType.Builder.<RexEntity>of(RexEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RexEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NinjiEntity>> NINJI = register("ninji",
			EntityType.Builder.<NinjiEntity>of(NinjiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NinjiEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<MartyEntity>> MARTY = register("marty",
			EntityType.Builder.<MartyEntity>of(MartyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MartyEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PenguinEntity>> PENGUIN = register("penguin",
			EntityType.Builder.<PenguinEntity>of(PenguinEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PenguinEntity::new)

					.sized(0.6f, 1.4f));
	public static final RegistryObject<EntityType<WalleyeEntity>> WALLEYE = register("walleye",
			EntityType.Builder.<WalleyeEntity>of(WalleyeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WalleyeEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<DragletEntity>> DRAGLET = register("draglet",
			EntityType.Builder.<DragletEntity>of(DragletEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DragletEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<AntTrooperEntity>> ANT_TROOPER = register("ant_trooper",
			EntityType.Builder.<AntTrooperEntity>of(AntTrooperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AntTrooperEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<ChuckyaEntity>> CHUCKYA = register("chuckya",
			EntityType.Builder.<ChuckyaEntity>of(ChuckyaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChuckyaEntity::new)

					.sized(0.6f, 1.2000000000000002f));
	public static final RegistryObject<EntityType<KoopaShellRedEntity>> KOOPA_SHELL_RED = register("koopa_shell_red",
			EntityType.Builder.<KoopaShellRedEntity>of(KoopaShellRedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopaShellRedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KoopaShellBlueEntity>> KOOPA_SHELL_BLUE = register("koopa_shell_blue",
			EntityType.Builder.<KoopaShellBlueEntity>of(KoopaShellBlueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopaShellBlueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KoopaShellYellowEntity>> KOOPA_SHELL_YELLOW = register("koopa_shell_yellow",
			EntityType.Builder.<KoopaShellYellowEntity>of(KoopaShellYellowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopaShellYellowEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FlameChompEntity>> FLAME_CHOMP = register("flame_chomp",
			EntityType.Builder.<FlameChompEntity>of(FlameChompEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FlameChompEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<FlameChompEntityProjectile>> FLAME_CHOMP_PROJECTILE = register("projectile_flame_chomp", EntityType.Builder.<FlameChompEntityProjectile>of(FlameChompEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(FlameChompEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ChainChompEntity>> CHAIN_CHOMP = register("chain_chomp", EntityType.Builder.<ChainChompEntity>of(ChainChompEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(ChainChompEntity::new).fireImmune().sized(2.5f, 1f));
	public static final RegistryObject<EntityType<RockyWrenchEntity>> ROCKY_WRENCH = register("rocky_wrench",
			EntityType.Builder.<RockyWrenchEntity>of(RockyWrenchEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RockyWrenchEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<ProngoEntity>> PRONGO = register("prongo",
			EntityType.Builder.<ProngoEntity>of(ProngoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ProngoEntity::new)

					.sized(0.6f, 1.6f));
	public static final RegistryObject<EntityType<SnailicornEntity>> SNAILICORN = register("snailicorn",
			EntityType.Builder.<SnailicornEntity>of(SnailicornEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnailicornEntity::new)

					.sized(0.6f, 1.4f));
	public static final RegistryObject<EntityType<LumaEntity>> LUMA = register("luma",
			EntityType.Builder.<LumaEntity>of(LumaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LumaEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<BlueLumaEntity>> BLUE_LUMA = register("blue_luma",
			EntityType.Builder.<BlueLumaEntity>of(BlueLumaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueLumaEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<GreenLumaEntity>> GREEN_LUMA = register("green_luma",
			EntityType.Builder.<GreenLumaEntity>of(GreenLumaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GreenLumaEntity::new)

					.sized(0.6f, 0.7999999999999999f));
	public static final RegistryObject<EntityType<RedLumaEntity>> RED_LUMA = register("red_luma",
			EntityType.Builder.<RedLumaEntity>of(RedLumaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RedLumaEntity::new)

					.sized(0.6f, 0.7999999999999999f));
	public static final RegistryObject<EntityType<PinkLumaEntity>> PINK_LUMA = register("pink_luma",
			EntityType.Builder.<PinkLumaEntity>of(PinkLumaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PinkLumaEntity::new)

					.sized(0.6f, 0.7999999999999999f));
	public static final RegistryObject<EntityType<PolariEntity>> POLARI = register("polari",
			EntityType.Builder.<PolariEntity>of(PolariEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PolariEntity::new)

					.sized(0.6f, 0.7999999999999999f));
	public static final RegistryObject<EntityType<BowserEntity>> BOWSER = register("bowser",
			EntityType.Builder.<BowserEntity>of(BowserEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BowserEntity::new).fireImmune().sized(3f, 5f));
	public static final RegistryObject<EntityType<BowserEntityProjectile>> BOWSER_PROJECTILE = register("projectile_bowser", EntityType.Builder.<BowserEntityProjectile>of(BowserEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(BowserEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SnifitEntity>> SNIFIT = register("snifit",
			EntityType.Builder.<SnifitEntity>of(SnifitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnifitEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SnifitEntityProjectile>> SNIFIT_PROJECTILE = register("projectile_snifit", EntityType.Builder.<SnifitEntityProjectile>of(SnifitEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(SnifitEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BowserJrPhase1Entity>> BOWSER_JR_PHASE_1 = register("bowser_jr_phase_1", EntityType.Builder.<BowserJrPhase1Entity>of(BowserJrPhase1Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BowserJrPhase1Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BowserJrShell1Entity>> BOWSER_JR_SHELL_1 = register("bowser_jr_shell_1", EntityType.Builder.<BowserJrShell1Entity>of(BowserJrShell1Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BowserJrShell1Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BowserJrPhase2Entity>> BOWSER_JR_PHASE_2 = register("bowser_jr_phase_2", EntityType.Builder.<BowserJrPhase2Entity>of(BowserJrPhase2Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BowserJrPhase2Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BowserJrShell2Entity>> BOWSER_JR_SHELL_2 = register("bowser_jr_shell_2", EntityType.Builder.<BowserJrShell2Entity>of(BowserJrShell2Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BowserJrShell2Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BowserJrPhase3Entity>> BOWSER_JR_PHASE_3 = register("bowser_jr_phase_3", EntityType.Builder.<BowserJrPhase3Entity>of(BowserJrPhase3Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BowserJrPhase3Entity::new).fireImmune().sized(0.6f, 1.8f));
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
	public static final RegistryObject<EntityType<ItemBoxEntity>> ITEM_BOX = register("item_box",
			EntityType.Builder.<ItemBoxEntity>of(ItemBoxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ItemBoxEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WrenchEntity>> WRENCH = register("projectile_wrench",
			EntityType.Builder.<WrenchEntity>of(WrenchEntity::new, MobCategory.MISC).setCustomClientFactory(WrenchEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FireballEntity>> FIREBALL = register("fireball",
			EntityType.Builder.<FireballEntity>of(FireballEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireballEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GoldBallEntity>> GOLD_BALL = register("gold_ball",
			EntityType.Builder.<GoldBallEntity>of(GoldBallEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoldBallEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DryBonesDeadEntity>> DRY_BONES_DEAD = register("dry_bones_dead", EntityType.Builder.<DryBonesDeadEntity>of(DryBonesDeadEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DryBonesDeadEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlueShyGuyEntity>> BLUE_SHY_GUY = register("blue_shy_guy",
			EntityType.Builder.<BlueShyGuyEntity>of(BlueShyGuyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueShyGuyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YellowShyGuyEntity>> YELLOW_SHY_GUY = register("yellow_shy_guy",
			EntityType.Builder.<YellowShyGuyEntity>of(YellowShyGuyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YellowShyGuyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AntiGuyEntity>> ANTI_GUY = register("anti_guy",
			EntityType.Builder.<AntiGuyEntity>of(AntiGuyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AntiGuyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YellowSnifitEntity>> YELLOW_SNIFIT = register("yellow_snifit",
			EntityType.Builder.<YellowSnifitEntity>of(YellowSnifitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YellowSnifitEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YellowSnifitEntityProjectile>> YELLOW_SNIFIT_PROJECTILE = register("projectile_yellow_snifit", EntityType.Builder.<YellowSnifitEntityProjectile>of(YellowSnifitEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(YellowSnifitEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlueSnifitEntity>> BLUE_SNIFIT = register("blue_snifit",
			EntityType.Builder.<BlueSnifitEntity>of(BlueSnifitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueSnifitEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlueSnifitEntityProjectile>> BLUE_SNIFIT_PROJECTILE = register("projectile_blue_snifit", EntityType.Builder.<BlueSnifitEntityProjectile>of(BlueSnifitEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(BlueSnifitEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiRedEntity>> YOSHI_RED = register("yoshi_red",
			EntityType.Builder.<YoshiRedEntity>of(YoshiRedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YoshiRedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YoshiYellowEntity>> YOSHI_YELLOW = register("yoshi_yellow",
			EntityType.Builder.<YoshiYellowEntity>of(YoshiYellowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YoshiYellowEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YoshiBlueEntity>> YOSHI_BLUE = register("yoshi_blue",
			EntityType.Builder.<YoshiBlueEntity>of(YoshiBlueEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YoshiBlueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YoshiBlackEntity>> YOSHI_BLACK = register("yoshi_black",
			EntityType.Builder.<YoshiBlackEntity>of(YoshiBlackEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YoshiBlackEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YoshiPinkEntity>> YOSHI_PINK = register("yoshi_pink",
			EntityType.Builder.<YoshiPinkEntity>of(YoshiPinkEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YoshiPinkEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YoshiLightBlueEntity>> YOSHI_LIGHT_BLUE = register("yoshi_light_blue",
			EntityType.Builder.<YoshiLightBlueEntity>of(YoshiLightBlueEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YoshiLightBlueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YoshiOrangeEntity>> YOSHI_ORANGE = register("yoshi_orange",
			EntityType.Builder.<YoshiOrangeEntity>of(YoshiOrangeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YoshiOrangeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YoshiWhiteEntity>> YOSHI_WHITE = register("yoshi_white",
			EntityType.Builder.<YoshiWhiteEntity>of(YoshiWhiteEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YoshiWhiteEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YoshiPurpleEntity>> YOSHI_PURPLE = register("yoshi_purple",
			EntityType.Builder.<YoshiPurpleEntity>of(YoshiPurpleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YoshiPurpleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YoshiBrownEntity>> YOSHI_BROWN = register("yoshi_brown",
			EntityType.Builder.<YoshiBrownEntity>of(YoshiBrownEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YoshiBrownEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlooperEntity>> BLOOPER = register("blooper",
			EntityType.Builder.<BlooperEntity>of(BlooperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlooperEntity::new)

					.sized(0.6f, 1.2000000000000002f));
	public static final RegistryObject<EntityType<BlooperPinkEntity>> BLOOPER_PINK = register("blooper_pink",
			EntityType.Builder.<BlooperPinkEntity>of(BlooperPinkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlooperPinkEntity::new)

					.sized(0.6f, 1.2000000000000002f));
	public static final RegistryObject<EntityType<MontyMoleEntity>> MONTY_MOLE = register("monty_mole",
			EntityType.Builder.<MontyMoleEntity>of(MontyMoleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MontyMoleEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<ToadetteEntity>> TOADETTE = register("toadette",
			EntityType.Builder.<ToadetteEntity>of(ToadetteEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToadetteEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToadsworthEntity>> TOADSWORTH = register("toadsworth",
			EntityType.Builder.<ToadsworthEntity>of(ToadsworthEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToadsworthEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CaptainToadEntity>> CAPTAIN_TOAD = register("captain_toad",
			EntityType.Builder.<CaptainToadEntity>of(CaptainToadEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CaptainToadEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BoomBoomEntity>> BOOM_BOOM = register("boom_boom",
			EntityType.Builder.<BoomBoomEntity>of(BoomBoomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BoomBoomEntity::new)

					.sized(0.6f, 1.4f));
	public static final RegistryObject<EntityType<KoopaKidGreenEntity>> KOOPA_KID_GREEN = register("koopa_kid_green", EntityType.Builder.<KoopaKidGreenEntity>of(KoopaKidGreenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopaKidGreenEntity::new).fireImmune().sized(0.6f, 1.4f));
	public static final RegistryObject<EntityType<KoopaKidBlueEntity>> KOOPA_KID_BLUE = register("koopa_kid_blue", EntityType.Builder.<KoopaKidBlueEntity>of(KoopaKidBlueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopaKidBlueEntity::new).fireImmune().sized(0.6f, 1.4f));
	public static final RegistryObject<EntityType<KoopaKidRedEntity>> KOOPA_KID_RED = register("koopa_kid_red", EntityType.Builder.<KoopaKidRedEntity>of(KoopaKidRedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoopaKidRedEntity::new).fireImmune().sized(0.6f, 1.4f));
	public static final RegistryObject<EntityType<NoshiBlueEntity>> NOSHI_BLUE = register("noshi_blue",
			EntityType.Builder.<NoshiBlueEntity>of(NoshiBlueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NoshiBlueEntity::new)

					.sized(2f, 5f));
	public static final RegistryObject<EntityType<NoshiYellowEntity>> NOSHI_YELLOW = register("noshi_yellow",
			EntityType.Builder.<NoshiYellowEntity>of(NoshiYellowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NoshiYellowEntity::new)

					.sized(2f, 5f));
	public static final RegistryObject<EntityType<NoshiPinkEntity>> NOSHI_PINK = register("noshi_pink",
			EntityType.Builder.<NoshiPinkEntity>of(NoshiPinkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NoshiPinkEntity::new)

					.sized(2f, 5f));
	public static final RegistryObject<EntityType<BoomerangEntity>> BOOMERANG = register("projectile_boomerang",
			EntityType.Builder.<BoomerangEntity>of(BoomerangEntity::new, MobCategory.MISC).setCustomClientFactory(BoomerangEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BobOmbEntity.init();
			GoombaEntity.init();
			BooEntity.init();
			ParaGoombaEntity.init();
			StretchBooEntity.init();
			CooliganEntity.init();
			HuckitCrabEntity.init();
			EerieEntity.init();
			FuzzyEntity.init();
			BulletBillEntity.init();
			MechaKoopaEntity.init();
			KoopaGreenEntity.init();
			KoopaRedEntity.init();
			KoopaYellowEntity.init();
			HammerBroEntity.init();
			KoopaBlueEntity.init();
			FireBroEntity.init();
			IceBroEntity.init();
			BoomerangBroEntity.init();
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
			RexEntity.init();
			NinjiEntity.init();
			MartyEntity.init();
			PenguinEntity.init();
			WalleyeEntity.init();
			DragletEntity.init();
			AntTrooperEntity.init();
			ChuckyaEntity.init();
			KoopaShellRedEntity.init();
			KoopaShellBlueEntity.init();
			KoopaShellYellowEntity.init();
			FlameChompEntity.init();
			ChainChompEntity.init();
			RockyWrenchEntity.init();
			ProngoEntity.init();
			SnailicornEntity.init();
			LumaEntity.init();
			BlueLumaEntity.init();
			GreenLumaEntity.init();
			RedLumaEntity.init();
			PinkLumaEntity.init();
			PolariEntity.init();
			BowserEntity.init();
			SnifitEntity.init();
			BowserJrPhase1Entity.init();
			BowserJrShell1Entity.init();
			BowserJrPhase2Entity.init();
			BowserJrShell2Entity.init();
			BowserJrPhase3Entity.init();
			StandardKartRedEntity.init();
			StandardKartGreenEntity.init();
			StandardKartBlueEntity.init();
			StandardKartYellowEntity.init();
			StandardKartPinkEntity.init();
			StandardKartPurpleEntity.init();
			StandardKartBrownEntity.init();
			StandardKartWhiteEntity.init();
			ItemBoxEntity.init();
			FireballEntity.init();
			GoldBallEntity.init();
			DryBonesDeadEntity.init();
			BlueShyGuyEntity.init();
			YellowShyGuyEntity.init();
			AntiGuyEntity.init();
			YellowSnifitEntity.init();
			BlueSnifitEntity.init();
			YoshiRedEntity.init();
			YoshiYellowEntity.init();
			YoshiBlueEntity.init();
			YoshiBlackEntity.init();
			YoshiPinkEntity.init();
			YoshiLightBlueEntity.init();
			YoshiOrangeEntity.init();
			YoshiWhiteEntity.init();
			YoshiPurpleEntity.init();
			YoshiBrownEntity.init();
			BlooperEntity.init();
			BlooperPinkEntity.init();
			MontyMoleEntity.init();
			ToadetteEntity.init();
			ToadsworthEntity.init();
			CaptainToadEntity.init();
			BoomBoomEntity.init();
			KoopaKidGreenEntity.init();
			KoopaKidBlueEntity.init();
			KoopaKidRedEntity.init();
			NoshiBlueEntity.init();
			NoshiYellowEntity.init();
			NoshiPinkEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BOB_OMB.get(), BobOmbEntity.createAttributes().build());
		event.put(GOOMBA.get(), GoombaEntity.createAttributes().build());
		event.put(BOO.get(), BooEntity.createAttributes().build());
		event.put(PARA_GOOMBA.get(), ParaGoombaEntity.createAttributes().build());
		event.put(STRETCH_BOO.get(), StretchBooEntity.createAttributes().build());
		event.put(COOLIGAN.get(), CooliganEntity.createAttributes().build());
		event.put(HUCKIT_CRAB.get(), HuckitCrabEntity.createAttributes().build());
		event.put(EERIE.get(), EerieEntity.createAttributes().build());
		event.put(FUZZY.get(), FuzzyEntity.createAttributes().build());
		event.put(BULLET_BILL.get(), BulletBillEntity.createAttributes().build());
		event.put(MECHA_KOOPA.get(), MechaKoopaEntity.createAttributes().build());
		event.put(KOOPA_GREEN.get(), KoopaGreenEntity.createAttributes().build());
		event.put(KOOPA_RED.get(), KoopaRedEntity.createAttributes().build());
		event.put(KOOPA_YELLOW.get(), KoopaYellowEntity.createAttributes().build());
		event.put(HAMMER_BRO.get(), HammerBroEntity.createAttributes().build());
		event.put(KOOPA_BLUE.get(), KoopaBlueEntity.createAttributes().build());
		event.put(FIRE_BRO.get(), FireBroEntity.createAttributes().build());
		event.put(ICE_BRO.get(), IceBroEntity.createAttributes().build());
		event.put(BOOMERANG_BRO.get(), BoomerangBroEntity.createAttributes().build());
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
		event.put(REX.get(), RexEntity.createAttributes().build());
		event.put(NINJI.get(), NinjiEntity.createAttributes().build());
		event.put(MARTY.get(), MartyEntity.createAttributes().build());
		event.put(PENGUIN.get(), PenguinEntity.createAttributes().build());
		event.put(WALLEYE.get(), WalleyeEntity.createAttributes().build());
		event.put(DRAGLET.get(), DragletEntity.createAttributes().build());
		event.put(ANT_TROOPER.get(), AntTrooperEntity.createAttributes().build());
		event.put(CHUCKYA.get(), ChuckyaEntity.createAttributes().build());
		event.put(KOOPA_SHELL_RED.get(), KoopaShellRedEntity.createAttributes().build());
		event.put(KOOPA_SHELL_BLUE.get(), KoopaShellBlueEntity.createAttributes().build());
		event.put(KOOPA_SHELL_YELLOW.get(), KoopaShellYellowEntity.createAttributes().build());
		event.put(FLAME_CHOMP.get(), FlameChompEntity.createAttributes().build());
		event.put(CHAIN_CHOMP.get(), ChainChompEntity.createAttributes().build());
		event.put(ROCKY_WRENCH.get(), RockyWrenchEntity.createAttributes().build());
		event.put(PRONGO.get(), ProngoEntity.createAttributes().build());
		event.put(SNAILICORN.get(), SnailicornEntity.createAttributes().build());
		event.put(LUMA.get(), LumaEntity.createAttributes().build());
		event.put(BLUE_LUMA.get(), BlueLumaEntity.createAttributes().build());
		event.put(GREEN_LUMA.get(), GreenLumaEntity.createAttributes().build());
		event.put(RED_LUMA.get(), RedLumaEntity.createAttributes().build());
		event.put(PINK_LUMA.get(), PinkLumaEntity.createAttributes().build());
		event.put(POLARI.get(), PolariEntity.createAttributes().build());
		event.put(BOWSER.get(), BowserEntity.createAttributes().build());
		event.put(SNIFIT.get(), SnifitEntity.createAttributes().build());
		event.put(BOWSER_JR_PHASE_1.get(), BowserJrPhase1Entity.createAttributes().build());
		event.put(BOWSER_JR_SHELL_1.get(), BowserJrShell1Entity.createAttributes().build());
		event.put(BOWSER_JR_PHASE_2.get(), BowserJrPhase2Entity.createAttributes().build());
		event.put(BOWSER_JR_SHELL_2.get(), BowserJrShell2Entity.createAttributes().build());
		event.put(BOWSER_JR_PHASE_3.get(), BowserJrPhase3Entity.createAttributes().build());
		event.put(STANDARD_KART_RED.get(), StandardKartRedEntity.createAttributes().build());
		event.put(STANDARD_KART_GREEN.get(), StandardKartGreenEntity.createAttributes().build());
		event.put(STANDARD_KART_BLUE.get(), StandardKartBlueEntity.createAttributes().build());
		event.put(STANDARD_KART_YELLOW.get(), StandardKartYellowEntity.createAttributes().build());
		event.put(STANDARD_KART_PINK.get(), StandardKartPinkEntity.createAttributes().build());
		event.put(STANDARD_KART_PURPLE.get(), StandardKartPurpleEntity.createAttributes().build());
		event.put(STANDARD_KART_BROWN.get(), StandardKartBrownEntity.createAttributes().build());
		event.put(STANDARD_KART_WHITE.get(), StandardKartWhiteEntity.createAttributes().build());
		event.put(ITEM_BOX.get(), ItemBoxEntity.createAttributes().build());
		event.put(FIREBALL.get(), FireballEntity.createAttributes().build());
		event.put(GOLD_BALL.get(), GoldBallEntity.createAttributes().build());
		event.put(DRY_BONES_DEAD.get(), DryBonesDeadEntity.createAttributes().build());
		event.put(BLUE_SHY_GUY.get(), BlueShyGuyEntity.createAttributes().build());
		event.put(YELLOW_SHY_GUY.get(), YellowShyGuyEntity.createAttributes().build());
		event.put(ANTI_GUY.get(), AntiGuyEntity.createAttributes().build());
		event.put(YELLOW_SNIFIT.get(), YellowSnifitEntity.createAttributes().build());
		event.put(BLUE_SNIFIT.get(), BlueSnifitEntity.createAttributes().build());
		event.put(YOSHI_RED.get(), YoshiRedEntity.createAttributes().build());
		event.put(YOSHI_YELLOW.get(), YoshiYellowEntity.createAttributes().build());
		event.put(YOSHI_BLUE.get(), YoshiBlueEntity.createAttributes().build());
		event.put(YOSHI_BLACK.get(), YoshiBlackEntity.createAttributes().build());
		event.put(YOSHI_PINK.get(), YoshiPinkEntity.createAttributes().build());
		event.put(YOSHI_LIGHT_BLUE.get(), YoshiLightBlueEntity.createAttributes().build());
		event.put(YOSHI_ORANGE.get(), YoshiOrangeEntity.createAttributes().build());
		event.put(YOSHI_WHITE.get(), YoshiWhiteEntity.createAttributes().build());
		event.put(YOSHI_PURPLE.get(), YoshiPurpleEntity.createAttributes().build());
		event.put(YOSHI_BROWN.get(), YoshiBrownEntity.createAttributes().build());
		event.put(BLOOPER.get(), BlooperEntity.createAttributes().build());
		event.put(BLOOPER_PINK.get(), BlooperPinkEntity.createAttributes().build());
		event.put(MONTY_MOLE.get(), MontyMoleEntity.createAttributes().build());
		event.put(TOADETTE.get(), ToadetteEntity.createAttributes().build());
		event.put(TOADSWORTH.get(), ToadsworthEntity.createAttributes().build());
		event.put(CAPTAIN_TOAD.get(), CaptainToadEntity.createAttributes().build());
		event.put(BOOM_BOOM.get(), BoomBoomEntity.createAttributes().build());
		event.put(KOOPA_KID_GREEN.get(), KoopaKidGreenEntity.createAttributes().build());
		event.put(KOOPA_KID_BLUE.get(), KoopaKidBlueEntity.createAttributes().build());
		event.put(KOOPA_KID_RED.get(), KoopaKidRedEntity.createAttributes().build());
		event.put(NOSHI_BLUE.get(), NoshiBlueEntity.createAttributes().build());
		event.put(NOSHI_YELLOW.get(), NoshiYellowEntity.createAttributes().build());
		event.put(NOSHI_PINK.get(), NoshiPinkEntity.createAttributes().build());
	}
}
