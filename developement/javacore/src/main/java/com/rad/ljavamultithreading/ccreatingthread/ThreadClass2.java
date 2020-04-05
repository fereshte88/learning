package com.rad.ljavamultithreading.ccreatingthread;
/*
Runnable interface:
The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread.
Runnable interface have only one method named run().
    public void run(): is used to perform action for a thread.
    رابط Runnable باید توسط هر کلاسی اجرا شود که نمونه های آن قرار است توسط یک thread اجرا شود. رابط Runnableا فقط یک متد با نام run () دارد.

     Public void run (): برای انجام عمل برای thread استفاده می شود.

 */
public class ThreadClass2 implements Runnable{
    public void run() {
        System.out.println("thread is running from interface...");
    }
}
/*
If you are not extending the Thread class,your class object would not be treated as a thread object.
So you need to explicitely create Thread class object.We are passing the object of your class that implements Runnable so that your class run() method may execute.
 */