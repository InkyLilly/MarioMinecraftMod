
package net.mcreator.supermario.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.supermario.init.SuperMarioModFluids;

public class GoldWaterBlock extends LiquidBlock {
	public GoldWaterBlock() {
		super(() -> (FlowingFluid) SuperMarioModFluids.GOLD_WATER.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
