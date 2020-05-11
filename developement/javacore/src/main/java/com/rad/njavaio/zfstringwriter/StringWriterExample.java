package com.rad.njavaio.zfstringwriter;
/**
 * Java StringWriter Class
 *
 * Java StringWriter class is a character stream that collects output from string buffer, which can be used to construct a string. The StringWriter class inherits the Writer class.
 * In StringWriter class, system resources like network sockets and files are not used, therefore closing the StringWriter is not necessary.
 *
 کلاس Java StringWriter یک جریان کاراکتر است که خروجی را از بافر رشته ای جمع می کند ، که می تواند برای ساختن یک رشته استفاده شود. کلاس StringWriter کلاس Writer را به ارث می برد.
 در کلاس StringWriter از منابع سیستمی مانند پریز شبکه و پرونده ها استفاده نمی شود ، بنابراین بستن StringWriter ضروری نیست.
 */
/**
 * Methods of StringWriter class
 *
 * void write(int c)
 * It is used to write the single character.
 * void write(String str)
 * It is used to write the string.
 * void write(String str, int off, int len)
 * It is used to write the portion of a string.
 * void write(char[] cbuf, int off, int len)
 * It is used to write the portion of an array of characters.
 * String toString()
 * It is used to return the buffer current value as a string.
 * برای بازگرداندن مقدار جریان بافر به عنوان یک رشته استفاده می شود.
 * StringBuffer getBuffer()
 * It is used t return the string buffer.
 * برای بازگشت بافر رشته استفاده می شود.
 * StringWriter append(char c)
 * It is used to append the specified character to the writer.
 * StringWriter append(CharSequence csq)
 * It is used to append the specified character sequence to the writer.
 * StringWriter append(CharSequence csq, int start, int end)
 * It is used to append the subsequence of specified character sequence to the writer.
 * void flush()
 * It is used to flush the stream.
 * void close()
 * It is used to close the stream.
 */

import java.io.*;

public class StringWriterExample {
    public String writerString(String filePath, int i) throws IOException {
        char[] ary = new char[i];
        StringWriter writer = new StringWriter();
        FileInputStream input = null;
        BufferedReader buffer = null;
        input = new FileInputStream(filePath);
        buffer = new BufferedReader(new InputStreamReader(input, "UTF-8"));
        int x;
        while ((x = buffer.read(ary)) != -1) {
            writer.write(ary, 0, x);
        }
        String value = writer.toString();
        writer.close();
        buffer.close();
        return value;
    }
}
