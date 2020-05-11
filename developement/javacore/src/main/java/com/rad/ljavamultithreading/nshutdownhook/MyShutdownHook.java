package com.rad.ljavamultithreading.nshutdownhook;

/**
 * The shutdown hook can be used to perform cleanup resource or save the state when JVM shuts down normally or abruptly.
 * Performing clean resource means closing log file, sending some alerts or something else.
 * So if you want to execute some code before JVM shuts down, use shutdown hook.
 * ق shutdownhook می تواند برای انجام پاکسازی منابع یا ذخیره حالت هنگامی که JVM به طور عادی یا ناگهانی خاموش می شود ، استفاده شود.
 * انجام منابع پاک به معنای بستن پرونده ورود به سیستم ، ارسال هشدارها یا چیز دیگری است.
 * بنابراین اگر می خواهید قبل از خاموش شدن JVM ، برخی از کد ها را اجرا کنید ، از shutdownhook استفاده کنید.
 */

/**
 * When does the JVM shut down?
 * The JVM shuts down when:
 *
 *     user presses ctrl+c on the command prompt
 *     System.exit(int) method is invoked
 *     user logoff
 *     user shutdown etc.
 */

/**
 * The addShutdownHook(Thread hook) method
 * The addShutdownHook() method of Runtime class is used to register the thread with the Virtual Machine. Syntax:
 * متد addShutdownHook () از کلاس Runtime برای ثبت thread در ماشین مجازی استفاده می شود. نحو:
 *     public void addShutdownHook(Thread hook){}
 * The object of Runtime class can be obtained by calling the static factory method getRuntime(). For example:
 * شی کلاس runtime میتواند از صدا زدن static factory method getRuntime() بدست بیاد
 * Runtime r = Runtime.getRuntime();
 * Factory method
 * The method that returns the instance of a class is known as factory method.
 * متدی که نمونه کلاس را برمی گرداند به عنوان factory method شناخته می شود.
 */
public class MyShutdownHook  extends Thread{
    public void run(){
        System.out.println("shut down hook task completed..");
    }
}

class TestShutdown1{
    public static void main(String[] args)throws Exception {

        Runtime r=Runtime.getRuntime();
        r.addShutdownHook(new MyShutdownHook());

        System.out.println("Now main sleeping... press ctrl+c to exit");
        try{Thread.sleep(3000);}catch (Exception e) {}
    }
}
//Note: The shutdown sequence can be stopped by invoking the halt(int) method of Runtime class.