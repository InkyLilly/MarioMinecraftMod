
package net.mcreator.supermario.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.supermario.init.SuperMarioModItems;
import net.mcreator.supermario.init.SuperMarioModFluids;
import net.mcreator.supermario.init.SuperMarioModBlocks;

public abstract class GoldWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(SuperMarioModFluids.GOLD_WATER, SuperMarioModFluids.FLOWING_GOLD_WATER,
			FluidAttributes.builder(new ResourceLocation("super_mario:blocks/goldwater"), new ResourceLocation("super_mario:blocks/goldwater"))

	).explosionResistance(100f).canMultiply()

			.bucket(SuperMarioModItems.GOLD_WATER_BUCKET).block(() -> (LiquidBlock) SuperMarioModBlocks.GOLD_WATER.get());

	private GoldWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends GoldWaterFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends GoldWaterFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
