
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.supermario.block.WoodenCrateBlock;
import net.mcreator.supermario.block.WoodPostBlock;
import net.mcreator.supermario.block.WhompsFortressPaintingBlock;
import net.mcreator.supermario.block.WetDryWorldPaintingBlock;
import net.mcreator.supermario.block.WarpPipeBlock;
import net.mcreator.supermario.block.VolcanoRockWallBlock;
import net.mcreator.supermario.block.VolcanoRockStairsBlock;
import net.mcreator.supermario.block.VolcanoRockSlabBlock;
import net.mcreator.supermario.block.VolcanoRockBlock;
import net.mcreator.supermario.block.TriangleBlockBlock;
import net.mcreator.supermario.block.TowerBlockWhiteBlock;
import net.mcreator.supermario.block.TowerBlockRedBlock;
import net.mcreator.supermario.block.TowerBlockOrangeBlock;
import net.mcreator.supermario.block.TowerBlockOliveBlock;
import net.mcreator.supermario.block.TowerBlockLimeBlock;
import net.mcreator.supermario.block.TowerBlockLightBlueBlock;
import net.mcreator.supermario.block.TowerBlockGreenBlock;
import net.mcreator.supermario.block.TowerBlockGrayBlock;
import net.mcreator.supermario.block.TowerBlockCyanBlock;
import net.mcreator.supermario.block.TowerBlockBrownBlock;
import net.mcreator.supermario.block.TowerBlockBlueBlock;
import net.mcreator.supermario.block.TowerBlockBlackBlock;
import net.mcreator.supermario.block.TinyHugeIslandPaintingBlock;
import net.mcreator.supermario.block.TallTallMountainPaintingBlock;
import net.mcreator.supermario.block.SwitchPalaceBlockBlock;
import net.mcreator.supermario.block.SuperLeafTreeTailLogBlock;
import net.mcreator.supermario.block.SuperLeafTreeStripeLogBlock;
import net.mcreator.supermario.block.SuperLeafTreeLogBlock;
import net.mcreator.supermario.block.StoneCastleBricksBlock;
import net.mcreator.supermario.block.StarCoinBlock;
import net.mcreator.supermario.block.SparklingWatersStoneStairsBlock;
import net.mcreator.supermario.block.SparklingWatersStoneSlabBlock;
import net.mcreator.supermario.block.SparklingWatersStoneBlock;
import net.mcreator.supermario.block.SparklingWatersRoadStairsBlock;
import net.mcreator.supermario.block.SparklingWatersRoadSlabBlock;
import net.mcreator.supermario.block.SparklingWatersRoadBlock;
import net.mcreator.supermario.block.SparklingWatersBeachStoneStairsBlock;
import net.mcreator.supermario.block.SparklingWatersBeachStoneSlabBlock;
import net.mcreator.supermario.block.SparklingWatersBeachStoneBlock;
import net.mcreator.supermario.block.SparklingWatersBeachGrassStairsBlock;
import net.mcreator.supermario.block.SparklingWatersBeachGrassSlabBlock;
import net.mcreator.supermario.block.SparklingWatersBeachGrassBlock;
import net.mcreator.supermario.block.SodaJungleGrassStairsBlock;
import net.mcreator.supermario.block.SodaJungleGrassSlabBlock;
import net.mcreator.supermario.block.SodaJungleGrassBlock;
import net.mcreator.supermario.block.SodaJungleGhostGrassStairsBlock;
import net.mcreator.supermario.block.SodaJungleGhostGrassSlabBlock;
import net.mcreator.supermario.block.SodaJungleGhostGrassBlock;
import net.mcreator.supermario.block.SodaJungleGhostDirtStairsBlock;
import net.mcreator.supermario.block.SodaJungleGhostDirtSlabBlock;
import net.mcreator.supermario.block.SodaJungleGhostDirtBlock;
import net.mcreator.supermario.block.SodaJungleDirtStairsBlock;
import net.mcreator.supermario.block.SodaJungleDirtSlabBlock;
import net.mcreator.supermario.block.SodaJungleDirtBlock;
import net.mcreator.supermario.block.RockCandyMinesStoneWhiteBlock;
import net.mcreator.supermario.block.RockCandyMinesStoneRedBlock;
import net.mcreator.supermario.block.RockCandyMinesStoneGreenBlock;
import net.mcreator.supermario.block.RockCandyMinesStoneBlueBlock;
import net.mcreator.supermario.block.RedPowBlockBlockBlock;
import net.mcreator.supermario.block.RedCarpetStairsBlock;
import net.mcreator.supermario.block.RedCarpetSlabBlock;
import net.mcreator.supermario.block.RainyCloudBlockBlock;
import net.mcreator.supermario.block.RainbowBlockBlock;
import net.mcreator.supermario.block.RainbowBlock7Block;
import net.mcreator.supermario.block.RainbowBlock6Block;
import net.mcreator.supermario.block.RainbowBlock5Block;
import net.mcreator.supermario.block.RainbowBlock4Block;
import net.mcreator.supermario.block.RainbowBlock3Block;
import net.mcreator.supermario.block.RainbowBlock2Block;
import net.mcreator.supermario.block.QuestionMarkBlockBlock;
import net.mcreator.supermario.block.PowBlockBlockBlock;
import net.mcreator.supermario.block.PoisonWaterBlock;
import net.mcreator.supermario.block.PipeBlock;
import net.mcreator.supermario.block.PeachsCastleThreeStarDoorBlock;
import net.mcreator.supermario.block.PeachsCastleStarDoorBlock;
import net.mcreator.supermario.block.PeachsCastlePlankDoorBlock;
import net.mcreator.supermario.block.PeachsCastleOneStarDoorBlock;
import net.mcreator.supermario.block.PeachsCastleIronDoorBlock;
import net.mcreator.supermario.block.PeachsCastleDoorBlock;
import net.mcreator.supermario.block.PeachesCastleLockedDoorBlock;
import net.mcreator.supermario.block.PeachPaintingBlock;
import net.mcreator.supermario.block.PSwitchBlock;
import net.mcreator.supermario.block.PBlockOutlineBlock;
import net.mcreator.supermario.block.PBlockBlock;
import net.mcreator.supermario.block.OnBlockBlock;
import net.mcreator.supermario.block.OffBlockBlock;
import net.mcreator.supermario.block.NoteBlockBlock;
import net.mcreator.supermario.block.MushstoneStairsBlock;
import net.mcreator.supermario.block.MushstoneSlabBlock;
import net.mcreator.supermario.block.MushstoneHardBlockBlock;
import net.mcreator.supermario.block.MushstoneBlueStairsBlock;
import net.mcreator.supermario.block.MushstoneBlueSlabBlock;
import net.mcreator.supermario.block.MushstoneBlueBlock;
import net.mcreator.supermario.block.MushstoneBlock;
import net.mcreator.supermario.block.MushroomWorldVineWhiteBlock;
import net.mcreator.supermario.block.MushroomWorldVineOrangeBlock;
import net.mcreator.supermario.block.MushroomWorldVineGreenBlock;
import net.mcreator.supermario.block.MushroomWorldVineBlueBlock;
import net.mcreator.supermario.block.MushroomWorldUnderwaterStoneBlock;
import net.mcreator.supermario.block.MushroomWorldUnderwaterRingWhiteBlock;
import net.mcreator.supermario.block.MushroomWorldUnderwaterRingPinkBlock;
import net.mcreator.supermario.block.MushroomWorldUnderwaterBlockBlock;
import net.mcreator.supermario.block.MushroomWorldStoneStairsBlock;
import net.mcreator.supermario.block.MushroomWorldStoneSlabBlock;
import net.mcreator.supermario.block.MushroomWorldStoneBlockBlock;
import net.mcreator.supermario.block.MushroomWorldSnowyStoneStairsBlock;
import net.mcreator.supermario.block.MushroomWorldSnowyStoneSlabBlock;
import net.mcreator.supermario.block.MushroomWorldSnowyStoneBlockBlock;
import net.mcreator.supermario.block.MushroomWorldSnowyRoadBlock;
import net.mcreator.supermario.block.MushroomWorldSandStairsBlock;
import net.mcreator.supermario.block.MushroomWorldSandSlabBlock;
import net.mcreator.supermario.block.MushroomWorldSandBlock;
import net.mcreator.supermario.block.MushroomWorldRoadStairsBlock;
import net.mcreator.supermario.block.MushroomWorldRoadSlabBlock;
import net.mcreator.supermario.block.MushroomWorldRoadBlock;
import net.mcreator.supermario.block.MushroomWorldRedStoneStairsBlock;
import net.mcreator.supermario.block.MushroomWorldRedStoneSlabBlock;
import net.mcreator.supermario.block.MushroomWorldRedStoneBlockBlock;
import net.mcreator.supermario.block.MushroomWorldPillarPurpleBlock;
import net.mcreator.supermario.block.MushroomWorldPillarCornerPurpleBlock;
import net.mcreator.supermario.block.MushroomWorldPillarCornerBlueBlock;
import net.mcreator.supermario.block.MushroomWorldPillarBlueBlock;
import net.mcreator.supermario.block.MushroomWorldHardBlockBlock;
import net.mcreator.supermario.block.MushroomWorldGroundStairsBlock;
import net.mcreator.supermario.block.MushroomWorldGroundSlabBlock;
import net.mcreator.supermario.block.MushroomWorldGroundBlock;
import net.mcreator.supermario.block.MushroomWorldGreenStoneStairsBlock;
import net.mcreator.supermario.block.MushroomWorldGreenStoneSlabBlock;
import net.mcreator.supermario.block.MushroomWorldGreenStoneBlockBlock;
import net.mcreator.supermario.block.MushroomWorldGrayHardBlockBlock;
import net.mcreator.supermario.block.MushroomWorldGrassStairsBlock;
import net.mcreator.supermario.block.MushroomWorldGrassSlabBlock;
import net.mcreator.supermario.block.MushroomWorldGrassBlock;
import net.mcreator.supermario.block.MushroomWorldBlueHardBlockBlock;
import net.mcreator.supermario.block.MushroomStemPinkBlock;
import net.mcreator.supermario.block.MushroomStemBlueBlock;
import net.mcreator.supermario.block.MushroomStemBlock;
import net.mcreator.supermario.block.MushroomKingomCastleTilesBlock;
import net.mcreator.supermario.block.MushroomKingdomTreeLogBlock;
import net.mcreator.supermario.block.MushroomKingdomTreeLeavesBlock;
import net.mcreator.supermario.block.MushroomKingdomSnowyTreeLeavesBlock;
import net.mcreator.supermario.block.MushroomKingdomPathBlockStairsBlock;
import net.mcreator.supermario.block.MushroomKingdomPathBlockSlabBlock;
import net.mcreator.supermario.block.MushroomKingdomPathBlockBlock;
import net.mcreator.supermario.block.MushroomKingdomOceanStoneBlock;
import net.mcreator.supermario.block.MushroomKingdomLeavesBlock;
import net.mcreator.supermario.block.MushroomKingdomGrassBlockStairsBlock;
import net.mcreator.supermario.block.MushroomKingdomGrassBlockSlabBlock;
import net.mcreator.supermario.block.MushroomKingdomGrassBlockBlock;
import net.mcreator.supermario.block.MushroomKingdomCrystalPurpleBlock;
import net.mcreator.supermario.block.MushroomKingdomCrystalPinkBlock;
import net.mcreator.supermario.block.MushroomKingdomCrystalGreenBlock;
import net.mcreator.supermario.block.MushroomKingdomCrystalBlueBlock;
import net.mcreator.supermario.block.MushroomKingdomCaveStoneStairsBlock;
import net.mcreator.supermario.block.MushroomKingdomCaveStoneSlabBlock;
import net.mcreator.supermario.block.MushroomKingdomCaveStoneBlock;
import net.mcreator.supermario.block.MushroomKingdomCaveRoadStairsBlock;
import net.mcreator.supermario.block.MushroomKingdomCaveRoadSlabBlock;
import net.mcreator.supermario.block.MushroomKingdomCaveRoadBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleWoodenBricksBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleWindowBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleWallpaperBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleUpperWallpaperBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleUpperTilesBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleUpperStarWallpaperBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleTilesStairsBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleTilesSlabBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleTiledWoodenBricksBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleTiledWallpaperBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleTiledGreenWallpaperBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleTiledGreenTopWallpaperBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleTiledBrickBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleTiledBaseboardBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleSunCarpetBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleStoneFloorSlabBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleStoneFloorBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleRoofStairsBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleRoofSlabBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleRoofBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleRailingBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleGreenWallpaperBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleGreenTopWallpaperBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleFakeBasementWallBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleDecorativeBrickBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleDarkWallpaperBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleDarkCloudWallpaperBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleCourtyardStatueBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleCloudWallpaperBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleCarpetedWoodenBricksBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleCarpetedWallpaperBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleCarpetedGreenWallpaperBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleCarpetedGreenTopWallpaperBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleCarpetedBaseboardBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleBlueWallpaperBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleBlueTopWallpaperBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleBlockWallBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleBlockFenceBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleBlockBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleBasementWallBlock;
import net.mcreator.supermario.block.MushroomKingdomCastleBaseboardBlock;
import net.mcreator.supermario.block.MushroomHillYellowBlock;
import net.mcreator.supermario.block.MushroomHillRedBlock;
import net.mcreator.supermario.block.MushroomHillGreenBlock;
import net.mcreator.supermario.block.MushroomHillBlueBlock;
import net.mcreator.supermario.block.MushroomCapYellowBlock;
import net.mcreator.supermario.block.MushroomCapTealBlock;
import net.mcreator.supermario.block.MushroomCapRedBlock;
import net.mcreator.supermario.block.MushroomCapPurpleBlock;
import net.mcreator.supermario.block.MushroomCapPinkBlock;
import net.mcreator.supermario.block.MushroomCapOrangeBlock;
import net.mcreator.supermario.block.MushroomCapGreenBlock;
import net.mcreator.supermario.block.MushroomCapBlueBlock;
import net.mcreator.supermario.block.MiniPipeYellowBlock;
import net.mcreator.supermario.block.MiniPipeTopYellowBlock;
import net.mcreator.supermario.block.MiniPipeTopSilverBlock;
import net.mcreator.supermario.block.MiniPipeTopRedBlock;
import net.mcreator.supermario.block.MiniPipeTopOrangeBlock;
import net.mcreator.supermario.block.MiniPipeTopBlueBlock;
import net.mcreator.supermario.block.MiniPipeTopBlock;
import net.mcreator.supermario.block.MiniPipeSilverBlock;
import net.mcreator.supermario.block.MiniPipeRedBlock;
import net.mcreator.supermario.block.MiniPipeOrangeBlock;
import net.mcreator.supermario.block.MiniPipeBlueBlock;
import net.mcreator.supermario.block.MiniPipeBlock;
import net.mcreator.supermario.block.MessageBlockBlock;
import net.mcreator.supermario.block.MeringueCloudsStoneStairsBlock;
import net.mcreator.supermario.block.MeringueCloudsStoneBlock;
import net.mcreator.supermario.block.MeringueCloudsSlabBlock;
import net.mcreator.supermario.block.MeringueCloudsGrassStairsBlock;
import net.mcreator.supermario.block.MeringueCloudsGrassSlabBlock;
import net.mcreator.supermario.block.MeringueCloudsGrassBlock;
import net.mcreator.supermario.block.LogBridgeBlock;
import net.mcreator.supermario.block.LethalLavaLandPaintingBlock;
import net.mcreator.supermario.block.LayerCakeDesertThickSandBlock;
import net.mcreator.supermario.block.LayerCakeDesertStonePillarBlock;
import net.mcreator.supermario.block.LayerCakeDesertStoneEyePillarBlock;
import net.mcreator.supermario.block.LayerCakeDesertStoneBlock;
import net.mcreator.supermario.block.LayerCakeDesertSandStairsBlock;
import net.mcreator.supermario.block.LayerCakeDesertSandSlabBlock;
import net.mcreator.supermario.block.LayerCakeDesertSandDecorativeBlock;
import net.mcreator.supermario.block.LayerCakeDesertSandBlock;
import net.mcreator.supermario.block.LayerCakeDesertRoadStairsBlock;
import net.mcreator.supermario.block.LayerCakeDesertRoadSlabBlock;
import net.mcreator.supermario.block.LayerCakeDesertRoadBlock;
import net.mcreator.supermario.block.LayerCakeDesertQuicksandBlock;
import net.mcreator.supermario.block.KoopaCastleBrickGrayBlock;
import net.mcreator.supermario.block.KoopaCastleBrickBlock;
import net.mcreator.supermario.block.JollyRodgerBayPaintingBlock;
import net.mcreator.supermario.block.IronCrateBlock;
import net.mcreator.supermario.block.IronBowserCrateBlock;
import net.mcreator.supermario.block.IceBrickBlockBlock;
import net.mcreator.supermario.block.HitBlockBlock;
import net.mcreator.supermario.block.HauntedWoodPillarBlock;
import net.mcreator.supermario.block.HauntedWoodLightPillarBlock;
import net.mcreator.supermario.block.HauntedWoodBlock;
import net.mcreator.supermario.block.HauntedStoneWoodenBlock;
import net.mcreator.supermario.block.HauntedStoneBlock;
import net.mcreator.supermario.block.HauntedStairsBlock;
import net.mcreator.supermario.block.HauntedSlabBlock;
import net.mcreator.supermario.block.HauntedPressurePlateBlock;
import net.mcreator.supermario.block.HauntedPlanksBlock;
import net.mcreator.supermario.block.HauntedLogBlock;
import net.mcreator.supermario.block.HauntedFenceGateBlock;
import net.mcreator.supermario.block.HauntedFenceBlock;
import net.mcreator.supermario.block.HauntedButtonBlock;
import net.mcreator.supermario.block.GhostHouseFloorBlock;
import net.mcreator.supermario.block.GhostHouseDoorBlock;
import net.mcreator.supermario.block.FrosterGlacierDirtSlabBlock;
import net.mcreator.supermario.block.FrostedGlacierSnowyIceBlock;
import net.mcreator.supermario.block.FrostedGlacierSnowyDirtStairsBlock;
import net.mcreator.supermario.block.FrostedGlacierSnowyDirtSlabBlock;
import net.mcreator.supermario.block.FrostedGlacierSnowyDirtBlock;
import net.mcreator.supermario.block.FrostedGlacierLogBlock;
import net.mcreator.supermario.block.FrostedGlacierLeavesBlock;
import net.mcreator.supermario.block.FrostedGlacierIceBlock;
import net.mcreator.supermario.block.FrostedGlacierDirtStairsBlock;
import net.mcreator.supermario.block.FrostedGlacierDirtBlock;
import net.mcreator.supermario.block.FluffyCloudBlockPinkBlock;
import net.mcreator.supermario.block.FluffyCloudBlockBlueBlock;
import net.mcreator.supermario.block.FluffyCloudBlockBlock;
import net.mcreator.supermario.block.DinosaurLandUndergroundStoneYellowBlock;
import net.mcreator.supermario.block.DinosaurLandUndergroundStoneLavenderBlock;
import net.mcreator.supermario.block.DinosaurLandUndergroundStoneGreenBlock;
import net.mcreator.supermario.block.DinosaurLandUndergroundStoneGrayBlock;
import net.mcreator.supermario.block.DinosaurLandUndergroundStoneBrownBlock;
import net.mcreator.supermario.block.DinosaurLandUndergroundRoadYellowBlock;
import net.mcreator.supermario.block.DinosaurLandUndergroundRoadLavenderBlock;
import net.mcreator.supermario.block.DinosaurLandUndergroundRoadGreenBlock;
import net.mcreator.supermario.block.DinosaurLandUndergroundRoadGrayBlock;
import net.mcreator.supermario.block.DinosaurLandUndergroundRoadBrownBlock;
import net.mcreator.supermario.block.DinosaurLandTreeBlock;
import net.mcreator.supermario.block.DinosaurLandLeavesBlock;
import net.mcreator.supermario.block.DinosaurLandGrassStairsBlock;
import net.mcreator.supermario.block.DinosaurLandGrassSlabBlock;
import net.mcreator.supermario.block.DinosaurLandGrassBlock;
import net.mcreator.supermario.block.DinosaurLandGhostHouseRoadBlock;
import net.mcreator.supermario.block.DinosaurLandGhostHousePillarBlock;
import net.mcreator.supermario.block.DinosaurLandGhostHouseBricksBlock;
import net.mcreator.supermario.block.DinosaurLandGhostHouseBlockBlock;
import net.mcreator.supermario.block.DinosaurLandForestGrassStairsBlock;
import net.mcreator.supermario.block.DinosaurLandForestGrassSlabBlock;
import net.mcreator.supermario.block.DinosaurLandForestGrassBlock;
import net.mcreator.supermario.block.DinosaurLandForestDirtStairsBlock;
import net.mcreator.supermario.block.DinosaurLandForestDirtSlabBlock;
import net.mcreator.supermario.block.DinosaurLandForestDirtBlock;
import net.mcreator.supermario.block.DinosaurLandDirtStairsBlock;
import net.mcreator.supermario.block.DinosaurLandDirtSlabBlock;
import net.mcreator.supermario.block.DinosaurLandDirtBlock;
import net.mcreator.supermario.block.DinosaurLandChocolateGrassStairsBlock;
import net.mcreator.supermario.block.DinosaurLandChocolateGrassSlabBlock;
import net.mcreator.supermario.block.DinosaurLandChocolateGrassBlock;
import net.mcreator.supermario.block.DinosaurLandChocolateDirtStairsBlock;
import net.mcreator.supermario.block.DinosaurLandChocolateDirtSlabBlock;
import net.mcreator.supermario.block.DinosaurLandChocolateDirtBlock;
import net.mcreator.supermario.block.DinosaurLandCastleStoneChocoBlock;
import net.mcreator.supermario.block.DinosaurLandCastleStoneBlueBlock;
import net.mcreator.supermario.block.DinosaurLandCastleStoneBlock;
import net.mcreator.supermario.block.DinosaurLandCastleRoadChocoBlock;
import net.mcreator.supermario.block.DinosaurLandCastleRoadBlueBlock;
import net.mcreator.supermario.block.DinosaurLandCastleRoadBlock;
import net.mcreator.supermario.block.DinosaurLandCastleBlockBlueBlock;
import net.mcreator.supermario.block.DinosaurLandCastleBlockBlock;
import net.mcreator.supermario.block.DeactivatedMechaKoopaBlock;
import net.mcreator.supermario.block.CoralBlock;
import net.mcreator.supermario.block.CoolCoolMountainPaintingBlock;
import net.mcreator.supermario.block.CoinBlock;
import net.mcreator.supermario.block.CloudBlockBlock;
import net.mcreator.supermario.block.ChainLinkFenceBlock;
import net.mcreator.supermario.block.CastleTileWhiteBlock;
import net.mcreator.supermario.block.CastleTileBlackBlock;
import net.mcreator.supermario.block.CastleThroneBlock;
import net.mcreator.supermario.block.CastleStainedGlassWindowBorderlessBlock;
import net.mcreator.supermario.block.CastleStainedGlassWindowBlock;
import net.mcreator.supermario.block.CastlePillarBlock;
import net.mcreator.supermario.block.CastleBridgeBlock;
import net.mcreator.supermario.block.CastleBrickBlock;
import net.mcreator.supermario.block.CastleBlockBlock;
import net.mcreator.supermario.block.CastleBackgroundWallBlock;
import net.mcreator.supermario.block.BuilderBoxYoshiBlock;
import net.mcreator.supermario.block.BuilderBoxWarioBlock;
import net.mcreator.supermario.block.BuilderBoxWaluigiBlock;
import net.mcreator.supermario.block.BuilderBoxToadetteBlock;
import net.mcreator.supermario.block.BuilderBoxToadBlock;
import net.mcreator.supermario.block.BuilderBoxRosalinaBlock;
import net.mcreator.supermario.block.BuilderBoxPeachBlock;
import net.mcreator.supermario.block.BuilderBoxMarioBlock;
import net.mcreator.supermario.block.BuilderBoxLuigiBlock;
import net.mcreator.supermario.block.BuilderBoxDaisyBlock;
import net.mcreator.supermario.block.BrickBlockStairsBlock;
import net.mcreator.supermario.block.BrickBlockSlabBlock;
import net.mcreator.supermario.block.BrickBlockRedBlock;
import net.mcreator.supermario.block.BrickBlockPurpleBlock;
import net.mcreator.supermario.block.BrickBlockGreenBlock;
import net.mcreator.supermario.block.BrickBlockGrayBlock;
import net.mcreator.supermario.block.BrickBlockBlueBlock;
import net.mcreator.supermario.block.BrickBlockBlock;
import net.mcreator.supermario.block.BowserStatueBlock;
import net.mcreator.supermario.block.BowserPaintingBlock;
import net.mcreator.supermario.block.BowserJrIconBlockBlock;
import net.mcreator.supermario.block.BowserIconBlockLaughingBlock;
import net.mcreator.supermario.block.BowserIconBlockBlock;
import net.mcreator.supermario.block.BossDoorRedBlock;
import net.mcreator.supermario.block.BossDoorBlueBlock;
import net.mcreator.supermario.block.BonusAreaBlockYellowBlock;
import net.mcreator.supermario.block.BonusAreaBlockPinkBlock;
import net.mcreator.supermario.block.BonusAreaBlockGreenBlock;
import net.mcreator.supermario.block.BonusAreaBlockBlueBlock;
import net.mcreator.supermario.block.BobOmbBattlefieldPaintingBlock;
import net.mcreator.supermario.block.BlueIronBlockBlock;
import net.mcreator.supermario.block.BlueCastleBlockBlock;
import net.mcreator.supermario.block.BillBlasterBlock;
import net.mcreator.supermario.block.AirshipWindowYellowBlock;
import net.mcreator.supermario.block.AirshipWindowLightBlueBlock;
import net.mcreator.supermario.block.AirshipWindowGreenBlock;
import net.mcreator.supermario.block.AirshipWindowBrownBlock;
import net.mcreator.supermario.block.AirshipWindowBlueBlock;
import net.mcreator.supermario.block.AirshipLogYellowBlock;
import net.mcreator.supermario.block.AirshipLogLightBlueBlock;
import net.mcreator.supermario.block.AirshipLogGreenBlock;
import net.mcreator.supermario.block.AirshipLogBrownBlock;
import net.mcreator.supermario.block.AirshipLogBlueBlock;
import net.mcreator.supermario.block.AirshipFenceYellowBlock;
import net.mcreator.supermario.block.AirshipFenceLightBlueBlock;
import net.mcreator.supermario.block.AirshipFenceGreenBlock;
import net.mcreator.supermario.block.AirshipFenceBrownBlock;
import net.mcreator.supermario.block.AirshipFenceBlueBlock;
import net.mcreator.supermario.block.AcornWoodDoorBlock;
import net.mcreator.supermario.block.AcornTreeLogBlock;
import net.mcreator.supermario.block.AcornPlainsStoneBlock;
import net.mcreator.supermario.block.AcornPlainsGrassStairsBlock;
import net.mcreator.supermario.block.AcornPlainsGrassSlabBlock;
import net.mcreator.supermario.block.AcornPlainsGrassBlock;
import net.mcreator.supermario.block.AcornPlainsDirtStairsBlock;
import net.mcreator.supermario.block.AcornPlainsDirtSlabBlock;
import net.mcreator.supermario.block.AcornPlainsDirtBlock;
import net.mcreator.supermario.SuperMarioMod;

public class SuperMarioModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SuperMarioMod.MODID);
	public static final RegistryObject<Block> MUSHSTONE = REGISTRY.register("mushstone", () -> new MushstoneBlock());
	public static final RegistryObject<Block> MUSHSTONE_STAIRS = REGISTRY.register("mushstone_stairs", () -> new MushstoneStairsBlock());
	public static final RegistryObject<Block> MUSHSTONE_SLAB = REGISTRY.register("mushstone_slab", () -> new MushstoneSlabBlock());
	public static final RegistryObject<Block> MUSHSTONE_BLUE = REGISTRY.register("mushstone_blue", () -> new MushstoneBlueBlock());
	public static final RegistryObject<Block> MUSHSTONE_BLUE_STAIRS = REGISTRY.register("mushstone_blue_stairs",
			() -> new MushstoneBlueStairsBlock());
	public static final RegistryObject<Block> MUSHSTONE_BLUE_SLAB = REGISTRY.register("mushstone_blue_slab", () -> new MushstoneBlueSlabBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_OCEAN_STONE = REGISTRY.register("mushroom_kingdom_ocean_stone",
			() -> new MushroomKingdomOceanStoneBlock());
	public static final RegistryObject<Block> CORAL = REGISTRY.register("coral", () -> new CoralBlock());
	public static final RegistryObject<Block> QUESTION_MARK_BLOCK = REGISTRY.register("question_mark_block", () -> new QuestionMarkBlockBlock());
	public static final RegistryObject<Block> BRICK_BLOCK = REGISTRY.register("brick_block", () -> new BrickBlockBlock());
	public static final RegistryObject<Block> BRICK_BLOCK_STAIRS = REGISTRY.register("brick_block_stairs", () -> new BrickBlockStairsBlock());
	public static final RegistryObject<Block> BRICK_BLOCK_SLAB = REGISTRY.register("brick_block_slab", () -> new BrickBlockSlabBlock());
	public static final RegistryObject<Block> BRICK_BLOCK_BLUE = REGISTRY.register("brick_block_blue", () -> new BrickBlockBlueBlock());
	public static final RegistryObject<Block> BRICK_BLOCK_GREEN = REGISTRY.register("brick_block_green", () -> new BrickBlockGreenBlock());
	public static final RegistryObject<Block> BRICK_BLOCK_PURPLE = REGISTRY.register("brick_block_purple", () -> new BrickBlockPurpleBlock());
	public static final RegistryObject<Block> BRICK_BLOCK_RED = REGISTRY.register("brick_block_red", () -> new BrickBlockRedBlock());
	public static final RegistryObject<Block> BRICK_BLOCK_GRAY = REGISTRY.register("brick_block_gray", () -> new BrickBlockGrayBlock());
	public static final RegistryObject<Block> HIT_BLOCK = REGISTRY.register("hit_block", () -> new HitBlockBlock());
	public static final RegistryObject<Block> MUSHSTONE_HARD_BLOCK = REGISTRY.register("mushstone_hard_block", () -> new MushstoneHardBlockBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_TREE_LOG = REGISTRY.register("mushroom_kingdom_tree_log",
			() -> new MushroomKingdomTreeLogBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_TREE_LEAVES = REGISTRY.register("mushroom_kingdom_tree_leaves",
			() -> new MushroomKingdomTreeLeavesBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_SNOWY_TREE_LEAVES = REGISTRY.register("mushroom_kingdom_snowy_tree_leaves",
			() -> new MushroomKingdomSnowyTreeLeavesBlock());
	public static final RegistryObject<Block> STONE_CASTLE_BRICKS = REGISTRY.register("stone_castle_bricks", () -> new StoneCastleBricksBlock());
	public static final RegistryObject<Block> CASTLE_BRIDGE = REGISTRY.register("castle_bridge", () -> new CastleBridgeBlock());
	public static final RegistryObject<Block> MINI_PIPE = REGISTRY.register("mini_pipe", () -> new MiniPipeBlock());
	public static final RegistryObject<Block> MINI_PIPE_TOP = REGISTRY.register("mini_pipe_top", () -> new MiniPipeTopBlock());
	public static final RegistryObject<Block> MINI_PIPE_BLUE = REGISTRY.register("mini_pipe_blue", () -> new MiniPipeBlueBlock());
	public static final RegistryObject<Block> MINI_PIPE_TOP_BLUE = REGISTRY.register("mini_pipe_top_blue", () -> new MiniPipeTopBlueBlock());
	public static final RegistryObject<Block> MINI_PIPE_YELLOW = REGISTRY.register("mini_pipe_yellow", () -> new MiniPipeYellowBlock());
	public static final RegistryObject<Block> MINI_PIPE_TOP_YELLOW = REGISTRY.register("mini_pipe_top_yellow", () -> new MiniPipeTopYellowBlock());
	public static final RegistryObject<Block> MINI_PIPE_RED = REGISTRY.register("mini_pipe_red", () -> new MiniPipeRedBlock());
	public static final RegistryObject<Block> MINI_PIPE_TOP_RED = REGISTRY.register("mini_pipe_top_red", () -> new MiniPipeTopRedBlock());
	public static final RegistryObject<Block> MINI_PIPE_ORANGE = REGISTRY.register("mini_pipe_orange", () -> new MiniPipeOrangeBlock());
	public static final RegistryObject<Block> MINI_PIPE_TOP_ORANGE = REGISTRY.register("mini_pipe_top_orange", () -> new MiniPipeTopOrangeBlock());
	public static final RegistryObject<Block> MINI_PIPE_SILVER = REGISTRY.register("mini_pipe_silver", () -> new MiniPipeSilverBlock());
	public static final RegistryObject<Block> MINI_PIPE_TOP_SILVER = REGISTRY.register("mini_pipe_top_silver", () -> new MiniPipeTopSilverBlock());
	public static final RegistryObject<Block> BLUE_IRON_BLOCK = REGISTRY.register("blue_iron_block", () -> new BlueIronBlockBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_ROAD = REGISTRY.register("mushroom_world_road", () -> new MushroomWorldRoadBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_ROAD_STAIRS = REGISTRY.register("mushroom_world_road_stairs",
			() -> new MushroomWorldRoadStairsBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_ROAD_SLAB = REGISTRY.register("mushroom_world_road_slab",
			() -> new MushroomWorldRoadSlabBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_SNOWY_ROAD = REGISTRY.register("mushroom_world_snowy_road",
			() -> new MushroomWorldSnowyRoadBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_GROUND = REGISTRY.register("mushroom_world_ground",
			() -> new MushroomWorldGroundBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_GROUND_STAIRS = REGISTRY.register("mushroom_world_ground_stairs",
			() -> new MushroomWorldGroundStairsBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_GROUND_SLAB = REGISTRY.register("mushroom_world_ground_slab",
			() -> new MushroomWorldGroundSlabBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_HARD_BLOCK = REGISTRY.register("mushroom_world_hard_block",
			() -> new MushroomWorldHardBlockBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_BLUE_HARD_BLOCK = REGISTRY.register("mushroom_world_blue_hard_block",
			() -> new MushroomWorldBlueHardBlockBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_GRAY_HARD_BLOCK = REGISTRY.register("mushroom_world_gray_hard_block",
			() -> new MushroomWorldGrayHardBlockBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_GRASS = REGISTRY.register("mushroom_world_grass", () -> new MushroomWorldGrassBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_GRASS_STAIRS = REGISTRY.register("mushroom_world_grass_stairs",
			() -> new MushroomWorldGrassStairsBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_GRASS_SLAB = REGISTRY.register("mushroom_world_grass_slab",
			() -> new MushroomWorldGrassSlabBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_SAND = REGISTRY.register("mushroom_world_sand", () -> new MushroomWorldSandBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_SAND_STAIRS = REGISTRY.register("mushroom_world_sand_stairs",
			() -> new MushroomWorldSandStairsBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_SAND_SLAB = REGISTRY.register("mushroom_world_sand_slab",
			() -> new MushroomWorldSandSlabBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_PILLAR_PURPLE = REGISTRY.register("mushroom_world_pillar_purple",
			() -> new MushroomWorldPillarPurpleBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_PILLAR_CORNER_PURPLE = REGISTRY.register("mushroom_world_pillar_corner_purple",
			() -> new MushroomWorldPillarCornerPurpleBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_STONE_BLOCK = REGISTRY.register("mushroom_world_stone_block",
			() -> new MushroomWorldStoneBlockBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_STONE_STAIRS = REGISTRY.register("mushroom_world_stone_stairs",
			() -> new MushroomWorldStoneStairsBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_STONE_SLAB = REGISTRY.register("mushroom_world_stone_slab",
			() -> new MushroomWorldStoneSlabBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_SNOWY_STONE_BLOCK = REGISTRY.register("mushroom_world_snowy_stone_block",
			() -> new MushroomWorldSnowyStoneBlockBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_SNOWY_STONE_STAIRS = REGISTRY.register("mushroom_world_snowy_stone_stairs",
			() -> new MushroomWorldSnowyStoneStairsBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_SNOWY_STONE_SLAB = REGISTRY.register("mushroom_world_snowy_stone_slab",
			() -> new MushroomWorldSnowyStoneSlabBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_GREEN_STONE_BLOCK = REGISTRY.register("mushroom_world_green_stone_block",
			() -> new MushroomWorldGreenStoneBlockBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_GREEN_STONE_STAIRS = REGISTRY.register("mushroom_world_green_stone_stairs",
			() -> new MushroomWorldGreenStoneStairsBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_GREEN_STONE_SLAB = REGISTRY.register("mushroom_world_green_stone_slab",
			() -> new MushroomWorldGreenStoneSlabBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_RED_STONE_BLOCK = REGISTRY.register("mushroom_world_red_stone_block",
			() -> new MushroomWorldRedStoneBlockBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_RED_STONE_STAIRS = REGISTRY.register("mushroom_world_red_stone_stairs",
			() -> new MushroomWorldRedStoneStairsBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_RED_STONE_SLAB = REGISTRY.register("mushroom_world_red_stone_slab",
			() -> new MushroomWorldRedStoneSlabBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_UNDERWATER_BLOCK = REGISTRY.register("mushroom_world_underwater_block",
			() -> new MushroomWorldUnderwaterBlockBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_UNDERWATER_STONE = REGISTRY.register("mushroom_world_underwater_stone",
			() -> new MushroomWorldUnderwaterStoneBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_UNDERWATER_RING_PINK = REGISTRY.register("mushroom_world_underwater_ring_pink",
			() -> new MushroomWorldUnderwaterRingPinkBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_UNDERWATER_RING_WHITE = REGISTRY.register("mushroom_world_underwater_ring_white",
			() -> new MushroomWorldUnderwaterRingWhiteBlock());
	public static final RegistryObject<Block> NOTE_BLOCK = REGISTRY.register("note_block", () -> new NoteBlockBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_PILLAR_BLUE = REGISTRY.register("mushroom_world_pillar_blue",
			() -> new MushroomWorldPillarBlueBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_PILLAR_CORNER_BLUE = REGISTRY.register("mushroom_world_pillar_corner_blue",
			() -> new MushroomWorldPillarCornerBlueBlock());
	public static final RegistryObject<Block> CASTLE_BLOCK = REGISTRY.register("castle_block", () -> new CastleBlockBlock());
	public static final RegistryObject<Block> BLUE_CASTLE_BLOCK = REGISTRY.register("blue_castle_block", () -> new BlueCastleBlockBlock());
	public static final RegistryObject<Block> CASTLE_TILE_BLACK = REGISTRY.register("castle_tile_black", () -> new CastleTileBlackBlock());
	public static final RegistryObject<Block> CASTLE_TILE_WHITE = REGISTRY.register("castle_tile_white", () -> new CastleTileWhiteBlock());
	public static final RegistryObject<Block> CASTLE_BACKGROUND_WALL = REGISTRY.register("castle_background_wall",
			() -> new CastleBackgroundWallBlock());
	public static final RegistryObject<Block> CASTLE_PILLAR = REGISTRY.register("castle_pillar", () -> new CastlePillarBlock());
	public static final RegistryObject<Block> CASTLE_BRICK = REGISTRY.register("castle_brick", () -> new CastleBrickBlock());
	public static final RegistryObject<Block> CLOUD_BLOCK = REGISTRY.register("cloud_block", () -> new CloudBlockBlock());
	public static final RegistryObject<Block> RAINY_CLOUD_BLOCK = REGISTRY.register("rainy_cloud_block", () -> new RainyCloudBlockBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_GRASS = REGISTRY.register("dinosaur_land_grass", () -> new DinosaurLandGrassBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_GRASS_STAIRS = REGISTRY.register("dinosaur_land_grass_stairs",
			() -> new DinosaurLandGrassStairsBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_GRASS_SLAB = REGISTRY.register("dinosaur_land_grass_slab",
			() -> new DinosaurLandGrassSlabBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_DIRT = REGISTRY.register("dinosaur_land_dirt", () -> new DinosaurLandDirtBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_DIRT_STAIRS = REGISTRY.register("dinosaur_land_dirt_stairs",
			() -> new DinosaurLandDirtStairsBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_DIRT_SLAB = REGISTRY.register("dinosaur_land_dirt_slab",
			() -> new DinosaurLandDirtSlabBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_FOREST_GRASS = REGISTRY.register("dinosaur_land_forest_grass",
			() -> new DinosaurLandForestGrassBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_FOREST_GRASS_STAIRS = REGISTRY.register("dinosaur_land_forest_grass_stairs",
			() -> new DinosaurLandForestGrassStairsBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_FOREST_GRASS_SLAB = REGISTRY.register("dinosaur_land_forest_grass_slab",
			() -> new DinosaurLandForestGrassSlabBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_FOREST_DIRT = REGISTRY.register("dinosaur_land_forest_dirt",
			() -> new DinosaurLandForestDirtBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_FOREST_DIRT_STAIRS = REGISTRY.register("dinosaur_land_forest_dirt_stairs",
			() -> new DinosaurLandForestDirtStairsBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_FOREST_DIRT_SLAB = REGISTRY.register("dinosaur_land_forest_dirt_slab",
			() -> new DinosaurLandForestDirtSlabBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_CHOCOLATE_GRASS = REGISTRY.register("dinosaur_land_chocolate_grass",
			() -> new DinosaurLandChocolateGrassBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_CHOCOLATE_GRASS_STAIRS = REGISTRY.register("dinosaur_land_chocolate_grass_stairs",
			() -> new DinosaurLandChocolateGrassStairsBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_CHOCOLATE_GRASS_SLAB = REGISTRY.register("dinosaur_land_chocolate_grass_slab",
			() -> new DinosaurLandChocolateGrassSlabBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_CHOCOLATE_DIRT = REGISTRY.register("dinosaur_land_chocolate_dirt",
			() -> new DinosaurLandChocolateDirtBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_CHOCOLATE_DIRT_STAIRS = REGISTRY.register("dinosaur_land_chocolate_dirt_stairs",
			() -> new DinosaurLandChocolateDirtStairsBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_CHOCOLATE_DIRT_SLAB = REGISTRY.register("dinosaur_land_chocolate_dirt_slab",
			() -> new DinosaurLandChocolateDirtSlabBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_TREE = REGISTRY.register("dinosaur_land_tree", () -> new DinosaurLandTreeBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_LEAVES = REGISTRY.register("dinosaur_land_leaves", () -> new DinosaurLandLeavesBlock());
	public static final RegistryObject<Block> LOG_BRIDGE = REGISTRY.register("log_bridge", () -> new LogBridgeBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_UNDERGROUND_STONE_GRAY = REGISTRY.register("dinosaur_land_underground_stone_gray",
			() -> new DinosaurLandUndergroundStoneGrayBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_UNDERGROUND_ROAD_GRAY = REGISTRY.register("dinosaur_land_underground_road_gray",
			() -> new DinosaurLandUndergroundRoadGrayBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_UNDERGROUND_STONE_LAVENDER = REGISTRY.register("dinosaur_land_underground_stone_lavender",
			() -> new DinosaurLandUndergroundStoneLavenderBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_UNDERGROUND_ROAD_LAVENDER = REGISTRY.register("dinosaur_land_underground_road_lavender",
			() -> new DinosaurLandUndergroundRoadLavenderBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_UNDERGROUND_STONE_GREEN = REGISTRY.register("dinosaur_land_underground_stone_green",
			() -> new DinosaurLandUndergroundStoneGreenBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_UNDERGROUND_ROAD_GREEN = REGISTRY.register("dinosaur_land_underground_road_green",
			() -> new DinosaurLandUndergroundRoadGreenBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_UNDERGROUND_STONE_YELLOW = REGISTRY.register("dinosaur_land_underground_stone_yellow",
			() -> new DinosaurLandUndergroundStoneYellowBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_UNDERGROUND_ROAD_YELLOW = REGISTRY.register("dinosaur_land_underground_road_yellow",
			() -> new DinosaurLandUndergroundRoadYellowBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_UNDERGROUND_STONE_BROWN = REGISTRY.register("dinosaur_land_underground_stone_brown",
			() -> new DinosaurLandUndergroundStoneBrownBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_UNDERGROUND_ROAD_BROWN = REGISTRY.register("dinosaur_land_underground_road_brown",
			() -> new DinosaurLandUndergroundRoadBrownBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_GHOST_HOUSE_ROAD = REGISTRY.register("dinosaur_land_ghost_house_road",
			() -> new DinosaurLandGhostHouseRoadBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_GHOST_HOUSE_BLOCK = REGISTRY.register("dinosaur_land_ghost_house_block",
			() -> new DinosaurLandGhostHouseBlockBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_GHOST_HOUSE_PILLAR = REGISTRY.register("dinosaur_land_ghost_house_pillar",
			() -> new DinosaurLandGhostHousePillarBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_GHOST_HOUSE_BRICKS = REGISTRY.register("dinosaur_land_ghost_house_bricks",
			() -> new DinosaurLandGhostHouseBricksBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_CASTLE_STONE = REGISTRY.register("dinosaur_land_castle_stone",
			() -> new DinosaurLandCastleStoneBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_CASTLE_ROAD = REGISTRY.register("dinosaur_land_castle_road",
			() -> new DinosaurLandCastleRoadBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_CASTLE_BLOCK = REGISTRY.register("dinosaur_land_castle_block",
			() -> new DinosaurLandCastleBlockBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_CASTLE_STONE_BLUE = REGISTRY.register("dinosaur_land_castle_stone_blue",
			() -> new DinosaurLandCastleStoneBlueBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_CASTLE_ROAD_BLUE = REGISTRY.register("dinosaur_land_castle_road_blue",
			() -> new DinosaurLandCastleRoadBlueBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_CASTLE_BLOCK_BLUE = REGISTRY.register("dinosaur_land_castle_block_blue",
			() -> new DinosaurLandCastleBlockBlueBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_CASTLE_STONE_CHOCO = REGISTRY.register("dinosaur_land_castle_stone_choco",
			() -> new DinosaurLandCastleStoneChocoBlock());
	public static final RegistryObject<Block> DINOSAUR_LAND_CASTLE_ROAD_CHOCO = REGISTRY.register("dinosaur_land_castle_road_choco",
			() -> new DinosaurLandCastleRoadChocoBlock());
	public static final RegistryObject<Block> SWITCH_PALACE_BLOCK = REGISTRY.register("switch_palace_block", () -> new SwitchPalaceBlockBlock());
	public static final RegistryObject<Block> AIRSHIP_LOG_YELLOW = REGISTRY.register("airship_log_yellow", () -> new AirshipLogYellowBlock());
	public static final RegistryObject<Block> AIRSHIP_WINDOW_YELLOW = REGISTRY.register("airship_window_yellow",
			() -> new AirshipWindowYellowBlock());
	public static final RegistryObject<Block> AIRSHIP_FENCE_YELLOW = REGISTRY.register("airship_fence_yellow", () -> new AirshipFenceYellowBlock());
	public static final RegistryObject<Block> AIRSHIP_LOG_BROWN = REGISTRY.register("airship_log_brown", () -> new AirshipLogBrownBlock());
	public static final RegistryObject<Block> AIRSHIP_WINDOW_BROWN = REGISTRY.register("airship_window_brown", () -> new AirshipWindowBrownBlock());
	public static final RegistryObject<Block> AIRSHIP_FENCE_BROWN = REGISTRY.register("airship_fence_brown", () -> new AirshipFenceBrownBlock());
	public static final RegistryObject<Block> AIRSHIP_LOG_LIGHT_BLUE = REGISTRY.register("airship_log_light_blue",
			() -> new AirshipLogLightBlueBlock());
	public static final RegistryObject<Block> AIRSHIP_WINDOW_LIGHT_BLUE = REGISTRY.register("airship_window_light_blue",
			() -> new AirshipWindowLightBlueBlock());
	public static final RegistryObject<Block> AIRSHIP_FENCE_LIGHT_BLUE = REGISTRY.register("airship_fence_light_blue",
			() -> new AirshipFenceLightBlueBlock());
	public static final RegistryObject<Block> AIRSHIP_LOG_BLUE = REGISTRY.register("airship_log_blue", () -> new AirshipLogBlueBlock());
	public static final RegistryObject<Block> AIRSHIP_WINDOW_BLUE = REGISTRY.register("airship_window_blue", () -> new AirshipWindowBlueBlock());
	public static final RegistryObject<Block> AIRSHIP_FENCE_BLUE = REGISTRY.register("airship_fence_blue", () -> new AirshipFenceBlueBlock());
	public static final RegistryObject<Block> AIRSHIP_LOG_GREEN = REGISTRY.register("airship_log_green", () -> new AirshipLogGreenBlock());
	public static final RegistryObject<Block> AIRSHIP_WINDOW_GREEN = REGISTRY.register("airship_window_green", () -> new AirshipWindowGreenBlock());
	public static final RegistryObject<Block> AIRSHIP_FENCE_GREEN = REGISTRY.register("airship_fence_green", () -> new AirshipFenceGreenBlock());
	public static final RegistryObject<Block> ACORN_PLAINS_GRASS = REGISTRY.register("acorn_plains_grass", () -> new AcornPlainsGrassBlock());
	public static final RegistryObject<Block> ACORN_PLAINS_GRASS_STAIRS = REGISTRY.register("acorn_plains_grass_stairs",
			() -> new AcornPlainsGrassStairsBlock());
	public static final RegistryObject<Block> ACORN_PLAINS_GRASS_SLAB = REGISTRY.register("acorn_plains_grass_slab",
			() -> new AcornPlainsGrassSlabBlock());
	public static final RegistryObject<Block> ACORN_PLAINS_DIRT = REGISTRY.register("acorn_plains_dirt", () -> new AcornPlainsDirtBlock());
	public static final RegistryObject<Block> ACORN_PLAINS_DIRT_STAIRS = REGISTRY.register("acorn_plains_dirt_stairs",
			() -> new AcornPlainsDirtStairsBlock());
	public static final RegistryObject<Block> ACORN_PLAINS_DIRT_SLAB = REGISTRY.register("acorn_plains_dirt_slab",
			() -> new AcornPlainsDirtSlabBlock());
	public static final RegistryObject<Block> ACORN_PLAINS_STONE = REGISTRY.register("acorn_plains_stone", () -> new AcornPlainsStoneBlock());
	public static final RegistryObject<Block> ACORN_WOOD_DOOR = REGISTRY.register("acorn_wood_door", () -> new AcornWoodDoorBlock());
	public static final RegistryObject<Block> ACORN_TREE_LOG = REGISTRY.register("acorn_tree_log", () -> new AcornTreeLogBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_LEAVES = REGISTRY.register("mushroom_kingdom_leaves",
			() -> new MushroomKingdomLeavesBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CAVE_ROAD = REGISTRY.register("mushroom_kingdom_cave_road",
			() -> new MushroomKingdomCaveRoadBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CAVE_ROAD_STAIRS = REGISTRY.register("mushroom_kingdom_cave_road_stairs",
			() -> new MushroomKingdomCaveRoadStairsBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CAVE_ROAD_SLAB = REGISTRY.register("mushroom_kingdom_cave_road_slab",
			() -> new MushroomKingdomCaveRoadSlabBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CAVE_STONE = REGISTRY.register("mushroom_kingdom_cave_stone",
			() -> new MushroomKingdomCaveStoneBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CAVE_STONE_STAIRS = REGISTRY.register("mushroom_kingdom_cave_stone_stairs",
			() -> new MushroomKingdomCaveStoneStairsBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CAVE_STONE_SLAB = REGISTRY.register("mushroom_kingdom_cave_stone_slab",
			() -> new MushroomKingdomCaveStoneSlabBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CRYSTAL_PINK = REGISTRY.register("mushroom_kingdom_crystal_pink",
			() -> new MushroomKingdomCrystalPinkBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CRYSTAL_PURPLE = REGISTRY.register("mushroom_kingdom_crystal_purple",
			() -> new MushroomKingdomCrystalPurpleBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CRYSTAL_BLUE = REGISTRY.register("mushroom_kingdom_crystal_blue",
			() -> new MushroomKingdomCrystalBlueBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CRYSTAL_GREEN = REGISTRY.register("mushroom_kingdom_crystal_green",
			() -> new MushroomKingdomCrystalGreenBlock());
	public static final RegistryObject<Block> MUSHROOM_STEM = REGISTRY.register("mushroom_stem", () -> new MushroomStemBlock());
	public static final RegistryObject<Block> MUSHROOM_STEM_PINK = REGISTRY.register("mushroom_stem_pink", () -> new MushroomStemPinkBlock());
	public static final RegistryObject<Block> MUSHROOM_STEM_BLUE = REGISTRY.register("mushroom_stem_blue", () -> new MushroomStemBlueBlock());
	public static final RegistryObject<Block> MUSHROOM_CAP_PINK = REGISTRY.register("mushroom_cap_pink", () -> new MushroomCapPinkBlock());
	public static final RegistryObject<Block> MUSHROOM_CAP_TEAL = REGISTRY.register("mushroom_cap_teal", () -> new MushroomCapTealBlock());
	public static final RegistryObject<Block> MUSHROOM_CAP_RED = REGISTRY.register("mushroom_cap_red", () -> new MushroomCapRedBlock());
	public static final RegistryObject<Block> MUSHROOM_CAP_GREEN = REGISTRY.register("mushroom_cap_green", () -> new MushroomCapGreenBlock());
	public static final RegistryObject<Block> MUSHROOM_CAP_YELLOW = REGISTRY.register("mushroom_cap_yellow", () -> new MushroomCapYellowBlock());
	public static final RegistryObject<Block> MUSHROOM_CAP_BLUE = REGISTRY.register("mushroom_cap_blue", () -> new MushroomCapBlueBlock());
	public static final RegistryObject<Block> MUSHROOM_CAP_ORANGE = REGISTRY.register("mushroom_cap_orange", () -> new MushroomCapOrangeBlock());
	public static final RegistryObject<Block> MUSHROOM_CAP_PURPLE = REGISTRY.register("mushroom_cap_purple", () -> new MushroomCapPurpleBlock());
	public static final RegistryObject<Block> LAYER_CAKE_DESERT_ROAD = REGISTRY.register("layer_cake_desert_road",
			() -> new LayerCakeDesertRoadBlock());
	public static final RegistryObject<Block> LAYER_CAKE_DESERT_ROAD_STAIRS = REGISTRY.register("layer_cake_desert_road_stairs",
			() -> new LayerCakeDesertRoadStairsBlock());
	public static final RegistryObject<Block> LAYER_CAKE_DESERT_ROAD_SLAB = REGISTRY.register("layer_cake_desert_road_slab",
			() -> new LayerCakeDesertRoadSlabBlock());
	public static final RegistryObject<Block> LAYER_CAKE_DESERT_SAND = REGISTRY.register("layer_cake_desert_sand",
			() -> new LayerCakeDesertSandBlock());
	public static final RegistryObject<Block> LAYER_CAKE_DESERT_SAND_STAIRS = REGISTRY.register("layer_cake_desert_sand_stairs",
			() -> new LayerCakeDesertSandStairsBlock());
	public static final RegistryObject<Block> LAYER_CAKE_DESERT_SAND_SLAB = REGISTRY.register("layer_cake_desert_sand_slab",
			() -> new LayerCakeDesertSandSlabBlock());
	public static final RegistryObject<Block> LAYER_CAKE_DESERT_SAND_DECORATIVE = REGISTRY.register("layer_cake_desert_sand_decorative",
			() -> new LayerCakeDesertSandDecorativeBlock());
	public static final RegistryObject<Block> LAYER_CAKE_DESERT_THICK_SAND = REGISTRY.register("layer_cake_desert_thick_sand",
			() -> new LayerCakeDesertThickSandBlock());
	public static final RegistryObject<Block> LAYER_CAKE_DESERT_QUICKSAND = REGISTRY.register("layer_cake_desert_quicksand",
			() -> new LayerCakeDesertQuicksandBlock());
	public static final RegistryObject<Block> LAYER_CAKE_DESERT_STONE = REGISTRY.register("layer_cake_desert_stone",
			() -> new LayerCakeDesertStoneBlock());
	public static final RegistryObject<Block> LAYER_CAKE_DESERT_STONE_PILLAR = REGISTRY.register("layer_cake_desert_stone_pillar",
			() -> new LayerCakeDesertStonePillarBlock());
	public static final RegistryObject<Block> LAYER_CAKE_DESERT_STONE_EYE_PILLAR = REGISTRY.register("layer_cake_desert_stone_eye_pillar",
			() -> new LayerCakeDesertStoneEyePillarBlock());
	public static final RegistryObject<Block> SPARKLING_WATERS_BEACH_GRASS = REGISTRY.register("sparkling_waters_beach_grass",
			() -> new SparklingWatersBeachGrassBlock());
	public static final RegistryObject<Block> SPARKLING_WATERS_BEACH_GRASS_STAIRS = REGISTRY.register("sparkling_waters_beach_grass_stairs",
			() -> new SparklingWatersBeachGrassStairsBlock());
	public static final RegistryObject<Block> SPARKLING_WATERS_BEACH_GRASS_SLAB = REGISTRY.register("sparkling_waters_beach_grass_slab",
			() -> new SparklingWatersBeachGrassSlabBlock());
	public static final RegistryObject<Block> SPARKLING_WATERS_BEACH_STONE = REGISTRY.register("sparkling_waters_beach_stone",
			() -> new SparklingWatersBeachStoneBlock());
	public static final RegistryObject<Block> SPARKLING_WATERS_BEACH_STONE_STAIRS = REGISTRY.register("sparkling_waters_beach_stone_stairs",
			() -> new SparklingWatersBeachStoneStairsBlock());
	public static final RegistryObject<Block> SPARKLING_WATERS_BEACH_STONE_SLAB = REGISTRY.register("sparkling_waters_beach_stone_slab",
			() -> new SparklingWatersBeachStoneSlabBlock());
	public static final RegistryObject<Block> SPARKLING_WATERS_ROAD = REGISTRY.register("sparkling_waters_road",
			() -> new SparklingWatersRoadBlock());
	public static final RegistryObject<Block> SPARKLING_WATERS_ROAD_STAIRS = REGISTRY.register("sparkling_waters_road_stairs",
			() -> new SparklingWatersRoadStairsBlock());
	public static final RegistryObject<Block> SPARKLING_WATERS_ROAD_SLAB = REGISTRY.register("sparkling_waters_road_slab",
			() -> new SparklingWatersRoadSlabBlock());
	public static final RegistryObject<Block> SPARKLING_WATERS_STONE = REGISTRY.register("sparkling_waters_stone",
			() -> new SparklingWatersStoneBlock());
	public static final RegistryObject<Block> SPARKLING_WATERS_STONE_STAIRS = REGISTRY.register("sparkling_waters_stone_stairs",
			() -> new SparklingWatersStoneStairsBlock());
	public static final RegistryObject<Block> SPARKLING_WATERS_STONE_SLAB = REGISTRY.register("sparkling_waters_stone_slab",
			() -> new SparklingWatersStoneSlabBlock());
	public static final RegistryObject<Block> FROSTED_GLACIER_SNOWY_DIRT = REGISTRY.register("frosted_glacier_snowy_dirt",
			() -> new FrostedGlacierSnowyDirtBlock());
	public static final RegistryObject<Block> FROSTED_GLACIER_SNOWY_DIRT_STAIRS = REGISTRY.register("frosted_glacier_snowy_dirt_stairs",
			() -> new FrostedGlacierSnowyDirtStairsBlock());
	public static final RegistryObject<Block> FROSTED_GLACIER_SNOWY_DIRT_SLAB = REGISTRY.register("frosted_glacier_snowy_dirt_slab",
			() -> new FrostedGlacierSnowyDirtSlabBlock());
	public static final RegistryObject<Block> FROSTED_GLACIER_DIRT = REGISTRY.register("frosted_glacier_dirt", () -> new FrostedGlacierDirtBlock());
	public static final RegistryObject<Block> FROSTED_GLACIER_DIRT_STAIRS = REGISTRY.register("frosted_glacier_dirt_stairs",
			() -> new FrostedGlacierDirtStairsBlock());
	public static final RegistryObject<Block> FROSTER_GLACIER_DIRT_SLAB = REGISTRY.register("froster_glacier_dirt_slab",
			() -> new FrosterGlacierDirtSlabBlock());
	public static final RegistryObject<Block> FROSTED_GLACIER_SNOWY_ICE = REGISTRY.register("frosted_glacier_snowy_ice",
			() -> new FrostedGlacierSnowyIceBlock());
	public static final RegistryObject<Block> FROSTED_GLACIER_ICE = REGISTRY.register("frosted_glacier_ice", () -> new FrostedGlacierIceBlock());
	public static final RegistryObject<Block> FROSTED_GLACIER_LOG = REGISTRY.register("frosted_glacier_log", () -> new FrostedGlacierLogBlock());
	public static final RegistryObject<Block> FROSTED_GLACIER_LEAVES = REGISTRY.register("frosted_glacier_leaves",
			() -> new FrostedGlacierLeavesBlock());
	public static final RegistryObject<Block> SODA_JUNGLE_GRASS = REGISTRY.register("soda_jungle_grass", () -> new SodaJungleGrassBlock());
	public static final RegistryObject<Block> SODA_JUNGLE_GRASS_STAIRS = REGISTRY.register("soda_jungle_grass_stairs",
			() -> new SodaJungleGrassStairsBlock());
	public static final RegistryObject<Block> SODA_JUNGLE_GRASS_SLAB = REGISTRY.register("soda_jungle_grass_slab",
			() -> new SodaJungleGrassSlabBlock());
	public static final RegistryObject<Block> SODA_JUNGLE_DIRT = REGISTRY.register("soda_jungle_dirt", () -> new SodaJungleDirtBlock());
	public static final RegistryObject<Block> SODA_JUNGLE_DIRT_STAIRS = REGISTRY.register("soda_jungle_dirt_stairs",
			() -> new SodaJungleDirtStairsBlock());
	public static final RegistryObject<Block> SODA_JUNGLE_DIRT_SLAB = REGISTRY.register("soda_jungle_dirt_slab", () -> new SodaJungleDirtSlabBlock());
	public static final RegistryObject<Block> SODA_JUNGLE_GHOST_GRASS = REGISTRY.register("soda_jungle_ghost_grass",
			() -> new SodaJungleGhostGrassBlock());
	public static final RegistryObject<Block> SODA_JUNGLE_GHOST_GRASS_STAIRS = REGISTRY.register("soda_jungle_ghost_grass_stairs",
			() -> new SodaJungleGhostGrassStairsBlock());
	public static final RegistryObject<Block> SODA_JUNGLE_GHOST_GRASS_SLAB = REGISTRY.register("soda_jungle_ghost_grass_slab",
			() -> new SodaJungleGhostGrassSlabBlock());
	public static final RegistryObject<Block> SODA_JUNGLE_GHOST_DIRT = REGISTRY.register("soda_jungle_ghost_dirt",
			() -> new SodaJungleGhostDirtBlock());
	public static final RegistryObject<Block> SODA_JUNGLE_GHOST_DIRT_STAIRS = REGISTRY.register("soda_jungle_ghost_dirt_stairs",
			() -> new SodaJungleGhostDirtStairsBlock());
	public static final RegistryObject<Block> SODA_JUNGLE_GHOST_DIRT_SLAB = REGISTRY.register("soda_jungle_ghost_dirt_slab",
			() -> new SodaJungleGhostDirtSlabBlock());
	public static final RegistryObject<Block> POISON_WATER = REGISTRY.register("poison_water", () -> new PoisonWaterBlock());
	public static final RegistryObject<Block> ROCK_CANDY_MINES_STONE_WHITE = REGISTRY.register("rock_candy_mines_stone_white",
			() -> new RockCandyMinesStoneWhiteBlock());
	public static final RegistryObject<Block> ROCK_CANDY_MINES_STONE_GREEN = REGISTRY.register("rock_candy_mines_stone_green",
			() -> new RockCandyMinesStoneGreenBlock());
	public static final RegistryObject<Block> ROCK_CANDY_MINES_STONE_BLUE = REGISTRY.register("rock_candy_mines_stone_blue",
			() -> new RockCandyMinesStoneBlueBlock());
	public static final RegistryObject<Block> ROCK_CANDY_MINES_STONE_RED = REGISTRY.register("rock_candy_mines_stone_red",
			() -> new RockCandyMinesStoneRedBlock());
	public static final RegistryObject<Block> MERINGUE_CLOUDS_GRASS = REGISTRY.register("meringue_clouds_grass",
			() -> new MeringueCloudsGrassBlock());
	public static final RegistryObject<Block> MERINGUE_CLOUDS_GRASS_STAIRS = REGISTRY.register("meringue_clouds_grass_stairs",
			() -> new MeringueCloudsGrassStairsBlock());
	public static final RegistryObject<Block> MERINGUE_CLOUDS_GRASS_SLAB = REGISTRY.register("meringue_clouds_grass_slab",
			() -> new MeringueCloudsGrassSlabBlock());
	public static final RegistryObject<Block> MERINGUE_CLOUDS_STONE = REGISTRY.register("meringue_clouds_stone",
			() -> new MeringueCloudsStoneBlock());
	public static final RegistryObject<Block> MERINGUE_CLOUDS_STONE_STAIRS = REGISTRY.register("meringue_clouds_stone_stairs",
			() -> new MeringueCloudsStoneStairsBlock());
	public static final RegistryObject<Block> MERINGUE_CLOUDS_SLAB = REGISTRY.register("meringue_clouds_slab", () -> new MeringueCloudsSlabBlock());
	public static final RegistryObject<Block> FLUFFY_CLOUD_BLOCK = REGISTRY.register("fluffy_cloud_block", () -> new FluffyCloudBlockBlock());
	public static final RegistryObject<Block> FLUFFY_CLOUD_BLOCK_BLUE = REGISTRY.register("fluffy_cloud_block_blue",
			() -> new FluffyCloudBlockBlueBlock());
	public static final RegistryObject<Block> FLUFFY_CLOUD_BLOCK_PINK = REGISTRY.register("fluffy_cloud_block_pink",
			() -> new FluffyCloudBlockPinkBlock());
	public static final RegistryObject<Block> MUSHROOM_HILL_RED = REGISTRY.register("mushroom_hill_red", () -> new MushroomHillRedBlock());
	public static final RegistryObject<Block> MUSHROOM_HILL_GREEN = REGISTRY.register("mushroom_hill_green", () -> new MushroomHillGreenBlock());
	public static final RegistryObject<Block> MUSHROOM_HILL_BLUE = REGISTRY.register("mushroom_hill_blue", () -> new MushroomHillBlueBlock());
	public static final RegistryObject<Block> MUSHROOM_HILL_YELLOW = REGISTRY.register("mushroom_hill_yellow", () -> new MushroomHillYellowBlock());
	public static final RegistryObject<Block> BONUS_AREA_BLOCK_PINK = REGISTRY.register("bonus_area_block_pink", () -> new BonusAreaBlockPinkBlock());
	public static final RegistryObject<Block> BONUS_AREA_BLOCK_BLUE = REGISTRY.register("bonus_area_block_blue", () -> new BonusAreaBlockBlueBlock());
	public static final RegistryObject<Block> BONUS_AREA_BLOCK_GREEN = REGISTRY.register("bonus_area_block_green",
			() -> new BonusAreaBlockGreenBlock());
	public static final RegistryObject<Block> BONUS_AREA_BLOCK_YELLOW = REGISTRY.register("bonus_area_block_yellow",
			() -> new BonusAreaBlockYellowBlock());
	public static final RegistryObject<Block> GHOST_HOUSE_DOOR = REGISTRY.register("ghost_house_door", () -> new GhostHouseDoorBlock());
	public static final RegistryObject<Block> KOOPA_CASTLE_BRICK = REGISTRY.register("koopa_castle_brick", () -> new KoopaCastleBrickBlock());
	public static final RegistryObject<Block> KOOPA_CASTLE_BRICK_GRAY = REGISTRY.register("koopa_castle_brick_gray",
			() -> new KoopaCastleBrickGrayBlock());
	public static final RegistryObject<Block> BOSS_DOOR_RED = REGISTRY.register("boss_door_red", () -> new BossDoorRedBlock());
	public static final RegistryObject<Block> BOSS_DOOR_BLUE = REGISTRY.register("boss_door_blue", () -> new BossDoorBlueBlock());
	public static final RegistryObject<Block> TOWER_BLOCK_GREEN = REGISTRY.register("tower_block_green", () -> new TowerBlockGreenBlock());
	public static final RegistryObject<Block> TOWER_BLOCK_WHITE = REGISTRY.register("tower_block_white", () -> new TowerBlockWhiteBlock());
	public static final RegistryObject<Block> TOWER_BLOCK_LIME = REGISTRY.register("tower_block_lime", () -> new TowerBlockLimeBlock());
	public static final RegistryObject<Block> TOWER_BLOCK_ORANGE = REGISTRY.register("tower_block_orange", () -> new TowerBlockOrangeBlock());
	public static final RegistryObject<Block> TOWER_BLOCK_OLIVE = REGISTRY.register("tower_block_olive", () -> new TowerBlockOliveBlock());
	public static final RegistryObject<Block> TOWER_BLOCK_GRAY = REGISTRY.register("tower_block_gray", () -> new TowerBlockGrayBlock());
	public static final RegistryObject<Block> TOWER_BLOCK_BLUE = REGISTRY.register("tower_block_blue", () -> new TowerBlockBlueBlock());
	public static final RegistryObject<Block> TOWER_BLOCK_CYAN = REGISTRY.register("tower_block_cyan", () -> new TowerBlockCyanBlock());
	public static final RegistryObject<Block> TOWER_BLOCK_BROWN = REGISTRY.register("tower_block_brown", () -> new TowerBlockBrownBlock());
	public static final RegistryObject<Block> TOWER_BLOCK_LIGHT_BLUE = REGISTRY.register("tower_block_light_blue",
			() -> new TowerBlockLightBlueBlock());
	public static final RegistryObject<Block> TOWER_BLOCK_BLACK = REGISTRY.register("tower_block_black", () -> new TowerBlockBlackBlock());
	public static final RegistryObject<Block> TOWER_BLOCK_RED = REGISTRY.register("tower_block_red", () -> new TowerBlockRedBlock());
	public static final RegistryObject<Block> HAUNTED_WOOD = REGISTRY.register("haunted_wood", () -> new HauntedWoodBlock());
	public static final RegistryObject<Block> HAUNTED_LOG = REGISTRY.register("haunted_log", () -> new HauntedLogBlock());
	public static final RegistryObject<Block> HAUNTED_PLANKS = REGISTRY.register("haunted_planks", () -> new HauntedPlanksBlock());
	public static final RegistryObject<Block> HAUNTED_STAIRS = REGISTRY.register("haunted_stairs", () -> new HauntedStairsBlock());
	public static final RegistryObject<Block> HAUNTED_SLAB = REGISTRY.register("haunted_slab", () -> new HauntedSlabBlock());
	public static final RegistryObject<Block> HAUNTED_FENCE = REGISTRY.register("haunted_fence", () -> new HauntedFenceBlock());
	public static final RegistryObject<Block> HAUNTED_FENCE_GATE = REGISTRY.register("haunted_fence_gate", () -> new HauntedFenceGateBlock());
	public static final RegistryObject<Block> HAUNTED_PRESSURE_PLATE = REGISTRY.register("haunted_pressure_plate",
			() -> new HauntedPressurePlateBlock());
	public static final RegistryObject<Block> HAUNTED_BUTTON = REGISTRY.register("haunted_button", () -> new HauntedButtonBlock());
	public static final RegistryObject<Block> HAUNTED_WOOD_PILLAR = REGISTRY.register("haunted_wood_pillar", () -> new HauntedWoodPillarBlock());
	public static final RegistryObject<Block> HAUNTED_WOOD_LIGHT_PILLAR = REGISTRY.register("haunted_wood_light_pillar",
			() -> new HauntedWoodLightPillarBlock());
	public static final RegistryObject<Block> GHOST_HOUSE_FLOOR = REGISTRY.register("ghost_house_floor", () -> new GhostHouseFloorBlock());
	public static final RegistryObject<Block> HAUNTED_STONE = REGISTRY.register("haunted_stone", () -> new HauntedStoneBlock());
	public static final RegistryObject<Block> HAUNTED_STONE_WOODEN = REGISTRY.register("haunted_stone_wooden", () -> new HauntedStoneWoodenBlock());
	public static final RegistryObject<Block> VOLCANO_ROCK = REGISTRY.register("volcano_rock", () -> new VolcanoRockBlock());
	public static final RegistryObject<Block> VOLCANO_ROCK_STAIRS = REGISTRY.register("volcano_rock_stairs", () -> new VolcanoRockStairsBlock());
	public static final RegistryObject<Block> VOLCANO_ROCK_SLAB = REGISTRY.register("volcano_rock_slab", () -> new VolcanoRockSlabBlock());
	public static final RegistryObject<Block> VOLCANO_ROCK_WALL = REGISTRY.register("volcano_rock_wall", () -> new VolcanoRockWallBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_GRASS_BLOCK = REGISTRY.register("mushroom_kingdom_grass_block",
			() -> new MushroomKingdomGrassBlockBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_GRASS_BLOCK_STAIRS = REGISTRY.register("mushroom_kingdom_grass_block_stairs",
			() -> new MushroomKingdomGrassBlockStairsBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_GRASS_BLOCK_SLAB = REGISTRY.register("mushroom_kingdom_grass_block_slab",
			() -> new MushroomKingdomGrassBlockSlabBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_PATH_BLOCK = REGISTRY.register("mushroom_kingdom_path_block",
			() -> new MushroomKingdomPathBlockBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_PATH_BLOCK_STAIRS = REGISTRY.register("mushroom_kingdom_path_block_stairs",
			() -> new MushroomKingdomPathBlockStairsBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_PATH_BLOCK_SLAB = REGISTRY.register("mushroom_kingdom_path_block_slab",
			() -> new MushroomKingdomPathBlockSlabBlock());
	public static final RegistryObject<Block> SUPER_LEAF_TREE_LOG = REGISTRY.register("super_leaf_tree_log", () -> new SuperLeafTreeLogBlock());
	public static final RegistryObject<Block> SUPER_LEAF_TREE_STRIPE_LOG = REGISTRY.register("super_leaf_tree_stripe_log",
			() -> new SuperLeafTreeStripeLogBlock());
	public static final RegistryObject<Block> SUPER_LEAF_TREE_TAIL_LOG = REGISTRY.register("super_leaf_tree_tail_log",
			() -> new SuperLeafTreeTailLogBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_BLOCK = REGISTRY.register("mushroom_kingdom_castle_block",
			() -> new MushroomKingdomCastleBlockBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_DECORATIVE_BRICK = REGISTRY.register("mushroom_kingdom_castle_decorative_brick",
			() -> new MushroomKingdomCastleDecorativeBrickBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_WINDOW = REGISTRY.register("mushroom_kingdom_castle_window",
			() -> new MushroomKingdomCastleWindowBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_BLOCK_FENCE = REGISTRY.register("mushroom_kingdom_castle_block_fence",
			() -> new MushroomKingdomCastleBlockFenceBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_BLOCK_WALL = REGISTRY.register("mushroom_kingdom_castle_block_wall",
			() -> new MushroomKingdomCastleBlockWallBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_TILED_BRICK = REGISTRY.register("mushroom_kingdom_castle_tiled_brick",
			() -> new MushroomKingdomCastleTiledBrickBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_ROOF = REGISTRY.register("mushroom_kingdom_castle_roof",
			() -> new MushroomKingdomCastleRoofBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_ROOF_STAIRS = REGISTRY.register("mushroom_kingdom_castle_roof_stairs",
			() -> new MushroomKingdomCastleRoofStairsBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_ROOF_SLAB = REGISTRY.register("mushroom_kingdom_castle_roof_slab",
			() -> new MushroomKingdomCastleRoofSlabBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGOM_CASTLE_TILES = REGISTRY.register("mushroom_kingom_castle_tiles",
			() -> new MushroomKingomCastleTilesBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_TILES_STAIRS = REGISTRY.register("mushroom_kingdom_castle_tiles_stairs",
			() -> new MushroomKingdomCastleTilesStairsBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_TILES_SLAB = REGISTRY.register("mushroom_kingdom_castle_tiles_slab",
			() -> new MushroomKingdomCastleTilesSlabBlock());
	public static final RegistryObject<Block> RED_CARPET_STAIRS = REGISTRY.register("red_carpet_stairs", () -> new RedCarpetStairsBlock());
	public static final RegistryObject<Block> RED_CARPET_SLAB = REGISTRY.register("red_carpet_slab", () -> new RedCarpetSlabBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_BASEBOARD = REGISTRY.register("mushroom_kingdom_castle_baseboard",
			() -> new MushroomKingdomCastleBaseboardBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_TILED_BASEBOARD = REGISTRY.register("mushroom_kingdom_castle_tiled_baseboard",
			() -> new MushroomKingdomCastleTiledBaseboardBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_CARPETED_BASEBOARD = REGISTRY
			.register("mushroom_kingdom_castle_carpeted_baseboard", () -> new MushroomKingdomCastleCarpetedBaseboardBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_GREEN_WALLPAPER = REGISTRY.register("mushroom_kingdom_castle_green_wallpaper",
			() -> new MushroomKingdomCastleGreenWallpaperBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_GREEN_TOP_WALLPAPER = REGISTRY
			.register("mushroom_kingdom_castle_green_top_wallpaper", () -> new MushroomKingdomCastleGreenTopWallpaperBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_WALLPAPER = REGISTRY.register("mushroom_kingdom_castle_wallpaper",
			() -> new MushroomKingdomCastleWallpaperBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_CLOUD_WALLPAPER = REGISTRY.register("mushroom_kingdom_castle_cloud_wallpaper",
			() -> new MushroomKingdomCastleCloudWallpaperBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_DARK_WALLPAPER = REGISTRY.register("mushroom_kingdom_castle_dark_wallpaper",
			() -> new MushroomKingdomCastleDarkWallpaperBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_DARK_CLOUD_WALLPAPER = REGISTRY
			.register("mushroom_kingdom_castle_dark_cloud_wallpaper", () -> new MushroomKingdomCastleDarkCloudWallpaperBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_TILED_GREEN_WALLPAPER = REGISTRY
			.register("mushroom_kingdom_castle_tiled_green_wallpaper", () -> new MushroomKingdomCastleTiledGreenWallpaperBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_TILED_GREEN_TOP_WALLPAPER = REGISTRY
			.register("mushroom_kingdom_castle_tiled_green_top_wallpaper", () -> new MushroomKingdomCastleTiledGreenTopWallpaperBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_TILED_WALLPAPER = REGISTRY.register("mushroom_kingdom_castle_tiled_wallpaper",
			() -> new MushroomKingdomCastleTiledWallpaperBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_CARPETED_GREEN_WALLPAPER = REGISTRY
			.register("mushroom_kingdom_castle_carpeted_green_wallpaper", () -> new MushroomKingdomCastleCarpetedGreenWallpaperBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_CARPETED_GREEN_TOP_WALLPAPER = REGISTRY
			.register("mushroom_kingdom_castle_carpeted_green_top_wallpaper", () -> new MushroomKingdomCastleCarpetedGreenTopWallpaperBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_CARPETED_WALLPAPER = REGISTRY
			.register("mushroom_kingdom_castle_carpeted_wallpaper", () -> new MushroomKingdomCastleCarpetedWallpaperBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_WOODEN_BRICKS = REGISTRY.register("mushroom_kingdom_castle_wooden_bricks",
			() -> new MushroomKingdomCastleWoodenBricksBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_TILED_WOODEN_BRICKS = REGISTRY
			.register("mushroom_kingdom_castle_tiled_wooden_bricks", () -> new MushroomKingdomCastleTiledWoodenBricksBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_CARPETED_WOODEN_BRICKS = REGISTRY
			.register("mushroom_kingdom_castle_carpeted_wooden_bricks", () -> new MushroomKingdomCastleCarpetedWoodenBricksBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_STONE_FLOOR = REGISTRY.register("mushroom_kingdom_castle_stone_floor",
			() -> new MushroomKingdomCastleStoneFloorBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_STONE_FLOOR_SLAB = REGISTRY.register("mushroom_kingdom_castle_stone_floor_slab",
			() -> new MushroomKingdomCastleStoneFloorSlabBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_RAILING = REGISTRY.register("mushroom_kingdom_castle_railing",
			() -> new MushroomKingdomCastleRailingBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_BASEMENT_WALL = REGISTRY.register("mushroom_kingdom_castle_basement_wall",
			() -> new MushroomKingdomCastleBasementWallBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_FAKE_BASEMENT_WALL = REGISTRY
			.register("mushroom_kingdom_castle_fake_basement_wall", () -> new MushroomKingdomCastleFakeBasementWallBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_UPPER_TILES = REGISTRY.register("mushroom_kingdom_castle_upper_tiles",
			() -> new MushroomKingdomCastleUpperTilesBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_BLUE_WALLPAPER = REGISTRY.register("mushroom_kingdom_castle_blue_wallpaper",
			() -> new MushroomKingdomCastleBlueWallpaperBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_BLUE_TOP_WALLPAPER = REGISTRY
			.register("mushroom_kingdom_castle_blue_top_wallpaper", () -> new MushroomKingdomCastleBlueTopWallpaperBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_UPPER_WALLPAPER = REGISTRY.register("mushroom_kingdom_castle_upper_wallpaper",
			() -> new MushroomKingdomCastleUpperWallpaperBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_UPPER_STAR_WALLPAPER = REGISTRY
			.register("mushroom_kingdom_castle_upper_star_wallpaper", () -> new MushroomKingdomCastleUpperStarWallpaperBlock());
	public static final RegistryObject<Block> PEACHS_CASTLE_DOOR = REGISTRY.register("peachs_castle_door", () -> new PeachsCastleDoorBlock());
	public static final RegistryObject<Block> PEACHS_CASTLE_STAR_DOOR = REGISTRY.register("peachs_castle_star_door",
			() -> new PeachsCastleStarDoorBlock());
	public static final RegistryObject<Block> PEACHS_CASTLE_ONE_STAR_DOOR = REGISTRY.register("peachs_castle_one_star_door",
			() -> new PeachsCastleOneStarDoorBlock());
	public static final RegistryObject<Block> PEACHS_CASTLE_THREE_STAR_DOOR = REGISTRY.register("peachs_castle_three_star_door",
			() -> new PeachsCastleThreeStarDoorBlock());
	public static final RegistryObject<Block> PEACHES_CASTLE_LOCKED_DOOR = REGISTRY.register("peaches_castle_locked_door",
			() -> new PeachesCastleLockedDoorBlock());
	public static final RegistryObject<Block> PEACHS_CASTLE_PLANK_DOOR = REGISTRY.register("peachs_castle_plank_door",
			() -> new PeachsCastlePlankDoorBlock());
	public static final RegistryObject<Block> PEACHS_CASTLE_IRON_DOOR = REGISTRY.register("peachs_castle_iron_door",
			() -> new PeachsCastleIronDoorBlock());
	public static final RegistryObject<Block> BOWSER_ICON_BLOCK = REGISTRY.register("bowser_icon_block", () -> new BowserIconBlockBlock());
	public static final RegistryObject<Block> BOWSER_JR_ICON_BLOCK = REGISTRY.register("bowser_jr_icon_block", () -> new BowserJrIconBlockBlock());
	public static final RegistryObject<Block> RAINBOW_BLOCK = REGISTRY.register("rainbow_block", () -> new RainbowBlockBlock());
	public static final RegistryObject<Block> BOWSER_ICON_BLOCK_LAUGHING = REGISTRY.register("bowser_icon_block_laughing",
			() -> new BowserIconBlockLaughingBlock());
	public static final RegistryObject<Block> MUSHROOM_WORLD_VINE_GREEN = REGISTRY.register("mushroom_world_vine_green",
			() -> new MushroomWorldVineGreenBlock());
	public static final RegistryObject<Block> RAINBOW_BLOCK_2 = REGISTRY.register("rainbow_block_2", () -> new RainbowBlock2Block());
	public static final RegistryObject<Block> MUSHROOM_WORLD_VINE_ORANGE = REGISTRY.register("mushroom_world_vine_orange",
			() -> new MushroomWorldVineOrangeBlock());
	public static final RegistryObject<Block> RAINBOW_BLOCK_3 = REGISTRY.register("rainbow_block_3", () -> new RainbowBlock3Block());
	public static final RegistryObject<Block> MUSHROOM_WORLD_VINE_BLUE = REGISTRY.register("mushroom_world_vine_blue",
			() -> new MushroomWorldVineBlueBlock());
	public static final RegistryObject<Block> RAINBOW_BLOCK_4 = REGISTRY.register("rainbow_block_4", () -> new RainbowBlock4Block());
	public static final RegistryObject<Block> MUSHROOM_WORLD_VINE_WHITE = REGISTRY.register("mushroom_world_vine_white",
			() -> new MushroomWorldVineWhiteBlock());
	public static final RegistryObject<Block> RAINBOW_BLOCK_5 = REGISTRY.register("rainbow_block_5", () -> new RainbowBlock5Block());
	public static final RegistryObject<Block> CASTLE_STAINED_GLASS_WINDOW = REGISTRY.register("castle_stained_glass_window",
			() -> new CastleStainedGlassWindowBlock());
	public static final RegistryObject<Block> RAINBOW_BLOCK_6 = REGISTRY.register("rainbow_block_6", () -> new RainbowBlock6Block());
	public static final RegistryObject<Block> CASTLE_STAINED_GLASS_WINDOW_BORDERLESS = REGISTRY.register("castle_stained_glass_window_borderless",
			() -> new CastleStainedGlassWindowBorderlessBlock());
	public static final RegistryObject<Block> RAINBOW_BLOCK_7 = REGISTRY.register("rainbow_block_7", () -> new RainbowBlock7Block());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_SUN_CARPET = REGISTRY.register("mushroom_kingdom_castle_sun_carpet",
			() -> new MushroomKingdomCastleSunCarpetBlock());
	public static final RegistryObject<Block> CASTLE_THRONE = REGISTRY.register("castle_throne", () -> new CastleThroneBlock());
	public static final RegistryObject<Block> MUSHROOM_KINGDOM_CASTLE_COURTYARD_STATUE = REGISTRY.register("mushroom_kingdom_castle_courtyard_statue",
			() -> new MushroomKingdomCastleCourtyardStatueBlock());
	public static final RegistryObject<Block> DEACTIVATED_MECHA_KOOPA = REGISTRY.register("deactivated_mecha_koopa",
			() -> new DeactivatedMechaKoopaBlock());
	public static final RegistryObject<Block> BOB_OMB_BATTLEFIELD_PAINTING = REGISTRY.register("bob_omb_battlefield_painting",
			() -> new BobOmbBattlefieldPaintingBlock());
	public static final RegistryObject<Block> WHOMPS_FORTRESS_PAINTING = REGISTRY.register("whomps_fortress_painting",
			() -> new WhompsFortressPaintingBlock());
	public static final RegistryObject<Block> JOLLY_RODGER_BAY_PAINTING = REGISTRY.register("jolly_rodger_bay_painting",
			() -> new JollyRodgerBayPaintingBlock());
	public static final RegistryObject<Block> COOL_COOL_MOUNTAIN_PAINTING = REGISTRY.register("cool_cool_mountain_painting",
			() -> new CoolCoolMountainPaintingBlock());
	public static final RegistryObject<Block> LETHAL_LAVA_LAND_PAINTING = REGISTRY.register("lethal_lava_land_painting",
			() -> new LethalLavaLandPaintingBlock());
	public static final RegistryObject<Block> WET_DRY_WORLD_PAINTING = REGISTRY.register("wet_dry_world_painting",
			() -> new WetDryWorldPaintingBlock());
	public static final RegistryObject<Block> TINY_HUGE_ISLAND_PAINTING = REGISTRY.register("tiny_huge_island_painting",
			() -> new TinyHugeIslandPaintingBlock());
	public static final RegistryObject<Block> TALL_TALL_MOUNTAIN_PAINTING = REGISTRY.register("tall_tall_mountain_painting",
			() -> new TallTallMountainPaintingBlock());
	public static final RegistryObject<Block> PEACH_PAINTING = REGISTRY.register("peach_painting", () -> new PeachPaintingBlock());
	public static final RegistryObject<Block> BOWSER_PAINTING = REGISTRY.register("bowser_painting", () -> new BowserPaintingBlock());
	public static final RegistryObject<Block> WARP_PIPE = REGISTRY.register("warp_pipe", () -> new WarpPipeBlock());
	public static final RegistryObject<Block> PIPE = REGISTRY.register("pipe", () -> new PipeBlock());
	public static final RegistryObject<Block> P_SWITCH = REGISTRY.register("p_switch", () -> new PSwitchBlock());
	public static final RegistryObject<Block> ON_BLOCK = REGISTRY.register("on_block", () -> new OnBlockBlock());
	public static final RegistryObject<Block> OFF_BLOCK = REGISTRY.register("off_block", () -> new OffBlockBlock());
	public static final RegistryObject<Block> P_BLOCK = REGISTRY.register("p_block", () -> new PBlockBlock());
	public static final RegistryObject<Block> P_BLOCK_OUTLINE = REGISTRY.register("p_block_outline", () -> new PBlockOutlineBlock());
	public static final RegistryObject<Block> BOWSER_STATUE = REGISTRY.register("bowser_statue", () -> new BowserStatueBlock());
	public static final RegistryObject<Block> TRIANGLE_BLOCK = REGISTRY.register("triangle_block", () -> new TriangleBlockBlock());
	public static final RegistryObject<Block> CHAIN_LINK_FENCE = REGISTRY.register("chain_link_fence", () -> new ChainLinkFenceBlock());
	public static final RegistryObject<Block> MESSAGE_BLOCK = REGISTRY.register("message_block", () -> new MessageBlockBlock());
	public static final RegistryObject<Block> WOOD_POST = REGISTRY.register("wood_post", () -> new WoodPostBlock());
	public static final RegistryObject<Block> WOODEN_CRATE = REGISTRY.register("wooden_crate", () -> new WoodenCrateBlock());
	public static final RegistryObject<Block> BUILDER_BOX_MARIO = REGISTRY.register("builder_box_mario", () -> new BuilderBoxMarioBlock());
	public static final RegistryObject<Block> POW_BLOCK_BLOCK = REGISTRY.register("pow_block_block", () -> new PowBlockBlockBlock());
	public static final RegistryObject<Block> BUILDER_BOX_LUIGI = REGISTRY.register("builder_box_luigi", () -> new BuilderBoxLuigiBlock());
	public static final RegistryObject<Block> RED_POW_BLOCK_BLOCK = REGISTRY.register("red_pow_block_block", () -> new RedPowBlockBlockBlock());
	public static final RegistryObject<Block> BUILDER_BOX_TOAD = REGISTRY.register("builder_box_toad", () -> new BuilderBoxToadBlock());
	public static final RegistryObject<Block> BUILDER_BOX_TOADETTE = REGISTRY.register("builder_box_toadette", () -> new BuilderBoxToadetteBlock());
	public static final RegistryObject<Block> BUILDER_BOX_PEACH = REGISTRY.register("builder_box_peach", () -> new BuilderBoxPeachBlock());
	public static final RegistryObject<Block> BUILDER_BOX_YOSHI = REGISTRY.register("builder_box_yoshi", () -> new BuilderBoxYoshiBlock());
	public static final RegistryObject<Block> BUILDER_BOX_DAISY = REGISTRY.register("builder_box_daisy", () -> new BuilderBoxDaisyBlock());
	public static final RegistryObject<Block> BUILDER_BOX_WARIO = REGISTRY.register("builder_box_wario", () -> new BuilderBoxWarioBlock());
	public static final RegistryObject<Block> BUILDER_BOX_WALUIGI = REGISTRY.register("builder_box_waluigi", () -> new BuilderBoxWaluigiBlock());
	public static final RegistryObject<Block> BUILDER_BOX_ROSALINA = REGISTRY.register("builder_box_rosalina", () -> new BuilderBoxRosalinaBlock());
	public static final RegistryObject<Block> IRON_CRATE = REGISTRY.register("iron_crate", () -> new IronCrateBlock());
	public static final RegistryObject<Block> IRON_BOWSER_CRATE = REGISTRY.register("iron_bowser_crate", () -> new IronBowserCrateBlock());
	public static final RegistryObject<Block> BILL_BLASTER = REGISTRY.register("bill_blaster", () -> new BillBlasterBlock());
	public static final RegistryObject<Block> COIN = REGISTRY.register("coin", () -> new CoinBlock());
	public static final RegistryObject<Block> STAR_COIN = REGISTRY.register("star_coin", () -> new StarCoinBlock());
	public static final RegistryObject<Block> ICE_BRICK_BLOCK = REGISTRY.register("ice_brick_block", () -> new IceBrickBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CoralBlock.registerRenderLayer();
			MushroomKingdomTreeLogBlock.registerRenderLayer();
			MushroomWorldUnderwaterRingPinkBlock.registerRenderLayer();
			MushroomWorldUnderwaterRingWhiteBlock.registerRenderLayer();
			CloudBlockBlock.registerRenderLayer();
			RainyCloudBlockBlock.registerRenderLayer();
			LogBridgeBlock.registerRenderLayer();
			AirshipWindowYellowBlock.registerRenderLayer();
			AirshipWindowBrownBlock.registerRenderLayer();
			AirshipWindowLightBlueBlock.registerRenderLayer();
			AirshipWindowBlueBlock.registerRenderLayer();
			AirshipWindowGreenBlock.registerRenderLayer();
			FluffyCloudBlockBlock.registerRenderLayer();
			FluffyCloudBlockBlueBlock.registerRenderLayer();
			FluffyCloudBlockPinkBlock.registerRenderLayer();
			GhostHouseDoorBlock.registerRenderLayer();
			MushroomKingdomCastleWindowBlock.registerRenderLayer();
			MushroomKingdomCastleRailingBlock.registerRenderLayer();
			PeachsCastleDoorBlock.registerRenderLayer();
			PeachsCastleStarDoorBlock.registerRenderLayer();
			PeachsCastleOneStarDoorBlock.registerRenderLayer();
			PeachsCastleThreeStarDoorBlock.registerRenderLayer();
			PeachesCastleLockedDoorBlock.registerRenderLayer();
			PeachsCastlePlankDoorBlock.registerRenderLayer();
			PeachsCastleIronDoorBlock.registerRenderLayer();
			MushroomWorldVineGreenBlock.registerRenderLayer();
			MushroomWorldVineOrangeBlock.registerRenderLayer();
			MushroomWorldVineBlueBlock.registerRenderLayer();
			MushroomWorldVineWhiteBlock.registerRenderLayer();
			CastleStainedGlassWindowBlock.registerRenderLayer();
			CastleStainedGlassWindowBorderlessBlock.registerRenderLayer();
			MushroomKingdomCastleSunCarpetBlock.registerRenderLayer();
			CastleThroneBlock.registerRenderLayer();
			MushroomKingdomCastleCourtyardStatueBlock.registerRenderLayer();
			DeactivatedMechaKoopaBlock.registerRenderLayer();
			BobOmbBattlefieldPaintingBlock.registerRenderLayer();
			WhompsFortressPaintingBlock.registerRenderLayer();
			JollyRodgerBayPaintingBlock.registerRenderLayer();
			CoolCoolMountainPaintingBlock.registerRenderLayer();
			LethalLavaLandPaintingBlock.registerRenderLayer();
			WetDryWorldPaintingBlock.registerRenderLayer();
			TinyHugeIslandPaintingBlock.registerRenderLayer();
			TallTallMountainPaintingBlock.registerRenderLayer();
			PeachPaintingBlock.registerRenderLayer();
			BowserPaintingBlock.registerRenderLayer();
			WarpPipeBlock.registerRenderLayer();
			PipeBlock.registerRenderLayer();
			PSwitchBlock.registerRenderLayer();
			PBlockBlock.registerRenderLayer();
			PBlockOutlineBlock.registerRenderLayer();
			BowserStatueBlock.registerRenderLayer();
			ChainLinkFenceBlock.registerRenderLayer();
			BillBlasterBlock.registerRenderLayer();
			CoinBlock.registerRenderLayer();
			StarCoinBlock.registerRenderLayer();
		}
	}
}
