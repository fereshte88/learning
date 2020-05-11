package com.rad.njavaio.wchararrayreader;

/**
 * Java CharArrayReader Class
 *
 * The CharArrayReader is composed of two words: CharArray and Reader. The CharArrayReader class is used to read character array as a reader (stream). It inherits Reader class.
 *
 کلاس CharArrayReader از دو کلمه تشکیل شده است: CharArray و Reader.
 کلاس CharArrayReader برای خواندن آرایه کاراکترها به عنوان خواننده (جریان) استفاده می شود. این کلاس Reader را به ارث می برد.
 */

/**
 * Java CharArrayReader class declaration
 *
 * Let's see the declaration for Java.io.CharArrayReader class:
 *
 *     public class CharArrayReader extends Reader
 */

import java.io.CharArrayReader;

/**
 * Java CharArrayReader class methods
 * int read() 	It is used to read a single character
 * int read(char[] b, int off, int len) 	It is used to read characters into the portion of an array.
 * boolean ready() 	It is used to tell whether the stream is ready to read.
 * boolean markSupported() 	It is used to tell whether the stream supports mark() operation.
 * long skip(long n) 	It is used to skip the character in the input stream.
 * void mark(int readAheadLimit) 	It is used to mark the present position in the stream.
 * void reset() 	It is used to reset the stream to a most recent mark.
 * void close() 	It is used to closes the stream.
 */
public class CharArrayReaderExample {
    public static void main(String[] ag) throws Exception {
        char[] ary = { 'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };
        CharArrayReader reader = new CharArrayReader(ary);
        int k = 0;
        // Read until the end of a file
        while ((k = reader.read()) != -1) {
            char ch = (char) k;
            System.out.print(ch + " : ");
            System.out.println(k);
        }
    }
}
