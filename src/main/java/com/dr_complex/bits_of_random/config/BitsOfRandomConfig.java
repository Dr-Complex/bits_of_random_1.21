package com.dr_complex.bits_of_random.config;

import com.dr_complex.bits_of_random.BitsOfRandom;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.Nest;
import io.wispforest.owo.config.annotation.RangeConstraint;

@Modmenu(modId = BitsOfRandom.MOD_ID)
@Config(name = BitsOfRandom.MOD_ID,wrapperName = "BoRConfigs")
public class BitsOfRandomConfig {

    @Nest
    public TestNest nest = new TestNest();


    public static class TestNest{

        @RangeConstraint(min = 0, max = 100)
        public int anIntTest = 1;

        @RangeConstraint(min = 0.0f, max = 1.0f)
        public float aFloatTest = 0.1f;

        public boolean aBooleanTest = false;

        public BitsOfRandomConfig.Choices anEnumTest = BitsOfRandomConfig.Choices.B_1;
    }

    public enum Choices{
        A_1, B_1, C_1
    }
}
