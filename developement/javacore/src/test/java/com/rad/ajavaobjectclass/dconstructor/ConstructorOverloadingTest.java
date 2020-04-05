package com.rad.ajavaobjectclass.dconstructor;

import org.junit.jupiter.api.Test;

class ConstructorOverloadingTest {
    ConstructorOverloading constructorOverloading = new ConstructorOverloading(101, "name1", 30);
    ConstructorOverloading constructorOverloading1 = new ConstructorOverloading(102, "name2");

    @Test
    void testDisplay() {
        constructorOverloading.display();
        constructorOverloading1.display();
    }
}

