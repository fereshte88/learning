package com.rad.njavaio.fsequenceinputstream;

import com.rad.njavaio.bfileoutputstream.FileOutputStreamExample;
import com.rad.njavaio.cfileinputstream.FileInputStreamExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class SequenceInputOneTest {

    SequenceInputStreamExample sequenceInputStreamExample = new SequenceInputStreamExample();
    FileOutputStreamExample fileOutputStreamExample = new FileOutputStreamExample();
    FileInputStreamExample fileInputStreamExample = new FileInputStreamExample();

    String rootPath= "javaiotemp\\";
    @BeforeEach
    void initUseCase() throws IOException {
        File file = new File(rootPath);
        if (!file.exists()) {
            file.mkdir();
        }

    }
    @Test
    void writeSequenceTest() throws IOException {
        fileOutputStreamExample.writeString("String1",rootPath+"testin1.txt");
        fileOutputStreamExample.writeString("String2",rootPath+"testin2.txt");
        sequenceInputStreamExample.writeSequence(rootPath+"testin1.txt", rootPath+"testin2.txt", rootPath+"testout.txt");
        Assertions.assertEquals("String1String2",fileInputStreamExample.readString(rootPath+"testout.txt"));
    }

    @Test
    void readSequenceTest() throws IOException{
        fileOutputStreamExample.writeString("String1","testin1.txt");
        fileOutputStreamExample.writeString("String2","testin2.txt");
        Assertions.assertEquals("String1String2",sequenceInputStreamExample.readSequence("testin1.txt","testin2.txt"));
    }

    @Test
    void readMultiFilesTest() throws IOException{
        fileOutputStreamExample.writeString("welcome ","a.txt");
        fileOutputStreamExample.writeString("to ","b.txt");
        fileOutputStreamExample.writeString("java ","c.txt");
        fileOutputStreamExample.writeString("programming","d.txt");
        String[] filePaths = {"a.txt","b.txt","c.txt","d.txt"};
        Assertions.assertEquals("welcome to java programming",sequenceInputStreamExample.readMultiFiles(filePaths));
    }
}
