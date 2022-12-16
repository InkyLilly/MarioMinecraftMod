
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
import net.mcreator.supermario.entity.StretchBooEntity;
import net.mcreator.supermario.entity.SledgeHammerEntity;
import net.mcreator.supermario.entity.RedPowBlockEntity;
import net.mcreator.supermario.entity.PowBlockEntity;
import net.mcreator.supermario.entity.ParaGoombaEntity;
import net.mcreator.supermario.entity.IceBrickItemEntity;
import net.mcreator.supermario.entity.HurlHammerEntity;
import net.mcreator.supermario.entity.HuckitCrabEntity;
import net.mcreator.supermario.entity.HuckitClawEntity;
import net.mcreator.supermario.entity.GoombaEntity;
import net.mcreator.supermario.entity.FuzzyEntity;
import net.mcreator.supermario.entity.CooliganEntity;
import net.mcreator.supermario.entity.BulletBillEntity;
import net.mcreator.supermario.entity.BooEntity;
import net.mcreator.supermario.entity.BobOmbEntity;
import net.mcreator.supermario.SuperMarioMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SuperMarioModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, SuperMarioMod.MODID);
	public static final RegistryObject<EntityType<GoombaEntity>> GOOMBA = register("goomba",
			EntityType.Builder.<GoombaEntity>of(GoombaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GoombaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ParaGoombaEntity>> PARA_GOOMBA = register("para_goomba",
			EntityType.Builder.<ParaGoombaEntity>of(ParaGoombaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ParaGoombaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BobOmbEntity>> BOB_OMB = register("bob_omb",
			EntityType.Builder.<BobOmbEntity>of(BobOmbEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BobOmbEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BooEntity>> BOO = register("boo",
			EntityType.Builder.<BooEntity>of(BooEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BooEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StretchBooEntity>> STRETCH_BOO = register("stretch_boo",
			EntityType.Builder.<StretchBooEntity>of(StretchBooEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StretchBooEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CooliganEntity>> COOLIGAN = register("cooligan",
			EntityType.Builder.<CooliganEntity>of(CooliganEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(CooliganEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HuckitCrabEntity>> HUCKIT_CRAB = register("huckit_crab",
			EntityType.Builder.<HuckitCrabEntity>of(HuckitCrabEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HuckitCrabEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HuckitClawEntity>> HUCKIT_CLAW = register("projectile_huckit_claw",
			EntityType.Builder.<HuckitClawEntity>of(HuckitClawEntity::new, MobCategory.MISC).setCustomClientFactory(HuckitClawEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FuzzyEntity>> FUZZY = register("fuzzy",
			EntityType.Builder.<FuzzyEntity>of(FuzzyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(FuzzyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BulletBillEntity>> BULLET_BILL = register("bullet_bill",
			EntityType.Builder.<BulletBillEntity>of(BulletBillEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BulletBillEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SledgeHammerEntity>> SLEDGE_HAMMER = register("projectile_sledge_hammer",
			EntityType.Builder.<SledgeHammerEntity>of(SledgeHammerEntity::new, MobCategory.MISC).setCustomClientFactory(SledgeHammerEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HurlHammerEntity>> HURL_HAMMER = register("projectile_hurl_hammer",
			EntityType.Builder.<HurlHammerEntity>of(HurlHammerEntity::new, MobCategory.MISC).setCustomClientFactory(HurlHammerEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PowBlockEntity>> POW_BLOCK = register("projectile_pow_block",
			EntityType.Builder.<PowBlockEntity>of(PowBlockEntity::new, MobCategory.MISC).setCustomClientFactory(PowBlockEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RedPowBlockEntity>> RED_POW_BLOCK = register("projectile_red_pow_block",
			EntityType.Builder.<RedPowBlockEntity>of(RedPowBlockEntity::new, MobCategory.MISC).setCustomClientFactory(RedPowBlockEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IceBrickItemEntity>> ICE_BRICK_ITEM = register("projectile_ice_brick_item",
			EntityType.Builder.<IceBrickItemEntity>of(IceBrickItemEntity::new, MobCategory.MISC).setCustomClientFactory(IceBrickItemEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggGreenEntity>> YOSHI_EGG_GREEN = register("projectile_yoshi_egg_green",
			EntityType.Builder.<YoshiEggGreenEntity>of(YoshiEggGreenEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggGreenEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggRedEntity>> YOSHI_EGG_RED = register("projectile_yoshi_egg_red",
			EntityType.Builder.<YoshiEggRedEntity>of(YoshiEggRedEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggRedEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggBlueEntity>> YOSHI_EGG_BLUE = register("projectile_yoshi_egg_blue",
			EntityType.Builder.<YoshiEggBlueEntity>of(YoshiEggBlueEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggBlueEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggYellowEntity>> YOSHI_EGG_YELLOW = register("projectile_yoshi_egg_yellow",
			EntityType.Builder.<YoshiEggYellowEntity>of(YoshiEggYellowEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggYellowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggPinkEntity>> YOSHI_EGG_PINK = register("projectile_yoshi_egg_pink",
			EntityType.Builder.<YoshiEggPinkEntity>of(YoshiEggPinkEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggPinkEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggLightBlueEntity>> YOSHI_EGG_LIGHT_BLUE = register("projectile_yoshi_egg_light_blue",
			EntityType.Builder.<YoshiEggLightBlueEntity>of(YoshiEggLightBlueEntity::new, MobCategory.MISC)
					.setCustomClientFactory(YoshiEggLightBlueEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggPurpleEntity>> YOSHI_EGG_PURPLE = register("projectile_yoshi_egg_purple",
			EntityType.Builder.<YoshiEggPurpleEntity>of(YoshiEggPurpleEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggPurpleEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggBlackEntity>> YOSHI_EGG_BLACK = register("projectile_yoshi_egg_black",
			EntityType.Builder.<YoshiEggBlackEntity>of(YoshiEggBlackEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggBlackEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggWhiteEntity>> YOSHI_EGG_WHITE = register("projectile_yoshi_egg_white",
			EntityType.Builder.<YoshiEggWhiteEntity>of(YoshiEggWhiteEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggWhiteEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggOrangeEntity>> YOSHI_EGG_ORANGE = register("projectile_yoshi_egg_orange",
			EntityType.Builder.<YoshiEggOrangeEntity>of(YoshiEggOrangeEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggOrangeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YoshiEggBrownEntity>> YOSHI_EGG_BROWN = register("projectile_yoshi_egg_brown",
			EntityType.Builder.<YoshiEggBrownEntity>of(YoshiEggBrownEntity::new, MobCategory.MISC).setCustomClientFactory(YoshiEggBrownEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GoombaEntity.init();
			ParaGoombaEntity.init();
			BobOmbEntity.init();
			BooEntity.init();
			StretchBooEntity.init();
			CooliganEntity.init();
			HuckitCrabEntity.init();
			FuzzyEntity.init();
			BulletBillEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GOOMBA.get(), GoombaEntity.createAttributes().build());
		event.put(PARA_GOOMBA.get(), ParaGoombaEntity.createAttributes().build());
		event.put(BOB_OMB.get(), BobOmbEntity.createAttributes().build());
		event.put(BOO.get(), BooEntity.createAttributes().build());
		event.put(STRETCH_BOO.get(), StretchBooEntity.createAttributes().build());
		event.put(COOLIGAN.get(), CooliganEntity.createAttributes().build());
		event.put(HUCKIT_CRAB.get(), HuckitCrabEntity.createAttributes().build());
		event.put(FUZZY.get(), FuzzyEntity.createAttributes().build());
		event.put(BULLET_BILL.get(), BulletBillEntity.createAttributes().build());
	}
}
