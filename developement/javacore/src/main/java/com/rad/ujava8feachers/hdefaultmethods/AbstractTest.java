package com.rad.ujava8feachers.hdefaultmethods;

/**
 * Abstract Class vs Java 8 Interface
 *
 * After having default and static methods inside the interface, we think about the need of abstract class in Java.
 * An interface and an abstract class is almost similar except that you can create constructor in the abstract class whereas you can't do this in interface.
 * بعد از داشتن روش های پیش فرض و استاتیک در داخل رابط ، ما به نیاز کلاس انتزاعی در جاوا فکر می کنیم.
 * یک رابط و یک کلاس انتزاعی تقریباً مشابه است به جز اینکه می توانید یک سازنده در کلاس انتزاعی ایجاد کنید در حالی که نمی توانید این کار را با رابط انجام دهید.
 */
abstract class AbstractClass{
    public AbstractClass() {        // constructor
        System.out.println("You can create constructor in abstract class");
    }
    abstract int add(int a, int b); // abstract method
    int sub(int a, int b){      // non-abstract method
        return a-b;
    }
    static int multiply(int a, int b){  // static method
        return a*b;
    }
}
public class AbstractTest extends AbstractClass{
    public int add(int a, int b){        // implementing abstract method
        return a+b;
    }
    public String abstractExample(int a, int b) {
        AbstractTest abstractTest = new AbstractTest();
        int result1 = abstractTest.add(a, b);    // calling abstract method
        int result2 = abstractTest.sub(a, b);    // calling non-abstract method
        int result3 = AbstractClass.multiply(a, b); // calling static method
        return "Addition: "+result1+" Substraction: "+result2+" Multiplication: "+result3;
    }
}
