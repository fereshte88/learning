package com.rad.njavaio.sfilewriter;

import com.rad.njavaio.tfilereader.FileReaderExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class FileWriterExampleTest {
    FileWriterExample fileWriterExample = new FileWriterExample();
    FileReaderExample fileReaderExample = new FileReaderExample();
    String rootPath= "javaiotemp\\";
    @BeforeEach
    void initUseCase() throws IOException {
        File file = new File(rootPath);
        if (!file.exists()) {
            file.mkdir();
        }

    }
    @Test
    void testFileWriter() throws IOException {
        fileWriterExample.fileWriter(rootPath+"filePathReader.txt", "Welcome To Learn Java I/O");
        Assertions.assertEquals("Welcome To Learn Java I/O",fileReaderExample.fileReader(rootPath+"filePathReader.txt"));

    }
}

