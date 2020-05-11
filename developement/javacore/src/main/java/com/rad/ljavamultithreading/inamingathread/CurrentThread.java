package com.rad.ljavamultithreading.inamingathread;
/*
The currentThread() method returns a reference to the currently executing thread object.
Syntax:
public static Thread currentThread()
 */
public class CurrentThread extends Thread {
    public void run(){

        System.out.println(this.getName());
        System.out.println(Thread.currentThread().getName());
    }


}
