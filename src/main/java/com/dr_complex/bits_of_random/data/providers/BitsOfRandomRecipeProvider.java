package com.dr_complex.bits_of_random.data.providers;

import com.dr_complex.bits_of_random.init.ModBlocks;
import com.dr_complex.bits_of_random.init.ModItems;
import com.dr_complex.bits_of_random.lists.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BitsOfRandomRecipeProvider extends FabricRecipeProvider {
    public BitsOfRandomRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.LATEX_BLOCK)
                .input('#',ModItems.LATEX_ITEM)
                .pattern("###").pattern("###").pattern("###")
                .criterion(hasItem(ModItems.LATEX_ITEM),conditionsFromItem(ModItems.LATEX_ITEM))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.LATEX_ITEM,9)
                .input(Ingredient.ofItems(ModBlocks.LATEX_BLOCK))
                .criterion(hasItem(ModBlocks.LATEX_BLOCK),conditionsFromItem(ModBlocks.LATEX_BLOCK))
                .offerTo(exporter);
    }
}
