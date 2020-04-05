package com.motaharinia.javacore.cjavapolymorphism.einstanceinitializerblock;

//Instance Initializer block is used to initialize the instance data member. It run each time when object of the class is created.
//The initialization of the instance variable can be done directly but there can be performed extra operations while initializing the instance variable in the instance initializer block.
//بلوک Initializer برای مقداردهی اولیه شیی عضو داده استفاده می شود. هر زمان که شیء کلاس ایجاد شود ، اجرا می شود.
//مقداردهی اولیه متغیر شیی می تواند بطور مستقیم انجام شود اما می توان همزمان با تنظیم متغیر شیی در بلوک نمونه اولیه ، عملیات اضافی انجام داد.
//
//There are three places in java where you can perform operations:
//method
//constructor
//block
//سه جا در جاوا وجود دارد که می توانید عملیات را انجام دهید:
//متد
//سازنده
//بلوک کد
//
//What is invoked first, instance initializer block or constructor?
//The java compiler copies the instance initializer block in the constructor after the first statement super
//ابتدا از بلوک مقداردهی اولیه یا سازنده  استفاده می شود؟
//کامپایلر جاوا بلوک مقداردهی اولیه نمونه را در سازنده پس از اولین super کپی می کند
public class InstanceInitializerBlock {
    //نام
    protected String name = "ParentDefault";

    /**
     * سازنده پدر
     */
    InstanceInitializerBlock() {
        this.name += ",ParentConstructor";
    }

    //Instance Initializer block
    //بلوک Initializer شیی
    {
        this.name += ",ParentInitializerBlock";
    }
}


class InstanceInitializerBlockChild extends InstanceInitializerBlock {
    /**
     * سازنده فرزند
     */
    InstanceInitializerBlockChild() {
        super();
        super.name += ",ChildConstructor";
    }

    //Instance Initializer block
    //بلوک Initializer شیی
    {
        super.name += ",ChildInitializerBlock";
    }

    /**
     * خروجی دهنده نام کلاس پدر
     *
     * @return خروجی: نام کلاس پدر
     */
    public String getSuperName() {
        return super.name;
    }
}