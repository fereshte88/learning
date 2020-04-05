package com.rad.djavaabstraction.aabstractclass;

import com.rad.cjavapolymorphism.amethodoverloading.MethodOverloading;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/abstract-class-in-java
public class AbstractClassTest {
    //متغیر تست
    Honda honda;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        honda = new Honda();
    }

    /**
     * این متد پیاده سازی متد Abstract را تست میکند
     */
    @Test
    void abstractClassAbstractMethodTest() {
        Assertions.assertEquals("Honda.run", honda.run());
    }
}
