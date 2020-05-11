package com.rad.njavaio.njavaobjectstreamfield;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ObjectStreamClass;
import java.util.Calendar;

class ObjectStreamFieldExampleTest {
    ObjectStreamFieldExample objectStreamFieldExample = new ObjectStreamFieldExample();

    @Test
    void testObjectStreamFieldMethod() {
        ObjectStreamClass objectStreamClass = objectStreamFieldExample.objectStreamFieldMethod(String.class);

        // get the value field from ObjectStreamClass for integers
        System.out.println("" + objectStreamClass.getField("value"));

        // create a new object stream class for Calendar
        ObjectStreamClass osc2 = ObjectStreamClass.lookup(Calendar.class);

        // get the Class instance for osc2
        System.out.println("" + osc2.getField("isTimeSet"));
        //Assertions.assertEquals(null, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme