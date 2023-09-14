
package net.mcreator.supermario.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.supermario.init.SuperMarioModFluids;

public class PoisonWaterBlock extends LiquidBlock {
	public PoisonWaterBlock() {
		super(() -> (FlowingFluid) SuperMarioModFluids.POISON_WATER.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f)

		);
	}
}
