package com.rad.njavaio.zlfile;

/**
 * The File class is an abstract representation of file and directory pathname. A pathname can be either absolute or relative.
 * The File class have several methods for working with directories and files such as creating new directories or files, deleting and renaming directories or files, listing the contents of a directory etc.
 * کلاس File یک نمایش انتزاعی از pathname فایل و فهرست است. یک pathname می تواند مطلق یا نسبی باشد.
 * کلاس File چندین متد برای کار با دایرکتوری ها و فایل ها از جمله ایجاد دایرکتوری ها یا فایل های جدید ، حذف و تغییر نام دایرکتوری ها یا فایل ها ، لیست کردن مطالب یک دایرکتوری و غیره دارد.
 */

/**
 * Fields
 *
 * static 	String 	pathSeparator
 * It is system-dependent path-separator character, represented as a string for convenience.
 * این یک کاراکتر جداکننده مسیر وابسته به سیستم است که به عنوان یک رشته برای راحتی نمایش داده می شود.
 * static 	char 	pathSeparatorChar
 * It is system-dependent path-separator character.
 * این کاراکتر وابسته به سیستم است.
 * static 	String 	separator
 * It is system-dependent default name-separator character, represented as a string for convenience.
 * این کاراکتر جداکننده پیش فرض وابسته به سیستم است ، به عنوان رشته ای برای راحتی نمایش داده می شود.
 * static 	char 	separatorChar
 * It is system-dependent default name-separator character.
 * این کاراکتر جداکننده پیش فرض وابسته به سیستم است.
 */

/**
 * Constructors
 *
 * File(File parent, String child)
 * It creates a new File instance from a parent abstract pathname and a child pathname string.
 * این یک نمونه فایل جدید از یکpathname انتزاعی parent و یک pathname child ایجاد می کند.
 * File(String pathname)
 * It creates a new File instance by converting the given pathname string into an abstract pathname.
 * این یک نمونه فایل جدید را با تبدیل رشته مسیر مشخص شده به یک نام مستقل انتزاعی ایجاد می کند.
 * File(String parent, String child)
 * It creates a new File instance from a parent pathname string and a child pathname string.
 * این یک نمونه فایل جدید را از یک رشتهpathname والدین و یک pathname کودک ایجاد می کند.
 * File(URI uri)
 * It creates a new File instance by converting the given file: URI into an abstract pathname.
 * با تبدیل فایل داده شده ، یک فایل جدید ایجاد می کند: URI به یک نام مستقل انتزاعی.
 */

import java.io.File;
import java.io.IOException;

/**
 * Useful Methods
 * static File 	createTempFile(String prefix, String suffix)
 * It creates an empty file in the default temporary-file directory, using the given prefix and suffix to generate its name.
 * این یک فایل خالی در فهرست پیش فرض فایل موقت ایجاد می کند ، با استفاده از پیشوند و پسوند داده شده برای تولید نام آن.
 * boolean 	createNewFile()
 * It atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist.
 * اگر  پرونده ای با این نام وجود نداشته باشد ، بطور اتمی پرونده ای خالی و جدید ایجاد می کند که با این نام انتزاعی نامگذاری شده است.
 * boolean 	canWrite()
 * It tests whether the application can modify the file denoted by this abstract pathname.String[]
 * این آزمایش می کند که آیا برنامه می تواند پرونده مشخص شده توسط این مسیر انتزاعی را تغییر دهد.
 * boolean 	canExecute()
 * It tests whether the application can execute the file denoted by this abstract pathname.
 * این آزمایش می کند که آیا برنامه می تواند پرونده مشخص شده با این نام انتزاعی را اجرا کند یا خیر.
 * boolean 	canRead()
 * It tests whether the application can read the file denoted by this abstract pathname.
 * این آزمایش می کند که آیا برنامه می تواند پرونده مشخص شده توسط این نقشه انتزاعی را بخواند یا خیر.
 * boolean 	isAbsolute()
 * It tests whether this abstract pathname is absolute.
 * این آزمایش می کند که آیا این نام انتزاعی مطلق است یا خیر.
 * boolean 	isDirectory()
 * It tests whether the file denoted by this abstract pathname is a directory.
 * این آزمایش می کند که آیا پرونده مشخص شده توسط این مسیر انتزاعی یک فهرست است.
 * boolean 	isFile()
 * It tests whether the file denoted by this abstract pathname is a normal file.
 * این آزمایش می کند که آیا پرونده مشخص شده توسط این مسیر انتزاعی یک فایل عادی است یا خیر.
 * String 	getName()
 * It returns the name of the file or directory denoted by this abstract pathname.
 * این نام فایل یا دایرکتوری مشخص شده توسط این pathname انتزاعی را برمی گرداند.
 * String 	getParent()
 * It returns the pathname string of this abstract pathname's parent, or null if this pathname does not name a parent directory.
 * این pathname پدر این pathname انتزاعی را برمی گرداند ، یا اگر اینpathname یک pathname پدر  نداشته باشد ، تهی است.
 * Path 	toPath()
 * It returns a java.nio.file.Path object constructed from the this abstract path.
 * این یک شیء java.nio.file.Path ایجاد شده از این مسیر انتزاعی را برمی گرداند.
 * URI 	toURI()
 * It constructs a file: URI that represents this abstract pathname.
 * این پرونده را ایجاد می کند: URI که نشان دهنده این pathname انتزاعی است.
 * File[] 	listFiles()
 * It returns an array of abstract pathnames denoting the files in the directory denoted by this abstract pathname
 * این مجموعه ای از pathnames های  انتزاعی را نشان می دهد که فایل ها در فهرست موجود در این فهرست انتزاعی را نشان می دهند
 * long 	getFreeSpace()
 * It returns the number of unallocated bytes in the partition named by this abstract path name.
 * تعداد بایتهای unallocated را در پارتیشن نامگذاری شده با این نام مسیر انتزاعی برمی گرداند.
 * String[] 	list(FilenameFilter filter)
 * It returns an array of strings naming the files and directories in the directory denoted by this abstract pathname that satisfy the specified filter.
 * این مجموعه ای از رشته ها را که نام فایل ها و دایرکتوری ها در دایرکتوری مشخص شده توسط این مسیر انتزاعی است که فیلتر مشخص شده را برآورده می کند ، بازمی گرداند.
 * boolean 	mkdir()
 * It creates the directory named by this abstract pathname.
 * این دایرکتوری را به نام این مسیر انتزاعی ایجاد می کند.
 */
public class FileExample {
    public  String fileCreate(String filePath) throws IOException {
            File file = new File(filePath);
            if (file.createNewFile()) {
                return "New File is created!";
            } else {
                return "File already exists.";
            }
    }
    public  void filePath(String filePath) throws IOException {

        String path = "";
        boolean bool = false;
            // createing  new files
            File file  = new File(filePath);
            file.createNewFile();
            System.out.println(file);
            // createing new canonical from file object
            File file2 = file.getCanonicalFile();
            // returns true if the file exists
            System.out.println(file2);
            bool = file2.exists();
            // returns absolute pathname
            path = file2.getAbsolutePath();
            System.out.println(bool);
            // if file exists
            if (bool) {
                // prints
                System.out.print(path + " Exists? " + bool);
            }
    }
    public  void fileList(String filePath) {
        File f=new File(filePath);
        String filenames[]=f.list();
        for(String filename:filenames){
            System.out.println(filename);
        }
    }
}
