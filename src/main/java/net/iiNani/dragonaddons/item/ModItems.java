package net.iiNani.dragonaddons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.iiNani.dragonaddons.DragonAddons;
import net.iiNani.dragonaddons.item.custom.CustomAxeItem;
import net.iiNani.dragonaddons.item.custom.CustomHoeItem;
import net.iiNani.dragonaddons.item.custom.CustomPickaxeItem;
import net.iiNani.dragonaddons.item.material.*;
import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
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

    // Weapons and Tools
        // Lime Dragon Tools
        public static ToolItem LIME_DRAGON_SWORD = registerToolItem("lime_dragon_sword",
                new SwordItem(LimeToolMaterial.INSTANCE, 5, -1.8F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem LIME_DRAGON_AXE = registerToolItem("lime_dragon_axe",
                new CustomAxeItem(LimeToolMaterial.INSTANCE, 7, -2.2F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem LIME_DRAGON_PICKAXE = registerToolItem("lime_dragon_pickaxe",
                new CustomPickaxeItem(LimeToolMaterial.INSTANCE, 3, -2.8F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem LIME_DRAGON_SHOVEL = registerToolItem("lime_dragon_shovel",
                new ShovelItem(LimeToolMaterial.INSTANCE, 3, -3.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem LIME_DRAGON_HOE = registerToolItem("lime_dragon_hoe",
                new CustomHoeItem(LimeToolMaterial.INSTANCE, -9, 0.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));

        // Gold Dragon Tools
        public static ToolItem GOLD_DRAGON_SWORD = registerToolItem("gold_dragon_sword",
                new SwordItem(GoldToolMaterial.INSTANCE, 5, -2.4F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem GOLD_DRAGON_AXE = registerToolItem("gold_dragon_axe",
                new CustomAxeItem(GoldToolMaterial.INSTANCE, 7, -3.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem GOLD_DRAGON_PICKAXE = registerToolItem("gold_dragon_pickaxe",
                new CustomPickaxeItem(GoldToolMaterial.INSTANCE, 3, -2.8F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem GOLD_DRAGON_SHOVEL = registerToolItem("gold_dragon_shovel",
                new ShovelItem(GoldToolMaterial.INSTANCE, 3, -3.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem GOLD_DRAGON_HOE = registerToolItem("gold_dragon_hoe",
                new CustomHoeItem(GoldToolMaterial.INSTANCE, -14, 0.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));

        // Gray Dragon Tools
        public static ToolItem GRAY_DRAGON_SWORD = registerToolItem("gray_dragon_sword",
                new SwordItem(GrayToolMaterial.INSTANCE, 5, -2.4F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem GRAY_DRAGON_AXE = registerToolItem("gray_dragon_axe",
                new CustomAxeItem(GrayToolMaterial.INSTANCE, 7, -3.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem GRAY_DRAGON_PICKAXE = registerToolItem("gray_dragon_pickaxe",
                new CustomPickaxeItem(GrayToolMaterial.INSTANCE, 3, -2.8F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem GRAY_DRAGON_SHOVEL = registerToolItem("gray_dragon_shovel",
                new ShovelItem(GrayToolMaterial.INSTANCE, 3, -3.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem GRAY_DRAGON_HOE = registerToolItem("gray_dragon_hoe",
                new CustomHoeItem(GrayToolMaterial.INSTANCE, -19, 0.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));

        // Blue Dragon Tools
        public static ToolItem BLUE_DRAGON_SWORD = registerToolItem("blue_dragon_sword",
                new SwordItem(BlueToolMaterial.INSTANCE, 5, -2.4F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem BLUE_DRAGON_AXE = registerToolItem("blue_dragon_axe",
                new CustomAxeItem(BlueToolMaterial.INSTANCE, 7, -3.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem BLUE_DRAGON_PICKAXE = registerToolItem("blue_dragon_pickaxe",
                new CustomPickaxeItem(BlueToolMaterial.INSTANCE, 3, -2.8F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem BLUE_DRAGON_SHOVEL = registerToolItem("blue_dragon_shovel",
                new ShovelItem(BlueToolMaterial.INSTANCE, 3, -3.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem BLUE_DRAGON_HOE = registerToolItem("blue_dragon_hoe",
                new CustomHoeItem(BlueToolMaterial.INSTANCE, -24, 0.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));

        // Purple Dragon Tools
        public static ToolItem PURPLE_DRAGON_SWORD = registerToolItem("purple_dragon_sword",
                new SwordItem(PurpleToolMaterial.INSTANCE, 5, -2.4F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem PURPLE_DRAGON_AXE = registerToolItem("purple_dragon_axe",
                new CustomAxeItem(PurpleToolMaterial.INSTANCE, 7, -3.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem PURPLE_DRAGON_PICKAXE = registerToolItem("purple_dragon_pickaxe",
                new CustomPickaxeItem(PurpleToolMaterial.INSTANCE, 3, -2.8F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem PURPLE_DRAGON_SHOVEL = registerToolItem("purple_dragon_shovel",
                new ShovelItem(PurpleToolMaterial.INSTANCE, 3, -3.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem PURPLE_DRAGON_HOE = registerToolItem("purple_dragon_hoe",
                new CustomHoeItem(PurpleToolMaterial.INSTANCE, -29, 0.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        
        // Red Dragon Tools
        public static ToolItem RED_DRAGON_SWORD = registerToolItem("red_dragon_sword",
                new SwordItem(RedToolMaterial.INSTANCE, 5, -2.4F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem RED_DRAGON_AXE = registerToolItem("red_dragon_axe",
                new CustomAxeItem(RedToolMaterial.INSTANCE, 7, -3.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem RED_DRAGON_PICKAXE = registerToolItem("red_dragon_pickaxe",
                new CustomPickaxeItem(RedToolMaterial.INSTANCE, 3, -2.8F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem RED_DRAGON_SHOVEL = registerToolItem("red_dragon_shovel",
                new ShovelItem(RedToolMaterial.INSTANCE, 3, -3.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem RED_DRAGON_HOE = registerToolItem("red_dragon_hoe",
                new CustomHoeItem(RedToolMaterial.INSTANCE, -46, 0.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        
        // Orange Dragon Tools
        public static ToolItem ORANGE_DRAGON_SWORD = registerToolItem("orange_dragon_sword",
                new SwordItem(OrangeToolMaterial.INSTANCE, 5, -1.8F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem ORANGE_DRAGON_AXE = registerToolItem("orange_dragon_axe",
                new CustomAxeItem(OrangeToolMaterial.INSTANCE, 7, -2.2F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem ORANGE_DRAGON_PICKAXE = registerToolItem("orange_dragon_pickaxe",
                new CustomPickaxeItem(OrangeToolMaterial.INSTANCE, 3, -2.8F, 
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem ORANGE_DRAGON_SHOVEL = registerToolItem("orange_dragon_shovel",
                new ShovelItem(OrangeToolMaterial.INSTANCE, 3, -3.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));
        public static ToolItem ORANGE_DRAGON_HOE = registerToolItem("orange_dragon_hoe",
                new CustomHoeItem(OrangeToolMaterial.INSTANCE, -47, 0.0F,
                new Item.Settings().group(ModItemGroup.LIME_DRAGON_SWORD)));


    // Miscellaneous Items
    public static final Item DRAGON_SPAWN_EGG = registerItem("dragon_spawn_egg",
            new SpawnEggItem(EntityType.ENDER_DRAGON, 65793, 9699539, new FabricItemSettings().group(ModItemGroup.LIME_DRAGON_FRAGMENT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DragonAddons.MOD_ID, name), item);
    }

    private static ToolItem registerToolItem(String name, ToolItem toolItem) {
        return Registry.register(Registry.ITEM, new Identifier(DragonAddons.MOD_ID, name), toolItem);
    }

    public static void RegisterModItems() {
        DragonAddons.LOGGER.debug("Registering Mod Items for " + DragonAddons.MOD_ID);
    }
}
