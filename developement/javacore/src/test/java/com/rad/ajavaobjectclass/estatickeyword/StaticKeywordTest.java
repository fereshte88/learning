package com.rad.javacore.ajavaobjectclass.estatickeyword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/static-keyword-in-java
public class StaticKeywordTest {


    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        StaticKeyword.count = 0;
    }


    /**
     * این متد قابلیتهای متد static را تست میکند
     */
    @Test
    void staticMethodTest() {
        StaticKeyword.change();
        Assertions.assertEquals(1, StaticKeyword.count);
    }

}
