package com.rad.mjavasynchronization.asynchronizationinjava;

/**
 * If you declare any method as synchronized, it is known as synchronized method.
 * Synchronized method is used to lock an object for any shared resource.
 * When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task.
 * اگر هر متدی را به عنوان synchronized اعلام کنید ، به عنوان متد synchronized شناخته می شود.
 * از متد synchronized برای قفل کردن یک شی برای هر منبع مشترک استفاده می شود.
 * هنگامی که نخ یک متد synchronized را فراخوانی می کند ، به طور خودکار قفل آن شی را به دست می آورد و پس از اتمام thread وظیفه خود را رها می کند.
 */
//example of java synchronized method
class Table1{
    synchronized void printTable(int n){//synchronized method
        for(int i=1;i<=5;i++){
            System.out.println(n+"-"+i+"Synch");
            try{
                Thread.sleep(4000);
            }catch(Exception e){System.out.println(e);}
        }
    }
    void printTable2(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n+"-"+i+"Not synch");
            try{
                Thread.sleep(4000);
            }catch(Exception e){System.out.println(e);}
        }
    }
}

class MyThread3 extends Thread{
    Table1 t;
    MyThread3(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable2(3);
    }

}
class MyThread4 extends Thread{
    Table1 t;
    MyThread4(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(4);
    }
}

class MyThread5 extends Thread{
    Table1 t;
    MyThread5(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}
class MyThread6 extends Thread{
    Table1 t;
    MyThread6(Table1 t){
        this.t=t;
    }
    public void run(){
        t.printTable(6);
    }
}
public class TestSynchronization2 {
    public static void main(String args[]) throws InterruptedException {
        Table1 obj = new Table1();//only one object
        MyThread3 t3=new MyThread3(obj);
        MyThread4 t4=new MyThread4(obj);
        MyThread5 t5=new MyThread5(obj);
        MyThread6 t6=new MyThread6(obj);
        t3.start();
        t4.start();
        t5.start();
//        t5.join();
        t6.start();

    }
}
