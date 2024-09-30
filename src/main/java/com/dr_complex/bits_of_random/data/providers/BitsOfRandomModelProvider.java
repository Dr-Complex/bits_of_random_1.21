package com.dr_complex.bits_of_random.data.providers;

import com.dr_complex.bits_of_random.init.ModBlocks;
import com.dr_complex.bits_of_random.init.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import org.jetbrains.annotations.NotNull;

public class BitsOfRandomModelProvider extends FabricModelProvider {
    public BitsOfRandomModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(@NotNull BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LATEX_BLOCK.getDefaultState().getBlock());

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK.getDefaultState().getBlock());
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUBY_BLOCK.getDefaultState().getBlock());
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LATEX_ITEM.asItem(), Models.GENERATED);

        itemModelGenerator.register(ModItems.RUBY_ITEM.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY_ITEM.asItem(), Models.GENERATED);
    }
}
