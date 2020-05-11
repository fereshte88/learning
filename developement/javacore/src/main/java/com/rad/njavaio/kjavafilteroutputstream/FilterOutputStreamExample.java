package com.rad.njavaio.kjavafilteroutputstream;

/**
 * Java FilterOutputStream class implements the OutputStream class.
 * It provides different sub classes such as BufferedOutputStream and DataOutputStream to provide additional functionality.
 * So it is less used individually.
 * کلاس Java FilterOutputStream کلاس OutputStream را پیاده سازی می کند.
 * این کلاس های فرعی مختلفی مانند BufferedOutputStream و DataOutputStream را فراهم می کند تا قابلیت های اضافی را ارائه دهد.
 * بنابراین کمتر به صورت جداگانه استفاده می شود.
 */

/**
 * Java FilterOutputStream class declaration
 *
 * Let's see the declaration for java.io.FilterOutputStream class:
 *
 *     public class FilterOutputStream extends OutputStream
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/**
 * Java FilterOutputStream class Methods
 *
 * void write(int b)
 * It is used to write the specified byte to the output stream.
 * برای نوشتن بایت مشخص شده در جریان خروجی استفاده می شود.
 * void write(byte[] ary)
 * It is used to write ary.length byte to the output stream.
 * برای نوشتن بایت ary.l طول به جریان خروجی استفاده می شود.
 * void write(byte[] b, int off, int len)
 * It is used to write len bytes from the offset off to the output stream.
 * برای نوشتن بایت های len از افست خاموش به جریان خروجی استفاده می شود.
 * void flush()
 * It is used to flushes the output stream.
 * برای شار جریان خروجی استفاده می شود.
 * void close()
 * It is used to close the output stream.
 * برای بستن جریان خروجی استفاده می شود.
 */
public class FilterOutputStreamExample {
    public void writeFilter(FileOutputStream file, String s) throws IOException {
        FilterOutputStream filter = new FilterOutputStream(file);
        byte b[]=s.getBytes();
        filter.write(b);
        filter.flush();
        filter.close();
        file.close();
    }
}
