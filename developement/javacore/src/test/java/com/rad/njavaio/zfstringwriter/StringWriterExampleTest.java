package com.rad.njavaio.zfstringwriter;

import com.rad.njavaio.zboutputstreamwriter.OutputStreamWriterExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class StringWriterExampleTest {
    StringWriterExample stringWriterExample = new StringWriterExample();
    OutputStreamWriterExample outputStreamWriterExample = new OutputStreamWriterExample();
    String rootPath= "javaiotemp\\";
    @BeforeEach
    void initUseCase() throws IOException {
        File file = new File(rootPath);
        if (!file.exists()) {
            file.mkdir();
        }
    }
    @Test
    void testWriterString() throws IOException {
        outputStreamWriterExample.outputStreamWriter(rootPath+"stringwriter.txt", "welcome to learn java");
        Assertions.assertEquals("welcome to learn java", stringWriterExample.writerString(rootPath+"stringwriter.txt", 512));
    }
}