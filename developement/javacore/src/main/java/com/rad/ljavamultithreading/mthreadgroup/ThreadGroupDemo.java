package com.rad.ljavamultithreading.mthreadgroup;

/**
 * Java provides a convenient way to group multiple threads in a single object.
 * In such way, we can suspend, resume or interrupt group of threads by a single method call.
 * جاوا روشی مناسب برای گروه بندی thread های مختلف در یک thread واحد فراهم می کند.
 * به این ترتیب ، ما می توانیم با استفاده از یک متد واحد ، گروه thread ها را به حالت تعلیق ، از سرگیری یا قطع آنها قرار دهیم.
 */

/**
 * Note: Now suspend(), resume() and stop() methods are deprecated.
 */

/**
 * Java thread group is implemented by java.lang.ThreadGroup class.
 * A ThreadGroup represents a set of threads. A thread group can also include the other thread group.
 * The thread group creates a tree in which every thread group except the initial thread group has a parent.
 * A thread is allowed to access information about its own thread group, but it cannot access the information about its thread group's parent thread group or any other thread groups.
 * گروه thread جاوا توسط کلاس java.lang.ThreadGroup پیاده سازی می شود.
 * رthreadGroup مجموعه ای از threadها را نشان می دهد. یک threadGroup می تواند شامل گروه دیگر threadها نیز باشد
 * گروه رشته درختی ایجاد می کند که در آن هر گروه رشته ای به جز گروه اصلی موضوع دارای والدین هستند.
 * دسترسی به اطلاعات مربوط به گروه موضوع خود مجاز است ، اما نمی تواند به اطلاعات مربوط به گروه موضوع اصلی والدین یا هر گروه دیگر موضوع دسترسی داشته باشد.
 */

/**
 * Constructors of ThreadGroup class
 *
 * There are only two constructors of ThreadGroup class.
 * 1)	ThreadGroup(String name)	creates a thread group with given name.
 * 2)	ThreadGroup(ThreadGroup parent, String name)	creates a thread group with given parent group and name.
 */

/**
 * Methods of ThreadGroup class
 * 1) 	void 	checkAccess()
 * This method determines if the currently running thread has permission to modify the thread group.
 * 2) 	int 	activeCount() 	T
 * his method returns an estimate of the number of active threads in the thread group and its subgroups.
 * 3) 	int 	activeGroupCount()
 * This method returns an estimate of the number of active groups in the thread group and its subgroups.
 * 4) 	void 	destroy()
 * This method destroys the thread group and all of its subgroups.
 * 5) 	int 	enumerate(Thread[] list)
 * This method copies into the specified array every active thread in the thread group and its subgroups.
 * 6) 	int 	getMaxPriority()
 * This method returns the maximum priority of the thread group.
 * 7) 	String 	getName()
 * This method returns the name of the thread group.
 * 8) 	ThreadGroup 	getParent()
 * This method returns the parent of the thread group.
 * 9) 	void 	interrupt()
 * This method interrupts all threads in the thread group.
 * 10) 	boolean 	isDaemon()
 * This method tests if the thread group is a daemon thread group.
 * 11) 	void 	setDaemon(boolean daemon)
 * This method changes the daemon status of the thread group.
 * 12) 	boolean 	isDestroyed()
 * This method tests if this thread group has been destroyed.
 * 13) 	void 	list()
 * This method prints information about the thread group to the standard output.
 * 14) 	boolean 	parentOf(ThreadGroup g
 * This method tests if the thread group is either the thread group argument or one of its ancestor thread groups.
 * 15) 	void 	suspend()
 * This method is used to suspend all threads in the thread group.
 * 16) 	void 	resume()
 * This method is used to resume all threads in the thread group which was suspended using suspend() method.
 * 17) 	void 	setMaxPriority(int pri)
 * This method sets the maximum priority of the group.
 * 18) 	void 	stop()
 * This method is used to stop all threads in the thread group.
 * 19) 	String 	toString()
 * This method returns a string representation of the Thread group.
 */
/**
 * Let's see a code to group multiple threads.
 *
 *     ThreadGroup tg1 = new ThreadGroup("Group A");
 *     Thread t1 = new Thread(tg1,new MyRunnable(),"one");
 *     Thread t2 = new Thread(tg1,new MyRunnable(),"two");
 *     Thread t3 = new Thread(tg1,new MyRunnable(),"three");
 *
 * Now all 3 threads belong to one group. Here, tg1 is the thread group name, MyRunnable is the class that implements Runnable interface and "one", "two" and "three" are the thread names.
 *
 * Now we can interrupt all threads by a single line of code only.
 *
 *     Thread.currentThread().getThreadGroup().interrupt();

 */
public class ThreadGroupDemo implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ThreadGroupDemo runnable = new ThreadGroupDemo();
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

        Thread t1 = new Thread(tg1, runnable,"one");
        t1.start();
        Thread t2 = new Thread(tg1, runnable,"two");
        t2.start();
        Thread t3 = new Thread(tg1, runnable,"three");
        t3.start();

        System.out.println("Thread Group Name: "+tg1.getName());
        tg1.list();

    }
}
