package com.rad.njavaio.ajavainputoutput;

public class JavaInputOutput {
    /**
     * Java I/O (Input and Output) is used to process the input and produce the output.
     * Java uses the concept of a stream to make I/O operation fast. The java.io package contains all the classes required for input and output operations.
     * We can perform file handling in Java by Java I/O API.
     * از Java I / O (ورودی و خروجی) برای پردازش ورودی و تولید خروجی استفاده می شود.
     * جاوا از مفهوم جریان استفاده می کند تا سریع I عملیاتی شود. بسته java.io شامل کلیه کلاس های مورد نیاز برای عملیات ورودی و خروجی می باشد.
     * ما می توانیم با استفاده از Java I / O API ، مدیریت پرونده را در جاوا انجام دهیم.
     */
    /**
     * Stream
     *
     * A stream is a sequence of data. In Java, a stream is composed of bytes. It's called a stream because it is like a stream of water that continues to flow.
     *جریان دنباله ای از داده ها است. در جاوا ، یک جریان از بایت تشکیل شده است. این جریان نامیده می شود زیرا مانند جریانی از آب است که جریان خود را ادامه می دهد.
     * In Java, 3 streams are created for us automatically. All these streams are attached with the console.
     *در جاوا ، 3 جریان به صورت خودکار برای ما ایجاد می شود. همه این جریان ها با کنسول وصل شده اند.
     * 1) System.out: standard output stream
     *
     * 2) System.in: standard input stream
     *
     * 3) System.err: standard error stream
     */
    /**
     * Let's see the code to print output and an error message to the console.
     *
     *     System.out.println("simple message");
     *     System.err.println("error message");
     *
     * Let's see the code to get input from console.
     *
     *     int i=System.in.read();//returns ASCII code of 1st character
     *     System.out.println((char)i);//will print the character
     */
    /**
     * OutputStream vs InputStream
     *
     * The explanation of OutputStream and InputStream classes are given below:
     * توضیح کلاسهای OutputStream و InputStream در زیر آورده شده است:
     * OutputStream
     * Java application uses an output stream to write data to a destination; it may be a file, an array, peripheral device or socket.
     * برنامه جاوا برای نوشتن داده به مقصد از یک جریان خروجی استفاده می کند. این ممکن است یک پرونده ، یک آرایه ، یک وسیله جانبی یا سوکت باشد.
     * InputStream
     * Java application uses an input stream to read data from a source; it may be a file, an array, peripheral device or socket.
     *برنامه جاوا برای خواندن اطلاعات از یک منبع از یک جریان ورودی استفاده می کند. این ممکن است یک پرونده ، یک آرایه ، یک وسیله جانبی یا سوکت باشد.
     * Let's understand the working of Java OutputStream and InputStream by the figure given below.
     */
    /**
     * OutputStream class
     *
     * OutputStream class is an abstract class. It is the superclass of all classes representing an output stream of bytes. An output stream accepts output bytes and sends them to some sink.
     * کلاس OutputStream یک کلاس انتزاعی است. این superclass از تمام کلاس ها است که یک جریان خروجی بایت را نشان می دهد. یک جریان خروجی بایت های خروجی را می پذیرد و آنها را به مقداری سینک می فرستد.
     * Useful methods of OutputStream
     * Method	Description
     * 1) public void write(int)throws IOException
     * is used to write a byte to the current output stream.
     * برای نوشتن یک بایت به جریان خروجی فعلی استفاده می شود.
     * 2) public void write(byte[])throws IOException
     * is used to write an array of byte to the current output stream.
     * برای نوشتن آرایه ای از بایت به جریان خروجی فعلی استفاده می شود.
     * 3) public void flush()throws IOException
     * flushes the current output stream.
     * جریان خروجی فعلی را پخش می کند.
     * 4) public void close()
     * throws IOException
     */
    /**
     * InputStream class
     *
     * InputStream class is an abstract class. It is the superclass of all classes representing an input stream of bytes.
     * کلاس InputStream یک کلاس انتزاعی است. این superclass از تمام کلاس ها است که یک جریان ورودی بایت را نشان می دهد.
     * Useful methods of InputStream
     * Method	Description
     * 1) public abstract int read()throws IOException
     * reads the next byte of data from the input stream. It returns -1 at the end of the file.
     * بایت بعدی داده ها از جریان ورودی را می خواند. در انتهای پرونده -1 برمی گردد.
     * 2) public int available()throws IOException
     * returns an estimate of the number of bytes that can be read from the current input stream.
     * برآوردی از تعداد بایتهای قابل خواندن از جریان ورودی فعلی را برمی گرداند.
     * 3) public void close()throws IOException
     * is used to close the current input stream.
     * برای بستن جریان ورودی فعلی استفاده می شود.
     */
}
