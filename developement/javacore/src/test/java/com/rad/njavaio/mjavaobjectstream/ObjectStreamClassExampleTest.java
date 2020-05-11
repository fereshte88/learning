package com.rad.njavaio.mjavaobjectstream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ObjectStreamClass;

class ObjectStreamClassExampleTest {
    ObjectStreamClassExample objectStreamClassExample = new ObjectStreamClassExample();
    @Test
    void testObjectStreamMethodLookUp() {
        ObjectStreamClass objectStreamClass = objectStreamClassExample.objectStreamMethodLookUp(SmartPhone.class);
        Assertions.assertThrows(NullPointerException.class, ()->{objectStreamClass.forClass();});
    }

    @Test
    void testObjectStreamMethodLookUpAny() {
        ObjectStreamClass objectStreamClass = objectStreamClassExample.objectStreamMethodLookUpAny(SmartPhone.class);
        Assertions.assertEquals("com.rad.njavaio.mjavaobjectstream.SmartPhone", objectStreamClass.getName());
    }
}
