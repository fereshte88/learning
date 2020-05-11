package com.rad.mjavasynchronization.finterruptingthread;

/**
 * What about isInterrupted and interrupted method?
 * The isInterrupted() method returns the interrupted flag either true or false. The static interrupted() method returns the interrupted flag afterthat it sets the flag to false if it is true.
 */
public class TestInterruptingThread4 extends Thread{

    public void run(){
        for(int i=1;i<=2;i++){
            if(this.isInterrupted()){
                System.out.println("code for interrupted thread");
            }
            else{
                System.out.println("code for normal thread");
            }

        }//end of for loop
    }

    public static void main(String args[]) throws InterruptedException {

        TestInterruptingThread4 t1=new TestInterruptingThread4();
        TestInterruptingThread4 t2=new TestInterruptingThread4();

        t1.start();
        t2.start();
        t2.interrupt();
        Thread.sleep(5000);
        t1.interrupt();
        System.out.println(t1.isInterrupted());


    }
}
