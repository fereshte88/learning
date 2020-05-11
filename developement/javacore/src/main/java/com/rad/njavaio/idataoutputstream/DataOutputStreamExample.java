package com.rad.njavaio.idataoutputstream;

/**
 * Java DataOutputStream Class
 * Java DataOutputStream class allows an application to write primitive Java data types to the output stream in a machine-independent way.
 * Java application generally uses the data output stream to write data that can later be read by a data input stream.
 *
 کلاس Java DataOutputStream به یک برنامه کاربردی اجازه می دهد انواع داده های جاوا ابتدایی را به روشی مستقل از ماشین به جریان خروجی بنویسد.
 برنامه جاوا به طور کلی از جریان خروجی داده برای نوشتن داده هایی استفاده می کند که بعداً توسط یک جریان ورودی داده قابل خواندن است.
 */

/**
 * Java DataOutputStream class declaration
 *
 * Let's see the declaration for java.io.DataOutputStream class:
 *
 *     public class DataOutputStream extends FilterOutputStream implements DataOutput
 */

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Java DataOutputStream class methods
 *
 * int size()
 * It is used to return the number of bytes written to the data output stream.
 * برای بازگشت تعداد بایت های نوشته شده به جریان خروجی داده استفاده می شود.
 * void write(int b)
 * It is used to write the specified byte to the underlying output stream.
 * برای نوشتن بایت مشخص شده در جریان خروجی زیرین استفاده می شود.
 * void write(byte[] b, int off, int len)
 * It is used to write len bytes of data to the output stream.
 * از آن برای نوشتن بایت های داده به جریان خروجی استفاده می شود.
 * void writeBoolean(boolean v)
 * It is used to write Boolean to the output stream as a 1-byte value.
 * برای نوشتن Boolean به جریان خروجی به عنوان مقدار 1 بایت استفاده می شود.
 * void writeChar(int v)
 * It is used to write char to the output stream as a 2-byte value.
 * برای نوشتن کاراکتر به جریان خروجی به عنوان یک مقدار 2 بایت استفاده می شود.
 * void writeChars(String s)
 * It is used to write string to the output stream as a sequence of characters.
 * برای نوشتن رشته به جریان خروجی به عنوان دنباله ای از کاراکترها استفاده می شود.
 * void writeByte(int v)
 * It is used to write a byte to the output stream as a 1-byte value.
 * برای نوشتن یک بایت به جریان خروجی به عنوان مقدار 1 بایت استفاده می شود.
 * void writeBytes(String s)
 * It is used to write string to the output stream as a sequence of bytes.
 * برای نوشتن رشته به جریان خروجی به عنوان دنباله ای از بایت استفاده می شود.
 * void writeInt(int v)
 * It is used to write an int to the output stream
 * برای نوشتن int به جریان خروجی استفاده می شود
 * void writeShort(int v)
 * It is used to write a short to the output stream.
 * برای نوشتن یک جریان کوتاه به جریان خروجی استفاده می شود.
 * void writeShort(int v)
 * It is used to write a short to the output stream.
 * برای نوشتن یک جریان کوتاه به جریان خروجی استفاده می شود.
 * void writeLong(long v)
 * It is used to write a long to the output stream.
 * برای نوشتن یک جریان طولانی تا جریان خروجی استفاده می شود.
 * void writeUTF(String str)
 * It is used to write a string to the output stream using UTF-8 encoding in portable manner.
 * برای نوشتن رشته ای به جریان خروجی با استفاده از رمزگذاری UTF-8 به روشی قابل استفاده استفاده می شود.
 * void flush()
 * It is used to flushes the data output stream.
 * برای شستشوی جریان خروجی داده استفاده می شود.
 */
public class DataOutputStreamExample {
    public  void writeData(FileOutputStream file,String data) throws IOException {
        DataOutputStream dataFile = new DataOutputStream(file);
        dataFile.writeUTF(data);
        dataFile.flush();
        dataFile.close();

    }
}
