package com.rad.ljavamultithreading.hjoiningathread;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class JoinMethodTest {
    @Test
    void testRun() throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);
        JoinMethod1 joinMethod1 = new JoinMethod1("joinMethod1");
//        joinMethod1.showRun();
        executor.execute(joinMethod1.showRun());
//        JoinMethod1 t1=new JoinMethod1("t1");
//        JoinMethod1 t2=new JoinMethod1("t2");
//        JoinMethod1 t3=new JoinMethod1("t3");
//        List<JoinMethod1> threadList = new ArrayList<>();
//        threadList.add(t1);
//        threadList.add(t2);
//        threadList.add(t3);
//        executor.execute(joinMethod1.showRun(threadList));
//
//        JoinMethod1 t1 = new JoinMethod1("t1");
//        JoinMethod1 t2 = new JoinMethod1("t2");
//        JoinMethod1 t3 = new JoinMethod1("t3");
//        try {
//            t2.join();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        executor.execute(t1);
//        executor.execute(t2);
//        executor.execute(t3);


        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);

    }
}