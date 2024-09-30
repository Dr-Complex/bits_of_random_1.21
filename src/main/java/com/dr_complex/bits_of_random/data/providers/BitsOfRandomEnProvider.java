package com.dr_complex.bits_of_random.data.providers;

import com.dr_complex.bits_of_random.BitsOfRandom;
import com.dr_complex.bits_of_random.init.ModBlocks;
import com.dr_complex.bits_of_random.init.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class BitsOfRandomEnProvider extends FabricLanguageProvider {

    public BitsOfRandomEnProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text,@NotNull String value){
        if(text.getContent() instanceof TranslatableTextContent content){
            builder.add(content.getKey(),value);
        }else {
            BitsOfRandom.LOGGER.warn("Could not make translation for: {}",value);
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        addText(translationBuilder,BitsOfRandom.BoR_GROUP.getDisplayName(),"Bits of Random");

        translationBuilder.add(Arrays.toString(BitsOfRandom.CONFIGS.keys.nest_anEnumTest.path()),"enum");


        translationBuilder.add(ModItems.LATEX_ITEM,"Latex Ball");
        translationBuilder.add(ModBlocks.LATEX_BLOCK,"Block of Latex");


        translationBuilder.add(ModBlocks.RUBY_BLOCK,"Block of Ruby");
        translationBuilder.add(ModBlocks.RAW_RUBY_BLOCK,"Block of Raw Ruby");
        translationBuilder.add(ModItems.RUBY_ITEM,"Ruby");
        translationBuilder.add(ModItems.RAW_RUBY_ITEM,"Raw Ruby");
    }
}
