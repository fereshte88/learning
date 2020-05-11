package com.rad.ujava8feachers.iforeachmethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Java forEach loop
 *
 * Java provides a new method forEach() to iterate the elements. It is defined in Iterable and Stream interface.
 * It is a default method defined in the Iterable interface. Collection classes which extends Iterable interface can use forEach loop to iterate elements.
 *
 * This method takes a single parameter which is a functional interface. So, you can pass lambda expression as an argument.
 * جاوا برای تکرار عناصر متد جدیدی forEach()  فراهم می کند. در رابط Iterable و Stream تعریف شده است. این یک متد پیش فرض است که در رابط Iterable تعریف شده است.
 * کلاس های مجموعه که واسط قابل پخش را گسترش می دهد می توانند از حلقه forEach برای تکرار عناصر استفاده کنند.
 *
 * این متد یک پارامتر واحد رابط کاربری را به خود اختصاص می دهد. بنابراین ، می توانید بیان لامبدا را به عنوان استدلال منتقل کنید.
 * forEach() Signature in Iterable Interface
 *
 *     default void forEach(Consumer<super T>action)
 */
public class ForEachLoop {
    String result="";
    public  void append(String s){
        this.result +=s+",";
    }

    public String forEachExample(List<String> gamesList ) {
        result="";
        gamesList.forEach(item->this.append(item));
        return this.result;
    }
    /**
     * Java Stream forEachOrdered() Method
     *
     * Along with forEach() method, Java provides one more method forEachOrdered(). It is used to iterate elements in the order specified by the stream.
     * همراه با متد forEach () ، جاوا یک متد دیگر  forEachOrdered(). ارائه می دهد. برای تکرار عناصر به ترتیب مشخص شده توسط جریان استفاده می شود.
     * Singnature:
     *
     *     void forEachOrdered(Consumer<? super T> action)
     */
    public String forEachOrderExample(List<String> gamesList) {
        result="";
        gamesList.stream().forEachOrdered(item -> this.append(item));
        return this.result;
    }
}
