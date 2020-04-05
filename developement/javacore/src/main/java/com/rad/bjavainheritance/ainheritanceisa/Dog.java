package com.rad.javacore.bjavainheritance.ainheritanceisa;

//Single Inheritance
//When a class inherits another class, it is known as a single inheritance.
//وقتی یک کلاس یک کلاس دیگر را به ارث می برد ، به عنوان single inheritance شناخته می شود.
public class Dog extends Animal {
    /**
     * پارس کردن سگ
     */
    void bark() {
        this.energy = this.energy - 5;
    }
}
