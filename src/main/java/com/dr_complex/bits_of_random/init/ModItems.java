package com.dr_complex.bits_of_random.init;

import com.dr_complex.bits_of_random.BitsOfRandom;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import io.wispforest.owo.registration.reflect.ItemRegistryContainer;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.util.Rarity;


@SuppressWarnings("unused")
public class ModItems implements ItemRegistryContainer{
    public static final Item LATEX_ITEM = new Item(new Item.Settings().group(BitsOfRandom.BoR_GROUP).rarity(Rarity.COMMON));

    public static final Item RUBY_ITEM = new Item(new Item.Settings().group(BitsOfRandom.BoR_GROUP).rarity(Rarity.COMMON));
    public static final Item RAW_RUBY_ITEM = new Item(new Item.Settings().group(BitsOfRandom.BoR_GROUP).rarity(Rarity.COMMON));

}
