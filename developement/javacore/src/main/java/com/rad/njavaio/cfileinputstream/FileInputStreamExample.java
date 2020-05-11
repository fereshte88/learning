package com.rad.njavaio.cfileinputstream;

/**
 * Java FileInputStream Class
 *
 * Java FileInputStream class obtains input bytes from a file.
 * It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc.
 * You can also read character-stream data. But, for reading streams of characters, it is recommended to use FileReader class.
 * * کلاس JavaInputStream بایت های ورودی را از یک پرونده بدست می آورد.
 *   * برای خواندن داده های بایت گرا (جریان بایت های خام) مانند داده های تصویر ، صدا ، فیلم و غیره استفاده می شود.
 *   * همچنین می توانید داده هایcharacter-stream را بخوانید. اما برای خواندن جریان های کاراکترها توصیه می شود از کلاس FileReader استفاده کنید.
 */

/**
 * Java FileInputStream class declaration
 *
 * Let's see the declaration for java.io.FileInputStream class:
 *
 *     public class FileInputStream extends InputStream
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Java FileInputStream class methods
 *
 * int available()
 * It is used to return the estimated number of bytes that can be read from the input stream.
 * از آن برای بازگرداندن تعداد برآورد بایتهای قابل خواندن از جریان ورودی استفاده می شود.
 * int read()
 * It is used to read the byte of data from the input stream.
 * برای خواندن بایت داده ها از جریان ورودی استفاده می شود.
 * int read(byte[] b)
 * It is used to read up to b.length bytes of data from the input stream.
 * برای خواندن بایتهای b.l طول داده ها از جریان ورودی استفاده می شود.
 * int read(byte[] b, int off, int len)
 * It is used to read up to len bytes of data from the input stream.
 * این مورد برای خواندن برای بایت کردن بایت های داده از جریان ورودی استفاده می شود.
 * long skip(long x)
 * It is used to skip over and discards x bytes of data from the input stream.
 * این برای پرش و رد کردن بایت x از داده ها از جریان ورودی استفاده می شود.
 * FileChannel getChannel()
 * It is used to return the unique FileChannel object associated with the file input stream.
 * برای برگرداندن شیء منحصر به فرد FileChannel مرتبط با جریان ورودی پرونده استفاده می شود.
 * FileDescriptor getFD()
 * It is used to return the FileDescriptor object.
 * برای بازگرداندن شیء FileDescriptor استفاده می شود.
 * protected void finalize()
 * It is used to ensure that the close method is call when there is no more reference to the file input stream.
 * در صورت عدم مراجعه بیشتر به جریان ورودی پرونده ، این اطمینان حاصل می شود که از متد close فراخوانی کنید.
 * void close()
 * It is used to closes the stream.
 * برای بستن جریان استفاده می شود.
 */
public class FileInputStreamExample {
    public  Character readChar(String readPathFile) throws IOException {
        FileInputStream fin=new FileInputStream(readPathFile);
        Character char1 = (char) fin.read();
        fin.close();
        return char1;

    }

    public  String readString(String readPathFile) throws IOException {
            FileInputStream fin=new FileInputStream(readPathFile);
            int i=0;
            int length=fin.available();
            byte[] buf = new byte[length];
            i = fin.read(buf);
            String value = new String(buf, StandardCharsets.UTF_8);
            fin.close();
       return value;
    }
}
