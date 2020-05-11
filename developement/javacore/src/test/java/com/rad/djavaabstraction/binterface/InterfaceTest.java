//package com.rad.djavaabstraction.binterface;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
////https://www.javatpoint.com/interface-in-java
//public class InterfaceTest {
//    //متغیر تست
//    PaperA4 paperA4;
//
//    /**
//     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
//     */
//    @BeforeEach
//    void initUseCase() {
//        paperA4 = new PaperA4();
//    }
//
//    /**
//     * این متد پیاده سازی قابلیت Default Method در اینترفیس را در Java8 به بعد تست میکند
//     */
//    @Test
//    void interfaceJava8DefaultMethodTest() {
//        Assertions.assertEquals("defaultMethod", paperA4.defaultMethod());
//    }
//
//
//    /**
//     * این متد پیاده سازی قابلیت  Static Method در اینترفیس را در Java8 به بعد تست میکند
//     */
//    @Test
//    void interfaceJava8StaticMethodTest() {
//        Assertions.assertEquals(8, Drawable.cube(2));
//    }
//
//
//    /**
//     * این متد پیاده سازی قابلیت  Nested Interface را تست میکند
//     */
//    @Test
//    void interfaceNestedTest() {
//        Assertions.assertEquals("messageNestedChild", paperA4.messageNestedChild());
//    }
//
//    /**
//     * این متد پیاده سازی قابلیت وراثت در  Interface را تست میکند
//     */
//    @Test
//    void interfaceInheritanceTest() {
//        Assertions.assertEquals("InheritanceInterfaceSetPrinterSize", paperA4.setPrinterSize());
//    }
//}
