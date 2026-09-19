package honu.haste.registries;

import honu.haste.potion.ModPotions;
import net.fabricmc.fabric.api.registry.FabricPotionBrewingBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;

public class ModPotionRegistries {
    public static void registerPotionRecipes() {
        // Haste I for 3 minutes.
        FabricPotionBrewingBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(Potions.SWIFTNESS, Ingredient.of(Items.GOLDEN_APPLE), ModPotions.HASTE_POTION);
        });

        // Haste I for 8 minutes.
        FabricPotionBrewingBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(ModPotions.HASTE_POTION, Ingredient.of(Items.REDSTONE), ModPotions.LONG_HASTE_POTION);
            builder.registerPotionRecipe(Potions.LONG_SWIFTNESS, Ingredient.of(Items.GOLDEN_APPLE), ModPotions.LONG_HASTE_POTION);
        });

        // Haste II for 3 minutes.
        FabricPotionBrewingBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(ModPotions.HASTE_POTION, Ingredient.of(Items.GLOWSTONE_DUST), ModPotions.STRONG_HASTE_POTION);
        });

        // Haste II for 8 minutes.
        FabricPotionBrewingBuilder.BUILD.register(builder -> {
            builder.registerPotionRecipe(ModPotions.STRONG_HASTE_POTION, Ingredient.of(Items.REDSTONE_BLOCK), ModPotions.LONG_STRONG_HASTE_POTION);
        });
    }
}
