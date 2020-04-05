package com.rad.djavaabstraction.binterface;

//Nested Interface in Java:
//Note: An interface can have another interface which is known as a nested interface.
//We will learn it in detail in the nested classes chapter.
//رابط تودرتو در جاوا:
//توجه: یک رابط می تواند یک رابط دیگر داشته باشد که به عنوان یک رابط تودرتو شناخته می شود.
//ما آن را با جزئیات در فصل کلاس های تو در تو می آموزیم.
public interface Nested {
    String messageNested();

    interface NestedChild {
        String messageNestedChild();
    }
}
