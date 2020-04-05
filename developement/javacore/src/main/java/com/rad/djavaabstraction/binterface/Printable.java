package com.rad.djavaabstraction.binterface;

//Interface in Java:
//An interface in Java is a blueprint of a class. It has static constants and abstract methods.
//The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body.
//It is used to achieve abstraction and multiple inheritance in Java.
//In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.
//Java Interface also represents the IS-A relationship.
//It cannot be instantiated just like the abstract class.
//Since Java 8, we can have default and static methods in an interface.
//Since Java 9, we can have private methods in an interface.
// رابط در جاوا:
// رابط در جاوا طرح کلی یک کلاس است. دارای ثابت های static و متد های انتزاعی است.
// رابط در جاوا مکانیسمی برای دستیابی به انتزاع است. در رابط جاوا فقط متد انتزاعی وجود دارد ، نه بدنه متد.
// برای دستیابی به انتزاع و وراثت چندگانه در جاوا استفاده می شود.
// به عبارت دیگر ، می توانید بگویید که رابط ها می توانند از روش ها و متغیرهای انتزاعی برخوردار باشند. نمی تواند بدنه متد داشته باشد.
// رابط جاوا همچنین بیانگر رابطه IS-A است.
// درست مثل کلاس انتزاعی نمی توان آنرا نمونه سازی کرد.
// از جاوا 8 ، می توانیم روش های پیش فرض و استاتیک را در یک رابط داشته باشیم.
// از جاوا 9 ، می توانیم روشهای خصوصی را در یک رابط داشته باشیم.
//
//Why use Java interface?
//There are mainly three reasons to use interface. They are given below.
//It is used to achieve abstraction.
//By interface, we can support the functionality of multiple inheritance.
//It can be used to achieve loose coupling.
//چرا از رابط جاوا استفاده می کنیم؟
//به طور عمده سه دلیل برای استفاده از رابط وجود دارد. آنها در زیر آورده شده است.
//برای دستیابی به انتزاع استفاده می شود.
//با رابط ، ما می توانیم از عملکرد وراثت چندگانه پشتیبانی کنیم.
//می توان از آن برای دستیابی به کم کردن وابستگی ها استفاده کرد.
//
//How to declare an interface?
//An interface is declared by using the interface keyword. It provides total abstraction;
//means all the methods in an interface are declared with the empty body, and all the fields are public, static and final by default.
//A class that implements an interface must implement all the methods declared in the interface.
//چگونه یک رابط را تعریف کنیم؟
//رابط با استفاده از کلید واژه interface تعریف می شود. این انتزاع را در اختیار شما قرار می دهد.
// یعنی تمام روش های موجود در یک رابط با بدنه خالی اعلام می شوند ، و تمام فیلد ها بصورت پیش فرض عمومی ، استاتیک و نهایی هستند.
//کلاس که یک رابط را پیاده سازی می کند باید تمام متد های اعلام شده در رابط را پیاده سازی کند.
//
//Internal addition by the compiler:
//The Java compiler adds public and abstract keywords before the interface method.
//Moreover, it adds public, static and final keywords before data members.
//اضافه شونده های داخلی توسط کامپایلر:
//کامپایلر جاوا قبل از متد رابط کلمات کلیدی public و abstract را اضافه می کند.
//علاوه بر این ، کلمات کلیدی public ، static و final را قبل از اعضای داده اضافه می کند.
//
//Multiple inheritance in Java by interface:
//If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.
//وراثت چندگانه در جاوا توسط رابط:
//اگر یک کلاس چندین رابط را پیاده سازی کند ، یا یک رابط چند رابط را extend کند ، به عنوان وراثت چندگانه شناخته می شود.
public interface Printable {
    /**
     * پرینت محتویات
     *
     * @return خروجی: نتیجه
     */
    String print();
}
