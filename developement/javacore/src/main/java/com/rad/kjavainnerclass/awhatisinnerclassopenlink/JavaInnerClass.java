package com.rad.kjavainnerclass.awhatisinnerclassopenlink;

public class JavaInnerClass {
    /*
    Java inner class or nested class is a class which is declared inside the class or interface.
We use inner classes to logically group classes and interfaces in one place so that it can be more readable and maintainable.
Additionally, it can access all the members of outer class including private data members and methods.
کلاس داخلی جاوا یا کلاس nested ، کلاس است که در داخل کلاس یا interface اعلام می شود.
ما از inner class استفاده می کنیم تا کلاس ها و interface ها را به صورت منطقی گروه بندی کنیم تا امکان خواندن و نگهداری آن بیشتر باشد.
علاوه بر این ، می تواند به همه اعضای کلاس بیرونی از جمله اعضای داده خصوصی و متد ها دسترسی پیدا کند.
     */

    //Syntax of Inner class

    class Java_Outer_class{
        //code
        class Java_Inner_class{
            //code
        }
    }
    /*
    Advantage of java inner classes
There are basically three advantages of inner classes in java. They are as follows:
1) Nested classes represent a special type of relationship that is it can access all the members (data members and methods) of outer class including private.
2) Nested classes are used to develop more readable and maintainable code because it logically group classes and interfaces in one place only.
3) Code Optimization: It requires less code to write.
مزیت کلاسهای درونی جاوا
اساساً سه مزیت کلاسهای داخلی در جاوا وجود دارد. آنها به شرح زیر است:
1) کلاس هایnested نشان دهنده نوع خاصی از رابطه است که می تواند به همه اعضا (اعضای داده و متد ها) کلاس خارجی از جمله خصوصی دسترسی داشته باشد.
2) از کلاس های تو در تو برای استفاده از کد قابل خواندن و نگهداری بیشتر استفاده می شود زیرا به طور منطقی کلاس ها و رابط ها را فقط در یک مکان گروه بندی می کند.
3) بهینه سازی کد: برای نوشتن به کد کمتری احتیاج دارد.

     */
    /*
    Difference between nested class and inner class in Java
Inner class is a part of nested class. Non-static nested classes are known as inner classes.
تفاوت بین کلاس nested و کلاس داخلی در جاوا
کلاس داخلی بخشی از کلاسnested است. کلاس های nested غیر استاتیک به عنوان کلاس های داخلی شناخته می شوند.
     */

    /*
    Types of Nested classes

There are two types of nested classes non-static and static nested classes.The non-static nested classes are also known as inner classes.

    Non-static nested class (inner class)
        Member inner class
        Anonymous inner class
        Local inner class
    Static nested class

//
Member Inner Class	A class created within class and outside method.
Anonymous Inner Class	A class created for implementing interface or extending class. Its name is decided by the java compiler.
Local Inner Class	A class created within method.
Static Nested Class	A static class created within class.
Nested Interface	An interface created within class or interface.
     */
}
