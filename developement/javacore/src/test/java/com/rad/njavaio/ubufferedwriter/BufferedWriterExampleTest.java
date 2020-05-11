package com.rad.njavaio.ubufferedwriter;

import com.rad.njavaio.vbufferedreader.BufferedReaderExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class BufferedWriterExampleTest {
    BufferedWriterExample bufferedWriterExample = new BufferedWriterExample();
    BufferedReaderExample bufferedReaderExample = new BufferedReaderExample();
    String rootPath= "javaiotemp\\";
    @BeforeEach
    void initUseCase() throws IOException {
        File file = new File(rootPath);
        if (!file.exists()) {
            file.mkdir();
        }
    }
    @Test
    void testBufferWriter() throws Exception {
        bufferedWriterExample.bufferWriter(rootPath+"testBufferWriter.txt", "Welcome To Learning Java");
        Assertions.assertEquals("Welcome To Learning Java", bufferedReaderExample.bufferReader(rootPath+"testBufferWriter.txt"));
    }
}
