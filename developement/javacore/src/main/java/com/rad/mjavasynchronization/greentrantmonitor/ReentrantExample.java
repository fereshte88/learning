package com.rad.mjavasynchronization.greentrantmonitor;

/**
 * Reentrant Monitor in Java
 * According to Sun Microsystems, Java monitors are reentrant means java thread can reuse the same monitor for different synchronized methods if method is called from the method.
 طبق گفته Sun Microsystems ، مانیتورهای مجدد در جاوا   به این معنی است که thread جاوا می توانداستفاده مجدد کند از همان مانیتور برای synchronized methods مختلف اگر متد از همان متد فراخوانی شود.
 */

/**
 * Advantage of Reentrant Monitor
 * It eliminates the possibility of single thread deadlocking
 این امر امکان  بسته شدن تک نخ را از بین می برد
 */
// Let's understand the java reentrant monitor by the example given below:
//-----> reentrant class

/**
 * In this class, m and n are the synchronized methods. The m() method internally calls the n() method.
 *
 * Now let's call the m() method on a thread. In the class given below, we are creating thread using annonymous class.
 */
public class ReentrantExample {
    public static void main(String args[]){
        final Reentrant re=new Reentrant();

        Thread t1=new Thread("t1"){
            public void run(){
                re.m(this.getName());//calling method of Reentrant class
            }
        };
        Thread t2=new Thread("t2"){
            public void run(){
                re.m(this.getName());//calling method of Reentrant class
            }
        };
        t1.start();
        t2.start();
    }
}
