package com.rad.ljavamultithreading.kdaemonthread;
/*
Daemon Thread in Java
Daemon thread in java is a service provider thread that provides services to the user thread.
Its life depend on the mercy of user threads i.e. when all the user threads dies, JVM terminates this thread automatically.
There are many java daemon threads running automatically e.g. gc, finalizer etc.
You can see all the detail by typing the jconsole in the command prompt.
The jconsole tool provides information about the loaded classes, memory usage, running threads etc.
رDaemon thread  در جاوا یک  ارائه دهنده خدمات است که خدمات را به thread کاربر ارائه می دهد
عمر آن به رحمت thread های کاربر بستگی دارد ، یعنی وقتی همه thread های کاربر از بین برود ، JVM این thread را بطور خودکار خاتمه می دهد.
تعداد بسیاری از thread های مربوط به Daemon Java وجود دارد که به طور خودکار اجرا می شوند. gc ، finalizer و غیره
با وارد کردن jconsole در قسمت فرمان می توانید تمام جزئیات را مشاهده کنید.
ابزار jconsole اطلاعاتی در مورد کلاسهای لود شده ، استفاده از حافظه ، thread  های در حال اجرا و غیره ارائه می دهد.
 */
/*
Points to remember for Daemon Thread in Java
    It provides services to user threads for background supporting tasks. It has no role in life than to serve user threads.
    Its life depends on user threads.
    It is a low priority thread.
  این سرویس  پشتیبانی پس زمینه خدمات را به thread های کاربر ارائه می دهد. این هیچ نقشی در زندگی ندارد تا سرویس دهی به  thread های کاربر.
     عمر آن به thread های کاربر بستگی دارد.
     این یک  thread  با اولویت پایین است.
 */
/*
Why JVM terminates the daemon thread if there is no user thread?
The sole purpose of the daemon thread is that it provides services to user thread for background supporting task.
If there is no user thread, why should JVM keep running this thread. That is why JVM terminates the daemon thread if there is no user thread.
چرا JVM اگر thread کاربر وجود نداشته باشد thread Daemon را خاتمه می دهد؟
تنها هدف از thrad daemon این است که برای کار پشتیبانی از پس زمینه خدمات را به کاربر ارائه می دهد. اگر هیچ thread کاربری وجود ندارد ، چرا JVM باید این thread را ادامه دهد.
 به همین دلیل JVM اگر thread کاربر وجود نداشته باشد thread Daemon را خاتمه می دهد.

 */
/*
Methods for Java Daemon thread by Thread class

The java.lang.Thread class provides two methods for java daemon thread.
No.	Method	Description
1)	public void setDaemon(boolean status)
is used to mark the current thread as daemon thread or user thread.
2)	public boolean isDaemon()
is used to check that current is daemon.
 */
public class DaemonThread extends Thread {
    public DaemonThread(String name) {
        super(name);
    }

    public void run() {
//        if (Thread.currentThread().isDaemon()) {//checking for daemon thread
        if (this.isDaemon()) {//checking for daemon thread
            System.out.println(this.getName()+" is daemon thread work");
        } else {
            System.out.println(this.getName()+" is user thread work");
        }
    }


}
