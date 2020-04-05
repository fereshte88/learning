package com.motaharinia.javacore.djavaabstraction.aabstractclass;

//Abstract class in Java:
//A class which is declared with the abstract keyword is known as an abstract class in Java.
//It can have abstract and non-abstract methods (method with the body).
//It needs to be extended and its method implemented. It cannot be instantiated.
//کلاس چکیده در جاوا:
//کلاس که با کلمه کلیدی abstract اعلام شده است ، به عنوان یک کلاس انتزاعی در جاوا شناخته می شود.
//می تواند دارای متدهای انتزاعی و غیر انتزاعی باشد (متد با بدنه).
//باید extend شود و متد آن پیاده سازی شود. نمی توان آنرا نمونه گیری کرد.
//
//Abstraction in Java:
//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//Another way, it shows only essential things to the user and hides the internal details,
// for example, sending SMS where you type the text and send the message.
//You don't know the internal processing about the message delivery.
//Abstraction lets you focus on what the object does instead of how it does it.
//There are two ways to achieve abstraction in java:
//1.Abstract class (0 to 100%)
//2.Interface (100%)
//انتزاع در جاوا:
//انتزاع فرآیندی است برای مخفی کردن جزئیات اجرای و نشان دادن تنها کارایی به کاربر.
//روش دیگر ، فقط موارد ضروری را به کاربر نشان می دهد و جزئیات داخلی را پنهان می کند ،
//به عنوان مثال ارسال پیامک در جایی که متن را تایپ می کنید و پیام را ارسال می کنید.
//شما پردازش داخلی در مورد ارسال پیام را نمی دانید.
//انتزاع به شما امکان می دهد به جای اینکه چگونه آن را انجام دهد ، روی آنچه که شی انجام می دهد متمرکز شوید.
//برای رسیدن به انتزاع در جاوا دو راه وجود دارد:
//1. کلاس انتزاعی (0 تا 100٪)
//2. رابط (100٪)
//
//Points to Remember:
//An abstract class must be declared with an abstract keyword.
//It can have abstract and non-abstract methods.
//It cannot be instantiated.
//It can have constructors and static methods also.
//It can have final methods which will force the subclass not to change the body of the method.
//نکاتی برای به خاطر سپردن:
//کلاس انتزاعی باید با یک کلمه کلیدی abstract اعلام شود.
//می تواند متدهای انتزاعی و غیر انتزاعی داشته باشد.
//نمی توان آنرا نمونه گیری کرد.
//همچنین می تواند دارای سازنده و متد استاتیک نیز باشد.
//می تواند متد نهایی داشته باشد که باعث می شود زیر کلاس نتواند بدنه متد را تغییر دهد.
//
//Rule: If there is an abstract method in a class, that class must be abstract.
//قانون: اگر در یک کلاس یک متد انتزاعی وجود داشته باشد ، آن کلاس باید انتزاعی باشد.
//
//The abstract class can also be used to provide some implementation of the interface.
//In such case, the end user may not be forced to override all the methods of the interface.
//کلاس انتزاعی همچنین می تواند برای ارائه برخی از اجرای رابط مورد استفاده قرار گیرد.
//در چنین شرایطی ، کاربر نهایی ممکن است مجبور نباشد که تمام متدهای رابط را override کند.
interface MovementDevice {
    public String powerOn();
    public String run();
    public String stop();
}


public abstract class Bike implements MovementDevice {

    //شماره دنده موتورسیکلت
    private Integer gearNo;

    /**
     * سازنده کلاس انتزاعی
     */
    Bike() {
        this.gearNo = 0;
    }

    /**
     * متدی از اینترفیس که با پیاده سازی در کلاس انتزاعی نیاز نیست در کلاس فرزند override بشود
     * @return خروجی: نتیجه
     */
    public String powerOn(){
        return ("Bike.powerOn");
    }


    /**
     * Abstract Method in Java:
     * A method which is declared as abstract and does not have implementation is known as an abstract method.
     * متد چکیده در جاوا:
     * متدی که به عنوان abstract اعلام شده و پیاده سازی شده نیست ، به عنوان یک متد انتزاعی شناخته می شود.
     * @return خروجی: نتیجه
     */
    public abstract String run();

    /**
     * متد افزایش دهنده دنده موتورسیکلت
     */
    void gearIncrease() {
        System.out.println("gear changed");
    }
}


//Creating a Child class which inherits Abstract class
//ایجاد یک کلاس کودک که از کلاس انتزاعی  ارث می برد
class Honda extends Bike {
    @Override
    public String run() {
        return ("Honda.run");
    }

    @Override
    public String stop() {
        return ("Honda.stop");
    }


}