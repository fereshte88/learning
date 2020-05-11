package com.rad.njavaio.zaprintwriter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
class PrintWriterExampleTest {
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
    void testPrintWriter() throws Exception {
        printWriterExample.printWriter();
        assertEquals("Javatpoint provides tutorials of all technology.",outContent.toString());
    }

}
