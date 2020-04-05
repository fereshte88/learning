package com.rad.ljavamultithreading.awhatismultithreadingopenlink;

public class MultiThreadInJava {
    /*
    Multithreading in Java is a process of executing multiple threads simultaneously.
    A thread is a lightweight sub-process, the smallest unit of processing.
Multiprocessing and multithreading, both are used to achieve multitasking.
However, we use multithreading than multiprocessing because threads use a shared memory area.
They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.
Java Multithreading is mostly used in games, animation, etc.

رmultithreading در java یک فرآیند اجرای همزمان چندین thread است.
یک thread یک فرایند سبک وزن است ، کوچکترین واحد پردازش است. multiprocessing و multithreading ، هر دو برای دستیابی به چند وظیفهmultitasking استفاده می شوند.
با این حال ، ما از multithreading بیشتر از multiprocessing استفاده می کنیم زیرا threads از یک فضای حافظه اشتراکی استفاده می کنند.
 آنها ناحیه حافظه جداگانه را اختصاص نمی دهند ، بنابراین حافظه را ذخیره می کنند ، و جابجایی متن بین موضوعات زمان کمتری نسبت به پردازش می گیرد.
 Java Multithreading بیشتر در بازی ها ، انیمیشن ها و غیره استفاده می شود.
     */

    /*
    Advantages of Java Multithreading
1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.
2) You can perform many operations together, so it saves time.
3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.
مزایای استفاده از Multithreading Java
1) کاربر را مسدود نمی کند زیرا thread ها مستقل هستند و می توانید همزمان چندین عملیات را انجام دهید.
2) شما می توانید بسیاری از عملیات را با هم انجام دهید ، بنابراین باعث صرفه جویی در وقت می شود.
3) مthread ها مستقل هستند ، بنابراین اگرخطایی در یک thread وجود داشته باشد ، بر thread های دیگر تأثیر نمی گذارد.

     */
    /*
    Multitasking
Multitasking is a process of executing multiple tasks simultaneously. We use multitasking to utilize the CPU. Multitasking can be achieved in two ways:
    Process-based Multitasking (Multiprocessing)
    Thread-based Multitasking (Multithreading)
1) Process-based Multitasking (Multiprocessing)
    Each process has an address in memory. In other words, each process allocates a separate memory area.
    A process is heavyweight.
    Cost of communication between the process is high.
    Switching from one process to another requires some time for saving and loading registers, memory maps, updating lists, etc.
2) Thread-based Multitasking (Multithreading)
    Threads share the same address space.
    A thread is lightweight.
    Cost of communication between the thread is low.
چند وظیفه ای
رmultitasking یک فرآیند اجرای همزمان چندین کار است .
 ما از multitasking برای استفاده از CPU استفاده می کنیم. چند وظیفه ای به دو روش قابل دستیابی است:
     چند وظیفه ای مبتنی بر فرآیند (Multiprocessing)
     چند وظیفه ای مبتنی بر موضوع (Multithreading)
1) چند وظیفه ای مبتنی بر فرآیند (Multiprocessing)
     هر فرآیند دارای یک آدرس در حافظه است. به عبارت دیگر ، هر فرایند یک منطقه حافظه جداگانه را اختصاص می دهد.
     یک روند سنگین وزن است.
     هزینه برقراری ارتباط بین فرایند زیاد است.
     جابجایی از یک فرآیند به فرآیند دیگر به صرفه جویی در بارگیری و بارگذاری ثبات ها ، نقشه های حافظه ، به روزرسانی لیست ها و غیره نیاز به مدتی دارد.
2) چند وظیفه ای مبتنی بر موضوع (Multithreading)
     موضوعات مشابه فضای آدرس را به اشتراک می گذارند.
     یک نخ سبک است.
     هزینه ارتباط بین موضوع کم است.
     */
    /*
    Note: At least one process is required for each thread.
    توجه: برای هر thread حداقل یک process لازم است.
     */
    /*
    What is Thread in java
A thread is a lightweight subprocess, the smallest unit of processing. It is a separate path of execution.
Threads are independent. If there occurs exception in one thread, it doesn't affect other threads. It uses a shared memory area.
ذthread در جاوا چیست
نخthread یک فرایند سبک وزن ، کوچکترین واحد پردازش است. این یک مسیر اجرای جداگانه است.
دthread ها مستقل هستند. اگر استثنائی در یک thread وجود داشته باشد ، روی thread های دیگر تأثیر نمی گذارد. از یک منطقه حافظه مشترک استفاده می کند.
     */
    /*
    As shown in the above figure, a thread is executed inside the process.
     There is context-switching between the threads. There can be multiple processes inside the OS, and one process can have multiple threads.
Note: At a time one thread is executed only.
همانطور که در شکل بالا نشان داده شده است ، یک thread در داخل فرایند اجرا می شود. بین thread ها تعویض متن دارد.
 می توانید چندین پردازش در داخل سیستم عامل وجود داشته باشد و یک فرآیند می تواند چندین thread داشته باشد.
توجه: در یک زمان فقط یک thread اجرا می شود.
     */
    /*
    Java Thread class
Java provides Thread class to achieve thread programming.
Thread class provides constructors and methods to create and perform operations on a thread.
Thread class extends Object class and implements Runnable interface.
     */
}
/*
1) 	void 	start()
	It is used to start the execution of the thread.
2) 	void 	run()
	It is used to do an action for a thread.
3) 	static void 	sleep()
	It sleeps a thread for the specified amount of time.
4) 	static Thread 	currentThread()
It returns a reference to the currently executing thread object.
5) 	void 	join()
	It waits for a thread to die.
6) 	int 	getPriority()
	It returns the priority of the thread.
7) 	void 	setPriority()
	It changes the priority of the thread.
8) 	String 	getName()
	It returns the name of the thread.
9) 	void 	setName()
	It changes the name of the thread.
10) 	long 	getId()
	It returns the id of the thread.
11) 	boolean 	isAlive()
 	It tests if the thread is alive.
12) 	static void 	yield()
	It causes the currently executing thread object to pause and allow other threads to execute temporarily.
13) 	void 	suspend()
	It is used to suspend the thread.
14) 	void 	resume()
	It is used to resume the suspended thread.
15) 	void 	stop()
	It is used to stop the thread.
16) 	void 	destroy()
	It is used to destroy the thread group and all of its subgroups.
17) 	boolean 	isDaemon()
	It tests if the thread is a daemon thread.
18) 	void 	setDaemon()
	It marks the thread as daemon or user thread.
19) 	void 	interrupt()
 	It interrupts the thread.
20) 	boolean 	isinterrupted()
 	It tests whether the thread has been interrupted.
21) 	static boolean 	interrupted()
	It tests whether the current thread has been interrupted.
22) 	static int 	activeCount()
	It returns the number of active threads in the current thread's thread group.
23) 	void 	checkAccess()
 	It determines if the currently running thread has permission to modify the thread.
24) 	static boolean 	holdLock()
	It returns true if and only if the current thread holds the monitor lock on the specified object.
25) 	static void 	dumpStack()
	It is used to print a stack trace of the current thread to the standard error stream.
26) 	StackTraceElement[] 	getStackTrace()
	It returns an array of stack trace elements representing the stack dump of the thread.
27) 	static int 	enumerate()
	It is used to copy every active thread's thread group and its subgroup into the specified array.
28) 	Thread.State 	getState()
    It is used to return the state of the thread.
29) 	ThreadGroup 	getThreadGroup()
	It is used to return the thread group to which this thread belongs
30) 	String 	toString()
 	It is used to return a string representation of this thread, including the thread's name, priority, and thread group.
31) 	void 	notify()
 	It is used to give the notification for only one thread which is waiting for a particular object.
32) 	void 	notifyAll()
	It is used to give the notification to all waiting threads of a particular object.
33) 	void 	setContextClassLoader()
	It sets the context ClassLoader for the Thread.
34) 	ClassLoader 	getContextClassLoader()
 	It returns the context ClassLoader for the thread.
35) 	static Thread.UncaughtExceptionHandler 	getDefaultUncaughtExceptionHandler()
	It returns the default handler invoked when a thread abruptly terminates due to an uncaught exception.
36) 	static void 	setDefaultUncaughtExceptionHandler()
	It sets the default handler invoked when a thread abruptly terminates due to an uncaught exception.
 */