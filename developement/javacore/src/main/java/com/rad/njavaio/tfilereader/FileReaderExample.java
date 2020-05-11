package com.rad.njavaio.tfilereader;

/**
 * Java FileReader Class
 * Java FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.
 * It is character-oriented class which is used for file handling in java.
 کلاس Java FileReader برای خواندن داده ها از پرونده استفاده می شود. داده ها را با فرمت بایت مانند کلاس FileInputStream باز می گرداند.
 این کلاس character-oriented است که برای پردازش پرونده ها در جاوا استفاده می شود.

 * Java FileReader class declaration
 * Let's see the declaration for Java.io.FileReader class:
 *     public class FileReader extends InputStreamReader
 */

import java.io.FileReader;
import java.io.IOException;

/**
 * Constructors of FileReader class
 * FileReader(String file)
 * It gets filename in string. It opens the given file in read mode. If file doesn't exist, it throws FileNotFoundException.
 * نام رشته ای در رشته می شود. این پرونده داده شده را در حالت read باز می کند. اگر پرونده وجود نداشته باشد ، FileNotFoundException را پرتاب می کند.
 * FileReader(File file)
 * It gets filename in file instance. It opens the given file in read mode. If file doesn't exist, it throws FileNotFoundException.
 * در نمونه پرونده نام پرونده می شود. این پرونده داده شده را در حالت read باز می کند. اگر پرونده وجود نداشته باشد ، FileNotFoundException را پرتاب می کند.
 * Methods of FileReader class
 * int read()
 * It is used to return a character in ASCII form. It returns -1 at the end of file.
 * برای برگرداندن یک کاراکتر به شکل ASCII استفاده می شود. در انتهای پرونده -1 برمی گردد.
 * void close()
 * It is used to close the FileReader class.
 */
public class FileReaderExample {
    public String fileReader(String filePath) throws IOException {
        String value = "";
        FileReader fr=new FileReader(filePath);
        int i;
        while((i=fr.read())!=-1)
            value = value+(char)i;
        fr.close();
        return value;
    }
}
