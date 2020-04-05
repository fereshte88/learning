package com.rad.ajavaobjectclass.estatickeyword;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CounterWithoutStaticVariableTest {

    @Test
    void counterTest(){
        int exceptedValue=1;
        CounterWithoutStaticVariable c1 = new CounterWithoutStaticVariable();
        CounterWithoutStaticVariable c2 = new CounterWithoutStaticVariable();
        CounterWithoutStaticVariable c3 = new CounterWithoutStaticVariable();
        assertEquals(exceptedValue,c3.counter());

    }
}
