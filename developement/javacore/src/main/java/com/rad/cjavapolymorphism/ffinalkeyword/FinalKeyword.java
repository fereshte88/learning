package com.motaharinia.javacore.cjavapolymorphism.ffinalkeyword;

//FinalKeyword:
//The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:
//variable
//method
//class
//The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable.
//It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only.
//کلمه کلیدی final در جاوا برای محدود کردن کاربر استفاده می شود. کلمه کلیدی جاوا final در زمینه های مختلفی قابل استفاده است. final می تواند باشد:
//متغیر
//متد
//کلاس
//کلمه کلیدی final را می توان روی متغیرها اعمال کرد ، به متغیر final که هیچ مقداری ندارد ، متغیر final خالی یا متغیر final مقداردهی اولیه نشده گفته می شود.
//می توان آن را فقط در سازنده مقداردهی اولیه کرد. متغیر final خالی می تواند استاتیک باشد که فقط در بلوک استاتیک مقداردهی اولیه شود.
//
//Can we declare a constructor final?
//No, because constructor is never inherited.
// آیا می توانیم سازنده final تعریف کنیم؟
// نه ، زیرا سازنده هرگز به ارث نمی رسد.
public class FinalKeyword {
    //متغیر final
    final Integer speedLimit = 10;

    //متد final
    //If you make any method as final, you cannot override it.
    //اگر هر متدی را final کنید ، نمی توانید آن را override کنید.
    final public Integer makeDouble() {
        return speedLimit * 2;
    }


    //blank or uninitialized final variable
    //متغیر final خالی یا مقداردهی نشده که فقط در سازنده میتوان به آن مقداردهی اولیه کرد
    final Integer speedMinimum;
    FinalKeyword() {
        speedMinimum = 5;
    }

    //blank or uninitialized static final variable
    //متغیر static final خالی یا مقداردهی نشده که قفط میتوان در بلاک سازنده استاتیک آن را مقداردهی اولیه کرد
    static final Integer staticData;
    static {
        staticData = 50;
    }


    //final parameter
    //If you declare any parameter as final, you cannot change the value of it.
    //اگر شما یک پارامتر final برای یک متد تعریف کنید ، شما نمیتوانید مقدار آن را داخل متد تغییر دهید
    public Integer methodWithFinalParameter(final Integer input1, Integer input2) {
        input2 = input1 * input2;
        return input2;
    }
}

//کلاس final
//If you make any class as final, you cannot extend it.
//اگر هر کلاس را final کنید ، نمی توانید آن را extend کنید.
final class FinalClass {
}



class FinalKeywordChild extends FinalKeyword {

    //final method is inherited but you cannot override it
    //از متد final میتوان ارث بری کرد ولی نمیتوان آن را override کرد
    public Integer calculate() {
        return this.makeDouble() + 5;
    }

}