package com.rad.njavaio.fsequenceinputstream;


/**
 * Java SequenceInputStream Class
 *
 * Java SequenceInputStream class is used to read data from multiple streams. It reads data sequentially (one by one).
 *
 کلاس Java SequenceInputStream برای خواندن داده ها از چندین جریان استفاده می شود. داده ها را به صورت متوالی خوانده می شود (یکی یکی).
 * Java SequenceInputStream Class declaration
 * Let's see the declaration for Java.io.SequenceInputStream class:
 *     public class SequenceInputStream extends InputStream
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 * Constructors of SequenceInputStream class
 * SequenceInputStream(InputStream s1, InputStream s2)
 * creates a new input stream by reading the data of two input stream in order, first s1 and then s2.
 * با خواندن داده های دو جریان ورودی به ترتیب ، ابتدا s1 و سپس s2 یک جریان ورودی جدید ایجاد می کند.
 * SequenceInputStream(Enumeration e)
 * creates a new input stream by reading the data of an enumeration whose type is InputStream.
 * با خواندن داده های شماری که نوع آن InputStream است ، یک جریان ورودی جدید ایجاد می کند.
 *
 * Methods of SequenceInputStream class
 * int read()
 * It is used to read the next byte of data from the input stream.
 * برای خواندن بایت بعدی داده ها از جریان ورودی استفاده می شود.
 * int read(byte[] ary, int off, int len)
 * It is used to read len bytes of data from the input stream into the array of bytes.
 * برای خواندن بایت های داده از جریان ورودی به آرایه بایت ها استفاده می شود.
 * int available()
 * It is used to return the maximum number of byte that can be read from an input stream.
 * برای بازگشت حداکثر تعداد بایت که از یک جریان ورودی قابل خواندن است استفاده می شود.
 * void close()
 * It is used to close the input stream.
 * برای بستن جریان ورودی استفاده می شود.
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

//In this example, we are writing the data of two files testin1.txt and testin2.txt into another file named testout.txt.
public class SequenceInputStreamExample {

    public  String readSequence(String filePath1, String filePath2)throws IOException {
        FileInputStream input1=new FileInputStream(filePath1);
        FileInputStream input2=new FileInputStream(filePath2);
        SequenceInputStream inst=new SequenceInputStream(input1, input2);
        String value="";
        int j;
        while((j=inst.read())!=-1){
            value =value + (char)j;
        }
        inst.close();
        input1.close();
        input2.close();
        return value;
    }

    void writeSequence(String readFilePath1, String readFilePath2,String writeFilePath) throws IOException {


        FileInputStream fin1=new FileInputStream(readFilePath1);
        FileInputStream fin2=new FileInputStream(readFilePath2);
        FileOutputStream fout=new FileOutputStream(writeFilePath);
        SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
        int i;
        while((i=sis.read())!=-1)
        {
            fout.write(i);
        }
        sis.close();
        fout.close();
        fin1.close();
        fin2.close();

    }

    /**
     * SequenceInputStream example that reads data using enumeration
     *
     * If we need to read the data from more than two files, we need to use Enumeration.
     * Enumeration object can be obtained by calling elements() method of the Vector class.
     * Let's see the simple example where we are reading the data from 4 files: a.txt, b.txt, c.txt and d.txt.
     *
     اگر ما نیاز به خواندن داده ها از بیش از دو پرونده داشته باشیم ، باید از Enumeration استفاده کنیم. با فراخوانی elements () از کلاس وکتور شیء شمارش را می توان بدست آورد.
     بیایید مثال ساده ای را ببینید که داده ها را از 4 پرونده می خوانیم: a.txt ، b.txt ، c.txt و d.txt
     */
    public String readMultiFiles(String[] filePaths)throws IOException {
        String value="";
//creating the FileInputStream objects for all the files
        //creating Vector object to all the stream
        Vector v=new Vector();
        for (int i = 0; i < filePaths.length; i++) {
            FileInputStream fin=new FileInputStream(filePaths[i]);
            v.add(fin);
        }

//creating enumeration object by calling the elements method
        Enumeration e=v.elements();
//passing the enumeration object in the constructor
        SequenceInputStream bin=new SequenceInputStream(e);
        int i=0;
        while((i=bin.read())!=-1){
            value = value+(char)i;
        }
        bin.close();
        return value;
    }

}
