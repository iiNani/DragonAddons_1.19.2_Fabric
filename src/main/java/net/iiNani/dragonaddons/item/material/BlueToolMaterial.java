package net.iiNani.dragonaddons.item.material;

import net.iiNani.dragonaddons.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class BlueToolMaterial implements ToolMaterial {
    public static final BlueToolMaterial INSTANCE = new BlueToolMaterial();

    @Override
    public int getDurability() {
        return 5437;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 18;
    }

    @Override
    public float getAttackDamage() {
        return 24;
    }

    @Override
    public int getMiningLevel() {
        return 8;
    }

    @Override
    public int getEnchantability() {
        return 40;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.BLUE_DRAGON_FRAGMENT);
    }
}
