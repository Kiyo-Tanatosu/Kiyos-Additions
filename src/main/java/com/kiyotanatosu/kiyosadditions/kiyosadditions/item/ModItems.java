package com.kiyotanatosu.kiyosadditions.kiyosadditions.item;

import com.kiyotanatosu.kiyosadditions.KiyosAdditions;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KiyosAdditions.MOD_ID);

    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties().group(ModItemGroup.KIYOSADDITIONS_GROUP)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
