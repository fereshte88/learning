package com.rad.njavaio.kjavafilteroutputstream;

import com.rad.njavaio.bfileoutputstream.FileOutputStreamExample;
import com.rad.njavaio.cfileinputstream.FileInputStreamExample;
import com.rad.njavaio.ljavafilterinputstream.FilterInputStreamExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class FilterOutputStreamExampleTest {
    FilterOutputStreamExample filterOutputStreamExample = new FilterOutputStreamExample();
    FileOutputStreamExample fileOutputStreamExample = new FileOutputStreamExample();
    FileInputStreamExample fileInputStreamExample = new FileInputStreamExample();
    FilterInputStreamExample filterInputStreamExample = new FilterInputStreamExample();

    @Test
    void testWriteFilter() throws IOException {
        filterOutputStreamExample.writeFilter(  fileOutputStreamExample.createFile("filterData.txt"), "enjoy java programming");
//        Assertions.assertEquals("enjoy java programming",fileInputStreamExample.readString("filterData.txt"));
        Assertions.assertEquals("enjoy java programming",filterInputStreamExample.readFilter("filterData.txt"));
    }
}

