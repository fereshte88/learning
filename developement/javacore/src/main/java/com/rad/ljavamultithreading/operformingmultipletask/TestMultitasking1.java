package com.rad.ljavamultithreading.operformingmultipletask;

/**
 * How to perform single task by multiple threads?
 * If you have to perform single task by many threads, have only one run() method.For example:
 */
public class TestMultitasking1 extends Thread{
    public void run(){
        System.out.println("task one");
    }
    public static void main(String args[]){
        TestMultitasking1 t1=new TestMultitasking1();
        TestMultitasking1 t2=new TestMultitasking1();
        TestMultitasking1 t3=new TestMultitasking1();

        t1.start();
        t2.start();
        t3.start();
    }
}
