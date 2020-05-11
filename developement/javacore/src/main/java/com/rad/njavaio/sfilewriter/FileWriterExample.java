package com.rad.njavaio.sfilewriter;

/**
 * Java FileWriter Class
 * Java FileWriter class is used to write character-oriented data to a file. It is character-oriented class which is used for file handling in java.
 * Unlike FileOutputStream class, you don't need to convert string into byte array because it provides method to write string directly.
 * کلاس FileWriter Java برای نوشتن داده های character-oriented  در یک فایل استفاده می شود. این کلاس character-oriented  است که برای پردازش فایل ها در جاوا استفاده می شود.
 * برخلاف کلاس FileOutputStream ، شما نیازی به تبدیل رشته به آرایه بایت ندارید زیرا این متد را برای نوشتن رشته به طور مستقیم فراهم می کند.
 *
 * Java FileWriter class declaration
 * Let's see the declaration for Java.io.FileWriter class:
 *     public class FileWriter extends OutputStreamWriter
 */

import java.io.FileWriter;
import java.io.IOException;

/**
 * Constructors of FileWriter class
 *
 * FileWriter(String file)
 * Creates a new file. It gets file name in string.
 * FileWriter(File file)
 * Creates a new file. It gets file name in File object.
 * Methods of FileWriter class
 * void write(String text)
 * It is used to write the string into FileWriter.
 * void write(char c)
 * It is used to write the char into FileWriter.
 * void write(char[] c)
 * It is used to write char array into FileWriter.
 * void flush()
 * It is used to flushes the data of FileWriter.
 * void close()
 * It is used to close the FileWriter.
 */
public class FileWriterExample {
    public void fileWriter(String filePath, String text) throws IOException {
            FileWriter fw=new FileWriter(filePath);
            fw.write(text);
            fw.close();
    }
}
