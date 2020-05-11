package com.rad.mjavasynchronization.asynchronizationinjava;

public class Synchronization {
    /**
     * Synchronization in java is the capability to control the access of multiple threads to any shared resource.
     * Java Synchronization is better option where we want to allow only one thread to access the shared resource.
     * همگام سازی در جاوا قابلیت کنترل دسترسی thread های مختلف به هر منبع مشترک است.
     * جاوا همگام سازی گزینه ای بهتر است وقتیکه می خواهیم فقط به یک thread اجازه دسترسی به منابع مشترک را بدهیم.
     */
    /**
     * Why use Synchronization
     *     To prevent thread interference.
     *     To prevent consistency problem.
     *
     برای جلوگیری از تداخل نخ.
     برای جلوگیری از مشکل سازگاری.
     */
    /**
     * Types of Synchronization
     * There are two types of synchronization
     *     Process Synchronization
     *     Thread Synchronization
     * Here, we will discuss only thread synchronization.
     */
    /**
     * There are two types of thread synchronization mutual exclusive and inter-thread communication.
     *     Mutual Exclusive
     *         Synchronized method.
     *         Synchronized block.
     *         static synchronization.
     *     Cooperation (Inter-thread communication in java)
     */
    /**
     * Mutual Exclusive
     *
     * Mutual Exclusive helps keep threads from interfering with one another while sharing data. This can be done by three ways in java:
     *
     دmutual exclusive به شما در جلوگیری از تداخل thread ها با یکدیگر در هنگام اشتراک داده کمک می کند. این کار با سه روش در جاوا قابل انجام است
     *     by synchronized method
     *     by synchronized block
     *     by static synchronization
     */
    /**
     * Concept of Lock in Java
     * Synchronization is built around an internal entity known as the lock or monitor.
     * Every object has an lock associated with it. By convention, a thread that needs consistent access to an object's fields has to acquire the object's lock before accessing them, and then release the lock when it's done with them.
     * From Java 5 the package java.util.concurrent.locks contains several lock implementations.
     *
     همگام سازی در اطراف یک موجود داخلی ساخته شده است که به قفل یا مانیتور معروف است. هر شی قفل مرتبط با آن را دارد.
     طبق قرارداد ، نخی که نیاز به دسترسی مداوم به فیلد های یک شی را دارد ، باید قبل از دسترسی به آنها ، قفل شی را بدست آورد ، و در صورت انجام این کار ، قفل را رها کنید.

     از Java 5 بسته java.util.concurrent.locks شامل چندین پیاده سازی قفل است.

     */
}
