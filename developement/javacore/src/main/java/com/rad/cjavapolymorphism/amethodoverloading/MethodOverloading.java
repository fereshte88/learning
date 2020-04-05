package com.rad.javacore.cjavapolymorphism.amethodoverloading;

//Method Overloading:
//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
//If we have to perform only one operation, having same name of the methods increases the readability of the program.
//There are two ways to overload the method in java
//1.By changing number of arguments
//2.By changing the arguments data type
//اگر یک کلاس چندین متد با نام مشابه داشته باشد اما از نظر پارامترها متفاوت باشد ، به عنوان Overloading Method شناخته می شود.
//اگر مجبور باشیم فقط یک عمل را انجام دهیم ، داشتن همین نام متدها خوانایی برنامه را افزایش می دهد.
//دو روش برای اضافه بار این روش در جاوا وجود دارد
//با تغییر تعداد آرگومان ها
//با تغییر نوع داده
//
//Why Method Overloading is not possible by changing the return type of method only?
//In java, method overloading is not possible by changing the return type of the method only because of ambiguity.
//چرا Method Overloading فقط با تغییر نوع خروجی متد امکان پذیر نیست؟
//در جاوا ، با تغییر نوع برگشتی متد به دلیل ابهام ،Overloading متد ممکن نیست.
//
//Can we overload java main() method?
//Yes, by method overloading. You can have any number of main methods in a class by method overloading.
//But JVM calls main() method which receives string array as arguments only.
//آیا می توانیم  متد main جاوا را overload کنیم؟
//بله ، با method overloading. با استفاده از method overloading بیش از حد ، می توانید تعداد متدهای main را در یک کلاس داشته باشید.
//اما JVM متد main را صدا میزند که آرایه رشته را فقط به عنوان آرگومان دریافت می کند.
public class MethodOverloading {
    //1.changing number of arguments
    //تغییر تعداد آرگومانها
    public Integer add(int a,int b){return a+b;}
    public Integer add(int a,int b,int c){return a+b+c;}

    //2.By changing the arguments data type
    // تغییر نوع داده آرگومانهای ورودی
    public Integer multiple(int a, int b){return a*b;}
    public Double multiple(double a, double b){return a*b;}

    //main overloading:
    public static void main(String[] args) {

    }
    public static void main(String[] args,Integer input) {

    }
}
