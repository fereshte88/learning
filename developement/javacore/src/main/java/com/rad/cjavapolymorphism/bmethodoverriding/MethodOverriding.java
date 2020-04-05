package com.rad.cjavapolymorphism.bmethodoverriding;

//MethodOverriding:
//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
//In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.
//Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
//Method overriding is used for runtime polymorphism
//اگر زیر کلاس (کلاس کودک) همان متدی را که در کلاس والدین اعلام شده است داشته باشد ، به عنوان متدی که در جاوا  به نام override مشهور است شناخته می شود.
//به عبارت دیگر ، اگر یک زیر کلاس اجرای خاصی از متدی را که توسط یکی از کلاسهای والدین خود اعلام شده است فراهم کند ، به عنوان متد اصلی شناخته می شود.
//متد overriding برای ارائه اجرای خاص متد که قبلاً توسط ابر کلاس آن ارائه شده است ، استفاده می شود.
//متد overriding برای چندریختی در زمان اجرا استفاده می شود
//
//Rules for Java Method Overriding:
//The method must have the same name as in the parent class
//The method must have the same parameter as in the parent class.
//There must be an IS-A relationship (inheritance).
//این متد باید به همان نام متد در کلاس والدین باشد
//متد باید همان پارامتر را در متد کلاس والدین داشته باشد.
//باید یک رابطه IS-A (ارث) برقرار شود.
//
//Can we override static method?
//No, a static method cannot be overridden. It can be proved by runtime polymorphism, so we will learn it later.
//آیا می توانیم متدهای استاتیک را override کنیم؟
//خیر ، یک متد استاتیک نمی تواند override شود. می توان آن را با polymorphism در زمان اجرا ثابت کرد ، بنابراین بعداً آن را خواهیم آموخت.
//
//Why can we not override static method?
//It is because the static method is bound with class whereas instance method is bound with an object.
//Static belongs to the class area, and an instance belongs to the heap area.
//چرا نمی توانیم متدهای استاتیک را override کنیم؟
//به این دلیل است که متد استاتیک با کلاس پیوند دارد در حالی که متد شیی با یک شیی محدود است.
//استاتیک متعلق به منطقه کلاس است و یک شیی به منطقه پشته تعلق دارد.
//
//Can we override java main method?
//No, because the main is a static method.
//آیا می توانیم متد main جاوا را override کنیم؟
//نه ، زیرا متد main استاتیک است.
//
public class MethodOverriding {
    public Integer getRateOfInterest() {
        return 0;
    }
}

class MethodOverridingChild extends MethodOverriding {
    public Integer getRateOfInterest() {
        return 1;
    }
}

