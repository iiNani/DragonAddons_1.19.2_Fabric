package net.iiNani.dragonaddons.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.iiNani.dragonaddons.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier DRAGON_ID
            = new Identifier("minecraft", "entities/ender_dragon");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (DRAGON_ID.equals(id)) {
                LootPool.Builder nullFragmentBuilder = LootPool.builder()
                        .bonusRolls(UniformLootNumberProvider.create(0, 5))
                        .rolls(ConstantLootNumberProvider.create(5))
                        .conditionally(RandomChanceLootCondition.builder(1f))
                        .with(ItemEntry.builder(ModItems.NULL_DRAGON_FRAGMENT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(nullFragmentBuilder.build());

                LootPool.Builder limeShardBuilder = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0, 2))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.LIME_DRAGON_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(limeShardBuilder.build());

                LootPool.Builder goldShardBuilder = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0, 2))
                        .conditionally(RandomChanceLootCondition.builder(0.04f))
                        .with(ItemEntry.builder(ModItems.GOLD_DRAGON_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(goldShardBuilder.build());

                LootPool.Builder grayShardBuilder = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0, 2))
                        .conditionally(RandomChanceLootCondition.builder(0.04f))
                        .with(ItemEntry.builder(ModItems.GRAY_DRAGON_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(grayShardBuilder.build());

                LootPool.Builder blueShardBuilder = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0, 2))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(ModItems.BLUE_DRAGON_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(blueShardBuilder.build());

                LootPool.Builder purpleShardBuilder = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0, 2))
                        .conditionally(RandomChanceLootCondition.builder(0.01f))
                        .with(ItemEntry.builder(ModItems.PURPLE_DRAGON_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(purpleShardBuilder.build());

                LootPool.Builder redShardBuilder = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0, 2))
                        .conditionally(RandomChanceLootCondition.builder(0.01f))
                        .with(ItemEntry.builder(ModItems.RED_DRAGON_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(redShardBuilder.build());

                LootPool.Builder orangeShardBuilder = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0, 2))
                        .conditionally(RandomChanceLootCondition.builder(0.001f))
                        .with(ItemEntry.builder(ModItems.ORANGE_DRAGON_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(orangeShardBuilder.build());
            }
        });
    }
}
