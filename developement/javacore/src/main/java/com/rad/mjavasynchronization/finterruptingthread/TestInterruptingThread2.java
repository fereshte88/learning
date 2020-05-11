package com.rad.mjavasynchronization.finterruptingthread;

/**
 * Example of interrupting a thread that doesn't stop working
 * In this example, after interrupting the thread, we handle the exception, so it will break out the sleeping but will not stop working.
 */
public class TestInterruptingThread2 extends Thread{
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("task");
        }catch(InterruptedException e){
            System.out.println("Exception handled "+e);
        }
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        TestInterruptingThread2 t1=new TestInterruptingThread2();
        t1.start();
        t1.interrupt();

    }
}
