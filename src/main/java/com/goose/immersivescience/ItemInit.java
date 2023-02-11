package com.goose.immersivescience;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ImmersiveScience.MOD_ID);

    //Register Items
    public static final RegistryObject<BlockItem> COBALT_ITEM = ITEMS.register("cobalt_ore", () -> new BlockItem(BlockInit.COBALT_BLOCK.get(), new Item.Properties().tab(ModTabInit.instance)));

    public static final RegistryObject<Item> COBALT_CHUNK = ITEMS.register("cobalt_chunk",
            () -> new Item(new Item.Properties().tab(ModTabInit.instance))
    );
}
