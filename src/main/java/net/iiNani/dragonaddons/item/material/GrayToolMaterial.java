package net.iiNani.dragonaddons.item.material;

import net.iiNani.dragonaddons.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GrayToolMaterial implements ToolMaterial {
    public static final GrayToolMaterial INSTANCE = new GrayToolMaterial();

    @Override
    public int getDurability() {
        return 10161;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 16;
    }

    @Override
    public float getAttackDamage() {
        return 19;
    }

    @Override
    public int getMiningLevel() {
        return 7;
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.GRAY_DRAGON_FRAGMENT);
    }
}
