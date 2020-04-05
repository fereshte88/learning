package com.rad.ljavamultithreading.dthreadscheduler;

public class ThreadSchedulerInJava {
    /*
    Thread scheduler in java is the part of the JVM that decides which thread should run.
There is no guarantee that which runnable thread will be chosen to run by the thread scheduler.
Only one thread at a time can run in a single process.
The thread scheduler mainly uses preemptive or time slicing scheduling to schedule the threads.
رthread scheduler در جاوا بخشی از jvm که تصمیم میگیرد کدام thread اجرا شود.
گارانتی وجود ندارد که کدام runnable thread توسط thread scheduler برای اجرا انتخاب می شود.
فقط یک thread در هر زمان می تواند در یک فرآیند واحد اجرا شود.

     */
    /*
    Difference between preemptive scheduling and time slicing

Under preemptive scheduling, the highest priority task executes until it enters the waiting or dead states or a higher priority task comes into existence.
Under time slicing, a task executes for a predefined slice of time and then reenters the pool of ready tasks.
The scheduler then determines which task should execute next, based on priority and other factors.
     */
}
