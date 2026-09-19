package honu.haste;

import honu.haste.potion.ModPotions;
import honu.haste.registries.ModPotionRegistries;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PotionOfHaste implements ModInitializer {
	public static final String MOD_ID = "potion-of-haste";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModPotions.registerPotions();
		ModPotionRegistries.registerPotionRecipes();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
