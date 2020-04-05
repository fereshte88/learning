package com.motaharinia.javacore.cjavapolymorphism.iinstanceofoperator;


//InstanceOf:
//The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
//The instanceof in java is also known as type comparison operator because it compares the instance with type.
//It returns either true or false. If we apply the instanceof operator with any variable that has null value, it returns false.
// از عملگر instanceof برای آزمایش اینکه شی نمونه ای از نوع مشخص شده (کلاس یا زیر کلاس یا interface) باشد استفاده می شود.
// عملگر instanceof در جاوا به عنوان عملگر مقایسه نوع نیز شناخته می شود زیرا نمونه را با نوع مقایسه می کند.
// این عملگر خروجی درست یا نادرست خروجی میدهد. اگر عملگر instanceof را با هر متغیری که مقدار null داشته باشد اعمال می کنیم ، آن را نادرست برمی گرداند.
//
//Downcasting with java instanceof operator:
//When Subclass type refers to the object of Parent class, it is known as downcasting. If we perform it directly, compiler gives Compilation error.
//If you perform it by typecasting, ClassCastException is thrown at runtime. But if we use instanceof operator, downcasting is possible.
//انجام Downcasting با عملگر instanceof جاوا:
// هنگامی که نوع Subclass به شیی کلاس والد اشاره دارد ، به عنوان downcasting شناخته می شود. اگر مستقیماً آن را انجام دهیم ، کامپایلر خطای کامپایل را می دهد.
// اگر آن را با typecasting انجام دهید ، ClassCastException در زمان اجرا پرتاب می شود. اما اگر از عملگر instanceof استفاده کنیم ، downcasting امکان پذیر است.
//Dog d=new Animal(); Compilation error
//Dog d=(Dog)new Animal(); Compiles successfully but ClassCastException is thrown at runtime
public class InstanceOf {

    /**
     * متد بررسی نوع شیی با کلاس پدر خود
     *
     * @return خروجی: درست یا نادرست
     */
    public Boolean checkInstanceOfWithParent() {
        Animal cat = new Cat();
        return cat instanceof Animal;
    }

    /**
     * متد بررسی نوع شیی با null
     *
     * @return خروجی: درست یا نادرست
     */
    public Boolean checkInstanceOfWithNull() {
        Cat cat = null;
        return cat instanceof Cat;
    }

    /**
     * این متد Downcasting با استفاده از instanceof را بررسی میکند
     *
     * @param animal شیی حیوان
     * @return خروجی: درست یا نادرست
     */
    public Boolean checkDowncastingWithInstanceof(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;//downcasting
            return true;
        } else {
            return false;
        }
    }

    /**
     * این متد Downcasting بدون استفاده از instanceof را بررسی میکند
     *
     * @param animal شیی حیوان
     * @return خروجی: درست یا نادرست
     */
    public Boolean checkDowncastingWithoutInstanceof(Animal animal) {
        Cat cat = (Cat) animal;
        return true;
    }
}


class Animal {
}

class Cat extends Animal {
}

