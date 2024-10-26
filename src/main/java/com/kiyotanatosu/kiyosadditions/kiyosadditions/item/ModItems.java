package com.kiyotanatosu.kiyosadditions.kiyosadditions.item;

import com.kiyotanatosu.kiyosadditions.KiyosAdditions;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KiyosAdditions.MOD_ID);

    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties().group(ModItemGroup.KIYOSADDITIONS_GROUP)));

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.KIYOSADDITIONS_GROUP)));

    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword",
            () -> new SwordItem(ModItemTier.PLATINUM, 3, -2.4f,
                    new Item.Properties().group(ModItemGroup.KIYOSADDITIONS_GROUP)));

    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe",
            () -> new AxeItem(ModItemTier.PLATINUM, 6, -3.1f,
                    new Item.Properties().group(ModItemGroup.KIYOSADDITIONS_GROUP)));

    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",
            () -> new PickaxeItem(ModItemTier.PLATINUM, 1, -2.8f,
                    new Item.Properties().group(ModItemGroup.KIYOSADDITIONS_GROUP)));

    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",
            () -> new ShovelItem(ModItemTier.PLATINUM, 1.5f, -3f,
                    new Item.Properties().group(ModItemGroup.KIYOSADDITIONS_GROUP)));

    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe",
            () -> new HoeItem(ModItemTier.PLATINUM, -2, -1f,
                    new Item.Properties().group(ModItemGroup.KIYOSADDITIONS_GROUP)));

    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet",
            () -> new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.KIYOSADDITIONS_GROUP)));

    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",
            () -> new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.KIYOSADDITIONS_GROUP)));

    public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings",
            () -> new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.KIYOSADDITIONS_GROUP)));

    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots",
            () -> new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.KIYOSADDITIONS_GROUP)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
