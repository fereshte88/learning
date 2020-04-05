package com.rad.cjavapolymorphism.ffinalkeyword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/final-keyword
public class FinalKeywordTest {

    //کلاس فرزند که از کلاس پدر یک متد final به ارث برده است
    FinalKeywordChild finalKeywordChild;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        finalKeywordChild = new FinalKeywordChild();
    }

    /**
     * این متد Final Method Inheritance را تست میکند
     */
    @Test
    void finalKeywordMethodInheritanceTest() {
        Assertions.assertEquals(25, finalKeywordChild.calculate());
    }
}
