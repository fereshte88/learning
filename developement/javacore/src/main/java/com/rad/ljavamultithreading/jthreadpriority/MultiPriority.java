package com.rad.ljavamultithreading.jthreadpriority;
/*
Priority of a Thread (Thread Priority):
Each thread have a priority. Priorities are represented by a number between 1 and 10.
 In most cases, thread schedular schedules the threads according to their priority (known as preemptive scheduling).
 But it is not guaranteed because it depends on JVM specification that which scheduling it chooses.
3 constants defined in Thread class:

    public static int MIN_PRIORITY
    public static int NORM_PRIORITY
    public static int MAX_PRIORITY

Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.
 */
public class MultiPriority extends Thread {
    public MultiPriority(String name) {
        super(name);
    }

    public void run(){
        System.out.println("running thread name is:"+Thread.currentThread().getName()+"   running thread priority is:"+Thread.currentThread().getPriority());
//        System.out.println("running thread priority is:"+Thread.currentThread().getPriority());

    }
//     Runnable showPriority(){
//        MultiPriority m1=new MultiPriority("m1");
//        MultiPriority m2=new MultiPriority("m2");
//        m1.setPriority(Thread.MIN_PRIORITY);
//        m2.setPriority(Thread.MAX_PRIORITY);
//        m1.start();
//        m2.start();
//        return this::run;
//    }
}
