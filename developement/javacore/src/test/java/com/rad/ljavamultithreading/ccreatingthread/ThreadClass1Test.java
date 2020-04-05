package com.rad.ljavamultithreading.ccreatingthread;


import org.junit.jupiter.api.Test;


class ThreadClass1Test {

    @Test
    void testRun() {
        ThreadClass1 threadClass1 = new ThreadClass1();
        threadClass1.start();
    }

    @Test
    void testRun2() {
        ThreadClass2 threadClass2 = new ThreadClass2();
        Thread t = new Thread(threadClass2);
        t.start();
    }
}

