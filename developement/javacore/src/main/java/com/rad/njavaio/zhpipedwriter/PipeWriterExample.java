package com.rad.njavaio.zhpipedwriter;

/**
 * Java - PipedWriter
 *
 * The PipedWriter class is used to write java pipe as a stream of characters. This class is used generally for writing text.
 * Generally PipedWriter is connected to a PipedReader and used by different threads.
 *کلاس PipedWriter برای نوشتن لوله جاوا به عنوان جریان کاراکترها استفاده می شود. این کلاس معمولاً برای نوشتن متن استفاده می شود.
 * به طور کلی PipedWriter به یک PipedReader وصل می شود و توسط موضوعات مختلف مورد استفاده قرار می گیرد.
 *
 * Constructor
 *
 * PipedWriter()
 * It creates a piped writer that is not yet connected to a piped reader.
 * این یک نویسنده لوله را ایجاد می کند که هنوز به یک لوله خوان وصل نشده است.
 * PipedWriter(PipedReader snk)
 * It creates a piped writer connected to the specified piped reader.
 * این یک نویسنده لوله دار متصل به خواننده مشخص شده لوله را ایجاد می کند.
 *
 * Method
 *
 * void 	close()
 * It closes this piped output stream and releases any system resources associated with this stream.
 * این جریان خروجی لوله کشی را می بندد و منابع سیستم مربوط به این جریان را آزاد می کند.
 * void 	connect(PipedReader snk)
 * It connects this piped writer to a receiver.
 * این نویسنده لوله را به یک گیرنده وصل می کند.
 * void 	flush()
 * It flushes this output stream and forces any buffered output characters to be written out.
 * void 	write(char[] cbuf, int off, int len)
 * It writes len characters from the specified character array starting at offset off to this piped output stream.
 * void 	write(int c)
 * It writes the specified char to the piped output stream.
 */
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipeWriterExample {
    public static void main(String[] args) {
        try {

            final PipedReader read = new PipedReader();
            final PipedWriter write = new PipedWriter(read);

            Thread readerThread = new Thread(new Runnable() {
                public void run() {
                    try {
                        int data = read.read();
                        while (data != -1) {
                            System.out.print((char) data);
                            data = read.read();
                        }
                    } catch (Exception ex) {
                    }
                }
            });

            Thread writerThread = new Thread(new Runnable() {
                public void run() {
                    try {
                        write.write("I love my country\n".toCharArray());
                    } catch (Exception ex) {
                    }
                }
            });

            readerThread.start();
            writerThread.start();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
