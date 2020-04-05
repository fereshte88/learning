package com.rad.kjavainnerclass.dlocalinnerclass;
/*
A class i.e. created inside a method is called local inner class in java. If you want to invoke the methods of local inner class, you must instantiate this class inside the method.
کلاسی که در داخل یک متد ایجاد می شود کلاس داخلی محلی در جاواگفته می شود..
 اگر می خواهید از متد های کلاس داخلی محلی فراخوانی کنید ، باید این کلاس را در داخل متد  نمونه ایجاد شده از کلاس فراخوانی کنید.
 */
public class LocalInner {
    private int data = 30;//instance variable

    int display() {
       final int value=50;//local variable must be final till jdk 1.7 only
        class Local {
            private int a;
            int msg() {
                return data+value;
            }
        }
        Local l = new Local();
        return l.msg();
    }
}
/*
Internal class generated by the compiler
In such case, compiler creates a class named Simple$1Local that have the reference of the outer class.
 */
//------------------Ruls
/*
Rule: Local variable can't be private, public or protected.
1) Local inner class cannot be invoked from outside the method.
2) Local inner class cannot access non-final local variable till JDK 1.7. Since JDK 1.8, it is possible to access the non-final local variable in local inner class.
 */