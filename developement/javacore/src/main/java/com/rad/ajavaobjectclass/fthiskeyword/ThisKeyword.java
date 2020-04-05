package com.rad.javacore.ajavaobjectclass.fthiskeyword;

//Here is given the 6 usage of java this keyword.
//this can be used to refer current class instance variable.
//this can be used to invoke current class method (implicitly)
//this() can be used to invoke current class constructor.
//this can be passed as an argument in the method call.
//this can be passed as argument in the constructor call.
//this can be used to return the current class instance from the method.
//در اینجا به 6 مورد استفاده جاوا از کلمه کلیدی this داده شده است.
// می تواند برای ارجاع متغیر نمونه کلاس فعلی استفاده شود.
// می تواند برای استناد به متد کلاس فعلی (به طور ضمنی) استفاده شود
// می توان برای استناد به سازنده کلاس فعلی استفاده کرد.
// می تواند به عنوان یک آرگومان در فراخوانی متد منتقل شود.
// می تواند به عنوان آرگومان در فراخوانی سازنده منتقل شود.
//این می تواند برای بازگشت نمونه کلاس فعلی از طریق متد استفاده شود.
public class ThisKeyword {
    Integer id;

    /**
     * متد سازنده
     */
    public ThisKeyword() {
        id = 1;
    }

    /**
     * متد سازنده با پارمتر
     * @param id شناسه
     */
    public ThisKeyword(Integer id) {

        //invoke current class constructor
        // استناد به سازنده کلاس فعلی
        this();

        //refer current class instance variable.
        // ارجاع متغیر نمونه کلاس فعلی
        this.id += id;

        //invoke current class method (implicitly)
        // استناد به متد کلاس فعلی (به طور ضمنی)
        this.testDouble();

        //pass as an argument in the method call
        //به عنوان یک آرگومان در فراخوانی متد
        this.testPassArgument(this);
    }

    public void testDouble() {
        this.id = this.id * 2;
    }

    public void testPassArgument(ThisKeyword thisVar) {
        thisVar.id += 4;
    }
}


class ThisKeyword2 {
    ThisKeyword thisKeyword;

    /**
     * pass as argument in the constructor call.
     * به عنوان آرگومان در فراخوانی سازنده
     *
     * @param thisKeyword شی ورودی
     */
    ThisKeyword2(ThisKeyword thisKeyword) {
        this.thisKeyword = thisKeyword;
    }

    //return the current class instance from the method
    //بازگشت نمونه کلاس فعلی از طریق متد
    public ThisKeyword2 getMe() {
        return this;
    }
}