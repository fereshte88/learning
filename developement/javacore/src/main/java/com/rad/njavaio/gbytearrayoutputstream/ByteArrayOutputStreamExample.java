package com.rad.njavaio.gbytearrayoutputstream;

/**
 * Java ByteArrayOutputStream Class
 *
 * Java ByteArrayOutputStream class is used to write common data into multiple files. In this stream, the data is written into a byte array which can be written to multiple streams later.
 * The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.
 * The buffer of ByteArrayOutputStream automatically grows according to data.
 *
 کلاس Java ByteArrayOutputStream برای نوشتن داده های مشترک در چندین فایل استفاده می شود. در این جریان ، داده ها به یک آرایه بایت نوشته شده اند که بعداً می توانند برای چندین جریان ارسال شوند.
 ByteArrayOutputStream یک کپی از داده ها را نگه می دارد و آن را به چندین جریان منتقل می کند.
 بافر ByteArrayOutputStream طبق داده ها به طور خودکار رشد می کند.
 */

/**
 * Java ByteArrayOutputStream class declaration
 *
 * Let's see the declaration for Java.io.ByteArrayOutputStream class:
 *
 *     public class ByteArrayOutputStream extends OutputStream
 */

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Java ByteArrayOutputStream class constructors
 * ByteArrayOutputStream()
 * Creates a new byte array output stream with the initial capacity of 32 bytes, though its size increases if necessary.
 * یک جریان خروجی آرایه جدید بایت با ظرفیت اولیه 32 بایت ایجاد می کند ، اگرچه در صورت لزوم اندازه آن افزایش می یابد.
 * ByteArrayOutputStream(int size)
 * Creates a new byte array output stream, with a buffer capacity of the specified size, in bytes.
 * یک جریان خروجی آرایه جدید بایت ، با ظرفیت بافر در اندازه مشخص شده ، در بایت ایجاد می کند.
 *
 * Java ByteArrayOutputStream class methods
 *
 * int size()
 * It is used to returns the current size of a buffer.
 * برای بازگرداندن اندازه فعلی یک بافر استفاده می شود.
 * byte[] toByteArray()
 * It is used to create a newly allocated byte array.
 * از آن برای ایجاد یک آرایه بایت تخصیص یافته استفاده می شود.
 * String toString()
 * It is used for converting the content into a string decoding bytes using a platform default character set.
 * برای تبدیل محتوا به یک بایت رمزگشایی رشته با استفاده از یک مجموعه کاراکتر پیش فرض بستر استفاده می شود.
 * String toString(String charsetName)
 * It is used for converting the content into a string decoding bytes using a specified charsetName.
 * برای تبدیل محتوا به بایت رمزگشایی رشته با استفاده از charsetName مشخص استفاده می شود.
 * void write(int b)
 * It is used for writing the byte specified to the byte array output stream.
 * برای نوشتن بایت مشخص شده در جریان خروجی آرایه بایت استفاده می شود.
 * void write(byte[] b, int off, int len
 * It is used for writing len bytes from specified byte array starting from the offset off to the byte array output stream.
 * این برای نوشتن بایت های len از آرایه بایت مشخص شده با شروع از افست off به جریان خروجی آرایه بایت استفاده می شود.
 * void writeTo(OutputStream out)
 * It is used for writing the complete content of a byte array output stream to the specified output stream.
 * این برای نوشتن محتوای کامل یک جریان خروجی آرایه بایت به جریان خروجی مشخص استفاده می شود.
 * void reset()
 * It is used to reset the count field of a byte array output stream to zero value.
 * برای تنظیم مجدد تعداد شمارش جریان خروجی آرایه بایت به مقدار صفر استفاده می شود.
 * void close()
 * It is used to close the ByteArrayOutputStream.
 * برای بستن ByteArrayOutputStream استفاده می شود.
 */
public class ByteArrayOutputStreamExample {
    public void writeCommonContext(FileOutputStream[] fileOutputStreams, String commonData) throws IOException {

        ByteArrayOutputStream bout=new ByteArrayOutputStream();
        byte[] b = commonData.getBytes();
        bout.write(b);
        for (int i = 0; i <fileOutputStreams.length ; i++) {
            bout.writeTo(fileOutputStreams[i]);
        }
        bout.flush();
        bout.close();//has no effect
    }
}
