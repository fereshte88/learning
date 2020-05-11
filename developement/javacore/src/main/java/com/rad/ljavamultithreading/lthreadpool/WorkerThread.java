package com.rad.ljavamultithreading.lthreadpool;
/*
Java Thread pool represents a group of worker threads that are waiting for the job and reuse many times.

In case of thread pool, a group of fixed size threads are created.
A thread from the thread pool is pulled out and assigned a job by the service provider.
After completion of the job, thread is contained in the thread pool again.
 */
/*
Advantage of Java Thread Pool

Better performance It saves time because there is no need to create new thread.
 */
/*
Real time usage

It is used in Servlet and JSP where container creates a thread pool to process the request.
 */
public class WorkerThread implements Runnable {
    private String message;
    public WorkerThread(String s){
        this.message=s;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);
        processmessage();//call processmessage method that sleeps the thread for 2 seconds
        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name
    }
    private void processmessage() {
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
