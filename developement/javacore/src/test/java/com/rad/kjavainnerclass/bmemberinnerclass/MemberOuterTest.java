package com.rad.kjavainnerclass.bmemberinnerclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MemberOuterTest {
    @Test
    void msgTest(){
        int exceptedValue=30;
        MemberOuter memberOuter = new MemberOuter();
        MemberOuter.Inner inner = memberOuter.new Inner();
        Assertions.assertEquals(30,inner.msg());
    }
}

