package net.iiNani.dragonaddons;

import net.fabricmc.api.ModInitializer;
import net.iiNani.dragonaddons.block.ModBlocks;
import net.iiNani.dragonaddons.item.ModItems;
import net.iiNani.dragonaddons.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DragonAddons implements ModInitializer {
	public static final String MOD_ID = "dragonaddons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.RegisterModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();
	}
}
