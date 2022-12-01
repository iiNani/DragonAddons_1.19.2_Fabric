package net.iiNani.dragonaddons.item.material;

import net.iiNani.dragonaddons.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class LimeToolMaterial implements ToolMaterial {
    public static final LimeToolMaterial INSTANCE = new LimeToolMaterial();

    @Override
    public int getDurability() {
        return 3432;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 26;
    }

    @Override
    public float getAttackDamage() {
        return 9;
    }

    @Override
    public int getMiningLevel() {
        return 5;
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
