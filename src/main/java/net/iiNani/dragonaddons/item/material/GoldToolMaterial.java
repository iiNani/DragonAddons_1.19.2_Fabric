package net.iiNani.dragonaddons.item.material;

import net.iiNani.dragonaddons.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GoldToolMaterial implements ToolMaterial {
    public static final GoldToolMaterial INSTANCE = new GoldToolMaterial();

    @Override
    public int getDurability() {
        return 6078;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 16;
    }

    @Override
    public float getAttackDamage() {
        return 14;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 16;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.GOLD_DRAGON_FRAGMENT);
    }
}
