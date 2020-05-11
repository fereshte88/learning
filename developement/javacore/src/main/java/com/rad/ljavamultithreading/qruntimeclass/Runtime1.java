package com.rad.ljavamultithreading.qruntimeclass;
/*
Java Runtime class
Java Runtime class is used to interact with java runtime environment.
Java Runtime class provides methods to execute a process, invoke GC, get total and free memory etc.
 There is only one instance of java.lang.Runtime class is available for one java application.
کلاس Java Runtime برای تعامل با محیط زمان اجرا جاوا استفاده می شود.
کلاس Java Runtime متدهایی را برای اجرای یک فرآیند ، فراخوانی GC ، آزاد کردن حافظه و غیره ارائه می دهد.
  فقط یک نمونه از کلاس java.lang.Runtime وجود دارد. کلاس زمان اجرا برای یک برنامه جاوا در دسترس است.

The Runtime.getRuntime() method returns the singleton instance of Runtime class.
Important methods of Java Runtime class
No.	Method	Description
1)	public static Runtime getRuntime()
returns the instance of Runtime class.
2)	public void exit(int status)
terminates the current virtual machine.
3)	public void addShutdownHook(Thread hook)
registers new hook thread.
4)	public Process exec(String command)throws IOException
executes given command in a separate process.
5)	public int availableProcessors()
returns no. of available processors.
6)	public long freeMemory()	r
eturns amount of free memory in JVM.
7)	public long totalMemory()
returns amount of total memory in JVM.
 */
public class Runtime1 {
    public static void main(String args[])throws Exception{
        Runtime.getRuntime().exec("notepad");//will open a new notepad
    }
}
