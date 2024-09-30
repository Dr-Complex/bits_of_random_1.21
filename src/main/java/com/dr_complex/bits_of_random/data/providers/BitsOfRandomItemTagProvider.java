package com.dr_complex.bits_of_random.data.providers;

import com.dr_complex.bits_of_random.init.ModBlocks;
import com.dr_complex.bits_of_random.init.ModItems;
import com.dr_complex.bits_of_random.lists.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class BitsOfRandomItemTagProvider extends FabricTagProvider<Item> {
    public BitsOfRandomItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
    }
}
