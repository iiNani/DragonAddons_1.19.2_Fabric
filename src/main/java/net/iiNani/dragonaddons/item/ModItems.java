package net.iiNani.dragonaddons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.iiNani.dragonaddons.DragonAddons;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems{
    // Dragon Fragments
    public static final Item NULL_DRAGON_FRAGMENT = registerItem("null_dragon_fragment",
            new Item(new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));
    public static final Item LIME_DRAGON_FRAGMENT = registerItem("lime_dragon_fragment",
            new Item(new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));
    public static final Item GOLD_DRAGON_FRAGMENT = registerItem("gold_dragon_fragment",
            new Item(new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));
    public static final Item GRAY_DRAGON_FRAGMENT = registerItem("gray_dragon_fragment",
            new Item(new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));
    public static final Item BLUE_DRAGON_FRAGMENT = registerItem("blue_dragon_fragment",
            new Item(new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));
    public static final Item PURPLE_DRAGON_FRAGMENT = registerItem("purple_dragon_fragment",
            new Item(new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));
    public static final Item RED_DRAGON_FRAGMENT = registerItem("red_dragon_fragment",
            new Item(new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));
    public static final Item ORANGE_DRAGON_FRAGMENT = registerItem("orange_dragon_fragment",
            new Item(new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));

    // Dragon Shards
    public static final Item LIME_DRAGON_SHARD = registerItem("lime_dragon_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));
    public static final Item GOLD_DRAGON_SHARD = registerItem("gold_dragon_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));
    public static final Item GRAY_DRAGON_SHARD = registerItem("gray_dragon_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));
    public static final Item BLUE_DRAGON_SHARD = registerItem("blue_dragon_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));
    public static final Item PURPLE_DRAGON_SHARD = registerItem("purple_dragon_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));
    public static final Item RED_DRAGON_SHARD = registerItem("red_dragon_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));
    public static final Item ORANGE_DRAGON_SHARD = registerItem("orange_dragon_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));

    // Miscellaneous Items
    public static final Item DRAGON_SPAWN_EGG = registerItem("dragon_spawn_egg",
            new SpawnEggItem(EntityType.ENDER_DRAGON, 65793, 9699539, new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DragonAddons.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        DragonAddons.LOGGER.debug("Registering Mod Items for " + DragonAddons.MOD_ID);
    }
}
