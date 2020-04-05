package com.rad.kjavainnerclass.canonymousinnerclass;
/*
A class that have no name is known as anonymous inner class in java.
It should be used if you have to override method of class or interface.
Java Anonymous inner class can be created by two ways:
    Class (may be abstract or concrete).
    Interface
کلاسی که هیچ نامی نداشته باشد در جاوا به عنوان کلاس داخلی ناشناس شناخته می شود.
 اگر مجبور به override کردن متد کلاس یا interface هستید باید از آن استفاده شود.
  کلاس داخلی جاوای ناشناس می تواند از دو طریق ایجاد شود:
     کلاس (ممکن است انتزاعی یا صریح باشد).
     interface

 */

class AnnonymousInner{
    public String msgFromClass(){
        Person p=new Person(){
            String eat(){
               String msg = "nice fruits";
                return msg;
            }
        };
        return p.eat();
    }
    public String msgFromInterface(){
        Eatable e=new Eatable() {
            public String eat() {
                return "nice food";
            }

        };
        return e.eat();
    }
}
/*
    A class is created but its name is decided by the compiler which extends the Person class and provides the implementation of the eat() method.
    An object of Anonymous class is created that is referred by p reference variable of Person type.
    کلاس ایجاد می شود اما نام آن توسط کامپایلر تصمیم گرفته می شود که کلاس Person را گسترش می دهد وپیاده سازی متد eat را فراهم می کند.
     یک شی از کلاس ناشناس ایجاد می شود که توسط متغیر مرجع p از نوع Person ارجاع می شود.
//---------------
    import java.io.PrintStream;
    static class AnonymousInner$1 extends Person
    {
       AnonymousInner$1(){}
       void eat()
        {
            System.out.println("nice fruits");
        }
    }
 */