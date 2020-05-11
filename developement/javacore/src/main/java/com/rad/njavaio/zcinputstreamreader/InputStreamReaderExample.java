package com.rad.njavaio.zcinputstreamreader;

/**
 * Java InputStreamReader
 *
 * An InputStreamReader is a bridge from byte streams to character streams: It reads bytes and decodes them into characters using a specified charset.
 * The charset that it uses may be specified by name or may be given explicitly, or the platform's default charset may be accepted.
 *
 کلاس InputStreamReader پلی است از جریان بایت تا جریان کاراکتر: این بایت را می خواند و آنها را با استفاده از یک مجموعه مشخص می کند.
 ک charset که از آن استفاده می کند ممکن است با نام مشخص شده باشد یا ممکن است صریحاً به آن داده شود ، یا کارتر پیش فرض سکوی ممکن باشد پذیرفته شود.
 */

import java.io.*;

/**
 * Constructor
 * InputStreamReader(InputStream in)
 * It creates an InputStreamReader that uses the default charset.
 * این یک InputStreamReader ایجاد می کند که از charset پیش فرض استفاده می کند.
 * InputStreamReader(InputStream in, Charset cs)
 * It creates an InputStreamReader that uses the given charset.
 * این یک InputStreamReader ایجاد می کند که از charset داده شده استفاده می کند.
 * InputStreamReader(InputStream in, CharsetDecoder dec)
 * It creates an InputStreamReader that uses the given charset decoder.
 * این یک InputStreamReader ایجاد می کند که از رمزگشای کارشده داده شده استفاده می کند.
 * InputStreamReader(InputStream in, String charsetName)
 * It creates an InputStreamReader that uses the named charset.
 * این یک InputStreamReader ایجاد می کند که از charset نامگذاری شده استفاده می کند.
 *
 * Method
 * void 	close()
 * It closes the stream and releases any system resources associated with it.
 * جریان را می بندد و منابع سیستم مربوط به آن را آزاد می کند.
 * String 	getEncoding()
 * It returns the name of the character encoding being used by this stream.
 * این اسم رمزگذاری کاراکتری را که توسط این جریان استفاده می شود ، برمی گرداند.
 * int 	read()
 * It reads a single character.
 * یک character واحد را می خواند.
 * int 	read(char[] cbuf, int offset, int length)
 * It reads characters into a portion of an array.
 * این کاراکترها را در قسمتی از آرایه می خواند.
 * boolean 	ready()
 * It tells whether this stream is ready to be read.
 * این می گوید که آیا این جریان برای مطالعه آماده است یا خیر.
 */
public class InputStreamReaderExample {
    public String inputStreamReader(String filePath) throws IOException {
        String value = "";
            InputStream stream = new FileInputStream(filePath);
            Reader reader = new InputStreamReader(stream);
            int data = reader.read();
            while (data != -1) {
                value = value +(char) data;
                data = reader.read();
            }
       return value;
    }
}
