package com.rad.ajavaobjectclass.estatickeyword;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CounterWithStaticVariableTest {

    @Test
    void counterTest(){
        int exceptedValue=3;
        CounterWithStaticVariable c1 = new CounterWithStaticVariable();
        CounterWithStaticVariable c2 = new CounterWithStaticVariable();
        CounterWithStaticVariable c3 = new CounterWithStaticVariable();

        assertEquals(3,c3.counter());
    }
}
