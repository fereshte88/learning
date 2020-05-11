package com.rad.ujava8feachers.qtypeannotations;

/**
 * Java Type Annotations
 *
 * Java 8 has included two new features repeating and type annotations in its prior annotations topic.
 * In early Java versions, you can apply annotations only to declarations.
 * After releasing of Java SE 8 , annotations can be applied to any type use.
 * It means that annotations can be used anywhere you use a type.
 * For example, if you want to avoid NullPointerException in your code, you can declare a string variable like this:
 *جاوا 8 در مبحث حاشیه نویسی های قبلی خود دارای دو ویژگی جدید در تکرار و نوع حاشیه نویسی است.
 *  در نسخه های اولیه جاوا ، شما می توانید حاشیه نویسی را فقط در اعلامیه ها اعمال کنید.
 * پس از انتشار جاوا SE 8 ، حاشیه نویسی ها را می توان برای هر نوع استفاده اعمال کرد.
 *  این بدان معناست که حاشیه نویسی ها در هر جایی که از یک نوع استفاده می کنید قابل استفاده هستند.
 *  به عنوان مثال ، اگر می خواهید از NullPointerException در کد خود جلوگیری کنید ، می توانید متغیر رشته مانند این را اعلام کنید:
 *     @NonNull String str;
 *
 * Following are the examples of type annotations:
 *
 *     @NonNull List<String>
 *
 *     List<@NonNull String> str
 *
 *     Arrays<@NonNegative Integer> sort
 *
 *     @Encrypted File file
 *
 *     @Open Connection connection
 *
 *     void divideInteger(int a, int b) throws @ZeroDivisor ArithmeticException
 *
 * Note - Java created type annotations to support improved analysis of Java programs. It supports way of ensuring stronger type checking.
 * توجه - جاوا حاشیه نویسی ها برای پشتیبانی از تجزیه و تحلیل بهتر برنامه های جاوا ایجاد شده است. این روش از اطمینان از بررسی نوع قوی تر پشتیبانی می کند.
 * Java Repeating Annotations
 *
 * In Java 8 release, Java allows you to repeating annotations in your source code. It is helpful when you want to reuse annotation for the same class.
 * You can repeat an annotation anywhere that you would use a standard annotation.
 *در نسخه جاوا 8 ، جاوا به شما اجازه می دهد تا یادداشت ها را در کد منبع خود تکرار کنید. وقتی می خواهید از همان یادداشت استفاده کنید ، از همان یادداشت استفاده کنید.
 * می توانید حاشیه نویسی را در هر مکانی که از یک یادداشت استاندارد استفاده کنید تکرار کنید.
 * For compatibility reasons, repeating annotations are stored in a container annotation that is automatically generated by the Java compiler.
 * In order for the compiler to do this, two declarations are required in your code.
 *به دلایل سازگاری ، تکرار حاشیه نویسی ها در حاشیه نویسی ظرف که به طور خودکار توسط کامپایلر جاوا تولید می شود ، ذخیره می شوند.
 * برای اینکه کامپایلر این کار را انجام دهد ، دو کد اعلامیه در کد شما لازم است.
 *     Declare a repeatable annotation type
 *     Declare the containing annotation type
 *
 * 1) Declare a repeatable annotation type
 *
 * Declaring of repeatable annotation type must be marked with the @Repeatable meta-annotation.
 * In the following example, we have defined a custom @Game repeatable annotation type.
 *
اعلام نوع حاشیه نویسی قابل تکرار باید با یادداشت فراداده قابل تکرار باشد. در مثال زیر ، یک نوع حاشیه نویسی قابل تکرارGame را تعریف کرده ایم.

 *     @Repeatable(Games.class)
 *     @interfaceGame{
 *         String name();
 *         String day();
 *     }
 *
 * The value of the @Repeatable meta-annotation, in parentheses, is the type of the container annotation that the Java compiler generates to store repeating annotations.
 * In the following example, the containing annotation type is Games. So, repeating @Game annotations is stored in an @Games annotation.
 * مقدار حاشیه نویسیRepeatable در پرانتزها نوع حاشیه نویسی ظرف است که کامپایلر جاوا برای ذخیره یادداشت های تکراری ایجاد می کند.
 * در مثال زیر ، نوع حاشیه نویسی حاوی بازی ها است. بنابراین ، تکرار یادداشتهایGame در حاشیه نویسیGames ذخیره می شود.
 * 2) Declare the containing annotation type
 *
 * Containing annotation type must have a value element with an array type. The component type of the array type must be the repeatable annotation type.
 * In the following example, we are declaring Games containing annotation type:
 * حاوی نوع حاشیه نویسی باید دارای یک عنصر ارزش با نوع آرایه باشد. نوع جزء از نوع آرایه باید نوع حاشیه نویسی قابل تکرار باشد.
 * در مثال زیر ، بازیهای حاوی نوع حاشیه نویسی را اعلام می کنیم:
 *
 *     @interfaceGames{
 *         Game[] value();
 *     }
 *
 * Note - Compiler will throw a compile-time error, if you apply the same annotation to a declaration without first declaring it as repeatable.
 * نکته - اگر همان یادداشت را در بیانیه ای اعمال کنید بدون آنکه ابتدا آن را تکرار کنید ، کامپایلر خطای زمان کامپایل را پرتاب می کند.
 */
// Declaring repeatable annotation type

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/// Declaring repeatable annotation type
@Repeatable(Games.class)
@interface Game{
        String name();
        String day();
        }
// Declaring container for repeatable annotation type
@Retention(RetentionPolicy.RUNTIME)
@interface Games{
        Game[] value();
        }
// Repeating annotation
@Game(name = "Cricket",  day = "Sunday")
@Game(name = "Hockey",   day = "Friday")
@Game(name = "Football", day = "Saturday")
public class RepeatingAnnotationsExample {
    public static void main(String[] args) {
        // Getting annotation by type into an array
        Game[] game = RepeatingAnnotationsExample.class.getAnnotationsByType(Game.class);
        for (Game game2 : game) {    // Iterating values
            System.out.println(game2.name()+" on "+game2.day());
        }
    }
}