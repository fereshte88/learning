package com.rad.njavaio.znrandomaccessfile;

import com.rad.njavaio.bfileoutputstream.FileOutputStreamExample;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class RandomAccessFileExampleTest {
    RandomAccessFileExample randomAccessFileExample = new RandomAccessFileExample();
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
    void testRandomAccess() throws IOException {
        fileOutputStreamExample.writeString("This class is used for reading and writing to random access file.",rootPath+"randomaccess.txt");
        randomAccessFileExample.randomAccess(rootPath+"randomaccess.txt");
    }
}
