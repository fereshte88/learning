package com.rad.njavaio.hbytearrayinputstream;

/**
 * Java ByteArrayInputStream Class
 *
 * The ByteArrayInputStream is composed of two words: ByteArray and InputStream. As the name suggests, it can be used to read byte array as input stream.
 * Java ByteArrayInputStream class contains an internal buffer which is used to read byte array as stream. In this stream, the data is read from a byte array.
 * The buffer of ByteArrayInputStream automatically grows according to data.
 *
 ByteArrayInputStream از دو کلمه تشکیل شده است: ByteArray و InputStream. همانطور که از نام آن پیداست ، می توان از آن برای خواندن آرایه بایت به عنوان جریان ورودی استفاده کرد.
 کلاس Java ByteArrayInputStream شامل یک بافر داخلی است که برای خواندن آرایه بایت به عنوان جریان استفاده می شود. در این جریان داده ها از یک آرایه بایت خوانده می شوند.
 بافر ByteArrayInputStream طبق داده ها به طور خودکار رشد می کند.

 */

/**
 * Java ByteArrayInputStream class declaration
 *
 * Let's see the declaration for Java.io.ByteArrayInputStream class:
 *
 *     public class ByteArrayInputStream extends InputStream
 */

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Java ByteArrayInputStream class constructors
 *
 * ByteArrayInputStream(byte[] ary)
 * Creates a new byte array input stream which uses ary as its buffer array.
 * یک جریان ورودی آرایه جدید بایت ایجاد می کند که از ary به عنوان آرایه بافر خود استفاده می کند.
 * ByteArrayInputStream(byte[] ary, int offset, int len)
 * Creates a new byte array input stream which uses ary as its buffer array that can read up to specified len bytes of data from an array.
 *یک جریان ورودی آرایه جدید بایت ایجاد می کند که از ary به عنوان آرایه بافر خود استفاده می کند که می تواند بایت های مشخص شده داده های یک آرایه را بخواند.
 *
 * Java ByteArrayInputStream class methods
 * int available()
 * It is used to return the number of remaining bytes that can be read from the input stream.
 * برای برگرداندن تعداد بایت های باقیمانده قابل خواندن از جریان ورودی استفاده می شود.
 * int read()
 * It is used to read the next byte of data from the input stream.
 * برای خواندن بایت بعدی داده ها از جریان ورودی استفاده می شود.
 * int read(byte[] ary, int off, int len)
 * It is used to read up to len bytes of data from an array of bytes in the input stream.
 * از آن برای خواندن بایت بایت داده ها از آرایه ای از بایت ها در جریان ورودی استفاده می شود.
 * boolean markSupported()
 * It is used to test the input stream for mark and reset method.
 * از آن برای آزمایش جریان ورودی برای روش mark و reset استفاده می شود.
 * long skip(long x)
 * It is used to skip the x bytes of input from the input stream.
 * برای پرش از بایت x از ورودی از جریان ورودی استفاده می شود.
 * void mark(int readAheadLimit)
 * It is used to set the current marked position in the stream.
 * برای تنظیم موقعیت مشخص شده فعلی در جریان استفاده می شود.
 * void reset()
 * It is used to reset the buffer of a byte array.
 * برای تنظیم مجدد بافر یک آرایه بایت استفاده می شود.
 * void close()
 * It is used for closing a ByteArrayInputStream.
 * این برای بستن یک ByteArrayInputStream استفاده می شود.
 */
public class ByteArrayInputStreamExample {
    public String readByteArray(byte[] buf) throws IOException {
        String value="";
        // Create the new byte array input stream
        ByteArrayInputStream byt = new ByteArrayInputStream(buf);
        int k = 0;
        while ((k = byt.read()) != -1) {
            //Conversion of a byte into character
            value=value+ (char) k;
        }
        return value;
    }
}
