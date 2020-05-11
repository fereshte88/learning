package com.rad.ljavamultithreading.kdaemonthread;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class DaemonThreadTest {

    @Test
    void testRun() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);
        DaemonThread t1=new DaemonThread("t1");//creating thread
        DaemonThread t2=new DaemonThread("t2");
        DaemonThread t3=new DaemonThread("t3");

        t1.setDaemon(true);//now t1 is daemon thread
        executor.execute(t1);
        executor.execute(t2);
        executor.execute(t3);

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);
    }
    @Test
    void testSetDaemon() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);
        DaemonThread t1=new DaemonThread("t1");//creating thread

//        executor.execute(t1);
        t1.start();
//        t1.setDaemon(true);

        executor.shutdown();
        Assertions.assertThrows(IllegalThreadStateException.class,()-> t1.setDaemon(true));
        executor.awaitTermination(1, TimeUnit.HOURS);
    }
}

