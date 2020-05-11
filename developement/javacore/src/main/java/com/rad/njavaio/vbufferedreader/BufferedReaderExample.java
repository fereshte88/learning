package com.rad.njavaio.vbufferedreader;

/**
 * Java BufferedReader Class
 *
 * Java BufferedReader class is used to read the text from a character-based input stream.
 * It can be used to read data line by line by readLine() method. It makes the performance fast. It inherits Reader class.
 کلاس Java BufferedReader برای خواندن متن از یک جریان ورودی مبتنی بر کاراکتر استفاده می شود.
 با استفاده از روش readLine () می توان خط خواندن خط داده را به صورت خط به كار برد. این باعث می شود عملکرد سریع شود. این کلاس Reader را به ارث می برد.
 */

/**
 * Java BufferedReader class declaration
 *
 * Let's see the declaration for Java.io.BufferedReader class:
 *
 *     public class BufferedReader extends Reader
 */

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Java BufferedReader class constructors
 *
 * BufferedReader(Reader rd)
 * It is used to create a buffered character input stream that uses the default size for an input buffer.
 * از آن برای ایجاد یک جریان ورودی بافر شخصیتی استفاده می شود که از اندازه پیش فرض برای بافر ورودی استفاده می کند.
 * BufferedReader(Reader rd, int size)
 * It is used to create a buffered character input stream that uses the specified size for an input buffer.
 * از آن برای ایجاد یک جریان ورودی بافر شخصیتی استفاده می شود که از اندازه مشخص شده برای بافر ورودی استفاده می کند.
 *
 * Java BufferedReader class methods
 *
 * int read()
 * It is used for reading a single character.
 * int read(char[] cbuf, int off, int len)
 * It is used for reading characters into a portion of an array.
 * boolean markSupported()
 * It is used to test the input stream support for the mark and reset method.
 * String readLine()
 * It is used for reading a line of text.
 * boolean ready()
 * It is used to test whether the input stream is ready to be read.
 * برای تست اینکه جریان ورودی برای خواندن آماده است استفاده می شود.
 * long skip(long n)
 * It is used for skipping the characters.
 * void reset()
 * It repositions the stream at a position the mark method was last called on this input stream.
 * void mark(int readAheadLimit)
 * It is used for marking the present position in a stream.
 * void close()
 * It closes the input stream and releases any of the system resources associated with the stream.
 */
public class BufferedReaderExample {
    public String bufferReader (String filePath)throws Exception{
        String value="";
        FileReader fr=new FileReader(filePath);
        BufferedReader br=new BufferedReader(fr);

        int i;
        while((i=br.read())!=-1){
            value=value+(char)i;
        }
        br.close();
        fr.close();
        return value;
    }
}
/*
Reading data from console by InputStreamReader and BufferedReader

In this example, we are connecting the BufferedReader stream with the InputStreamReader stream for reading the line by line data from the keyboard.

    package com.javatpoint;
    import java.io.*;
    public class BufferedReaderExample{
    public static void main(String args[])throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("Enter your name");
        String name=br.readLine();
        System.out.println("Welcome "+name);
    }
    }
 */
/*
Another example of reading data from console until user writes stop

In this example, we are reading and printing the data until the user prints stop.

    package com.javatpoint;
    import java.io.*;
    public class BufferedReaderExample{
    public static void main(String args[])throws Exception{
         InputStreamReader r=new InputStreamReader(System.in);
         BufferedReader br=new BufferedReader(r);
         String name="";
         while(!name.equals("stop")){
          System.out.println("Enter data: ");
          name=br.readLine();
          System.out.println("data is: "+name);
         }
        br.close();
        r.close();
        }
        }
 */