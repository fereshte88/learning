package com.rad.ujava8feachers.cmethodreferences;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MethodReferenceExampleTest {
    MethodReferenceExample methodReferenceExample = new MethodReferenceExample();

    @Test
    void testReferringStaticMethod() {
        Assertions.assertEquals("Hello, this is static method.", MethodReferenceExample.referringStaticMethod());
    }


    @Test
    void testThreadRunnable() {
        methodReferenceExample.threadRunnable();
    }

    @Test
    void testAdder() {
        Assertions.assertEquals(30, methodReferenceExample.adder(10, 20));
    }

    @Test
    void testOverloadedMethod() {
        methodReferenceExample.overloadedMethod();
    }

    @Test
    void testInterfaceMethod() {
        Assertions.assertEquals("Creating object Hello, this is non-static method. **  anonymous object  Hello, this is non-static method.", methodReferenceExample.interfaceMethod());
    }

    @Test
    void testThreadNonStatic() {
        methodReferenceExample.threadNonStatic();
    }

    @Test
    void testAdderNonStatic() {
        Assertions.assertEquals(60, methodReferenceExample.adderNonStatic(10, 50));
    }

    @Test
    void testConstructor() {
        methodReferenceExample.constructor("hello construtor");
    }
}
