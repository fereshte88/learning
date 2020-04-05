package com.motaharinia.javacore.ajavaobjectclass.cobjectandclass;

//There are 3 ways to initialize object in Java.
//By reference variable
//By method
//By constructor
//3 روش برای مقداردهی اولیه شی در جاوا وجود دارد.
//توسط متغیر مرجع
//توسط متد
//توسط سازنده
public class ObjectInitialize {
    //شناسه
    public Integer id;

    /**
     * متد مقداردهی اولیه کلاس
     *
     * @param id شناسه
     */
    void insertRecord(Integer id) {
        this.id = id;
    }

    /**
     * سازنده با مقداردهی اولیه
     *
     * @param id شناسه
     */
    public ObjectInitialize(Integer id) {
        this.id = id;
    }

    /**
     * سازنده پیش فرض
     */
    public ObjectInitialize() {
    }

}