package com.rad.ljavamultithreading.esleepingathread;
/*
Sleep method in java
The sleep() method of Thread class is used to sleep a thread for the specified amount of time.
Syntax of sleep() method in java
The Thread class provides two methods for sleeping a thread:
    public static void sleep(long miliseconds)throws InterruptedException
    public static void sleep(long miliseconds, int nanos)throws InterruptedException


 */
public class SleepMethod extends Thread {


    public SleepMethod(String name) {
        super(name);
    }

    public void run() {

        System.out.println("thread sleep   "+this.getName());
        for (int i = 1; i < 5; i++) {
            long time = (long) (Math.random()*5000);
            try {

                Thread.sleep(time);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i+"  "+this.getName()+"  "+time);
        }
    }

}
//As you know well that at a time only one thread is executed. If you sleep a thread for the specified time,the thread shedular picks up another thread and so on.
//همانطور که می دانید در یک زمان فقط یک thread اجرا می شود. اگر thread را برای زمان مشخص شده sleep شد ، thread scheduler یک thread دیگری را انتخاب می کند و مواردی از این دست.