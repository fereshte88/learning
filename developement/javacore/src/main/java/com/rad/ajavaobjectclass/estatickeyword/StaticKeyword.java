package com.rad.ajavaobjectclass.estatickeyword;

//The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes.
//The static keyword belongs to the class than an instance of the class.
//The static can be:
//Variable (also known as a class variable)
//Method (also known as a class method)
//Block
//Nested class
//کلمه کلیدی static در جاوا عمدتا برای مدیریت حافظه استفاده می شود. ما می توانیم کلمه کلیدی static را برای متغیرها ، متد ها ، بلوک ها و کلاس هایinner قرار دهیم.
// کلمه کلیدی static متعلق به کلاس است تا نمونه ای از کلاس.
//موارد زیر میتوانند استاتیک باشد:
//متغیر (همچنین به عنوان یک متغیر کلاس شناخته می شود)
//متد (همچنین به عنوان یک متد کلاس شناخته می شود)
//بلاک کد
//کلاس Nested
//
//Why is the Java main method static?
//It is because the object is not required to call a static method.
//If it were a non-static method, JVM creates an object first then call main() method that will lead the problem of extra memory allocation.
//چرا متد main جاوا استاتیک است؟
//به این دلیل است که شیء نیازی به فراخوانی یک متد static ندارد.
// اگر این یک متد غیر استاتیک بود ، JVM ابتدا یک شیء ایجاد می کرد و سپس متدmain را صدا می کند که مشکل تخصیص حافظه اضافی را به وجود می آورد.
//
//Can we execute a program without main() method?
//No, one of the ways was the static block, but it was possible till JDK 1.6. Since JDK 1.7, it is not possible to execute a Java class without the main method.
//آیا می توانیم یک برنامه را بدون متد main اجرا کنیم؟
//نه ، یکی از راه ها بلوک استاتیک بود ، اما تا JDK 1.6 امکان پذیر بود. از JDK 1.7 ، اجرای یک کلاس جاوا بدون متد main امکان پذیر نیست.
public class StaticKeyword {
    //متغیر استاتیک
    public static Integer count = 0;

    //بلوک استاتیک
    //برای اولیه سازی عضو داده استاتیک استفاده می شود.
    //قبل از روش اصلی در زمان بارگذاری کلاس اجرا می شود.
    static {
        count = 0;
    }

    private void test(){

    }

    //متد استاتیک
    static void change() {
        count++;
        StaticKeyword staticKeyword = new StaticKeyword();
        staticKeyword.test();
    }
}
