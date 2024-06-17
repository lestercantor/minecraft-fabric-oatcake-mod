package net.magic497.oatcakemod;

import net.fabricmc.api.ModInitializer;

import net.magic497.oatcakemod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OatcakeMod implements ModInitializer {
	public static final String MOD_ID = "oatcake-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}