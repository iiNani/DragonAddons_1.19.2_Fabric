package net.iiNani.dragonaddons.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.iiNani.dragonaddons.DragonAddons;
import net.iiNani.dragonaddons.block.custom.IronwoodLog;
import net.iiNani.dragonaddons.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block DRAGON_DRY_EGG_BLOCK = registerBlock("dragon_dry_egg_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.LIME_DRAGON_FRAGMENT);
    public static final Block IRONWOOD_LOG = registerBlock("ironwood_log",
            new IronwoodLog(FabricBlockSettings.of(Material.WOOD).strength(2f)), ModItemGroup.LIME_DRAGON_FRAGMENT);
    public static final Block IRONWOOD_PLANKS = registerBlock("ironwood_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2f)), ModItemGroup.LIME_DRAGON_FRAGMENT);
    public static final Block IRONWOOD_STRIPPED_PLANKS = registerBlock("ironwood_stripped_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2f)), ModItemGroup.LIME_DRAGON_FRAGMENT);
    public static final Block IRONWOOD_STRIPPED_LOG = registerStrippableBlock("ironwood_stripped_log", IRONWOOD_LOG,
            new IronwoodLog(FabricBlockSettings.of(Material.WOOD).strength(2f)), ModItemGroup.LIME_DRAGON_FRAGMENT);


    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(DragonAddons.MOD_ID, name), block);
    }

    private static Block registerStrippableBlock(String name, Block block, Block strippedBlock, ItemGroup tab){
        StrippableBlockRegistry.register(block, strippedBlock);
        registerBlockItem(name, strippedBlock, tab);
        return Registry.register(Registry.BLOCK, new Identifier(DragonAddons.MOD_ID, name), strippedBlock);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(DragonAddons.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        DragonAddons.LOGGER.debug("Registering ModBlocks for " + DragonAddons.MOD_ID);
    }
}
