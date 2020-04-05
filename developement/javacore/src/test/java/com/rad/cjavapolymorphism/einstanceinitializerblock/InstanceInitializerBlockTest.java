package com.rad.cjavapolymorphism.einstanceinitializerblock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/instance-initializer-block
public class InstanceInitializerBlockTest {
    InstanceInitializerBlockChild instanceInitializerBlockChild;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        instanceInitializerBlockChild = new InstanceInitializerBlockChild();
    }

    /**
     * این متد Instance Initializer Block را بر اساس ترتیب اجرای آن و سازنده فرزند و پدر آن تست میکند
     */
    @Test
    void instanceInitializerBlockTest() {
        Assertions.assertEquals("ParentDefault,ParentInitializerBlock,ParentConstructor,ChildInitializerBlock,ChildConstructor", instanceInitializerBlockChild.getSuperName());
    }
}
