package com.dr_complex.bits_of_random;

import net.fabricmc.api.ClientModInitializer;

public class BitsOfRandomClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BitsOfRandom.LOGGER.info("yay");
    }
}
