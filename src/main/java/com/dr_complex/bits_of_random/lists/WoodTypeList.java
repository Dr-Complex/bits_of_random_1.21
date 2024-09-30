package com.dr_complex.bits_of_random.lists;

import com.dr_complex.bits_of_random.BitsOfRandom;
import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class WoodTypeList {
    public static final WoodType PARA = new WoodType(BitsOfRandom.id("para").toString(),BlockSetTypeList.PARA, BlockSoundGroup.WOOD, BlockSoundGroup.HANGING_SIGN, SoundEvents.BLOCK_FENCE_GATE_CLOSE,SoundEvents.BLOCK_FENCE_GATE_OPEN);
}
