package com.rad.mjavasynchronization.asynchronizationinjava;

/**
 * In this program, we have created the two threads by annonymous class, so less coding is required.
 */
//Program of synchronized method by using annonymous class
class Table2{
    synchronized void printTable(int n){//synchronized method
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

public class TestSynchronization3{
    public static void main(String args[]){
        final Table2 obj = new Table2();//only one object

        Thread t1=new Thread(){
            public void run(){
                obj.printTable(5);
            }
        };
        Thread t2=new Thread(){
            public void run(){
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
}
