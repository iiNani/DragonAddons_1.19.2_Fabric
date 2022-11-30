package net.iiNani.dragonaddons.item.material;

import net.iiNani.dragonaddons.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class OrangeToolMaterial implements ToolMaterial {
    public static final OrangeToolMaterial INSTANCE = new OrangeToolMaterial();

    @Override
    public int getDurability() {
        return 12948;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 22;
    }

    @Override
    public float getAttackDamage() {
        return 47;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 40;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.LIME_DRAGON_FRAGMENT, ModItems.GRAY_DRAGON_FRAGMENT,
                ModItems.GOLD_DRAGON_FRAGMENT, ModItems.BLUE_DRAGON_FRAGMENT, ModItems.RED_DRAGON_FRAGMENT,
                ModItems.PURPLE_DRAGON_FRAGMENT, ModItems.ORANGE_DRAGON_FRAGMENT);
    }
}
