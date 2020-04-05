package com.motaharinia.javacore.ajavaobjectclass.cobjectandclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ObjectInitializeTest {
    //شیی جهت تست
    ObjectInitialize objectInitialize;


    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        objectInitialize = null;
    }

    /**
     * این متد مقداردهی اولیه شیی با ارجاع را تست میکند
     */
    @Test
    void objectInitializeByReferenceVariableTest() {
        objectInitialize = new ObjectInitialize();
        objectInitialize.id = 1;
        Assertions.assertEquals(1, objectInitialize.id);
    }

    /**
     * این متد مقداردهی اولیه شیی با متد را تست میکند
     */
    @Test
    void objectInitializeByMethodTest() {
        objectInitialize = new ObjectInitialize();
        objectInitialize.insertRecord(1);
        Assertions.assertEquals(1, objectInitialize.id);
    }

    /**
     * این متد مقداردهی اولیه شیی با سازنده را تست میکند
     */
    @Test
    void objectInitializeByConstructorTest() {
        objectInitialize= new ObjectInitialize(1);
        Assertions.assertEquals(1, objectInitialize.id);
    }
}
