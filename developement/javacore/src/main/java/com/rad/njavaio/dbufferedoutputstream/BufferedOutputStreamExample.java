package com.rad.njavaio.dbufferedoutputstream;

/**
 * Java BufferedOutputStream class is used for buffering an output stream. It internally uses buffer to store data.
 * It adds more efficiency than to write data directly into a stream. So, it makes the performance fast.
 * For adding the buffer in an OutputStream, use the BufferedOutputStream class.
 * Let's see the syntax for adding the buffer in an OutputStream:
 * کلاس Java BufferedOutputStream برای بافر جریان خروجی استفاده می شود. در داخل از بافر برای ذخیره داده استفاده می کند.
 * این کارآیی بیشتر از نوشتن داده به طور مستقیم در یک جریان اضافه می کند. بنابراین ، باعث می شود عملکرد سریع شود.
 * برای افزودن بافر در OutputStream ، از کلاس BufferedOutputStream استفاده کنید.
 * بیایید نحو اضافه کردن بافر در OutputStream را مشاهده کنیم:
 *     OutputStream os= new BufferedOutputStream(new FileOutputStream("D:\\IO Package\\testout.txt"));
 */

/**
 * Java BufferedOutputStream class declaration
 *
 * Let's see the declaration for Java.io.BufferedOutputStream class:
 *
 *     public class BufferedOutputStream extends FilterOutputStream
 */

/**
 * Java BufferedOutputStream class constructors
 *
 * BufferedOutputStream(OutputStream os)
 * It creates the new buffered output stream which is used for writing the data to the specified output stream.
 * این جریان خروجی بافر جدید را ایجاد می کند که برای نوشتن داده ها به جریان خروجی مشخص استفاده می شود.
 * BufferedOutputStream(OutputStream os, int size)
 * It creates the new buffered output stream which is used for writing the data to the specified output stream with a specified buffer size.
 * این جریان خروجی بافر جدید را ایجاد می کند که برای نوشتن داده ها به جریان خروجی مشخص شده با اندازه بافر مشخص استفاده می شود.
 */

/**
 * Java BufferedOutputStream class methods
 * void write(int b)
 * It writes the specified byte to the buffered output stream.
 * بایت مشخص شده را به جریان خروجی بافر می نویسد.
 * void write(byte[] b, int off, int len)
 * It write the bytes from the specified byte-input stream into a specified byte array, starting with the given offset
 * این بایت ها را از جریان بایت ورودی مشخص شده در یک آرایه بایت مشخص ، با شروع افست داده شده ، می نویسد
 * void flush()
 * It flushes the buffered output stream.
 * جریان خروجی بافر را flush می کند.
 */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * In this example, we are writing the textual information in the BufferedOutputStream object which is connected to the FileOutputStream object.
 * The flush() flushes the data of one stream and send it into another. It is required if you have connected the one stream with another.
 *
 در این مثال ، ما در حال نوشتن اطلاعات متنی در شی BufferedOutputStream هستیم که به شیء FileOutputStream متصل می شود.
 flush () داده های یک جریان را پخش می کند و آن را به جریان دیگر ارسال می کند. در صورت اتصال یک جریان با جریان دیگر لازم است.

 */
public class BufferedOutputStreamExample {
    public static void main(String args[])throws Exception{
        FileOutputStream fout=new FileOutputStream("testout.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Welcome to javaTpoint.";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }

}
