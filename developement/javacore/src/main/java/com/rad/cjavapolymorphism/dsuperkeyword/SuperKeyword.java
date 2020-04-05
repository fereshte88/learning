package com.motaharinia.javacore.cjavapolymorphism.dsuperkeyword;

//The super keyword in Java is a reference variable which is used to refer immediate parent class object.
//Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.
//کلمه کلیدی super در جاوا یک متغیر مرجع است که برای مراجعه به نزدیکترین شیی کلاس والدین استفاده می شود.
//هر زمان که شیی زیر کلاس را ایجاد کنید ، نمونه ای از کلاس والدین به طور ضمنی ایجاد می شود که توسط متغیر super مرجع ارجاع می شود.
//
//Usage of Java super Keyword
//super can be used to refer immediate parent class instance variable.
//super can be used to invoke immediate parent class method.
//super can be used to invoke immediate parent class constructor.
//استفاده از کلیدواژه super در جاوا
//کلیدواژه super را می توان برای ارجاع به نزدیک ترین متغیر شیی کلاس والدین استفاده کرد.
//کلیدواژه super را می توان برای فراخوانی به نزدیک ترین متد شیی کلاس والدین استفاده کرد.
//کلیدواژه super را می توان برای فراخوانی به نزدیک ترین سازنده شیی کلاس والدین استفاده کرد.
//
//1)super is used to refer immediate parent class instance variable.
//We can use super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields.
public class SuperKeyword {
    //شناسه
    Integer id = 1;

    /**
     * متد سازنده
     */
    public SuperKeyword() {
        this.id++;
    }

    /**
     * متد دوبرابر کننده شناسه
     */
    public void makeDouble() {
        this.id = this.id * 2;
    }

    /**
     * سازنده
     * @param id
     */
    public SuperKeyword(Integer id) {
        this.id =id*4;
    }
}






class SuperKeywordChild extends SuperKeyword {
    //شناسه فرزند
    Integer id = 100;

    /**
     * خروجی دهنده شناسه شیی کلاس فعلی فرزند
     *
     * @return خروجی: شناسه شیی کلاس فعلی فرزند
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * کلیدواژه super را می توان برای ارجاع به نزدیک ترین متغیر شیی کلاس والدین استفاده کرد.
     *
     * @return خروجی: شناسه شیی کلاس پدر
     */
    public Integer getSuperId() {
        return super.id;
    }


    /**
     * کلیدواژه super را می توان برای فراخوانی به نزدیک ترین متد شیی کلاس والدین استفاده کرد.
     *
     * @return خروجی: شناسه محاسبه شده با توجه به فراخوانی کتد کلاس والدین
     */
    public Integer calculate() {
        super.makeDouble();
        super.id *= 3;
        return super.id;
    }

    /**
     * سازنده
     */
    SuperKeywordChild() {
    }

    /**
     * متد سازنده
     * کلیدواژه super را می توان برای فراخوانی به نزدیک ترین سازنده شیی کلاس والدین استفاده کرد.
     *
     * @param input ورودی
     */
    SuperKeywordChild(Integer input) {
        super(input);
    }
}
