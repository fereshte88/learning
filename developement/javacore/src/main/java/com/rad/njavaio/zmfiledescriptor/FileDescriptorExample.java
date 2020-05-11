package com.rad.njavaio.zmfiledescriptor;

/**
 * FileDescriptor class serves as an handle to the underlying machine-specific structure representing an open file, an open socket, or another source or sink of bytes.
 * The handle can be err, in or out.
 * The FileDescriptor class is used to create a FileInputStream or FileOutputStream to contain it.
 * کلاس FileDescriptor به عنوان دسته ای برای ساختار خاص دستگاه موردنظر که یک فایل باز ، یک سوکت باز یا منبع یا سینک دیگری از بایت را ارائه می دهد ، خدمت می کند.
 * دسته می تواند err, in or out باشد.
 * از کلاس FileDescriptor برای ایجاد FileInputStream یا FileOutputStream استفاده می شود تا آن را مهار کند.
 */

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Field
 *
 * static 	FileDescriptor 	err
 * A handle to the standard error stream.
 * یک دسته به جریان خطای استاندارد.
 * static 	FileDescriptor 	in
 * A handle to the standard input stream.
 * دسته ای به جریان ورودی استاندارد.
 * static 	FileDescriptor 	out
 * A handle to the standard output stream.
 * دسته ای به جریان خروجی استاندارد.
 *
 * Constructors
 *
 * FileDescriptor() 	Constructs an (invalid) FileDescriptor object.
 * یک شیء (نامعتبر) FileDescriptor ایجاد می کند.
 *
 * Method
 *
 * void 	sync()
 * It force all system buffers to synchronize with the underlying device.
 * این همه بافر سیستم را وادار می کند تا با دستگاه زیر همگام شود.
 * boolean 	valid()
 * It tests if this file descriptor object is valid.
 * اگر این شیء توصیف کننده فایل معتبر باشد ، آزمایش می کند.
 */
public class FileDescriptorExample {
    public static void main(String[] args) {
        FileDescriptor fd = null;
        byte[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58 };
        try  {
            FileOutputStream fos = new FileOutputStream("Record.txt");
            FileInputStream fis = new FileInputStream("Record.txt");
            fd = fos.getFD();
            fos.write(b);
            fos.flush();
            fd.sync();// confirms data to be written to the disk
            int value = 0;
            // for every available bytes
            while ((value = fis.read()) != -1) {
                char c = (char) value;// converts bytes to char
                System.out.print(c);
            }
            System.out.println("\nSync() successfully executed!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
