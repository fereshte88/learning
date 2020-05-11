package com.rad.njavaio.yprintstream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class PrintStreamExampleTest {
    PrintStreamExample printStreamExample = new PrintStreamExample();
    String rootPath= "javaiotemp\\";
    @BeforeEach
    void initUseCase() throws IOException {
        File file = new File(rootPath);
        if (!file.exists()) {
            file.mkdir();
        }
    }
    @Test
    void testPrintStream() throws Exception {
        printStreamExample.printStream(rootPath+"printstream.txt", new Object[]{"welcome to java",1256,"Hello Word",14.5,});
    }
}
