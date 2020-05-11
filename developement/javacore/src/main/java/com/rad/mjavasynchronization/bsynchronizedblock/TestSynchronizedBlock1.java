package com.rad.mjavasynchronization.bsynchronizedblock;

/**
 * Synchronized Block in Java
 * Synchronized block can be used to perform synchronization on any specific resource of the method.
 * Suppose you have 50 lines of code in your method, but you want to synchronize only 5 lines, you can use synchronized block.
 * If you put all the codes of the method in the synchronized block, it will work same as the synchronized method.
 * بلوک هماهنگ را می توان برای انجام همزمان سازی بر روی منابع خاص متد استفاده کرد.
 * فرض کنید در متد خود 50 خط کد دارید ، اما می خواهید فقط 5 خط را همزمان کنید ، می توانید از بلوک هماهنگ استفاده کنید.
 * اگر تمام کدهای متد را در بلوک هماهنگ قرار دهید ، همان متد همگام سازی کار خواهد کرد.
 * Points to remember for Synchronized block
 *     Synchronized block is used to lock an object for any shared resource.
 *     Scope of synchronized block is smaller than the method.
 *     نکاتی که باید برای بلوک همگام سازی به خاطر بیاورید
 *      بلوک هماهنگ برای قفل کردن یک شی برای هر منبع مشترک استفاده می شود.
 *      دامنه بلوک هماهنگ از متد کوچکتر است.
 *      Syntax to use synchronized block
 *     synchronized (object reference expression) {
 *       //code block
 *     }
 */
class Table{
int test=50;
    void printTable(int n){
        synchronized(this){//synchronized block
            this.test++;
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
            }
        }
    }//end of the method
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class TestSynchronizedBlock1{
    public static void main(String args[]){
        Table obj = new Table();//only one object
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
