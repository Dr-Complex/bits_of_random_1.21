package com.dr_complex.bits_of_random;

import com.dr_complex.bits_of_random.data.providers.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BitsOfRandomDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(BitsOfRandomRecipeProvider::new);
		pack.addProvider(BitsOfRandomEnProvider::new);
		pack.addProvider(BitsOfRandomModelProvider::new);
		pack.addProvider(BitsOfRandomBlockLootProvider::new);
		pack.addProvider(BitsOfRandomBlockTagProvider::new);
		pack.addProvider(BitsOfRandomItemTagProvider::new);

	}
}
