package com.rad.javacore.bjavainheritance.ainheritanceisa;

//Hierarchical Inheritance:
//When two or more classes inherits a single class, it is known as hierarchical inheritance.
//هنگامی که دو یا چند طبقه یک کلاس واحد را به ارث می برند ، به عنوان میراث سلسله مراتبی شناخته می شود
public class Cat extends Animal {

    /**
     * میو کردن سگ
     */
    void meow() {
        this.energy = this.energy - 5;
    }
}
