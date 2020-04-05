package com.rad.kjavainnerclass.fnestedinterface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NestedInterfaceTest {


    @Test
    void testMsg() {
        NestedInterface nestedInterface = new NestedInterface();
        String result = nestedInterface.msg();
        Assertions.assertEquals("Hi, It is Nested Interface In Interface", result);
    }

    @Test
    void testMsg2() {
        NestedInterface2 nestedInterface = new NestedInterface2();
        String result = nestedInterface.msg();
        Assertions.assertEquals("Hi, It is Nested Interface In Class", result);
    }
}

