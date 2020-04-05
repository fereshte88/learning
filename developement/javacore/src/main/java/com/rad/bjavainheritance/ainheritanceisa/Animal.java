package com.motaharinia.javacore.bjavainheritance.ainheritanceisa;

//Why multiple inheritance is not supported in java?
//To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
//Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes.
//If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.
//Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes.
//So whether you have same method or different, there will be compile time error.
//چرا ارث چندگانه در جاوا پشتیبانی نمی شود؟
//برای کاهش پیچیدگی و ساده کردن زبان ، ارث چندگانه در جاوا پشتیبانی نمی شود.
//سناریویی را در نظر بگیرید که A ، B و C سه کلاس هستند. کلاس C کلاس A و B را به ارث می برد.
//اگر کلاس A و B یک متد را داشته باشد و شما آن را از کلاس کودک فراخوانی کنید ، ابهام وجود خواهد داشت که از متد کلاس A یا B استفاده شود.
//از آنجا که خطاهای زمان کامپایل بهتر از خطاهای زمان اجرا هستند ، اگر 2 کلاس را به ارث ببرید ، جاوا را خطا وارد می کند.
//بنابراین چه شما یک متد مشابه داشته باشید و چه متفاوت ، خطای زمانی کامپایل وجود خواهد داشت.
public class Animal {
    //میزان انرژی حیوان
    protected Integer energy = 0;

    /**
     * غذا خوردن حیوان
     */
    void eat() {
        this.energy = this.energy + 10;
    }

    /**
     * خروجی دهنده میزان انرژی حیوان
     *
     * @return خروجی: میزان انرژی حیوان
     */
    public Integer getEnergy() {
        return this.energy;
    }
}
