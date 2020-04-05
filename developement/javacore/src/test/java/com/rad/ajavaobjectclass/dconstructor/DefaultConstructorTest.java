package com.rad.ajavaobjectclass.dconstructor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DefaultConstructorTest {
    @Test
    void defaultConstructorTest(){

    DefaultConstructor df1 = new DefaultConstructor();
    DefaultConstructor df2 = new DefaultConstructor();
    assertEquals(df1.id,df2.id);
    }
}

