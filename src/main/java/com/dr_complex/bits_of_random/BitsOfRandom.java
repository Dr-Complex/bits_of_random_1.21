package com.dr_complex.bits_of_random;

import com.dr_complex.bits_of_random.config.BoRConfigs;
import com.dr_complex.bits_of_random.init.ModBlocks;
import com.dr_complex.bits_of_random.init.ModItems;
import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;
import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import net.fabricmc.api.ModInitializer;


import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BitsOfRandom implements ModInitializer {

	public static final BoRConfigs CONFIGS = BoRConfigs.createAndLoad();

	public static final String MOD_ID = "bits_of_random";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final OwoItemGroup BoR_GROUP = OwoItemGroup.builder(id("bits_of_random_group"),()-> Icon.of(ModItems.LATEX_ITEM)).build();

	public static Identifier id(String path){
		return Identifier.of(MOD_ID, path);
	}
	@Override
	public void onInitialize() {
		LOGGER.info("Randomness will happen");

		BoR_GROUP.initialize();
		LOGGER.info("Making the groups for: "+ MOD_ID);

		FieldRegistrationHandler.register(ModBlocks.class, MOD_ID,false);
		LOGGER.info("Making the blocks for: "+ MOD_ID);
		FieldRegistrationHandler.register(ModItems.class, MOD_ID,false);
		LOGGER.info("Making the items for: "+ MOD_ID);

		LOGGER.info("Randomness hase happened");
	}
}