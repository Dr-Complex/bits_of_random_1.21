package com.dr_complex.bits_of_random.init;

import com.dr_complex.bits_of_random.BitsOfRandom;
import io.wispforest.owo.registration.reflect.ItemRegistryContainer;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;


@SuppressWarnings("unused")
public class ModItems implements ItemRegistryContainer{
    public static final Item LATEX_ITEM = new Item(new Item.Settings().group(BitsOfRandom.BoR_GROUP).rarity(Rarity.COMMON));

    public static final Item RUBY_ITEM = new Item(new Item.Settings().group(BitsOfRandom.BoR_GROUP).rarity(Rarity.COMMON));
    public static final Item RAW_RUBY_ITEM = new Item(new Item.Settings().group(BitsOfRandom.BoR_GROUP).rarity(Rarity.COMMON));

}
