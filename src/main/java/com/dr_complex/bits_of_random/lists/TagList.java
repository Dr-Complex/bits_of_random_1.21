package com.dr_complex.bits_of_random.lists;

import com.dr_complex.bits_of_random.BitsOfRandom;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class TagList {
    public static class Items {
        public static final TagKey<Item> PARA_LOGS = TagKey.of(RegistryKeys.ITEM, BitsOfRandom.id("para_logs"));
    }

    public static class Blocks {
        public static final TagKey<Block> PARA_LOGS = TagKey.of(RegistryKeys.BLOCK, BitsOfRandom.id("para_logs"));
    }
}
