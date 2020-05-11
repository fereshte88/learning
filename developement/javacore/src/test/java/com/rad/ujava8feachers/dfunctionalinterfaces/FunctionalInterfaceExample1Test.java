package com.rad.ujava8feachers.dfunctionalinterfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FunctionalInterfaceExampleTest {
    FunctionalInterfaceExample.FunctionalInterfaceExample1 functionalInterfaceExample1 = new FunctionalInterfaceExample().new FunctionalInterfaceExample1();
    FunctionalInterfaceExample.FunctionalInterfaceExample2 functionalInterfaceExample2 = new FunctionalInterfaceExample().new FunctionalInterfaceExample2();
    FunctionalInterfaceExample.FunctionalInterfaceExample3 functionalInterfaceExample3 = new FunctionalInterfaceExample().new FunctionalInterfaceExample3();


    @Test
    void testSaySomthing() {
        Assertions.assertEquals("hello", functionalInterfaceExample1.saySomthing("hello"));
    }
    @Test
    void testSaySomthing2() {
        Assertions.assertEquals("hello", functionalInterfaceExample2.saysomthing2("hello"));
    }
    @Test
    void testSaySomthing3() {
        Assertions.assertEquals("Do it now hello", functionalInterfaceExample3.saySomthing3("hello"));
    }
}
