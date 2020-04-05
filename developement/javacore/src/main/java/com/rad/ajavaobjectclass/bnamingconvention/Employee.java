//Package:
//It should be a lowercase letter such as java, lang.
//If the name contains multiple words, it should be separated by dots (.) such as java.util, java.lang.
//باید حروف کوچک مانند java ، lang باشد.
//اگر نام شامل چندین کلمه باشد ، باید با نقاط (.) مانند java.util ، java.lang از هم جدا شود.
package com.motaharinia.javacore.ajavaobjectclass.bnamingconvention;


//Class:
//It should start with the uppercase letter.
//It should be a noun such as Color, Button, System, Thread, etc.
//Use appropriate words, instead of acronyms.
//A class in Java can contain:
//Fields
//Methods
//Constructors
//Blocks
//Nested class and interface
//باید با حرف بزرگ شروع شود.
//این باید اسمی مانند Color ، Button ، System ، Thread و غیره باشد.
//به جای کلمات اختصاری از کلمات مناسب استفاده کنید.
public class Employee {

    //Variable:
    //It should start with a lowercase letter such as id, name.
    //It should not start with the special characters like & (ampersand), $ (dollar), _ (underscore).
    //If the name contains multiple words, start it with the lowercase letter followed by an uppercase letter such as firstName, lastName.
    //Avoid using one-character variables such as x, y, z.
    //باید با یک حروف کوچک مانند id ، name شروع شود.
    //این نباید با کاراکترهای خاصی مانند & (ampersand) ، $ (دلار) ، _ (underscore) شروع شود.
    //اگر این نام شامل چندین کلمه است ، آن را با حروف کوچک شروع کنید و به دنبال آن یک حروف بزرگ مانند firstName ، lastName.
    //از استفاده از متغیرهای یک کارکتری مانند x ، y ، z خودداری کنید.
    Integer id;


    //Constant:
    //It should be in uppercase letters such as RED, YELLOW.
    //If the name contains multiple words, it should be separated by an underscore(_) such as MAX_PRIORITY.
    //It may contain digits but not as the first letter.
    //این باید با حروف بزرگ مانند RED ، YELLOW باشد.
    //اگر نام شامل چندین کلمه باشد ، باید توسط یک زیر نویس (_) مانند MAX_PRIORITY جدا شود.
    //ممکن است حاوی رقم باشد اما به عنوان حرف اول نیست.
    static final Integer MIN_AGE = 18;


    //Method:
    //It should start with lowercase letter.
    //It should be a verb such as main(), print(), println().
    //If the name contains multiple words, start it with a lowercase letter followed by an uppercase letter such as actionPerformed()
    //باید با حروف کوچک شروع شود.
    //این باید یک فعل مانند main ، print ، println باشد.
    //اگر نام شامل چندین کلمه است ، آن را با یک حرف کوچک شروع کنید و به دنبال آن یک حروف بزرگ مانند actionPerformed
    void draw() {

        //Object:
        //An object has three characteristics:
        //State: represents the data (value) of an object.
        //Behavior: represents the behavior (functionality) of an object such as deposit, withdraw, etc.
        //Identity: An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user. However, it is used internally by the JVM to identify each object uniquely.
        //یک شیء دارای سه ویژگی است:
        //حالت: داده (مقدار) یک شی را نشان می دهد.
        //رفتار: بیانگر رفتار (عملکرد) شیء مانند سپرده گذاری ، برداشت و غیره است.
        //هویت: یک هویت شی به طور معمول از طریق یک شناسه منحصر به فرد پیاده سازی می شود. مقدار شناسه برای کاربر خارجی قابل مشاهده نیست. با این حال ، آن را در داخل توسط JVM استفاده می شود برای شناسایی منحصر به فرد هر شی.
        Employee employee=new Employee();
    }
}
