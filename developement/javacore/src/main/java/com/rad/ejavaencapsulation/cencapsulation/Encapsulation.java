package com.rad.javacore.ejavaencapsulation.cencapsulation;

//https://www.javatpoint.com/encapsulation
//Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.
//We can create a fully encapsulated class in Java by making all the data members of the class private.
//Now we can use setter and getter methods to set and get the data in it.
//The Java Bean class is the example of a fully encapsulated class.
//كپسوله كردن در جاوا فرايند بسته كردن كد و داده ها در يك واحد واحد است ، براي مثال ، يك كپسول كه از چند دارو مخلوط مي شود.
//با خصوصی سازی تمام اعضای داده کلاس می توانیم یک کلاس کاملاً محصور در جاوا ایجاد کنیم.
//اکنون می توانیم از متد های setter و getter برای تنظیم و دریافت داده ها در آن استفاده کنیم.
//کلاس Java Bean نمونه ای از کلاس کاملاً محصور شده است.
//
//Advantage of Encapsulation in Java
//By providing only a setter or getter method, you can make the class read-only or write-only.
//In other words, you can skip the getter or setter methods.
//It provides you the control over the data.
//Suppose you want to set the value of id which should be greater than 100 only, you can write the logic inside the setter method.
//You can write the logic not to store the negative numbers in the setter methods.
//It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.
//The encapsulate class is easy to test. So, it is better for unit testing.
//The standard IDE's are providing the facility to generate the getters and setters.
//So, it is easy and fast to create an encapsulated class in Java.
//مزیت Encapsulation در جاوا:
//با ارائه فقط یک متد setter یا getter ، می توانید کلاس را فقط برای خواندن یا فقط برای نوشتن درست کنید.
//به عبارت دیگر ، می توانید از متد های getter یا setter پرش کنید.
//این کنترل را بر روی داده ها فراهم می کند.
//فرض کنید می خواهید مقدار شناسه را که باید بیشتر از 100 باشد ، ست کنید ، می توانید منطق را درون متد setter بنویسید.
//می توانید منطقی را برای ذخیره شماره های منفی در متد های setter بنویسید.
//این راهی برای دستیابی به پنهان کردن داده ها در جاوا است زیرا کلاس دیگر نمی تواند از طریق اعضای داده های خصوصی به داده ها دسترسی پیدا کند.
//كلاس كپسوله شده برای تست بهتر است ، پس برای یونیت تست بهتر است.
//نرم افزاهای IDE استاندارد تسهیلاتی را برای تولید getter و setter فراهم می کند.
//بنابراین ، ایجاد کلاس محصور در جاوا آسان و سریع است.
public class Encapsulation {
    //شناسه
    private Integer id;

    /**
     * متد دریافت کننده شناسه
     *
     * @return خروجی: شناسه
     */
    public Integer getId() {
        return id;
    }

    /**
     * متد تنظیم کننده شناسه
     *
     * @param id شناسه
     */
    public void setId(Integer id) {
        this.id = id;
    }

}


//Read-Only class:
//you can't change the value of the data member which is 10.
//کلاس فقط-خواندنی
//شما نمی توانید مقدار عضو داده را که 10 است تغییر دهید.
class ReadOnlyClass {
    //شناسه
    private Integer id = 10;

    /**
     * متد دریافت کننده شناسه
     *
     * @return خروجی: شناسه
     */
    public Integer getId() {
        return id;
    }
}

//Write-Only class:
//you can't get the value of the class data member, you can only change the value of class data member.
//کلاس فقط-نوشتنی
//شما نمی توانید ارزش عضو داده کلاس را بدست آورید ، فقط می توانید ارزش عضو داده کلاس را تغییر دهید.
class WriteOnlyClass {
    //شناسه
    private Integer id;

    /**
     * متد تنظیم کننده شناسه
     *
     * @param id شناسه
     */
    public void setId(Integer id) {
        this.id = id;
    }
}