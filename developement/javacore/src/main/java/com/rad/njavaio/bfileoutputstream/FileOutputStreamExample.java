package com.rad.njavaio.bfileoutputstream;

/**
 * Java FileOutputStream Class
 *
 * Java FileOutputStream is an output stream used for writing data to a file.
 * If you have to write primitive values into a file, use FileOutputStream class.
 * You can write byte-oriented as well as character-oriented data through FileOutputStream class.
 * But, for character-oriented data, it is preferred to use FileWriter than FileOutputStream.
 *
 Java FileOutputStream یک جریان خروجی است که برای نوشتن داده ها به یک پرونده استفاده می شود.
 اگر مجبور هستید مقادیر اولیه را در یک پرونده بنویسید ، از کلاس FileOutputStream استفاده کنید.
 می توانید داده های byte-oriented به خوبی character-orientedا را از طریق کلاس FileOutputStream بنویسید.
 اما ، برای داده های character-orientedا ، استفاده از FileWriter از FileOutputStream ترجیح داده می شود.

 */

/**
 * FileOutputStream class declaration
 *
 * Let's see the declaration for Java.io.FileOutputStream class:
 *
 *     public class FileOutputStream extends OutputStream
 */

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream class methods
 *
 * protected void finalize()
 * It is used to clean up the connection with the file output stream.
 * برای تمیز کردن اتصال با جریان خروجی پرونده استفاده می شود.
 * void write(byte[] ary)
 * It is used to write ary.length bytes from the byte array to the file output stream.
 * برای نوشتن بایت ary.l طول از آرایه بایت تا جریان خروجی پرونده استفاده می شود.
 * void write(byte[] ary, int off, int len)
 * It is used to write len bytes from the byte array starting at offset off to the file output stream.
 * void write(int b)
 * It is used to write the specified byte to the file output stream.
 * برای نوشتن بایت مشخص شده در جریان خروجی پرونده استفاده می شود.
 * FileChannel getChannel()
 * It is used to return the file channel object associated with the file output stream.
 * برای برگرداندن شی کانال کانال مرتبط با جریان خروجی پرونده استفاده می شود.
 * FileDescriptor getFD()
 * It is used to return the file descriptor associated with the stream.
 * برای بازگشت توصیف کننده فایل مرتبط با جریان استفاده می شود.
 * void close() 	It is used to closes the file output stream.
 * برای بستن جریان خروجی پرونده استفاده می شود.
 */
public class FileOutputStreamExample {

    public  void writeString(String input, String writeFilePath) throws IOException {
        FileOutputStream fout=new FileOutputStream(writeFilePath);
        byte b[]=input.getBytes();//converting string into byte array
        fout.write(b);
        fout.close();
    }

    public  void writeChar(Character input, String writeFilePath) throws IOException {

            FileOutputStream fout=new FileOutputStream(writeFilePath);
            fout.write(input);
            fout.close();
    }
    public  FileOutputStream createFile(String writeFilePath) throws IOException {
            FileOutputStream fout=new FileOutputStream(writeFilePath);
            return fout;
    }
}
//The content of a text file testout.txt is set with the data A.