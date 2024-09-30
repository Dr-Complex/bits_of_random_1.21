package com.dr_complex.bits_of_random.data.providers;

import com.dr_complex.bits_of_random.init.ModBlocks;
import com.dr_complex.bits_of_random.init.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BitsOfRandomBlockLootProvider extends FabricBlockLootTableProvider {
    public BitsOfRandomBlockLootProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }


    @Override
    public void generate() {
        addDrop(ModBlocks.LATEX_BLOCK);



        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RAW_RUBY_BLOCK);
    }
}
