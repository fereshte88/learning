package com.rad.javacore.cjavapolymorphism.amethodoverloading;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/method-overloading-in-java
public class MethodOverloadingTest {

    //متغیر تست
    MethodOverloading methodOverloading;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        methodOverloading = new MethodOverloading();
    }

    /**
     * این متد Overloading را بر اساس تعداد آرگومانها تست میکند
     */
    @Test
    void methodOverloadingByArgumentTest() {
        Integer addSum1 = methodOverloading.add(1, 2);
        Integer addSum2 = methodOverloading.add(1, 2, 0);
        Assertions.assertEquals(addSum1, addSum2);
    }


    /**
     * این متد Overloading را بر اساس نوع خروجی تست میکند
     */
    @Test
    void methodOverloadingByReturnTypeTest() {
        Integer multipleSum1 = methodOverloading.multiple(1, 2);
        Double multipleSum2 = methodOverloading.multiple(1d, 2d);
        Assertions.assertEquals(multipleSum1, multipleSum2.intValue());
    }
}
