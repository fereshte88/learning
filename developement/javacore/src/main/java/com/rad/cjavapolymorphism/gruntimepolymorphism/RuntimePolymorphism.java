package com.rad.cjavapolymorphism.gruntimepolymorphism;

//Polymorphism in Java:
//Polymorphism in Java is a concept by which we can perform a single action in different ways.
//Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.
//There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. We can perform polymorphism in java by method overloading and method overriding.
//If you overload a static method in Java, it is the example of compile time polymorphism. Here, we will focus on runtime polymorphism in java.
//پلی مورفیسم در جاوا:
//پلی مورفیسم در جاوا مفهومی است که توسط آن می توانیم یک عمل واحد را به روش های مختلف انجام دهیم.
// پلی مورفیسم از 2 کلمه یونانی گرفته شده است: pol و morphs. کلمه "پلی" به معنی بسیاری است و "morphs" به معنای اشکال است. بنابراین polymorphism به معنای اشکال مختلف است.
//در جاوا دو نوع پلی مورفیسم وجود دارد: پلی مورفیسم زمان کامپایل  و  پلی مورفیسم زمان اجرا. ما می توانیم با استفاده از روش overloading متد و overriding متد پلی مورفیسم در جاوا را انجام دهیم.
//اگر یک متد استاتیک را در جاوا overload کنید ، نمونه ای از پلی مورفیسم زمان کامپایل است. در اینجا ، ما به پلی مورفیسم زمان اجرا در جاوا خواهیم پرداخت.
//
//Runtime Polymorphism in Java:
//Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.
//In this process, an overridden method is called through the reference variable of a superclass.
//The determination of the method to be called is based on the object being referred to by the reference variable.
//Let's first understand the upcasting before Runtime Polymorphism.
//پلی مورفیسم زمان اجرا در جاوا:
//در این فرآیند ، یک متد overridden از طریق متغیر مرجع یک superclass فراخوانی می شود.
// تعیین متدی که باید فراخوانی شود براساس شیء مورد استفاده متغیر مرجع است.
//بیایید ابتدا upcasting را قبل از Runtime Polymorphism درک کنیم.
//
//Upcasting:
//If the reference variable of Parent class refers to the object of Child class, it is known as upcasting.
//صعود:
//اگر متغیر مرجع کلاس Parent به شیی کلاس Child اشاره داشته باشد ، به عنوان upcasting شناخته می شود.
//
//

public class RuntimePolymorphism {
    public Upcasting getUpcastingObject() {
        UpcastingChild upcastingChild = new UpcastingChild();
        Upcasting upcasting = upcastingChild;
        return upcasting;
    }
}

interface UpcastingInterface {
}

class Upcasting {
    Integer speedLimit = 90;
}

class UpcastingChild extends Upcasting implements UpcastingInterface {
    //A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.
    //یک متد میتواند overridden شود ، نه اعضای داده ، بنابراین پلی مورفیسم زمان اجرا توسط اعضای داده قابل دستیابی نیست.
    Integer speedLimit = 120;
}