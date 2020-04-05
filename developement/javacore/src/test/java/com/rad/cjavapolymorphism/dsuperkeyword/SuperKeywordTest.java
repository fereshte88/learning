package com.rad.javacore.cjavapolymorphism.dsuperkeyword;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/super-keyword
public class SuperKeywordTest {

    //متغیر فرزند
    SuperKeywordChild superKeywordChild;


    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        superKeywordChild = new SuperKeywordChild();
    }

    /**
     * این متد Super Keyword را در حالت Child Variable تست میکند
     */
    @Test
    void superKeywordChildVariableTest() {
        Assertions.assertEquals(100, superKeywordChild.getId());
    }


    /**
     * این متد Super Keyword را در حالت Parent Variable تست میکند
     */
    @Test
    void superKeywordParentVariableTest() {
        Assertions.assertEquals(2, superKeywordChild.getSuperId());
    }


    /**
     * این متد Super Keyword را در حالت فراخوانی متد تست میکند
     */
    @Test
    void superKeywordParentMethodTest() {
        Assertions.assertEquals(12, superKeywordChild.calculate());
    }

    /**
     * این متد Super Keyword را در حالت فراخوانی سازنده تست میکند
     */
    @Test
    void superKeywordParentConstructorTest() {
        superKeywordChild = new SuperKeywordChild(8);
        Assertions.assertEquals(32, superKeywordChild.getSuperId());
    }

}
