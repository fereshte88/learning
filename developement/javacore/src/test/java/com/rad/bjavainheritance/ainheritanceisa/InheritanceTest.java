package com.rad.javacore.bjavainheritance.ainheritanceisa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/inheritance-in-java
public class InheritanceTest {

    //سگ
    Dog dog;
    //سگبچه
    BabyDog babyDog;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        dog = new Dog();
        System.out.println("initUseCase");
        babyDog = new BabyDog();
    }

    /**
     * این متد وراثت Single را تست میکند
     */
    @Test
    void inheritanceSingleTest() {
        dog.eat();
        dog.bark();
        Assertions.assertEquals(5, dog.getEnergy());
    }

    /**
     * این متد وراثت Multilevel را تست میکند
     */
    @Test
    void inheritanceMultilevelTest() {
        babyDog.eat();
        babyDog.bark();
        babyDog.weep();
        Assertions.assertEquals(3, babyDog.getEnergy());
    }

}
