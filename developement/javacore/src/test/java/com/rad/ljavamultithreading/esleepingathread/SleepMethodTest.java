package com.rad.ljavamultithreading.esleepingathread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class SleepMethodTest {

    @Test
    void testRun() throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);

        SleepMethod t1 = new SleepMethod("t1");
        SleepMethod t2 = new SleepMethod("t2");
        SleepMethod t3 = new SleepMethod("t3");
        executor.execute(t1);
//        executor.schedule(t2,1, TimeUnit.HOURS);
        executor.execute(t2);
        executor.execute(t3);
//        t1.start();
//        t2.start();

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);


    }
}

