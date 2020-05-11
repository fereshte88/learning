package com.rad.ujava8feachers.hdefaultmethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AbstractTestTest {
    AbstractTest abstractTest = new AbstractTest();

    @Test
    void testAbstractExample() {
        Assertions.assertEquals("Addition: 100 Substraction: 40 Multiplication: 2100", abstractTest.abstractExample(70, 30));
    }
}