package net.iiNani.dragonaddons.item.material;

import net.iiNani.dragonaddons.item.ModItems;
import net.minecraft.recipe.Ingredient;

public class LimeToolMaterial implements net.minecraft.item.ToolMaterial {
    public static final LimeToolMaterial INSTANCE = new LimeToolMaterial();

    @Override
    public int getDurability() {
        return 3000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12;
    }

    @Override
    public float getAttackDamage() {
        return 9;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 14;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.LIME_DRAGON_FRAGMENT);
    }
}
