package net.iiNani.dragonaddons.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.iiNani.dragonaddons.DragonAddons;
import net.iiNani.dragonaddons.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup LIME_DRAGON_FRAGMENT = FabricItemGroupBuilder.build(
            new Identifier(DragonAddons.MOD_ID, "lime_dragon_fragment"), () -> new ItemStack(ModItems.LIME_DRAGON_FRAGMENT));
    public static final ItemGroup LIME_DRAGON_SWORD = FabricItemGroupBuilder.build(
            new Identifier(DragonAddons.MOD_ID, "lime_dragon_sword"),() -> new ItemStack(ModItems.LIME_DRAGON_SWORD));
    public static final ItemGroup DRAGON_DRY_EGG_BLOCK = FabricItemGroupBuilder.build(
            new Identifier(DragonAddons.MOD_ID, "dragon_dry_egg_block"),() -> new ItemStack(ModBlocks.DRAGON_DRY_EGG_BLOCK));
}
