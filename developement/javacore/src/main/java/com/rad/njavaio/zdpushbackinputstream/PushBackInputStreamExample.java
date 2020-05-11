package com.rad.njavaio.zdpushbackinputstream;

/**
 * Java PushbackInputStream Class
 * <p>
 * Java PushbackInputStream class overrides InputStream and provides extra functionality to another input stream.
 * It can unread a byte which is already read and push back one byte.
 * کلاس Java PushbackInputStreamکلاس InputStream را  overrides  می کند و عملکرد اضافی را برای یک جریان ورودی دیگر فراهم می کند.
 * این می تواند یک بایت را که قبلاً خوانده شده بازخوانی کند و یک بایت را به عقب برگرداند.
 * Class declaration
 * Let's see the declaration for java.io.PushbackInputStream class:
 * public class PushbackInputStream extends FilterInputStream
 */

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

/**
 * Class Methods
 * int available()
 * It is used to return the number of bytes that can be read from the input stream.
 * برای بازگشت تعداد بایت هایی که از جریان ورودی قابل خواندن هستند استفاده می شود.
 * int read()
 * It is used to read the next byte of data from the input stream.
 * برای خواندن بایت بعدی داده ها از جریان ورودی استفاده می شود.
 * boolean markSupported()
 * It is used to test if the input stream support mark and reset method.
 * برای آزمایش اینکه آیاازپشتیبانی مارک  جریان ورودی و روش بازنشانی استفاده می شود.
 * void mark(int readlimit)
 * It is used to mark the current position in the input stream.
 * برای علامت گذاری موقعیت فعلی در جریان ورودی استفاده می شود.
 * long skip(long x)
 * It is used to skip over and discard x bytes of data.
 * برای پرش و دور انداختن بایت x از داده ها استفاده می شود.
 * void unread(int b)
 * It is used to pushes back the byte by copying it to the pushback buffer.
 * از آن برای بازگرداندن بایت با کپی کردن آن در بافر pushback استفاده می شود.
 * void unread(byte[] b)
 * It is used to pushes back the array of byte by copying it to the pushback buffer.
 * از آن برای بازگرداندن آرایه بایت با کپی کردن آن در بافر pushback استفاده می شود.
 * void reset()
 * It is used to reset the input stream.
 * برای تنظیم مجدد جریان ورودی استفاده می شود.
 * void close()
 * It is used to close the input stream.
 * برای بستن جریان ورودی استفاده می شود.
 */
public class PushBackInputStreamExample {
    public String pushBackInput(String str,int i) throws Exception {
        String value="";
        byte byteArray[] = str.getBytes();
        ByteArrayInputStream bout = new ByteArrayInputStream(byteArray);
        PushbackInputStream push = new PushbackInputStream(bout, str.length()+i);
        int c;
        // unread method
        push.unread(byteArray, 0, i);

        while ((c = push.read()) != -1) {
            value = value +(char) c;
        }
       return value;
    }
}