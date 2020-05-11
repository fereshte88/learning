package com.rad.njavaio.zgstringreader;

import com.rad.njavaio.zaprintwriter.PrintWriterExample;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

class StringReaderExampleTest {
    StringReaderExample stringReaderExample = new StringReaderExample();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;


    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));

    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    PrintWriterExample printWriterExample = new PrintWriterExample();


    @Test
    void testReadingString() throws Exception {
        stringReaderExample.readingString( "Hello Java!! \nWelcome to Javatpoint.");
        assertEquals("Hello Java!! \nWelcome to Javatpoint.",outContent.toString());
    }
}