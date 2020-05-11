package com.rad.njavaio.gbytearrayoutputstream;

import com.rad.njavaio.bfileoutputstream.FileOutputStreamExample;
import com.rad.njavaio.cfileinputstream.FileInputStreamExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

class ByteArrayOutputStreamExampleTest {
    ByteArrayOutputStreamExample byteArrayOutputStreamExample = new ByteArrayOutputStreamExample();
    FileOutputStreamExample fileOutputStreamExample = new FileOutputStreamExample();
    FileInputStreamExample fileInputStreamExample = new FileInputStreamExample();

    @Test
    void testWriteCommonContext() throws IOException {
        FileOutputStream f1 = fileOutputStreamExample.createFile("file1.txt");
        FileOutputStream f2 = fileOutputStreamExample.createFile("file2.txt");
        byteArrayOutputStreamExample.writeCommonContext(new FileOutputStream[]{f1,f2},"فرشته");
        Assertions.assertEquals(fileInputStreamExample.readString("file1.txt"),fileInputStreamExample.readString("file2.txt"));
    }
}

