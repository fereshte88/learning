package com.rad.ljavamultithreading.jthreadpriority;


import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
@RunWith(ConcurrentTestRunner.class)
class MultiPriorityTest {


    @Test
    void testShowPriority() throws InterruptedException {
//        ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);
//     MultiPriority multiPriority = new MultiPriority("multiPriority");
//
//     executor.execute(multiPriority.showPriority());
//        executor.shutdown();
//        executor.awaitTermination(1, TimeUnit.HOURS);

        MultiPriority m1=new MultiPriority("m1");
        MultiPriority m2=new MultiPriority("m2");
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();


    }

}

