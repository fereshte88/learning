package com.rad.ljavamultithreading.ccreatingthread;
/*
How to create thread
There are two ways to create a thread:
    By extending Thread class
    By implementing Runnable interface.

Thread class:
Thread class provide constructors and methods to create and perform operations on a thread.
Thread class extends Object class and implements Runnable interface.
کلاس thread سازنده ها و متدهایی را برای ساخت و اجرای عملیاتی رو thread فراهم می کند.
Commonly used Constructors of Thread class:
    Thread()
    Thread(String name)
    Thread(Runnable r)
    Thread(Runnable r,String name)

 */
/*
Commonly used methods of Thread class:

    public void run(): is used to perform action for a thread.
    public void start(): starts the execution of the thread.JVM calls the run() method on the thread.
    public void sleep(long miliseconds): Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
    public void join(): waits for a thread to die.
    public void join(long miliseconds): waits for a thread to die for the specified miliseconds.
    public int getPriority(): returns the priority of the thread.
    public int setPriority(int priority): changes the priority of the thread.
    public String getName(): returns the name of the thread.
    public void setName(String name): changes the name of the thread.
    public Thread currentThread(): returns the reference of currently executing thread.
    public int getId(): returns the id of the thread.
    public Thread.State getState(): returns the state of the thread.
    public boolean isAlive(): tests if the thread is alive.
    public void yield(): causes the currently executing thread object to temporarily pause and allow other threads to execute.
    public void suspend(): is used to suspend the thread(depricated).
    public void resume(): is used to resume the suspended thread(depricated).
    public void stop(): is used to stop the thread(depricated).
    public boolean isDaemon(): tests if the thread is a daemon thread.
    public void setDaemon(boolean b): marks the thread as daemon or user thread.
    public void interrupt(): interrupts the thread.
    public boolean isInterrupted(): tests if the thread has been interrupted.
    public static boolean interrupted(): tests if the current thread has been interrupted.

 */
/*
Starting a thread:
start() method of Thread class is used to start a newly created thread. It performs following tasks:
    A new thread starts(with new callstack).
    The thread moves from New state to the Runnable state.
    When the thread gets a chance to execute, its target run() method will run.
شروع یک thread:
رstart از کلاس thread برای شروع یک thread  تازه ایجاد شده استفاده می شود
این وظایف زیر را انجام می دهد:

     یک thread جدید شروع می شود (با مجموعه تماس جدید).
     رthread از حالت New به حالت Runnable منتقل می شود.
     هنگامی که موضوع فرصتی برای اجرای دارد ،متد run هدف آن اجرا خواهد شد.

 */
public class ThreadClass1  extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
}
