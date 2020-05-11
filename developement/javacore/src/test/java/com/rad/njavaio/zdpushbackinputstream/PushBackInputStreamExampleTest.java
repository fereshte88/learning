package com.rad.njavaio.zdpushbackinputstream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PushBackInputStreamExampleTest {
    PushBackInputStreamExample pushBackInputStreamExample = new PushBackInputStreamExample();

    @Test
    void testPushBackInput() throws Exception {
        String result = pushBackInputStreamExample.pushBackInput("Fereshteh Rad", 10);
        Assertions.assertEquals("Fereshteh Fereshteh Rad", result);
    }
}