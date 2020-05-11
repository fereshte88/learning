package com.rad.njavaio.idataoutputstream;

import com.rad.njavaio.bfileoutputstream.FileOutputStreamExample;
import com.rad.njavaio.cfileinputstream.FileInputStreamExample;
import com.rad.njavaio.jdatainputstream.DataInputStreamExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

class DataOutputStreamExampleTest {
    DataOutputStreamExample dataOutputStreamExample = new DataOutputStreamExample();
    FileOutputStreamExample fileOutputStreamExample = new FileOutputStreamExample();
    FileInputStreamExample fileInputStreamExample = new FileInputStreamExample();
    DataInputStreamExample dataInputStreamExample = new DataInputStreamExample();

    @Test
    void testWriteData()  throws IOException {

        FileOutputStream file = fileOutputStreamExample.createFile("testData.txt");
//        dataOutputStreamExample.writeData(file,"فرشته");
        dataOutputStreamExample.writeData(file,"فرشته");
//        Assertions.assertEquals("فرشته", fileInputStreamExample.readString("testData.txt"));
        Assertions.assertEquals("فرشته", dataInputStreamExample.readData("testData.txt"));
    }
}
