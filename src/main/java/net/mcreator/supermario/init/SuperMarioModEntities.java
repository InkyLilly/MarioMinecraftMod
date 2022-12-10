
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

import net.mcreator.supermario.entity.StretchBooEntity;
import net.mcreator.supermario.entity.SledgeHammerEntity;
import net.mcreator.supermario.entity.RedPowBlockEntity;
import net.mcreator.supermario.entity.PowBlockEntity;
import net.mcreator.supermario.entity.ParaGoombaEntity;
import net.mcreator.supermario.entity.HuckitCrabEntity;
import net.mcreator.supermario.entity.HuckitClawEntity;
import net.mcreator.supermario.entity.GoombaEntity;
import net.mcreator.supermario.entity.FuzzyEntity;
import net.mcreator.supermario.entity.FireballEntity;
import net.mcreator.supermario.entity.CooliganEntity;
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
	public static final RegistryObject<EntityType<SledgeHammerEntity>> SLEDGE_HAMMER = register("projectile_sledge_hammer",
			EntityType.Builder.<SledgeHammerEntity>of(SledgeHammerEntity::new, MobCategory.MISC).setCustomClientFactory(SledgeHammerEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PowBlockEntity>> POW_BLOCK = register("projectile_pow_block",
			EntityType.Builder.<PowBlockEntity>of(PowBlockEntity::new, MobCategory.MISC).setCustomClientFactory(PowBlockEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RedPowBlockEntity>> RED_POW_BLOCK = register("projectile_red_pow_block",
			EntityType.Builder.<RedPowBlockEntity>of(RedPowBlockEntity::new, MobCategory.MISC).setCustomClientFactory(RedPowBlockEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FireballEntity>> FIREBALL = register("fireball",
			EntityType.Builder.<FireballEntity>of(FireballEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(FireballEntity::new).fireImmune().sized(0.6f, 1.8f));

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
			FireballEntity.init();
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
		event.put(FIREBALL.get(), FireballEntity.createAttributes().build());
	}
}
