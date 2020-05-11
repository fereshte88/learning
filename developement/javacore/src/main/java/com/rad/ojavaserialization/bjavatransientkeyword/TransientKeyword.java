package com.rad.ojavaserialization.bjavatransientkeyword;

/**
 * Java transient keyword is used in serialization. If you define any data member as transient, it will not be serialized.
 *
 * Let's take an example, I have declared a class as Student, it has three data members id, name and age.
 * If you serialize the object, all the values will be serialized but I don't want to serialize one value, e.g. age then we can declare the age data member as transient.
 * کلید واژه transient جاوا در سریال سازی استفاده می شود. اگر شما هر عضو داده را به عنوان transient تعریف کنید ، سریالی نمی شود.
 *
 * بیایید مثالی بزنم ، من یک کلاس را به عنوان Student اعلام کرده ام ، دارای سه شناسه عضو ، نام و سن است.
 * اگر شما شی را سریالی کنید ، تمام مقادیر سریالی می شوند اما من نمی خواهم یک مقدار را مثلاً سریال سازی کنم. سن ما می توانیم عضو داده های سن را به عنوان transient اعلام کنیم.
 */

import java.io.*;

/**
 * Example of Java Transient Keyword
 *
 * In this example, we have created the two classes Student and PersistExample. The age data member of the Student class is declared as transient, its value will not be serialized.
 *
 * If you deserialize the object, you will get the default value for transient variable.
 *
 * Let's create a class with transient variable.
 *
 در این مثال ، ما دو کلاس Student و PersistExample را ایجاد کرده ایم. عضو داده سنی کلاس Student به عنوان گذرا اعلام می شود ، مقدار آن به صورت سریال نمی شود.

 در صورت deserialize کردن شی ، مقدار پیش فرض را برای متغیر گذر دریافت خواهید کرد.

 بیایید یک کلاس با متغیر گذرا ایجاد کنیم.

 */
public class TransientKeyword {

    public void persist(String pathFile, Student student)throws Exception{
        //writing object into file
        FileOutputStream f=new FileOutputStream(pathFile);
        ObjectOutputStream out=new ObjectOutputStream(f);
        out.writeObject(student);
        out.flush();

        out.close();
        f.close();
    }

    public  String depersist(String pathFile)throws Exception{
        ObjectInputStream in=new ObjectInputStream(new FileInputStream(pathFile));
        Student s=(Student)in.readObject();
        in.close();
        return s.id+" "+s.name+" "+s.age;
    }

}