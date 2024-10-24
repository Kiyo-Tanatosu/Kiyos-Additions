package com.kiyotanatosu.kiyosadditions.kiyosadditions.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup KIYOSADDITIONS_GROUP = new ItemGroup("KiyosAdditionsTab") {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.BANANA.get());
        }
    };

}
