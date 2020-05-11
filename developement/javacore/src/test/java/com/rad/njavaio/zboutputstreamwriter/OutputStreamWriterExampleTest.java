package com.rad.njavaio.zboutputstreamwriter;

import com.rad.njavaio.zcinputstreamreader.InputStreamReaderExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class OutputStreamWriterExampleTest {
    OutputStreamWriterExample outputStreamWriterExample = new OutputStreamWriterExample();
    InputStreamReaderExample inputStreamReaderExample = new InputStreamReaderExample();

    String rootPath= "javaiotemp\\";
    @BeforeEach
    void initUseCase() throws IOException {
        File file = new File(rootPath);
        if (!file.exists()) {
            file.mkdir();
        }
    }

    @Test
    void testOutputStreamWriter() throws IOException {
        outputStreamWriterExample.outputStreamWriter(rootPath+"outputstreamwriter.txt", "welcome to learn java ");
        Assertions.assertEquals("welcome to learn java ",inputStreamReaderExample.inputStreamReader(rootPath+"outputstreamwriter.txt"));
    }
}
