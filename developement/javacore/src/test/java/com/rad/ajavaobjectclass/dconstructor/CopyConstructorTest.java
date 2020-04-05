package com.rad.ajavaobjectclass.dconstructor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CopyConstructorTest {
    @Test
    void copyconstructorTest(){
        CopyConstructor copyConstructor1= new CopyConstructor(11,"name");
        CopyConstructor copyConstructor2= new CopyConstructor(copyConstructor1);

        Assertions.assertEquals(copyConstructor1.id,copyConstructor2.id);
        Assertions.assertEquals(copyConstructor1.name,copyConstructor2.name);
    }



}

