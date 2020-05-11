package com.rad.ujava8feachers.kstringjoinerclass;

/**
 * Java added a new final class StringJoiner in java.util package. It is used to construct a sequence of characters separated by a delimiter.
 * Now, you can create string by passing delimiters like comma(,), hyphen(-) etc. You can also pass prefix and suffix to the char sequence.
 * جاوا کلاس بسته بندی شده جدید StringJoiner را در بسته java.util اضافه کرد. از آن برای ساختن دنباله ای از کاراکتر های جدا شده توسط تعیین کننده استفاده می شود.
 * اکنون می توانید رشته هایی را با عبور دادن محدود کننده هایی مانند کاما (،) ، خط (()) ایجاد کنید.
 */

import java.util.StringJoiner;

/**
 * StringJoiner Constructors
 *
 * Public StringJoiner(CharSequence delimiter)
 * It constructs a StringJoiner with no characters in it, with no prefix or suffix, and a copy of the supplied delimiter. It throws NullPointerException if delimiter is null.
 *این StringJoiner را بدون هیچ کاراکتری در آن ، بدون پیشوند یا پسوند ، و یک کپی از تحویل دهنده ارائه می دهد. اگر محدود کننده صفر باشد NullPointerException را پرتاب می کند.
 * Public StringJoiner(CharSequence delimiter,CharSequence prefix,CharSequence suffix)
 * It constructs a StringJoiner with no characters in it using copies of the supplied prefix, delimiter and suffix. It throws NullPointerException if prefix, delimiter, or suffix is null.
 *این StringJoiner را با استفاده از کپی های پیشوند ارائه شده ، تعریف کننده و پسوند ، StringJoiner ایجاد می کند. اگر پیشوند ، محدودکننده یا پسوند تهی باشد ، NullPointerException را پرتاب می کند.
 *
 * StringJoiner Methods
 *
 * Public StringJoiner add(CharSequence newElement)
 * It adds a copy of the given CharSequence value as the next element of the StringJoiner value. If newElement is null,"null" is added.
 *این یک نسخه از مقدار CharSequence داده شده را بعنوان عنصر بعدی مقدار StringJoiner اضافه می کند. اگر newElement تهی است ، "تهی" اضافه می شود.
 * Public StringJoiner merge(StringJoiner other)
 * It adds the contents of the given StringJoiner without prefix and suffix as the next element if it is non-empty. If the given StringJoiner is empty, the call has no effect.
 *اگر محتوای غیر خالی باشد ، محتویات StringJoiner داده شده را بدون پیشوند و پسوند به عنوان عنصر بعدی اضافه می کند. اگر StringJoiner داده شده خالی باشد ، تماس هیچ تاثیری ندارد.
 * Public int length()
 * It returns the length of the String representation of this StringJoiner.
 *طول نمایه String این StringJoiner را برمی گرداند.
 * Public StringJoiner setEmptyValue(CharSequence emptyValue)
 * It sets the sequence of characters to be used when determining the string representation of this StringJoiner and no elements have been added yet, that is, when it is empty.
 * این ترتیب ترتیب کاراکترها را هنگام تعیین بازنمایی رشته این StringJoiner تعیین می کند و هنوز هیچ عنصری اضافه نشده است ، یعنی وقتی خالی است.
 */
public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter

        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");
        joinNames.add("Peter");
        joinNames.add("Raheem");

        System.out.println(joinNames);
        StringJoiner joinNames1 = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames1.add("Rahul");
        joinNames1.add("Raju");
        joinNames1.add("Peter");
        joinNames1.add("Raheem");

        System.out.println(joinNames1);
    }
}
