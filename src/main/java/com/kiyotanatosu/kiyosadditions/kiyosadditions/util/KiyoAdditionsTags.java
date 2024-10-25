package com.kiyotanatosu.kiyosadditions.kiyosadditions.util;

import com.kiyotanatosu.kiyosadditions.KiyosAdditions;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class KiyoAdditionsTags {

    public static class Blocks {

        //public static final Tags.IOptionalNamedTag<Block> PLATINUM_ORE =


        private static Tags.IOptionalNamedTag<Block> createTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(KiyosAdditions.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }



    public static class Items {

        public static final Tags.IOptionalNamedTag<Item> PLATINUM_INGOT = createForgeTag("ingots/platinum_ingot");

        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(KiyosAdditions.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }

}
