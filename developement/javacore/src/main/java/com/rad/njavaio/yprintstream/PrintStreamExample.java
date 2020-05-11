package com.rad.njavaio.yprintstream;

/**
 * Java PrintStream Class
 *
 * The PrintStream class provides methods to write data to another stream. The PrintStream class automatically flushes the data so there is no need to call flush() method.
 * Moreover, its methods don't throw IOException.
 *
 کلاس PrintStream متد هایی را برای نوشتن داده به جریان دیگر ارائه می دهد. کلاس PrintStream به طور خودکار داده ها را flush می کند ، بنابراین نیازی به فراخوانی با متد flush () نیست.
 علاوه بر این ، متد های آن IOException را پرتاب نمی کند.

 */

/**
 * Class declaration
 *
 * Let's see the declaration for Java.io.PrintStream class:
 *
 *     public class PrintStream extends FilterOutputStream implements Closeable. Appendable
 */

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Methods of PrintStream class
 * Method 	Description
 * void print(boolean b) 	It prints the specified boolean value.
 * void print(char c) 	It prints the specified char value.
 * void print(char[] c) 	It prints the specified character array values.
 * void print(int i) 	It prints the specified int value.
 * void print(long l) 	It prints the specified long value.
 * void print(float f) 	It prints the specified float value.
 * void print(double d) 	It prints the specified double value.
 * void print(String s) 	It prints the specified string value.
 * void print(Object obj) 	It prints the specified object value.
 * void println(boolean b) 	It prints the specified boolean value and terminates the line.
 * void println(char c) 	It prints the specified char value and terminates the line.
 * void println(char[] c) 	It prints the specified character array values and terminates the line.
 * void println(int i) 	It prints the specified int value and terminates the line.
 * void println(long l) 	It prints the specified long value and terminates the line.
 * void println(float f) 	It prints the specified float value and terminates the line.
 * void println(double d) 	It prints the specified double value and terminates the line.
 * void println(String s) 	It prints the specified string value and terminates the line.
 * void println(Object obj) 	It prints the specified object value and terminates the line.
 * void println() 	It terminates the line only.
 * void printf(Object format, Object... args) 	It writes the formatted string to the current stream.
 * void printf(Locale l, Object format, Object... args) 	It writes the formatted string to the current stream.
 * void format(Object format, Object... args) 	It writes the formatted string to the current stream using specified format.
 * void format(Locale l, Object format, Object... args) 	It writes the formatted string to the current stream using specified format.
 */
public class PrintStreamExample {
    public void printStream(String filePath,Object[] arr)throws Exception{
        FileOutputStream fout=new FileOutputStream(filePath);
        PrintStream pout=new PrintStream(fout);
        for (int i = 0; i <arr.length ; i++) {
            pout.println(arr[i]);
        }
        pout.close();
        fout.close();

    }
}
