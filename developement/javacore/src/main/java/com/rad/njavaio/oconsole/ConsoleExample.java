package com.rad.njavaio.oconsole;

/**
 * Java Console Class
 * The Java Console class is be used to get input from console. It provides methods to read texts and passwords.
 * If you read password using Console class, it will not be displayed to the user.
 * The java.io.Console class is attached with system console internally. The Console class is introduced since 1.5.
 *
 برای دریافت ورودی از کنسول از کلاس Java Console استفاده می شود. این متد ها را برای خواندن متن و کلمه عبور فراهم می کند.
 اگر رمز عبور را با استفاده از کلاس Console بخوانید ، برای کاربر نمایش داده نمی شود.
 کلاس java.io.Console به کنسول سیستم داخلی وصل می شود. کلاس کنسول از 1.5 معرفی شده است.
 */

/**
 * Java Console class declaration
 *
 * Let's see the declaration for Java.io.Console class:
 *
 *     public final class Console extends Object implements Flushable
 */

/**
 * Java Console class methods
 * Reader reader()
 * It is used to retrieve the reader object associated with the console
 * برای بازیابی شیء خواننده مرتبط با کنسول استفاده می شود
 * String readLine()
 * It is used to read a single line of text from the console.
 * برای خواندن یک خط متن از کنسول استفاده می شود.
 * String readLine(String fmt, Object... args)
 * It provides a formatted prompt then reads the single line of text from the console.
 *یک formatted prompt  را ارائه می دهد و سپس خط تک متن از کنسول را می خواند.
 * char[] readPassword()
 * It is used to read password that is not being displayed on the console.
 * برای خواندن پسوردی که روی کنسول نمایش داده نمی شود ، استفاده می شود.
 * char[] readPassword(String fmt, Object... args)
 * It provides a formatted prompt then reads the password that is not being displayed on the console.
 *یک formatted prompt   را فراهم می کند و پسوردی را که در کنسول نمایش داده نمی شود ، می خواند.
 * Console format(String fmt, Object... args)
 * It is used to write a formatted string to the console output stream.
 * برای نوشتن یک رشته فرمت شده به جریان خروجی کنسول استفاده می شود.
 * Console printf(String format, Object... args)
 * It is used to write a string to the console output stream.
 * برای نوشتن رشته ای به جریان خروجی کنسول استفاده می شود.
 * PrintWriter writer()
 * It is used to retrieve the PrintWriter object associated with the console.
 * برای بازیابی شیء PrintWriter مرتبط با کنسول استفاده می شود.
 * void flush()
 * It is used to flushes the console.
 * از آن برای خالی کردن کنسول استفاده می شود.
 */

import java.io.Console;

/**
 * How to get the object of Console
 *
 * System class provides a static method console() that returns the singleton instance of Console class.
 *
 *     public static Console console(){}
 *
 * Let's see the code to get the instance of Console class.
 *
 *     Console c=System.console();
 */
public class ConsoleExample {
    public static void main(String args[]){
        Console c=System.console();
        System.out.println("Enter your name: ");
        String n=c.readLine();
        System.out.println("Welcome "+n);
        System.out.println("Enter password: ");
        char[] ch=c.readPassword();
        String pass=String.valueOf(ch);//converting char array into string
        System.out.println("Password is: "+pass);
    }
}
