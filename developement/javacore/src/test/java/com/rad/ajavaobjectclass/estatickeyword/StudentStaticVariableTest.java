package com.rad.ajavaobjectclass.estatickeyword;

import com.rad.ajavaobjectclass.estatickeyword.StudentStaticVariable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentStaticVariableTest {

    @Test
    void staticVariableTest(){
        StudentStaticVariable s1 = new StudentStaticVariable(111,"Karan");
        StudentStaticVariable s2 = new StudentStaticVariable(222,"Aryan");
        assertEquals(s1.display(),s2.display());
    }
}
