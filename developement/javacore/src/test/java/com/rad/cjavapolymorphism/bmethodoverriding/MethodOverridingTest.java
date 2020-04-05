package com.motaharinia.javacore.cjavapolymorphism.bmethodoverriding;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/method-overriding-in-java
public class MethodOverridingTest {

    //متغیر کلاس فرزند
    MethodOverridingChild methodOverridingChild;


    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        methodOverridingChild = new MethodOverridingChild();
    }

    /**
     * این متد Overriding را تست میکند
     */
    @Test
    void methodOverridingChildTest() {
        Assertions.assertEquals(1, methodOverridingChild.getRateOfInterest());
    }

}
