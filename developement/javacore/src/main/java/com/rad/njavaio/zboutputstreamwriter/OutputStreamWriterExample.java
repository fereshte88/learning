package com.rad.njavaio.zboutputstreamwriter;

/**
 * Java OutputStreamWriter
 *
 * OutputStreamWriter is a class which is used to convert character stream to byte stream, the characters are encoded into byte using a specified charset.
 * write() method calls the encoding converter which converts the character into bytes.
 * The resulting bytes are then accumulated in a buffer before being written into the underlying output stream.
 * The characters passed to write() methods are not buffered. We optimize the performance of OutputStreamWriter by using it with in a BufferedWriter so that to avoid frequent converter invocation.
 *
 کلاس OutputStreamWriter کلاس است که برای تبدیل جریان کاراکتر به جریان بایت استفاده می شود.
 متد write () تبدیل کننده رمزگذار است که کاراکتر را به بایت تبدیل می کند.
 بایتهای حاصل سپس در یک بافر قبل از نوشتن در جریان خروجی زیرین جمع می شوند. نویسه های ارسال شده برای نوشتن () بافر نیستند.
 ما عملکرد OutputStreamWriter را با استفاده از آن در BufferedWriter بهینه می کنیم تا از مراجعه مکرر مبدل جلوگیری شود.

 */

import java.io.*;

/**
 * Constructor
 * Constructor 	Description
 * OutputStreamWriter(OutputStream out) 	It creates an OutputStreamWriter that uses the default character encoding.
 * OutputStreamWriter را ایجاد می کند که از کدگذاری کاراکتر پیش فرض استفاده می کند.
 * OutputStreamWriter(OutputStream out, Charset cs) 	It creates an OutputStreamWriter that uses the given charset.
 * OutputStreamWriter را ایجاد می کند که از charset داده شده استفاده می کند.
 * OutputStreamWriter(OutputStream out, CharsetEncoder enc) 	It creates an OutputStreamWriter that uses the given charset encoder.
 * OutputStreamWriter ایجاد می کند که از رمزگذارcharset  داده شده استفاده می کند.
 * OutputStreamWriter(OutputStream out, String charsetName) 	It creates an OutputStreamWriter that uses the named charset.
 * OutputStreamWriter را ایجاد می کند که از named charset. شده استفاده می کند.
 * Methods
 * Modifier and Type 	Method 	Description
 * void 	close() 	It closes the stream, flushing it first.
 * void 	flush() 	It flushes the stream.
 * String 	getEncoding() 	It returns the name of the character encoding being used by this stream.
 * این اسم رمزگذاری کاراکتری را که توسط این جریان استفاده می شود ، برمی گرداند.
 * void 	write(char[] cbuf, int off, int len) 	It writes a portion of an array of characters.
 * void 	write(int c) 	It writes a single character.
 * void 	write(String str, int off, int len) 	It writes a portion of a string.
 */
public class OutputStreamWriterExample {
    public void outputStreamWriter(String filePath, String text) throws IOException {
            OutputStream outputStream = new FileOutputStream(filePath);
            Writer outputStreamWriter = new OutputStreamWriter(outputStream);
            outputStreamWriter.write(text);
            outputStreamWriter.close();
    }
}
