package com.dr_complex.bits_of_random;

import com.dr_complex.bits_of_random.init.ModBlocks;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BitsOfRandomClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BitsOfRandom.LOGGER.info("yay");
    }
}
