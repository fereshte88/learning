package com.rad.javacore.ajavaobjectclass.dconstructor;

//In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created.
// At the time of calling constructor, memory for the object is allocated in the memory.
//It is a special type of method which is used to initialize the object.
//Every time an object is created using the new() keyword, at least one constructor is called.
//در جاوا ، سازنده بلوک کدهای مشابه با متد است.
// وقتی نمونه ای از کلاس ایجاد می شود ، فراخوانی می شود. در زمان تماس با سازنده ، حافظه برای شیی در حافظه اختصاص می یابد.
//این یک نوع ویژه از متد است که برای اولیه سازی شی استفاده می شود.
//هر بار که یک شی با استفاده از کلید واژه new ایجاد شود ، حداقل یک سازنده فراخوانی می شود.
//
//Rules for creating Java constructor:
//Constructor name must be the same as its class name
//A Constructor must have no explicit return type
//A Java constructor cannot be abstract, static, final, and synchronized
//قوانینی برای ایجاد سازنده جاوا
//نام سازنده باید برابر با نام کلاس باشد
//یک سازنده نباید از نوع بازگشت صریح برخوردار باشد
//یک سازنده جاوا نمی تواند abstract ، static ، final و synchronized باشد
//
//Types of Java constructors:
//Default constructor (no-arg constructor)
//Parameterized constructor
//انواع سازندگان جاوا
//سازنده پیش فرض (سازنده بدون بحث)
//سازنده پارامتری
//
//Constructor Overloading:
//Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.
// They are arranged in a way that each constructor performs a different task.
//They are differentiated by the compiler by the number of parameters in the list and their types.
//تکنیک Constructor Overloading در جاوا تکنیکی برای داشتن بیش از یک سازنده با لیست پارامترهای مختلف است.
// آنها به گونه ای ترتیب داده شده اند که هر سازنده وظیفه متفاوتی را انجام می دهد.
// آنها با توجه به تعداد پارامترهای موجود در لیست و انواع آنها توسط کامپایلر متمایز می شوند.
//
//Does constructor return any value?
//Yes, it is the current class instance (You cannot use return type yet it returns a value).
//آیا سازنده مقداری خروجی میدهد؟
//بله ، آن نمونه کلاس فعلی است (شما نمی توانید هنوز از نوع خروجی استفاده کنید ، اما یک مقدار را برمی گرداند).
//
//
public class Constructor {
    //شناسه
    private Integer id;
    //نام
    private String name;

    /**
     * سازنده پیش فرض
     */
    Constructor() {
        this.id = 1;
    }

    /**
     * سازنده پارامتری
     *
     * @param id   شناسه
     * @param name نام
     */
    Constructor(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * متد خروجی دهنده شناسه
     * @return خروجی: شناسه
     */
    public Integer getId() {
        return id;
    }
}
