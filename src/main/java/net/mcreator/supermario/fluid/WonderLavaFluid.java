
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

public abstract class WonderLavaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(SuperMarioModFluids.WONDER_LAVA, SuperMarioModFluids.FLOWING_WONDER_LAVA,
			FluidAttributes.builder(new ResourceLocation("super_mario:blocks/wonderlava"), new ResourceLocation("super_mario:blocks/wonderlava"))

	).explosionResistance(100f).canMultiply()

			.bucket(SuperMarioModItems.WONDER_LAVA_BUCKET).block(() -> (LiquidBlock) SuperMarioModBlocks.WONDER_LAVA.get());

	private WonderLavaFluid() {
		super(PROPERTIES);
	}

	public static class Source extends WonderLavaFluid {
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

	public static class Flowing extends WonderLavaFluid {
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
