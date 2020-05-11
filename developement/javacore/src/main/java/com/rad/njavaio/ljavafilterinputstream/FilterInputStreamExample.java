package com.rad.njavaio.ljavafilterinputstream;

/**
 * Java FilterInputStream class implements the InputStream.
 * It contains different sub classes as BufferedInputStream, DataInputStream for providing additional functionality.
 * So it is less used individually.
 * کلاس Java FilterInputStream کلاس InputStream را پیاده سازی می کند.
 * این شامل کلاس های فرعی مختلف به عنوان BufferedInputStream ، DataInputStream برای ارائه قابلیت های اضافی است.
 * بنابراین کمتر به صورت جداگانه استفاده می شود.
 */

/**
 * Java FilterInputStream class declaration
 *
 * Let's see the declaration for java.io.FilterInputStream class
 *
 *     public class FilterInputStream extends InputStream
 */

import java.io.*;

/**
 * Java FilterInputStream class Methods
 *
 * int available()
 * It is used to return an estimate number of bytes that can be read from the input stream.
 * برای بازگشت تعداد برآورد بایت که می تواند از جریان ورودی خوانده شود ، استفاده می شود.
 * int read()
 * It is used to read the next byte of data from the input stream.
 * برای خواندن بایت بعدی داده ها از جریان ورودی استفاده می شود.
 * int read(byte[] b)
 * It is used to read up to byte.length bytes of data from the input stream.
 * از آن برای خواندن بایت تا طول بایت از داده های جریان ورودی استفاده می شود.
 * long skip(long n)
 * It is used to skip over and discards n bytes of data from the input stream.
 * برای پرش و رد کردن بایت های داده از جریان ورودی استفاده می شود.
 * boolean markSupported()
 * It is used to test if the input stream support mark and reset method.
 * برای آزمایش اینکه آیا مارک پشتیبانی از جریان ورودی و روش بازنشانی استفاده می شود ، استفاده می شود.
 * void mark(int readlimit)
 * It is used to mark the current position in the input stream.
 * برای علامت گذاری موقعیت فعلی در جریان ورودی استفاده می شود.
 * void reset()
 * It is used to reset the input stream.
 * برای تنظیم مجدد جریان ورودی استفاده می شود.
 * void close()
 * It is used to close the input stream.
 * برای بستن جریان ورودی استفاده می شود.
 */
public class FilterInputStreamExample {
    public String readFilter(String filePath) throws IOException {
        String value="";
        File data = new File(filePath);
        FileInputStream  file = new FileInputStream(data);
        FilterInputStream filter = new BufferedInputStream(file);
        int k =0;
        while((k=filter.read())!=-1){
            value = value +(char)k;
        }
        file.close();
        filter.close();
        return value;
    }
}
