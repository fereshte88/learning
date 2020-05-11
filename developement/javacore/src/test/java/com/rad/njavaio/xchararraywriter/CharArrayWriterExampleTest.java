package com.rad.njavaio.xchararraywriter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class CharArrayWriterExampleTest {
    CharArrayWriterExample charArrayWriterExample = new CharArrayWriterExample();
    String rootPath= "javaiotemp\\";
    @BeforeEach
    void initUseCase() throws IOException {
        File file = new File(rootPath);
        FileWriter file1 = new FileWriter(rootPath);
        FileWriter file2 = new FileWriter(rootPath);
        FileWriter file3 = new FileWriter(rootPath);
        FileWriter file4 = new FileWriter(rootPath);
        if (!file.exists()) {
            file.mkdir();
        }

    }

    @Test
    void testArrayWriter() throws Exception {
        FileWriter f1 = new FileWriter(rootPath+"java1.txt");
        FileWriter f2 = new FileWriter(rootPath+"java2.txt");
        FileWriter f3= new FileWriter(rootPath+"java3.txt");
        FileWriter f4= new FileWriter(rootPath+"java4.txt");
        charArrayWriterExample.arrayWriter(new FileWriter[]{f1,f2,f3,f4}, "Welcome To Lerning Java");
    }
}