package com.motaharinia.javacore.ejavaencapsulation.baccessmodifiers;

//https://www.javatpoint.com/access-modifiers
//There are two types of modifiers in Java: access modifiers and non-access modifiers.
//The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class.
// We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.
//There are four types of Java access modifiers
//1.Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
//2.Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package.
//If you do not specify any access level, it will be the default.
//3.Protected: The access level of a protected modifier is within the package and outside the package through child class.
//If you do not make the child class, it cannot be accessed from outside the package.
//The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.
//4.Public: The access level of a public modifier is everywhere.
//It can be accessed from within the class, outside the class, within the package and outside the package.
//There are many non-access modifiers, such as static, abstract, synchronized, native, volatile, transient, etc.
//Here, we are going to learn the access modifiers only.
// در جاوا دو نوع اصلاح کننده وجود دارد: اصلاح کننده های دسترسی و اصلاح کننده های غیر دسترسی.
// اصلاح کننده های دسترسی در جاوا قابلیت دستیابی یا دامنه یک قسمت ، متد ، سازنده یا کلاس را مشخص می کند.
// ما می توانیم با استفاده از اصلاح کننده دسترسی روی آن ، سطح دستیابی به زمینه ها ، سازنده ها ، روش ها و کلاس را تغییر دهیم.
// چهار نوع اصلاح کننده دسترسی جاوا وجود دارد
//1.Private:
// سطح دسترسی یک اصلاح کننده Private فقط در داخل کلاس است. از خارج از کلاس قابل دسترسی نیست.
//2.Default:
// سطح دسترسی یک اصلاح کننده Default فقط در پکیج موجود است. از خارج از پکیج قابل دسترسی نیست.
// اگر هیچ سطح دسترسی را مشخص نکردید ، پیش فرض خواهد بود.
//3.Protected:
// سطح دسترسی یک اصلاح کننده Protected در داخل پکیج و خارج از پکیج از طریق کلاس فرزند است.
// اگر کلاس فرزند را درست نکردید ، از خارج از پکیج قابل دسترسی نیست.
//اصلاح کننده دسترسی Protected می تواند روی عضو داده ، متد و سازنده اعمال شود. و نمی تواند برای کلاس اعمال شود.
//4.Public:
// سطح دسترسی یک اصلاح کننده Public در همه جا است.
// از داخل کلاس ، خارج از کلاس ، درون پکیج و خارج از پکیج قابل دسترسی است.
// تعداد زیادی non-access modifiers زیادی وجود دارد ، مانند static ، abstract ، synchronized ، native ، volatile ، transient و غیره.
// در اینجا ، ما فقط قصد داریم اصلاح کننده های دسترسی را بیاموزیم.
//
//Understanding Java Access Modifiers:
//درک اصلاح کننده های دسترسی Java
//Access Modifier	within class	within package	outside package by subclass only	    outside package
//Private	            Y	                N	                    N	                                                N
//Default	            Y	                Y	                    N	                                                N
//Protected	        Y	                Y	                    Y	                                                N
//Public	                Y	                Y	                    Y	                                                Y
//
//Note: A class cannot be private or protected except nested class.
//توجه: یک کلاس به جز کلاس تو در تو نمی تواند private یا protected شود.
//
//Java Access Modifiers with Method Overriding:
//If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive.
//اصلاح کننده های دسترسی به Java با Overriding متد
//اگر شما  هر متدی را override می کنید ،دسترسی متد override شده (برای مثال اعلام شده در زیر کلاس) نباید محدودتر باشد.
public class AccessModifier {

    // Private Constructor
    //If you make any class constructor private, you cannot create the instance of that class from outside the class. For example:
    //سازنده خصوصی
    //اگر سازنده کلاس را خصوصی کنید ، نمی توانید نمونه آن کلاس را از خارج از کلاس ایجاد کنید. مثلا:
    private AccessModifier(){}
}
