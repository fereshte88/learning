package com.rad.njavaio.rreader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Java Reader is an abstract class for reading character streams. The only methods that a subclass must implement are read(char[], int, int) and close().
 * Most subclasses, however, will override some of the methods to provide higher efficiency, additional functionality, or both.
 *کلاس جاوا ریدر کلاس انتزاعی برای خواندن character streams است. تنها متدی که یک زیر کلاس باید پیاده سازی کند read (char []، int، int) و close () است.
 *  با این حال ، اکثر زیر کلاس ها برخی از روش ها را برای ارائه راندمان بالاتر ، کارایی اضافی یا هر دو مورد غلبه می کنند.
 * Some of the implementation class are BufferedReader, CharArrayReader, FilterReader, InputStreamReader, PipedReader, StringReader
 *
 برخی از کلاس های اجرای عبارتند از BufferedReader ، CharArrayReader ، FilterReader ، InputStreamReader ، PipedReader ، StringReader

 */

/**
 * Fields
 *
 * protected Object 	lock
 * The object used to synchronize operations on this stream.
 * شی مورد استفاده برای همگام سازی عملیات در این جریان.
 * Constructor
 *
 * protected 	Reader()
 * It creates a new character-stream reader whose critical sections will synchronize on the reader itself.
 * این یک خواننده کاراکتر جریان جدید ایجاد می کند که بخش های مهم آن روی خود خواننده همگام می شود.
 * protected 	Reader(Object lock)
 * It creates a new character-stream reader whose critical sections will synchronize on the given object.
 * این یک خواننده جریان کاراکتر جدید ایجاد می کند که بخش های مهم آن همزمان در مورد داده شده همگام می شوند.
 * Methods
 *
 * abstract void 	close()
 * It closes the stream and releases any system resources associated with it.
 * جریان را می بندد و منابع سیستم مربوط به آن را آزاد می کند.
 * void 	mark(int readAheadLimit)
 * It marks the present position in the stream.
 * این موقعیت فعلی را در جریان نشان می دهد.
 * boolean 	markSupported()
 * It tells whether this stream supports the mark() operation.
 * این می گوید که آیا این جریان از عملکرد علامت () پشتیبانی می کند یا خیر.
 * int 	read()
 * It reads a single character.
 * int 	read(char[] cbuf)
 * It reads characters into an array.
 * abstract int 	read(char[] cbuf, int off, int len)
 * It reads characters into a portion of an array.
 * int 	read(CharBuffer target)
 * It attempts to read characters into the specified character buffer.
 * boolean 	ready()
 * It tells whether this stream is ready to be read.
 * void 	reset()
 * It resets the stream.
 * long 	skip(long n)
 * It skips characters.
 */
public class ReaderExample {
    public String read(String filePath)  throws IOException {
            Reader reader = new FileReader(filePath);
            String value = "";
            int data = reader.read();
            while (data != -1) {
                value= value +((char) data);
                data = reader.read();
            }
            reader.close();
        return value;
    }
}
