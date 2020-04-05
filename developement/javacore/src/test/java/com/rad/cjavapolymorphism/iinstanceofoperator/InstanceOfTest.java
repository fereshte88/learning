package com.rad.cjavapolymorphism.iinstanceofoperator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/downcasting-with-instanceof-operator
public class InstanceOfTest {
    //شیی جهت تست
    InstanceOf instanceOf;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        instanceOf = new InstanceOf();
    }

    /**
     * این متد instanceof را با بررسی کلاس پدر تست میکند
     */
    @Test
    void instanceOfWithParentTest() {
        Assertions.assertEquals(true, instanceOf.checkInstanceOfWithParent());
    }

    /**
     * این متد instanceof را با بررسی null تست میکند
     */
    @Test
    void instanceOfWithNullTest() {
        Assertions.assertEquals(false, instanceOf.checkInstanceOfWithNull());
    }

    /**
     * این متد Downcasting را با instanceof تست میکند
     */
    @Test
    void instanceOfDowncastingWithInstanceOfTest() {
        Assertions.assertEquals(true, instanceOf.checkDowncastingWithInstanceof(new Cat()));
    }

    /**
     * این متد Downcasting را بدون instanceof تست میکند
     */
    @Test
    void instanceOfDowncastingWithoutInstanceOfTest() {
        Assertions.assertEquals(true, instanceOf.checkDowncastingWithoutInstanceof(new Cat()));
    }
}
