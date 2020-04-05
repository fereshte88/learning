package com.rad.javacore.cjavapolymorphism.gruntimepolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/runtime-polymorphism-in-java
public class RuntimePolymorphismTest {
    //شیی کلاس فرزند
    RuntimePolymorphism runtimePolymorphism;


    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        runtimePolymorphism = new RuntimePolymorphism();
    }

    /**
     * این متد Upcasting Extend را در Polymorphism تست میکند
     */
    @Test
    void runtimePolymorphismUpcastingExtendTest() {
        Assertions.assertEquals(true, runtimePolymorphism.getUpcastingObject() instanceof Upcasting);
    }

    /**
     * این متد Upcasting Interface را در Polymorphism تست میکند
     */
    @Test
    void runtimePolymorphismUpcastingInterfaceTest() {
        Assertions.assertEquals(true, runtimePolymorphism.getUpcastingObject() instanceof UpcastingInterface);
    }

    /**
     * این متد Overridden را در Polymorphism برای Data Member ها تست میکند
     */
    @Test
    void runtimePolymorphismOverriddenDataMemberTest() {
        Assertions.assertEquals(90, runtimePolymorphism.getUpcastingObject().speedLimit);
    }
}
