package com.motaharinia.javacore.bjavainheritance.ainheritanceisa;

//Multilevel Inheritance:
//When there is a chain of inheritance, it is known as multilevel inheritance.
//وقتی زنجیره ای از ارث بری وجود دارد ، به عنوان وراثت چند سطحی شناخته می شود.
public class BabyDog extends Dog {
    /**
     * گریه کردن سگبچه
     */
    void weep() {
        super.energy = super.energy - 2;
    }
}
