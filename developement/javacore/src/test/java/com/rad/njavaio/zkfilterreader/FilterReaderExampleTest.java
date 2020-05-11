package com.rad.njavaio.zkfilterreader;

import com.rad.njavaio.bfileoutputstream.FileOutputStreamExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class FilterReaderExampleTest {
    FilterReaderExample filterReaderExample = new FilterReaderExample();
    FileOutputStreamExample fileOutputStreamExample = new FileOutputStreamExample();
    String rootPath= "javaiotemp\\";
    @BeforeEach
    void initUseCase() throws IOException {
        File file = new File(rootPath);
        if (!file.exists()) {
            file.mkdir();
        }
    }
    @Test
    void testFilterResder() throws IOException {
        fileOutputStreamExample.writeString("I Love Java",rootPath+"filereader.txt");
        Assertions.assertEquals("I?Love?Java", filterReaderExample.filterResder(rootPath+"filereader.txt"));
    }
}
