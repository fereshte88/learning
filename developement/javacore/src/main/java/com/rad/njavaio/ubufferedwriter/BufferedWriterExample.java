package com.rad.njavaio.ubufferedwriter;

/**
 * Java BufferedWriter Class
 *
 * Java BufferedWriter class is used to provide buffering for Writer instances.It makes the performance fast. It inherits Writer class.
 * The buffering characters are used for providing the efficient writing of single arrays, characters, and strings.
 کلاس Java BufferedWriter برای تهیه بافر برای نمونه های Writer استفاده می شود. این باعث می شود عملکرد سریع شود. این کلاس Writer را به ارث می برد.
 شخصیت های بافر برای تهیه نوشتن کارآمد از آرایه های تک ، کاراکترها و رشته ها استفاده می شوند.
 */

/**
 * Class declaration
 *
 * Let's see the declaration for Java.io.BufferedWriter class:
 *
 *     public class BufferedWriter extends Writer
 */

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Class constructors
 *
 * BufferedWriter(Writer wrt)
 * It is used to create a buffered character output stream that uses the default size for an output buffer.
 * برای ایجاد یک جریان خروجی کاراکتر بافر که از اندازه پیش فرض برای بافر خروجی استفاده می شود ، استفاده می شود.
 * BufferedWriter(Writer wrt, int size)
 * It is used to create a buffered character output stream that uses the specified size for an output buffer.
 * از آن برای ایجاد یک جریان خروجی کاراکتر بافر استفاده می شود که از اندازه مشخص شده برای بافر خروجی استفاده می کند.
 * Class methods
 *
 * void newLine()
 * It is used to add a new line by writing a line separator.
 * برای اضافه کردن یک خط جدید با نوشتن جداکننده خط استفاده می شود.
 * void write(int c)
 * It is used to write a single character.
 * برای نوشتن یک شخصیت واحد استفاده می شود.
 * void write(char[] cbuf, int off, int len)
 * It is used to write a portion of an array of characters.
 * برای نوشتن بخشی از آرایه ها از آن استفاده می شود.
 * void write(String s, int off, int len)
 * It is used to write a portion of a string.
 * برای نوشتن بخشی از رشته استفاده می شود.
 * void flush()
 * It is used to flushes the input stream.
 * void close()
 * It is used to closes the input stream
 */
public class BufferedWriterExample {
    public void bufferWriter(String filePath, String text) throws Exception {
        FileWriter writer = new FileWriter(filePath);
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write(text);
        buffer.close();
    }
}
