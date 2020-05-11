package com.rad.ujava8feachers.hdefaultmethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DefaultMethodExampleTest {
    DefaultMethodExample defaultMethodExample = new DefaultMethodExample();

    @Test
    void testDefaultExample() {
        Assertions.assertEquals("Hello, this is default method abstract method static method", defaultMethodExample.defaultExample("abstract method", "static method"));
    }
}