package com.rad.ajavaobjectclass.estatickeyword;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentStaticMethodTest {

    @Test
    void displayTest(){
        String exceptedValue="BBDIT";
        StudentStaticMethod s = new StudentStaticMethod(101,"fereshteh");
        StudentStaticMethod.change();
        assertEquals(exceptedValue, s.display());
    }
}
