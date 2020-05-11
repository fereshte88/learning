package com.rad.ljavamultithreading.fstartathreadtwice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreadTwiceTest {
    @Test
    void testRun(){
        ThreadTwice t1 = new ThreadTwice();
        t1.start();
        Assertions.assertThrows(IllegalThreadStateException.class,()->{t1.start();} );
    }
}
