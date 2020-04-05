package com.motaharinia.javacore.ajavaobjectclass.fthiskeyword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/this-keyword
public class ThisKeywordTest {
    //متغیر تست
    ThisKeyword thisKeyword;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        thisKeyword = null;
    }


    /**
     * این متد نحوه استفاده از this را تست میکند
     */
    @Test
    void thisTest() {
        thisKeyword = new ThisKeyword(2);
        ThisKeyword2 this2 = new ThisKeyword2(thisKeyword);
        Assertions.assertEquals(10, this2.getMe().thisKeyword.id);
    }

}
