package com.rad.njavaio.jdatainputstream;

/**
 * Java DataInputStream Class
 * Java DataInputStream class allows an application to read primitive data from the input stream in a machine-independent way.
 * Java application generally uses the data output stream to write data that can later be read by a data input stream.
 *
 کلاس Java DataInputStream به یک برنامه اجازه می دهد تا داده های ابتدایی از جریان ورودی را به روشی مستقل از دستگاه بخواند.
 برنامه جاوا به طور کلی از جریان خروجی داده برای نوشتن داده هایی استفاده می کند که بعداً توسط یک جریان ورودی داده قابل خواندن است.
 */

/**
 * Java DataInputStream class declaration
 *
 * Let's see the declaration for java.io.DataInputStream class:
 *
 *     public class DataInputStream extends FilterInputStream implements DataInput
 */

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Java DataInputStream class Methods
 *
 * int read(byte[] b)
 * It is used to read the number of bytes from the input stream.
 * برای خواندن تعداد بایت های جریان ورودی استفاده می شود.
 * int read(byte[] b, int off, int len)
 * It is used to read len bytes of data from the input stream.
 * برای خواندن بایت های داده از جریان ورودی استفاده می شود.
 * int readInt()
 * It is used to read input bytes and return an int value.
 * برای خواندن بایت های ورودی و بازگرداندن مقدار int استفاده می شود.
 * byte readByte()
 * It is used to read and return the one input byte.
 * از آن برای خواندن و بازگشت بایت ورودی استفاده می شود.
 * char readChar()
 * It is used to read two input bytes and returns a char value.
 * برای خواندن دو بایت ورودی استفاده می شود و مقدار char را برمی گرداند.
 * double readDouble()
 * It is used to read eight input bytes and returns a double value.
 * برای خواندن هشت بایت ورودی استفاده می شود و مقدار دو برابر را برمی گرداند.
 * boolean readBoolean()
 * It is used to read one input byte and return true if byte is non zero, false if byte is zero.
 * برای خواندن یک بایت ورودی و برگشت درست اگر بایت غیر صفر باشد ، غلط اگر بایت صفر باشد ، استفاده می شود.
 * int skipBytes(int x)
 * It is used to skip over x bytes of data from the input stream.
 * این برای پرش از بیش از x بایت داده از جریان ورودی استفاده می شود.
 * String readUTF()
 * It is used to read a string that has been encoded using the UTF-8 format.
 * برای خواندن رشته ای که با استفاده از قالب UTF-8 رمزگذاری شده است ، استفاده می شود.
 * void readFully(byte[] b)
 * It is used to read bytes from the input stream and store them into the buffer array.
 * برای خواندن بایت از جریان ورودی و ذخیره آنها در آرایه بافر استفاده می شود.
 * void readFully(byte[] b, int off, int len)
 * It is used to read len bytes from the input stream.
 * برای خواندن بایت های len از جریان ورودی استفاده می شود.
 */
public class DataInputStreamExample {
    public String readData(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        DataInputStream inst = new DataInputStream(fileInputStream);
        return inst.readUTF();
    }
}
