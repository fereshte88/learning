package com.rad.ljavamultithreading.inamingathread;


import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class CurrentThreadTest {

    @Test
    void testRun() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);
            CurrentThread t1=new CurrentThread();
            CurrentThread t2=new CurrentThread();
            t1.setName("t1");
            t2.setName("t2");
           executor.execute(t1);
           executor.execute(t2);
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);
        }
}

