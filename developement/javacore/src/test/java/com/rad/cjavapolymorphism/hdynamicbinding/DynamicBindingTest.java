package com.rad.javacore.cjavapolymorphism.hdynamicbinding;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/static-binding-and-dynamic-binding
public class DynamicBindingTest {
    //فرزند شیی
    DynamicBindingChild dynamicBindingChild;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        dynamicBindingChild = new DynamicBindingChild();
    }

    /**
     * این متد Dynamic Binding را تست میکند
     */
    @Test
    void dynamicBindingTest() {
//        Assertions.assertEquals(DynamicBindingChild, dynamicBindingChild.walk());
        Assertions.assertTrue(dynamicBindingChild.walk() instanceof DynamicBindingChild);
    }

}
