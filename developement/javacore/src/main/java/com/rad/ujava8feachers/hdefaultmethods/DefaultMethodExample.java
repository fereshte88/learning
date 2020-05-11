package com.rad.ujava8feachers.hdefaultmethods;

/**
 * Java Default Methods
 *
 * Java provides a facility to create default methods inside the interface. Methods which are defined inside the interface and tagged with default are known as default methods.
 * These methods are non-abstract methods.
 * جاوا امکان ایجاد متدهای پیش فرض در رابط را فراهم می کند.
 * متد هایی که درون رابط تعریف شده و با پیش فرض برچسب گذاری شده اند ، به عنوان متد های پیش فرض شناخته می شوند. این متدها متدهای غیر انتزاعی هستند.
 * Java Default Method Example
 *
 * In the following example, Sayable is a functional interface that contains a default and an abstract method.
 * The concept of default method is used to define a method with default implementation.
 * You can override default method also to provide more specific implementation for the method.
 * در مثال زیر ، Sayable یک رابط کاربری است که شامل یک پیش فرض و یک روش انتزاعی است. مفهوم روش پیش فرض برای تعریف یک متد با اجرای پیش فرض استفاده می شود.
 * می توانید از روش پیش فرض نیز استفاده کنید تا اجرای خاص تری را برای این روش ارائه دهید.
 */
interface Sayable{
    // Default method
    default String say(){
        return "Hello, this is default method";
    }
    // Abstract method
    String sayMore(String msg);
    // static method
    static String sayLouder(String msg){
        return msg;
    }
}
public class DefaultMethodExample implements Sayable {
    public String sayMore(String msg){        // implementing abstract method
        return msg;
    }
    public String defaultExample(String str, String str1) {
        DefaultMethodExample dm = new DefaultMethodExample();
          // calling default method
        ;  // calling abstract method
        return dm.say() +" "+dm.sayMore(str)+" "+Sayable.sayLouder(str1);
    }
}
