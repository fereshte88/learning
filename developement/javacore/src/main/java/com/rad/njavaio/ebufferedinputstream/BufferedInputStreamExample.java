package com.rad.njavaio.ebufferedinputstream;

/**
 * Java BufferedInputStream class is used to read information from stream. It internally uses buffer mechanism to make the performance fast.
 *
 * The important points about BufferedInputStream are:
 *
 *     When the bytes from the stream are skipped or read, the internal buffer automatically refilled from the contained input stream, many bytes at a time.
 *     When a BufferedInputStream is created, an internal buffer array is created.
 *     کلاس Java BufferedInputStream برای خواندن اطلاعات از جریان استفاده می شود. در داخل از مکانیزم بافر برای سرعت بخشیدن به عملکرد استفاده می کند.
 *
 * نکات مهم در مورد BufferedInputStream عبارتند از:
 *
 *      هنگامی که بایت های جریان از بین می روند یا خوانده می شوند ، بافر داخلی به طور خودکار از جریان ورودی موجود ، بایت های زیادی را در یک زمان دوباره پر می کند.
 *      هنگامی که BufferedInputStream ایجاد می شود ، یک آرایه بافر داخلی ایجاد می شود.
 */

/**
 * Java BufferedInputStream class declaration
 *
 * Let's see the declaration for Java.io.BufferedInputStream class:
 *
 *     public class BufferedInputStream extends FilterInputStream
 */

/**
 * Java BufferedInputStream class constructors
 *
 * BufferedInputStream(InputStream IS)
 * It creates the BufferedInputStream and saves it argument, the input stream IS, for later use.
 * این BufferedInputStream را ایجاد کرده و آرگومان آن را ذخیره می کند ، جریان ورودی IS ، برای استفاده بعدی.
 * BufferedInputStream(InputStream IS, int size)
 * It creates the BufferedInputStream with a specified buffer size and saves it argument, the input stream IS, for later use.
 * BufferedInputStream را با اندازه بافر مشخص ایجاد می کند و استدلال آن ، جریان ورودی IS را برای استفاده بعدی ذخیره می کند.
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * Java BufferedInputStream class methods
 * int available()
 * It returns an estimate number of bytes that can be read from the input stream without blocking by the next invocation method for the input stream.
 * این تعداد برآورد بایت را که می تواند از جریان ورودی خوانده شود بدون مسدود کردن با متد فراخوانی بعدی برای جریان ورودی برمی گرداند.
 * int read()
 * It read the next byte of data from the input stream.
 * بایت بعدی داده ها را از جریان ورودی می خواند.
 * int read(byte[] b, int off, int ln)
 * It read the bytes from the specified byte-input stream into a specified byte array, starting with the given offset.
 * این بایت ها را از جریان بایت ورودی مشخص به آرایه بایت مشخص می خواند ، با شروع افست داده شده.
 * void close()
 * It closes the input stream and releases any of the system resources associated with the stream.
 * این جریان ورودی را می بندد و هر یک از منابع سیستم مرتبط با جریان را آزاد می کند.
 * void reset()
 * It repositions the stream at a position the mark method was last called on this input stream.
 * این جریان را در موقعیتی تغییر می دهد که آخرین بار متد علامت گذاری به این جریان ورودی فراخوانی شده است.
 * void mark(int readlimit)
 * It sees the general contract of the mark method for the input stream.\
 * این قرارداد عمومی متد علامت گذاری را برای جریان ورودی مشاهده می کند.
 * long skip(long x)
 * It skips over and discards x bytes of data from the input stream.
 * آن را رد می کند و x بایت داده را از جریان ورودی دور می کند.
 * boolean markSupported()
 * It tests for the input stream to support the mark and reset methods.
 * این آزمایش برای پشتیبانی از جریان ورودی برای پشتیبانی از متد های علامت گذاری و تنظیم مجدد است.
 */
public class BufferedInputStreamExample {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("testout.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
