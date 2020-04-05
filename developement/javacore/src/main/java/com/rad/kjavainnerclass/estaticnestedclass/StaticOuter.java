package com.rad.kjavainnerclass.estaticnestedclass;
/*
A static class i.e. created inside a class is called static nested class in java. It cannot access non-static data members and methods. It can be accessed by outer class name.
    It can access static data members of outer class including private.
    Static nested class cannot access non-static (instance) data member or method.
کلاس استاتیک ایجاد شده در داخل یک کلاس با نام کلاس استاتیک در جاوا نامیده می شود.
 این دسترسی به اعضا و متد های داده غیر استاتیک نمی تواند دسترسی داشته باشد. با نام کلاس بیرونی قابل دسترسی است.
     این می تواند به اعضای داده های استاتیک کلاس خارجی از جمله خصوصی دسترسی داشته باشد.
     کلاس استاتیک تو در تو نمی تواند عضو یا متد داده غیر استاتیک (instance) دسترسی داشته باشد.

 */
public class StaticOuter {
    static int data=30;
    static class Inner{
        int msg(){return data;}
    }
}
/*
In this example, you need to create the instance of static nested class because it has instance method msg().
But you don't need to create the object of Outer class because nested class is static and static properties, methods or classes can be accessed without object.
در این مثال ، شما باید نمونه کلاس استاتیک nested را ایجاد کنید زیرا این متد به عنوان مثال msg () دارد.
 اما شما نیازی به ایجاد شیء کلاس Outer ندارید زیرا کلاس nested استاتیک است و متد ها یا کلاس ها بدون شی قابل دسترسی هستند.

 */
/*
Internal class generated by the compiler

    import java.io.PrintStream;
    static class TestOuter1$Inner
    {
    TestOuter1$Inner(){}
    void msg(){
    System.out.println((new StringBuilder()).append("data is ")
    .append(TestOuter1.data).toString());
    }
    }
 */