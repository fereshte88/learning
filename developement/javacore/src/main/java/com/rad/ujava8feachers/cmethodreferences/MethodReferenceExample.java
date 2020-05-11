package com.rad.ujava8feachers.cmethodreferences;

/**
 * Java Method References
 *
 * Java provides a new feature called method reference in Java 8.
 * Method reference is used to refer method of functional interface.
 * It is compact and easy form of lambda expression.
 * Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference.
 * In this tutorial, we are explaining method reference concept in detail.
 * جاوا از ویژگی جدیدی به نام مرجع متد در جاوا 8 استفاده می کند.
 * از مرجع متد برای ارجاع متد رابط کاربری استفاده می شود. این فرم کم و آسان بیان لامبدا است
 * . هر بار که از عبارت lambda استفاده می کنید و فقط یک متد را ارجاع می دهید ، می توانید عبارت lambda را با استفاده از method reference. جایگزین کنید.
 * در این آموزش ، ما به تفصیل مفهوم مرجع روش را توضیح می دهیم.
 */

/**
 * Types of Method References
 *
 * There are following types of method references in java:
 *
 *     Reference to a static method.
 *     Reference to an instance method.
 *     Reference to a constructor.
 */

import java.util.function.BiFunction;

/**
 * 1) Reference to a Static Method
 *
 * You can refer to static method defined in the class. Following is the syntax and example which describe the process of referring static method in Java.
 *می توانید به روش استاتیک تعریف شده در کلاس مراجعه کنید. در زیر نحو و نمونه ای که فرایند مراجعه به روش استاتیک در جاوا را شرح می دهد آورده شده است.
 * Syntax
 *
 *     ContainingClass::staticMethodName
 */
class Arithmetic{
    public static int add(int a, int b){
        return a+b;
    }
    public int add1(int a, int b){
        return a+b;
    }
    public static float add(int a, float b){
        return a+b;
    }
    public static float add(float a, float b){
        return a+b;
    }
}

interface Messageable{
    Message getMessage(String msg);
}
class Message{
    Message(String msg){
        System.out.print(msg);
    }
}
public class MethodReferenceExample {

    //*****************************************************************

    /**
     * In the following example, we have defined a functional interface and referring a static method to it's functional method say().
     */
    interface Sayable{
        String say();
    }
    public static String saySomething(){
        return "Hello, this is static method.";
    }
    public static String referringStaticMethod() {
        // Referring static method
        Sayable sayable = MethodReferenceExample::saySomething;
        // Calling interface method
       return sayable.say();
    }
    //*****************************************************************
    /**
     * In the following example, we are using predefined functional interface Runnable to refer static method.
     */
    public static void threadStatus(){
        System.out.println("Thread is running...");
    }
    public void threadRunnable() {
        Runnable r = MethodReferenceExample::threadStatus;
        Thread t2=new Thread(r);
        Thread t1=new Thread(new Custom());
        t2.start();
    }
    class Custom implements Runnable{
         public void run(){
            threadStatus();
        }
    }

    //*****************************************************************
    /**
     * You can also use predefined functional interface to refer methods. In the following example, we are using BiFunction interface and using it's apply() method.
     */
    public int adder(int a, int b) {
        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        int result = adder.apply(a, b);
        return result;
    }
    //*****************************************************************
    /**
     * You can also override static methods by referring methods. In the following example, we have defined and overloaded three add methods.
     */
    public void overloadedMethod() {
        BiFunction<Integer, Integer, Integer>adder1 = Arithmetic::add;
        BiFunction<Integer, Float, Float>adder2 = Arithmetic::add;
        BiFunction<Float, Float, Float>adder3 = Arithmetic::add;
        int result1 = adder1.apply(10, 20);
        float result2 = adder2.apply(10, 20.0f);
        float result3 = adder3.apply(10.0f, 20.0f);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
    //*****************************************************************

    /**
     * 2) Reference to an Instance Method
     *
     * like static methods, you can refer instance methods also. In the following example, we are describing the process of referring the instance method.
     *مانند متد های استاتیک ، می توانید به nstance methods نیز مراجعه کنید. در مثال زیر ، ما در حال توصیف روند مراجعه به instance method هستیم.
     * Syntax
     *
     *     containingObject::instanceMethodName
     */
    interface Sayable1{
        String say();
    }
    public String saySomething1(){
        return "Hello, this is non-static method.";
    }
    public String interfaceMethod() {
        MethodReferenceExample methodReference = new MethodReferenceExample(); // Creating object
        // Referring non-static method using reference
        Sayable1 sayable = methodReference::saySomething1;
        // Calling interface method
        // Referring non-static method using anonymous object
        Sayable1 sayable2 = new MethodReferenceExample()::saySomething1; // You can use anonymous object also
        // Calling interface method
       return "Creating object "+sayable.say() +" **  anonymous object  "+ sayable2.say();
    }
    //*****************************************************************
    /**
     * In the following example, we are referring instance (non-static) method. Runnable interface contains only one abstract method. So, we can use it as functional interface.
     */
    public void printnMsg(){
        System.out.println("Hello, this is instance method");
    }
    public void threadNonStatic() {
        Thread t2=new Thread(new MethodReferenceExample()::printnMsg);
        t2.start();
    }
    //*****************************************************************
    /**
     * In the following example, we are using BiFunction interface. It is a predefined interface and contains a functional method apply(). Here, we are referring add method to apply method.
     */
    public int adderNonStatic(int a, int b) {
        BiFunction<Integer, Integer, Integer>adder = new Arithmetic()::add1;
        int result = adder.apply(a, b);
        return result;
    }
    //*****************************************************************
    /**
     * 3) Reference to a Constructor
     *
     * You can refer a constructor by using the new keyword. Here, we are referring constructor with the help of functional interface.
     *با استفاده از کلید واژه جدید می توانید به سازنده ارجاع دهید. در اینجا ، ما به کمک functional interface به سازنده ارجاع می دهیم.
     * Syntax
     *
     *     ClassName::new
     */

    public void constructor(String msg) {
        Messageable hello = Message::new;
        hello.getMessage(msg);
    }
}
