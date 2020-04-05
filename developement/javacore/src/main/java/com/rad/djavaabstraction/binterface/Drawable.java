package com.rad.djavaabstraction.binterface;


public interface Drawable {
    /**
     * Java 8 Default Method in Interface
     * Since Java 8, we can have method body in interface. But we need to make it default method.
     * متد پیش فرض جاوا 8 در رابط
     * از جاوا 8 ، ما می توانیم بدنه متد را در رابط داشته باشیم. اما ما باید آن را به متد default تبدیل کنیم.
     *
     * @return خروجی: نتیجه
     */
    default String defaultMethod() {
        return ("defaultMethod");
    }

    /**
     * Java 8 Static Method in Interface
     * Since Java 8, we can have static method in interface.
     * متد Static جاوا 8 در رابط
     * از جاوا 8 ، ما می توانیم متد استاتیک در رابط داشته باشیم.
     *
     * @param x عدد ورودی
     * @return خروجی: حجم
     */
    static Integer cube(Integer x) {
        return x * x * x;
    }
}
