package com.rad.njavaio.qwriter;

/**
 * It is an abstract class for writing to character streams. The methods that a subclass must implement are write(char[], int, int), flush(), and close().
 * Most subclasses will override some of the methods defined here to provide higher efficiency, functionality or both.
 * این یک کلاس انتزاعی برای نوشتن به character streams است. متدهایی که یک زیر کلاس باید پیاده سازی کند write (char []، int، int)،  ()flush و close () است.
 * بیشتر زیر کلاس ها برخی از متد های تعریف شده در اینجا را override می کنند تا کارایی ، کارایی یا هر دو بالاتر را ارائه دهند.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Fields
 *
 * protected Object 	lock
 * The object used to synchronize operations on this stream.
 *شی مورد استفاده برای همگام سازی عملیات در این جریان.
 * Constructor
 * protected 	Writer()
 * It creates a new character-stream writer whose critical sections will synchronize on the writer itself.
 * این یک نویسنده جدیدcharacter-stream ایجاد می کند که بخش های مهم آن همزمان با خود نویسنده هماهنگ می شوند.
 * protected 	Writer(Object lock)
 * It creates a new character-stream writer whose critical sections will synchronize on the given object.
 * این یک نویسنده character-stream جدید  ایجاد می کند که بخش های مهم آن در یک هدف خاص همگام می شوند.
 *
 * Methods
 *
 * Writer 	append(char c)
 * It appends the specified character to this writer.
 * این character مشخص شده را به این نویسنده اضافه می کند.
 * Writer 	append(CharSequence csq)
 * It appends the specified character sequence to this writer
 * این دنباله character مشخص شده را به این نویسنده اضافه می کند
 * Writer 	append(CharSequence csq, int start, int end)
 * It appends a subsequence of the specified character sequence to this writer.
 * این پیامد دنباله شخصیت مشخص شده را به این نویسنده اضافه می کند.
 * abstract void 	close()
 * It closes the stream, flushing it first.
 * این جریان را می بندد و ابتدا آن را می تاباند.
 * abstract void 	flush()
 * It flushes the stream.
 * جریان را سرازیر می کند.
 * void 	write(char[] cbuf)
 * It writes an array of characters.
 * این قسمت از مجموعه ای از شخصیت ها را می نویسد.
 * abstract void 	write(char[] cbuf, int off, int len)
 * It writes a portion of an array of characters.
 * void 	write(int c)
 * It writes a single character.
 * این یک شخصیت واحد را می نویسد.
 * void 	write(String str)
 * It writes a string.
 * void 	write(String str, int off, int len)
 * It writes a portion of a string.
 * بخشی از رشته را می نویسد.
 */
public class WriterExample {
    public void write(String filePath, String text)  throws  IOException{
            Writer w = new FileWriter(filePath);
            w.write(text);
            w.close();
    }

}
