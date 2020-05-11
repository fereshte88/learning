package com.rad.ljavamultithreading.inamingathread;


import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class NamingThreadTest {

    @Test
    void testRun() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);
        NamingThread t1=new NamingThread();
        NamingThread t2=new NamingThread();
        System.out.println("Name of t1:"+t1.getName());
        System.out.println("Name of t2:"+t2.getName());
        System.out.println("id of t1:"+t1.getId());

       executor.execute(t1);
       executor.execute(t2);

        t1.setName("Sonoo Jaiswal");
        System.out.println("After changing name of t1:"+t1.getName());

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);
    }
}

