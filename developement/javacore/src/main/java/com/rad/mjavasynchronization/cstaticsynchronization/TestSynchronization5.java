package com.rad.mjavasynchronization.cstaticsynchronization;
//In this example, we are using annonymous class to create the threads.
class Table1{

    synchronized static  void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){}
        }
    }
}

public class TestSynchronization5 {
    public static void main(String[] args) {

        Thread t1=new Thread(){
            public void run(){
                Table.printTable(1);
            }
        };

        Thread t2=new Thread(){
            public void run(){
                Table.printTable(10);
            }
        };

        Thread t3=new Thread(){
            public void run(){
                Table.printTable(100);
            }
        };

        Thread t4=new Thread(){
            public void run(){
                Table.printTable(1000);
            }
        };
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
/*
Synchronized block on a class lock:

The block synchronizes on the lock of the object denoted by the reference .class name .class.
A static synchronized method printTable(int n) in class Table is equivalent to the following declaration:

    static void printTable(int n) {
        synchronized (Table.class) {       // Synchronized block on class A
            // ...
        }
    }
 */