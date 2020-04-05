package com.motaharinia.javacore.cjavapolymorphism.hdynamicbinding;

//Static Binding and Dynamic Binding:
//Connecting a method call to the method body is known as binding.
//There are two types of binding
//Static Binding (also known as Early Binding).
//Dynamic Binding (also known as Late Binding).
//اتصال استاتیک و اتصال پویا
//اتصال یک فراخوانی متد به بدن متد به عنوان binding شناخته می شود.
//دو نوع اتصال وجود دارد
//اتصال استاتیک (همچنین به عنوان Early Binding نیز شناخته می شود).
//اتصال داینامیک (همچنین به عنوان Late Binding شناخته می شود).
//
//Understanding Type:
//Let's understand the type of instance.
//1) variables have a type: Each variable has a type, it may be primitive and non-primitive.
//2) References have a type
//3) Objects have a type
//فهمیدن نوع
//بیایید نوع نمونه را درک کنیم.
// 1) متغیرها یک نوع دارند: هر متغیر دارای یک نوع است ، ممکن است ابتدایی و غیر بدوی باشد.
// 2) ارجاعها دارای یک نوع هستند
// 3) اشیاء دارای یک نوع هستند
//
//static binding:
//When type of the object is determined at compiled time(by the compiler), it is known as static binding.
//If there is any private, final or static method in a class, there is static binding.
//اتصال استاتیک:
// هنگامی که نوع شیء در زمان کامپایل تعیین می شود (توسط کامپایلر) ، به عنوان اتصال استاتیک شناخته می شود.
// در صورت وجود هر متد خصوصی ، نهایی یا استاتیک در یک کلاس ، اتصال استاتیک وجود دارد.
//
//Dynamic binding:
//When type of the object is determined at run-time, it is known as dynamic binding.
//اتصال پویا:
// وقتی نوع شی در زمان اجرا مشخص می شود ، به عنوان اتصال پویا شناخته می شود.
public class DynamicBinding {
    private String id;
    //static binding:
    private String eat(){return("ParentPrivateEat(StaticBinding)");}

    public DynamicBinding walk(){return new DynamicBinding();}
}


class DynamicBindingChild extends  DynamicBinding{
     private Integer id;
    //Dynamic binding:
    public DynamicBindingChild walk(){return new DynamicBindingChild();}
}