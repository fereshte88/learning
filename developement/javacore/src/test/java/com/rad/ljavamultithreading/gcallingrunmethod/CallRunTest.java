package com.rad.ljavamultithreading.gcallingrunmethod;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class CallRunTest {
    @Test
    void testRun(){
        CallRun t1 = new CallRun();
        CallRun t2 = new CallRun();
        t1.run();
        t2.run();
    }
}
//As you can see in the above program that there is no context-switching because here t1 and t2 will be treated as normal object not thread object.