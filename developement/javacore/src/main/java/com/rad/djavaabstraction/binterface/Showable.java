package com.rad.javacore.djavaabstraction.binterface;

//Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
//As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of ambiguity.
//However, it is supported in case of an interface because there is no ambiguity.
//It is because its implementation is provided by the implementation class.
//وراثت چندگانه از طریق کلاس در جاوا پشتیبانی نمی شود ، اما با یک رابط امکان پذیر است ، چرا؟
//همانطور که در فصل ارث بری توضیح داده ایم ، به دلیل ابهام از ارث چندگانه در مورد کلاس پشتیبانی نمی شود.
//اما ، در صورت وجود رابط پشتیبانی می شود زیرا هیچ ابهام وجود ندارد.
//به این دلیل است که اجرای آن توسط کلاس اجرا ارائه می شود.
public interface Showable {
    /**
     * پرینت محتویات
     * این متد با متد print در Printable هم نام هستند و در کلاس PaperA4 وراثت چندگانه به وجود می آورد
     * که چون در کلاس یکبار پیاده سازی این دو متد print همنام از دو اینترفیس پیاده سازی انجام میشود دیگر ابهامی ندارد
     *
     * @return خروجی: نتیجه
     */
    String print();
}
