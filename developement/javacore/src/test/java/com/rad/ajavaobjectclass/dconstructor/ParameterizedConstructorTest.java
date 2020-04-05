package com.rad.ajavaobjectclass.dconstructor;

import org.junit.jupiter.api.Test;

class ParameterizedConstructorTest {
    ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor(0, "name");

    @Test
    void displayTest() {
        parameterizedConstructor.display();
    }
}
