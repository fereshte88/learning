package com.rad.ljavamultithreading.blifecycleofathread;

public class LifeCycleOfAThread {
    /*
    A thread can be in one of the five states. According to sun, there is only 4 states in thread life cycle in java new, runnable, non-runnable and terminated. There is no running state.
But for better understanding the threads, we are explaining it in the 5 states.
The lifecycle of the thread in java is controlled by JVM. The java thread states are as follows:
    New
    Runnable
    Running
    Non-Runnable (Blocked)
    Terminated
یک thread می تواند در یکی از پنج حالت باشد. به گفته sun ، فقط 4 حالت در چرخه عمر thread در جاوا  وجود داردnew, runnable, non-runnable and terminated.  حالت Runningا وجود ندارد
اما برای درک بهتر thread ها ، ما در 5 حالت توضیح می دهیم.
چرخه عمر thread در جاوا توسط JVM کنترل می شود. حالت های جاوا به شرح زیر است:
     جدید
     قابل اجرا
     در حال دویدن
     غیر قابل اجرا (مسدود شده)
     خاتمه یافت
     */

    /*
    1) New
The thread is in new state if you create an instance of Thread class but before the invocation of start() method.
اگر نمونه ای از کلاس Thread اما قبل از فراخوانی متد start () ایجاد کنید ،  در حالت جدید است.
2) Runnable
The thread is in runnable state after invocation of start() method, but the thread scheduler has not selected it to be the running thread.
ذthread بعد از فراخوانی متد start در حالت runnable است. اما thread scheduler این thread را برای اجرا انتخاب نکرده است.
3) Running
The thread is in running state if the thread scheduler has selected it.
اگر thread scheduler این thread رو برای اجرا انتخاب کند thread در حالت running است.
4) Non-Runnable (Blocked)
This is the state when the thread is still alive, but is currently not eligible to run.
این حالت زمانی است که thread هنوز زنده است ، اما در حال حاضر واجد شرایط اجرای آن نیست.
5) Terminated
A thread is in terminated or dead state when its run() method exits.
هنگام خروج ازمتد run آن ، thread در حالت خاتمه یا مرده قرار می گیرد.
     */
}
