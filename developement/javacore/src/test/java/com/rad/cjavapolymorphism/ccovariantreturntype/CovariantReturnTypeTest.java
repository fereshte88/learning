package com.rad.javacore.cjavapolymorphism.ccovariantreturntype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/covariant-return-type
public class CovariantReturnTypeTest {

    //متغیر فرزند
    CovariantReturnTypeChild covariantReturnTypeChild;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        covariantReturnTypeChild = new CovariantReturnTypeChild();
    }

    /**
     * این متد CovariantReturnType را تست میکند
     */
    @Test
    void covariantReturnTypeTest() {
        Assertions.assertEquals(CovariantReturnTypeChild.class, covariantReturnTypeChild.get().getClass());
    }

}
