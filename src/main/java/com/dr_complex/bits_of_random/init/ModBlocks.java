package com.dr_complex.bits_of_random.init;

import com.dr_complex.bits_of_random.BitsOfRandom;
import io.wispforest.owo.registration.reflect.BlockRegistryContainer;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@SuppressWarnings("unused")
public class ModBlocks implements BlockRegistryContainer {

    public static final Block LATEX_BLOCK = new Block(AbstractBlock.Settings.copy(Blocks.SLIME_BLOCK));



    public static final Block RUBY_BLOCK = new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK));
    public static final Block RAW_RUBY_BLOCK = new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK));

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface NoItemGroup {}

    @Override
    public BlockItem createBlockItem(Block block, String identifier) {
        return new BlockItem(block, new Item.Settings().group(BitsOfRandom.BoR_GROUP));
    }

    @Override
    public void postProcessField(String namespace, Block value, String id, Field field){
        if(field.isAnnotationPresent(NoBlockItem.class)) return;

        var settings = new Item.Settings();

        if(!field.isAnnotationPresent(NoItemGroup.class)){
            settings.group(BitsOfRandom.BoR_GROUP);
        }

        Registry.register(Registries.ITEM,BitsOfRandom.id(id), new BlockItem(value,settings));
    }

}
