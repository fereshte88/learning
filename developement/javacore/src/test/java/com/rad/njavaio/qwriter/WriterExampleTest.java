package com.rad.njavaio.qwriter;

import com.rad.njavaio.bfileoutputstream.FileOutputStreamExample;
import com.rad.njavaio.rreader.ReaderExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class WriterExampleTest {
    WriterExample writerExample = new WriterExample();
    ReaderExample readerExample = new ReaderExample();
    String rootPath= "javaiotemp\\";
    @BeforeEach
    void initUseCase() throws IOException {
        File file = new File(rootPath);
        if (!file.exists()) {
            file.mkdir();
        }

    }
    @Test
    void testWrite() throws IOException {
        writerExample.write(rootPath+"filePath.txt", "سلام دنیا");
        Assertions.assertEquals("سلام دنیا",readerExample.read(rootPath+"filePath.txt"));
    }
}
