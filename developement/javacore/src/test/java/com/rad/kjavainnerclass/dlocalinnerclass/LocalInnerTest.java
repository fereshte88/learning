package com.rad.kjavainnerclass.dlocalinnerclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LocalInnerTest {


    @Test
    void display() {
        LocalInner localInner = new LocalInner();
        int result = localInner.display();
        Assertions.assertEquals(80, result);
    }
}

