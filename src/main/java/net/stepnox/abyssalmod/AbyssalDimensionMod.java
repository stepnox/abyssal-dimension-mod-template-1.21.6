package net.stepnox.abyssalmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// starting project
public class AbyssalDimensionMod implements ModInitializer {
	public static final String MOD_ID = "abyssal-dimension-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}