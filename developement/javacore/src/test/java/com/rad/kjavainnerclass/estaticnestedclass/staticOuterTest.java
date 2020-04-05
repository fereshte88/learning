package com.rad.kjavainnerclass.estaticnestedclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class staticOuterTest {
    @Test
    void staticClassTest(){
        StaticOuter.Inner inner = new StaticOuter.Inner();
        Assertions.assertEquals(30,inner.msg());
    }
}

