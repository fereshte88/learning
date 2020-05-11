package com.rad.njavaio.zgstringreader;
/**
 * Java StringReader Class
 *
 * Java StringReader class is a character stream with string as a source. It takes an input string and changes it into character stream. It inherits Reader class.
 * In StringReader class, system resources like network sockets and files are not used, therefore closing the StringReader is not necessary.
 *
 کلاس Java StringReader یک جریان کاراکتر با رشته به عنوان منبع است. یک رشته ورودی را می گیرد و آن را به جریان کاراکتر تغییر می دهد. این کلاس Reader را به ارث می برد.
 در کلاس StringReader از منابع سیستمی مانند سوکت شبکه و پرونده ها استفاده نمی شود ، بنابراین بستن StringReader ضروری نیست.
 */
/**
 * Methods of StringReader class
 * int read() 	It is used to read a single character.
 * int read(char[] cbuf, int off, int len) 	It is used to read a character into a portion of an array.
 * boolean ready() 	It is used to tell whether the stream is ready to be read.
 * boolean markSupported() 	It is used to tell whether the stream support mark() operation.
 * long skip(long ns) 	It is used to skip the specified number of character in a stream
 * void mark(int readAheadLimit) 	It is used to mark the mark the present position in a stream.
 * void reset() 	It is used to reset the stream.
 * void close() 	It is used to close the stream.
 */

import java.io.StringReader;

public class StringReaderExample {
    public void readingString(String text) throws Exception {
        StringReader reader = new StringReader(text);
        int k=0;
        while((k=reader.read())!=-1){
            System.out.print((char)k);
        }
    }
}
