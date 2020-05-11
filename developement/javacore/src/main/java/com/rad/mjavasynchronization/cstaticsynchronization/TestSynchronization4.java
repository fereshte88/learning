package com.rad.mjavasynchronization.cstaticsynchronization;
/*
Static Synchronization
If you make any static method as synchronized, the lock will be on the class not on object.
اگر هر روش استاتیک را به صورت هماهنگ انجام دهید ، قفل روی کلاس خواهد بود نه روی شی.
 */
/*
Problem without static synchronization
Suppose there are two objects of a shared class(e.g. Table) named object1 and object2.
In case of synchronized method and synchronized block there cannot be interference between t1 and t2 or t3 and t4 because t1 and t2 both refers to a common object that have a single lock.
But there can be interference between t1 and t3 or t2 and t4 because t1 acquires another lock and t3 acquires another lock.
I want no interference between t1 and t3 or t2 and t4.
Static synchronization solves this problem.
فرض کنید دو شی  از یک کلاس مشترک وجود دارد (به عنوان مثال Table) به نام object1 و object2.
 در صورت استفاده از متد synchronized و بلوک synchronized ، نمی توان تداخل بین t1 و t2 یا t3 و t4 را ایجاد کرد زیرا t1 و t2 هر دو به یک شیء مشترک اشاره دارند. یک قفل واحد وجود دارد.
 اما t1 و t3 یا t2 و t4 می توانند تداخل ایجاد کنند زیرا t1 قفل دیگری را بدست می آورد و t3 قفل دیگری را بدست می آورد.
 من نمی خواهم تداخلی بین t1 و t3 یا t2 و t4 باشد.

 */
class Table{

    static synchronized void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){}
        }
    }
}

class MyThread1 extends Thread{
    public void run(){
        Table.printTable(1);
    }
}

class MyThread2 extends Thread{
    public void run(){
        Table.printTable(10);
    }
}

class MyThread3 extends Thread{
    public void run(){
        Table.printTable(100);
    }
}




class MyThread4 extends Thread{
    public void run(){
        Table.printTable(1000);
    }
}

public class TestSynchronization4{
    public static void main(String t[]){
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        MyThread3 t3=new MyThread3();
        MyThread4 t4=new MyThread4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
