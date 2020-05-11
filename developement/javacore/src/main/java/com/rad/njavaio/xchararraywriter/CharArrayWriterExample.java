package com.rad.njavaio.xchararraywriter;

/**
 * Java CharArrayWriter Class
 *
 * The CharArrayWriter class can be used to write common data to multiple files.
 * This class inherits Writer class. Its buffer automatically grows when data is written in this stream. Calling the close() method on this object has no effect.
 *
 از کلاس CharArrayWriter می توان برای نوشتن داده های مشترک در چندین فایل استفاده کرد. این کلاس کلاس Writer را به ارث می برد.
 بافر آن هنگامی که داده ها در این جریان نوشته می شوند به طور خودکار رشد می کند. فراخوانی روش بستن () روی این شیء تأثیری ندارد.
 */

/**
 * Java CharArrayWriter class declaration
 *
 * Let's see the declaration for Java.io.CharArrayWriter class:
 *
 *     public class CharArrayWriter extends Writer
 */

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Java CharArrayWriter class Methods
 * Method 	Description
 * int size() 	It is used to return the current size of the buffer.
 * char[] toCharArray() 	It is used to return the copy of an input data.
 * String toString() 	It is used for converting an input data to a string.
 * CharArrayWriter append(char c) 	It is used to append the specified character to the writer.
 * CharArrayWriter append(CharSequence csq) 	It is used to append the specified character sequence to the writer.
 * CharArrayWriter append(CharSequence csq, int start, int end) 	It is used to append the subsequence of a specified character to the writer.
 * void write(int c) 	It is used to write a character to the buffer.
 * void write(char[] c, int off, int len) 	It is used to write a character to the buffer.
 * void write(String str, int off, int len) 	It is used to write a portion of string to the buffer.
 * void writeTo(Writer out) 	It is used to write the content of buffer to different character stream.
 * void flush() 	It is used to flush the stream.
 * void reset() 	It is used to reset the buffer.
 * void close() 	It is used to close the stream.
 */
public class CharArrayWriterExample {
    public void arrayWriter(FileWriter[] fileWriters, String commonData)throws Exception{
        CharArrayWriter out=new CharArrayWriter();
        out.write(commonData);
        for (int i = 0; i <fileWriters.length ; i++) {
            out.writeTo(fileWriters[i]);
            fileWriters[i].close();
        }
    }
}
