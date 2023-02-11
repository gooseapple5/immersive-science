package com.goose.immersivescience;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

public class ModTabInit {
    public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length, ImmersiveScience.MOD_ID);
    //Create custom item tab for our mod
    public static class ModCreativeTab extends CreativeModeTab {
        ModCreativeTab(int index, String label) {
            super(index,label);
        }

        @Override
        public ItemStack makeIcon(){
            return new ItemStack((ItemLike) ItemInit.COBALT_ITEM.get());
        }
    }
}
