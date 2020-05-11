package com.rad.ljavamultithreading.inamingathread;
/*
getName(),setName(String) and getId() method:
public String getName()
public void setName(String name)
public long getId()

The Thread class provides methods to change and get the name of a thread. By default, each thread has a name i.e. thread-0, thread-1 and so on.
By we can change the name of the thread by using setName() method. The syntax of setName() and getName() methods are given below:

    public String getName(): is used to return the name of a thread.
    public void setName(String name): is used to change the name of a thread.

 */
public class NamingThread extends Thread {
    public void run(){

        System.out.println("running...");
    }
}
