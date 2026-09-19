package honu.haste.potion;

import honu.haste.PotionOfHaste;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;

public class ModPotions {
    public static final Holder<Potion> HASTE_POTION = registerPotion("haste_potion",
            new Potion("haste_potion", new MobEffectInstance(MobEffects.HASTE, 3600, 0)));

    public static final Holder<Potion> LONG_HASTE_POTION = registerPotion("long_haste_potion",
            new Potion("long_haste_potion", new MobEffectInstance(MobEffects.HASTE, 9600, 0)));

    public static final Holder<Potion> STRONG_HASTE_POTION = registerPotion("strong_haste_potion",
            new Potion("strong_haste_potion", new MobEffectInstance(MobEffects.HASTE, 3600, 1)));

    public static final Holder<Potion> LONG_STRONG_HASTE_POTION = registerPotion("long_strong_haste_potion",
            new Potion("long_strong_haste_potion", new MobEffectInstance(MobEffects.HASTE, 9600, 1)));

    private static Holder<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerForHolder(BuiltInRegistries.POTION, Identifier.fromNamespaceAndPath(PotionOfHaste.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        PotionOfHaste.LOGGER.info("Registering potions for " + PotionOfHaste.MOD_ID);
    }
}
