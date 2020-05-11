package com.rad.ujava8feachers.loptionalclass;

/**
 * Java introduced a new class Optional in jdk8. It is a public final class and used to deal with NullPointerException in Java application.
 * You must import java.util package to use this class. It provides methods which are used to check the presence of value for particular variable.
 * جاوا کلاس جدید اختیاری را در jdk8 معرفی کرد. این یک کلاس نهایی عمومی است و برای مقابله با NullPointerException در برنامه جاوا استفاده می شود.
 * برای استفاده از این کلاس باید بسته java.util را وارد کنید. این متدهایی را ارائه می دهد که برای بررسی وجود مقدار متغیر خاص استفاده می شود.
 */

import java.util.Optional;

/**
 * Java Optional Class Methods
 *
 * public static <T> Optional<T> empty()
 * It returns an empty Optional object. No value is present for this Optional.
 * این یک جسم اختیاری خالی را برمی گرداند. هیچ ارزشی برای این اختیاری موجود نیست.
 * public static <T> Optional<T> of(T value)
 * It returns an Optional with the specified present non-null value.
 * این مقدار اختیاری را با مقدار غیر معتبر موجود فعلی برمی گرداند.
 * public static <T> Optional<T> ofNullable(T value)
 * It returns an Optional describing the specified value, if non-null, otherwise returns an empty Optional.
 * این یک اختیاری است که مقدار مشخص شده را توصیف می کند ، در صورت غیر تهی بودن ، در غیر این صورت یک گزینه اختیاری خالی را برمی گرداند.
 * public T get()
 * If a value is present in this Optional, returns the value, otherwise throws NoSuchElementException.
 * اگر مقداری در این اختیاری موجود باشد ، مقدار را برمی گرداند ، در غیر این صورت NoSuchElementException را پرتاب می کند.
 * public boolean isPresent()
 * It returns true if there is a value present, otherwise false.
 * اگر مقدار فعلی وجود داشته باشد ، در غیر این صورت غلط است.
 * public void ifPresent(Consumer<? super T> consumer)
 * If a value is present, invoke the specified consumer with the value, otherwise do nothing.
 * اگر یک مقدار موجود است ، با مقدار مشخصی ، از مصرف کننده مشخص شده استعلام دهید ، در غیر این صورت هیچ کاری نکنید.
 * public Optional<T> filter(Predicate<? super T> predicate)
 * If a value is present, and the value matches the given predicate, return an Optional describing the value, otherwise return an empty Optional.
 * اگر یک مقدار موجود است ، و مقدار با پیش نویس داده شده مطابقت دارد ، یک توضیحی اختیاری را با مقدار اضافه کنید ، در غیر این صورت یک گزینه اختیاری خالی را برگردانید.
 * public <U> Optional<U> map(Function<? super T,? extends U> mapper)
 * If a value is present, apply the provided mapping function to it, and if the result is non-null, return an Optional describing the result. Otherwise return an empty Optional.
 * اگر مقدار موجود است ، عملکرد نقشه برداری ارائه شده را برای آن اعمال کنید ، و اگر نتیجه غیر تهی است ، یک اختیاری را که توصیف نتیجه را دارد ، برگردانید. در غیر این صورت اختیاری خالی را برگردانید.
 * public <U> Optional<U> flatMap(Function<? super T,Optional<U> mapper)
 * If a value is present, apply the provided Optional-bearing mapping function to it, return that result, otherwise return an empty Optional.
 * اگر مقدار موجود است ، عملکرد نقشه برداری اختیاری ارائه شده را بر روی آن اعمال کنید ، آن نتیجه را برگردانید ، در غیر این صورت یک گزینه خالی اختیاری را برگردانید.
 * public T orElse(T other)
 * It returns the value if present, otherwise returns other.
 * اگر مقدار موجود باشد مقدار را برمی گرداند ، در غیر این صورت بازگرداندن دیگری.
 * public T orElseGet(Supplier<? extends T> other)
 * It returns the value if present, otherwise invoke other and return the result of that invocation.
 * اگر مقدار موجود باشد مقدار را برمی گرداند ، در غیر این صورت استناد به دیگری می کند و نتیجه آن فراخوان را برمی گرداند.
 * public <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) throws X extends Throwable
 * It returns the contained value, if present, otherwise throw an exception to be created by the provided supplier.
 * اگر مقدار موجود باشد مقدار موجود را باز می گرداند ، در غیر این صورت استثنائی را ایجاد می کند که توسط تهیه کننده ارائه شده ایجاد شود.
 * public boolean equals(Object obj)
 * Indicates whether some other object is "equal to" this Optional or not. The other object is considered equal if:
 *
 *     It is also an Optional and;
 *     Both instances have no value present or;
 *     the present values are "equal to" each other via equals().
 *نشان می دهد که آیا برخی از شیء دیگر "این" مساوی با "این اختیاری است یا خیر. اگر شی دیگر برابر باشد در نظر گرفته می شود:
 *
 *     همچنین اختیاری است و
 *     هر دو مورد ارزش فعلی ندارند یا
 *     مقادیر موجود از طریق مساوی "برابر" با یکدیگر هستند.
 * public int hashCode()
 * It returns the hash code value of the present value, if any, or returns 0 (zero) if no value is present.
 * در صورت وجود مقدار کد هش از مقدار فعلی ، یا 0 (صفر) را در صورت عدم وجود مقدار باز می گرداند.
 * public String toString()
 * It returns a non-empty string representation of this Optional suitable for debugging. The exact presentation format is unspecified and may vary between implementations and versions.
 * این یک رشته رشته غیر خالی از این اختیاری مناسب برای اشکال زدایی را برمی گرداند. قالب ارائه دقیق نامشخص است و ممکن است بین پیاده سازی ها و نسخه ها متفاوت باشد.
 */
public class OptionalExample {
    public static void main(String[] args) {
//        String[] str = new String[10];
//        String lowercaseString = str[5].toLowerCase();
//        System.out.print(lowercaseString);
        String[] str = new String[10];
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){  // check for value is present or not
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("string value is not present");
//*****************************************************************
        String[] str1 = new String[10];
        str1[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index
        Optional<String> checkNull1 = Optional.ofNullable(str1[5]);
        if(checkNull1.isPresent()){  // It Checks, value is present or not
            String lowercaseString = str1[5].toLowerCase();
            System.out.println(lowercaseString);
        }else
            System.out.println("String value is not present");
        //******************************************************************
        String[] str2 = new String[10];
        str2[5] = "JAVA OPTIONAL CLASS EXAMPLE************";  // Setting value for 5th index
        Optional<String> checkNull2 = Optional.ofNullable(str2[5]);
        checkNull2.ifPresent(System.out::println);   // printing value by using method reference
        System.out.println(checkNull2.get());    // printing value by using get method
        System.out.println(str2[5].toLowerCase());
        //********************************************************
        String[] str3 = new String[10];
        str3[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index
        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str3[5]);
        // If value is present, it returns an Optional otherwise returns an empty Optional
        System.out.println("Filtered value: "+value.filter((s)->s.equals("Abc")));
        System.out.println("Filtered value: "+value.filter((s)->s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
        // It returns value of an Optional. if value is not present, it throws an NoSuchElementException
        System.out.println("Getting value: "+value.get());
        // It returns hashCode of the value
        System.out.println("Getting hashCode: "+value.hashCode());
        // It returns true if value is present, otherwise false
        System.out.println("Is value present: "+value.isPresent());
        // It returns non-empty Optional if value is present, otherwise returns an empty Optional
        System.out.println("Nullable Optional: "+Optional.ofNullable(null));
        // It returns value if available, otherwise returns specified value,
        System.out.println("orElse: "+value.orElse("Value is not present"));
        System.out.println("orElse: "+empty.orElse("Value is not present"));
        value.ifPresent(System.out::println);   // printing value by using method reference
    }
}
