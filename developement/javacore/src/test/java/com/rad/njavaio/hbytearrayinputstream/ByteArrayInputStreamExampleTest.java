package com.rad.njavaio.hbytearrayinputstream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class ByteArrayInputStreamExampleTest {
    ByteArrayInputStreamExample byteArrayInputStreamExample = new ByteArrayInputStreamExample();

    @Test
    void testReadByteArray() throws IOException {
        byte[] buf = { 35, 36, 37, 38 };
        String exceptedValue="";
        for (int i = 0; i < buf.length; i++) {
            exceptedValue = exceptedValue +(char) buf[i];
        }
        Assertions.assertEquals(exceptedValue, byteArrayInputStreamExample.readByteArray(buf));
    }
}
