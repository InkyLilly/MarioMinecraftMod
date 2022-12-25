
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supermario.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SuperMarioModTabs {
	public static CreativeModeTab TAB_MARIO_BLOCKS;
	public static CreativeModeTab TAB_MARIO_ITEMS;
	public static CreativeModeTab TAB_MARIO_ENTITIES;
	public static CreativeModeTab TAB_MARIO_GIMMICK_BLOCKS;
	public static CreativeModeTab TAB_MARIO_DECORATION;

	public static void load() {
		TAB_MARIO_BLOCKS = new CreativeModeTab("tabmario_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SuperMarioModBlocks.BRICK_BLOCK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MARIO_ITEMS = new CreativeModeTab("tabmario_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SuperMarioModItems.SUPER_MUSHROOM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MARIO_ENTITIES = new CreativeModeTab("tabmario_entities") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SuperMarioModItems.GOOMBAICON.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MARIO_GIMMICK_BLOCKS = new CreativeModeTab("tabmario_gimmick_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SuperMarioModBlocks.ON_BLOCK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MARIO_DECORATION = new CreativeModeTab("tabmario_decoration") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SuperMarioModBlocks.CASTLE_STAINED_GLASS_WINDOW_BORDERLESS.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
