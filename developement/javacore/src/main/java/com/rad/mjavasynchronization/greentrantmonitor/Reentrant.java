package com.rad.mjavasynchronization.greentrantmonitor;

public class Reentrant {
    public synchronized void m(String name) {
        n(name);
        System.out.println(name+" this is m() method");
    }
    public synchronized void n(String name) {
        System.out.println(name+" this is n() method");
    }
}
