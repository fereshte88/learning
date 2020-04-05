package com.rad.javacore.ajavaobjectclass.dconstructor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConstructorTest {

    //شیی جهت تست
    Constructor constructor;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        constructor = null;
    }

    /**
     * این متد قابلیت سازنده پیش فرض را تست میکند
     */
    @Test
    void constructorDefaultTest() {
        constructor = new Constructor();
        Assertions.assertEquals(1, constructor.getId());
    }

    /**
     * این متد قابلیت سازنده پارامتری را تست میکند
     */
    @Test
    void constructorParameterizedTest() {
        constructor = new Constructor(1, "rad");
        Assertions.assertEquals(1, constructor.getId());
    }
}
