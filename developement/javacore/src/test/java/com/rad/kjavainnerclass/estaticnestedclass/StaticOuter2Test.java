package com.rad.kjavainnerclass.estaticnestedclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StaticOuter2Test {
    @Test
    void staticClassTest(){

        Assertions.assertEquals(30,StaticOuter2.Inner.msg());
    }
}
