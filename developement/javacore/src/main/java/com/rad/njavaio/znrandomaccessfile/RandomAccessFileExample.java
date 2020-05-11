package com.rad.njavaio.znrandomaccessfile;

/**
 * This class is used for reading and writing to random access file. A random access file behaves like a large array of bytes.
 * There is a cursor implied to the array called file pointer, by moving the cursor we do the read write operations.
 * If end-of-file is reached before the desired number of byte has been read than EOFException is thrown. It is a type of IOException.
 * این کلاس برای خواندن و نوشتن در فایل دسترسی تصادفی استفاده می شود. یک فایل دسترسی تصادفی مانند یک مجموعه بزرگ بایت رفتار می کند.
 * یک مکان نما وجود دارد که به آرایه موسوم به اشاره گر فایل اشاره دارد ، با حرکت مکان نما ما عملیات نوشتن را انجام می دهیم.
 * اگر پایان فایل قبل از خوانده شدن تعداد مورد نظر بایت حاصل شود ، از پرتاب EOFException استفاده می شود. این نوعی از IOException است.
 */

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Constructor
 *
 * RandomAccessFile(File file, String mode)
 * Creates a random access file stream to read from, and optionally to write to, the file specified by the File argument.
 * یک فایل دسترسی تصادفی را برای خواندن ، و اختیاری برای نوشتن ، پرونده مشخص شده توسط پرونده File ایجاد می کند.
 * RandomAccessFile(String name, String mode)
 * Creates a random access file stream to read from, and optionally to write to, a file with the specified name.
 * یک پرونده دسترسی دسترسی تصادفی برای خواندن از پرونده ، و به صورت اختیاری برای نوشتن ، یک پرونده با نام مشخص شده ایجاد می کند.
 *
 * Method
 *
 * void 	close()
 * It closes this random access file stream and releases any system resources associated with the stream.
 * این جریان دسترسی به پرونده تصادفی را می بندد و منابع سیستم مربوط به جریان را آزاد می کند.
 * FileChannel 	getChannel()
 * It returns the unique FileChannel object associated with this file.
 * این شیء منحصر به فرد FileChannel مرتبط با این پرونده را برمی گرداند.
 * int 	readInt()
 * It reads a signed 32-bit integer from this file.
 * این یک عدد صحیح 32 بیتی امضا شده از این پرونده را می خواند.
 * String 	readUTF()
 * It reads in a string from this file.
 * در رشته ای از این پرونده خوانده می شود.
 * void 	seek(long pos)
 * It sets the file-pointer offset, measured from the beginning of this file, at which the next read or write occurs.
 * این مجموعه ای از نشانگر پرونده ، از ابتدای این پرونده اندازه گیری می شود ، که در آن خواندن یا نوشتن بعدی رخ می دهد.
 * void 	writeDouble(double v)
 * It converts the double argument to a long using the doubleToLongBits method in class Double, and then writes that long value to the file as an eight-byte quantity, high byte first.
 * با استفاده از متد DoubleToLongBits در کلاس Double ، آرگومان دوتایی را به مدت طولانی تبدیل می کند ، و سپس این مقدار طولانی را به عنوان یک مقدار هشت بایت ، ابتدا بایت بالا به پرونده می نویسد.
 * void 	writeFloat(float v)
 * It converts the float argument to an int using the floatToIntBits method in class Float, and then writes that int value to the file as a four-byte quantity, high byte first.
 * با استفاده از متد floatToIntBits در کلاس Float ، آرگومان float را به int تبدیل می کند و سپس مقدار int را به صورت چهار بایت ، بایت اول ، به پرونده می نویسد.
 * void 	write(int b)
 * It writes the specified byte to this file.
 * بایت مشخص شده را در این پرونده می نویسد.
 * int 	read()
 * It reads a byte of data from this file.
 * این بایت داده از این پرونده را می خواند.
 * long 	length()
 * It returns the length of this file.
 * طول این پرونده را برمی گرداند.
 * void 	seek(long pos)
 * It sets the file-pointer offset, measured from the beginning of this file, at which the next read or write occurs.
 * این مجموعه ای از نشانگر پرونده ، از ابتدای این پرونده اندازه گیری می شود ، که در آن خواندن یا نوشتن بعدی رخ می دهد.
 */
public class RandomAccessFileExample {
    public void randomAccess(String filePath) {
        try {
            System.out.println(new String(readFromFile(filePath, 0, 18)));
            writeToFile(filePath, "I love my country and my people", 31);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static byte[] readFromFile(String filePath, int position, int size)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }
    private static void writeToFile(String filePath, String data, int position)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}
