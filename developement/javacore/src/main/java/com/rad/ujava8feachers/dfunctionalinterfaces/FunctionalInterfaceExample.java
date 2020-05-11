package com.rad.ujava8feachers.dfunctionalinterfaces;

/**
 * Java Functional Interfaces
 *
 * An Interface that contains exactly one abstract method is known as functional interface. It can have any number of default, static methods but can contain only one abstract method.
 * It can also declare methods of object class.
 *
 * Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces. It is a new feature in Java, which helps to achieve functional programming approach.
 *
 رابط که دقیقاً یک متد انتزاعی دارد به عنوان رابط کاربری شناخته می شود.
 این می تواند هر تعداد متد پیش فرض و ایستا داشته باشد اما فقط شامل یک متد انتزاعی است. همچنین می تواند متدهای کلاس شی را اعلام کند.

 رابط کارکردی همچنین به عنوان رابطهای متد انتزاعی یا رابطهای SAM معروف است. این یک ویژگی جدید در جاوا است که به دستیابی به رویکرد برنامه نویسی کاربردی کمک می کند.

 */

/**
 * Java Predefined-Functional Interfaces
 *
 * Java provides predefined functional interfaces to deal with functional programming by using lambda and method references.
 *
 * You can also define your own custom functional interface. Following is the list of functional interface which are placed in java.util.function package.
 * جاوا رابطهای کاربردی از پیش تعریف شده ای برای مقابله با برنامه نویسی کاربردی با استفاده از منابع لامبدا و متد ارائه می دهد.
 *
 * همچنین می توانید رابط کاربری سفارشی خود را تعریف کنید. در زیر لیستی از رابط کاربری که در بسته java.util.function قرار داده شده است.
 * BiConsumer<T,U>
 * It represents an operation that accepts two input arguments and returns no result.
 * این نمایانگر عملی است که دو آرگومان ورودی را می پذیرد و نتیجه ای به دست نمی آورد.
 * Consumer<T>
 * It represents an operation that accepts a single argument and returns no result.
 * این نمایانگر عملی است که یک استدلال واحد را می پذیرد و نتیجه ای ندارد.
 * Function<T,R>
 * It represents a function that accepts one argument and returns a result.
 * این تابعی است که یک استدلال را می پذیرد و نتیجه را برمی گرداند.
 * Predicate<T>
 * It represents a predicate (boolean-valued function) of one argument.
 * این یک گزاره (عملکرد ارزشمند boolean) یک آرگومان را نشان می دهد.
 * BiFunction<T,U,R>
 * It represents a function that accepts two arguments and returns a a result.
 * این تابعی است که دو آرگومان را می پذیرد و نتیجه را برمی گرداند.
 * BinaryOperator<T>
 * It represents an operation upon two operands of the same data type. It returns a result of the same type as the operands.
 * این نمایانگر عملیاتی است بر دو عملگر از نوع داده مشابه. این نتیجه ای را از همان نوع عملوندها برمی گرداند.
 * BiPredicate<T,U>
 * It represents a predicate (boolean-valued function) of two arguments.
 * این یک گزاره (عملکرد ارزشمند boolean) از دو آرگومان را نشان می دهد.
 * BooleanSupplier
 * It represents a supplier of boolean-valued results.
 * این نماینده تامین کننده نتایج دارای ارزش بولی است.
 * DoubleBinaryOperator
 * It represents an operation upon two double type operands and returns a double type value.
 * این عملكرد را بر روی دو عملكرد دوتایی نشان می دهد و مقدار دو برابر را برمی گرداند.
 * DoubleConsumer
 * It represents an operation that accepts a single double type argument and returns no result.
 * این نمایانگر عملی است که یک آرگومان از نوع دوتایی را می پذیرد و نتیجه ای ندارد.
 * DoubleFunction<R>
 * It represents a function that accepts a double type argument and produces a result.
 * این تابعی است که یک آرگومان از نوع دو را می پذیرد و نتیجه ای را تولید می کند.
 * DoublePredicate
 * It represents a predicate (boolean-valued function) of one double type argument.
 * این یک گزاره (عملکرد ارزش بولی) از یک آرگومان از نوع دو را نشان می دهد.
 * DoubleSupplier
 * It represents a supplier of double type results.
 * این نماینده ارائه دهنده نتایج از نوع دوتایی است.
 * DoubleToIntFunction
 * It represents a function that accepts a double type argument and produces an int type result.
 * این تابعی است که یک آرگومان از نوع دو را می پذیرد و نتیجه نوع int را تولید می کند.
 * DoubleToLongFunction
 * It represents a function that accepts a double type argument and produces a long type result.
 * این تابعی است که یک آرگومان از نوع دو را می پذیرد و نتیجه نوع طولانی را تولید می کند.
 * DoubleUnaryOperator
 * It represents an operation on a single double type operand that produces a double type result.
 * این عملكرد را روی یك عملكرد دوتایی منفرد نشان می دهد كه نتیجه نوع دومی را ایجاد می كند.
 * IntBinaryOperator
 * It represents an operation upon two int type operands and returns an int type result.
 * این یک عملكرد بر روی دو عملكرد نوع int است و نتیجه نوع int را برمی گرداند.
 * IntConsumer
 * It represents an operation that accepts a single integer argument and returns no result.
 * این نمایانگر عملی است که یک آرگومان عدد صحیح را می پذیرد و نتیجه ای به دست نمی دهد.
 * IntFunction<R>
 * It represents a function that accepts an integer argument and returns a result.
 * این تابعی است که یک آرگومان عدد صحیح را می پذیرد و نتیجه را برمی گرداند.
 * IntPredicate
 * It represents a predicate (boolean-valued function) of one integer argument.
 * این یک گزاره (عملکرد ارزش بولی) از یک آرگومان عدد صحیح را نشان می دهد.
 * IntSupplier
 * It represents a supplier of integer type.
 * این نماینده یک نوع عدد صحیح است.
 * IntToDoubleFunction
 * It represents a function that accepts an integer argument and returns a double.
 * این تابعی است که یک آرگومان عدد صحیح را می پذیرد و یک دو برابر را برمی گرداند.
 * IntToLongFunction
 * It represents a function that accepts an integer argument and returns a long.
 * این تابعی است که یک آرگومان عدد صحیح را می پذیرد و مدت زیادی را برمی گرداند.
 * IntUnaryOperator
 * It represents an operation on a single integer operand that produces an integer result.
 * این نمایانگر عملیاتی بر روی یک ارکان عدد صحیح است که نتیجه عدد صحیحی را ایجاد می کند.
 * LongBinaryOperator
 * It represents an operation upon two long type operands and returns a long type result.
 * این عملكرد را بر روی دو عملكرد از نوع بلند نشان می دهد و نتیجه نوع طولانی را برمی گرداند.
 * LongConsumer
 * It represents an operation that accepts a single long type argument and returns no result.
 * این نمایانگر عملی است که یک آرگومان نوع طولانی را می پذیرد و نتیجه ای ندارد.
 * LongFunction<R>
 * It represents a function that accepts a long type argument and returns a result.
 * این عملکردی را نشان می دهد که یک آرگومان نوع طولانی را می پذیرد و نتیجه را برمی گرداند.
 * LongPredicate
 * It represents a predicate (boolean-valued function) of one long type argument.
 * این یک گزاره (عملکرد ارزشمند بولی) از یک آرگومان نوع طولانی را نشان می دهد.
 * LongSupplier
 * It represents a supplier of long type results.
 * این نماینده تامین کننده نتایج نوع طولانی است.
 * LongToDoubleFunction
 * It represents a function that accepts a long type argument and returns a result of double type.
 * این تابعی است که یک آرگومان نوع طولانی را می پذیرد و نتیجه ای از نوع دوتایی را برمی گرداند.
 * LongToIntFunction
 * It represents a function that accepts a long type argument and returns an integer result.
 * این تابعی است که یک آرگومان از نوع طولانی را می پذیرد و نتیجه عدد صحیح را برمی گرداند.
 * LongUnaryOperator
 * It represents an operation on a single long type operand that returns a long type result.
 * این نمایانگر عملیاتی بر روی یک عملوند نوع طولانی است که نتیجه نوع طولانی را برمی گرداند.
 * ObjDoubleConsumer<T>
 * It represents an operation that accepts an object and a double argument, and returns no result.
 * این نمایانگر عملی است که یک مفعول و یک استدلال مضاعف را می پذیرد و نتیجه ای ندارد.
 * ObjIntConsumer<T>
 * It represents an operation that accepts an object and an integer argument. It does not return result.
 * این نمایانگر عملی است که یک شیء و یک استدلال صحیح را می پذیرد. نتیجه آن بر نمی گردد.
 * ObjLongConsumer<T>
 * It represents an operation that accepts an object and a long argument, it returns no result.
 * این نمایانگر عملی است که یک شیء و یک استدلال طولانی را می پذیرد ، نتیجه ای ندارد.
 * Supplier<T>
 * It represents a supplier of results.
 * این نماینده تامین کننده نتایج است.
 * ToDoubleBiFunction<T,U>
 * It represents a function that accepts two arguments and produces a double type result.
 * این عملکردی را نشان می دهد که دو آرگومان را می پذیرد و نتیجه ای از نوع دوتایی ایجاد می کند.
 * ToDoubleFunction<T>
 * It represents a function that returns a double type result.
 * این عملکردی را نشان می دهد که یک نتیجه از نوع دوتایی را برمی گرداند.
 * ToIntBiFunction<T,U>
 * It represents a function that accepts two arguments and returns an integer.
 * این تابعی است که دو آرگومان را می پذیرد و عدد صحیح را برمی گرداند.
 * ToIntFunction<T>
 * It represents a function that returns an integer.
 * این عملکردی را نشان می دهد که یک عدد صحیح را برمی گرداند.
 * ToLongBiFunction<T,U>
 * It represents a function that accepts two arguments and returns a result of long type.
 * این تابعی است که دو آرگومان را می پذیرد و نتیجه ای از نوع طولانی را برمی گرداند.
 * ToLongFunction<T>
 * It represents a function that returns a result of long type.
 * این عملکردی را نشان می دهد که نتیجه ای از نوع طولانی را برمی گرداند.
 * UnaryOperator<T>
 * It represents an operation on a single operand that returnsa a result of the same type as its operand.
 * این نمایانگر عملیاتی است که در یک اپرند واحد انجام می شود و نتیجه ای از همان نوع عملگر خود را برمی گرداند.
 */

public class FunctionalInterfaceExample {
    //****************************************************************
    @FunctionalInterface
    interface sayable{
        String say(String msg);
    }
    public class FunctionalInterfaceExample1 implements sayable{
        public String say(String msg){
            return msg;
        }
        public String saySomthing(String msg) {
            FunctionalInterfaceExample1 fie = new FunctionalInterfaceExample1();
            return fie.say(msg);
        }
    }
    //****************************************************************
    /**
     * A functional interface can have methods of object class. See in the following example.
     */
    @FunctionalInterface
    interface sayable2{
        String say(String msg);   // abstract method
        // It can contain any number of Object class methods.
        int hashCode();
        String toString();
        boolean equals(Object obj);
    }
    public class FunctionalInterfaceExample2 implements sayable2{
        public String say(String msg){
            return msg;
        }
        public  String saysomthing2(String msg) {
            FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();
            return fie.say(msg);
        }
    }

    //****************************************************************
    /**
     * Invalid Functional Interface
     *
     * A functional interface can extends another interface only when it does not have any abstract method.
     * رابط کاربری فقط در صورت عدم استفاده از هر روش انتزاعی ، می تواند یک رابط دیگر را گسترش دهد.
     */
    interface sayable3{
        void say(String msg);   // abstract method
    }
   // @FunctionalInterface
    interface Doable extends sayable3{
        // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface
        void doIt();
    }//compile-time error

    //****************************************************************
    /**
     * In the following example, a functional interface is extending to a non-functional interface.
     */
    interface Doable1{
        default String doIt(){
            return "Do it now";
        }
    }
    @FunctionalInterface
    interface Sayable4 extends Doable1{
        String say(String msg);   // abstract method
    }
    public class FunctionalInterfaceExample3 implements Sayable4{
        public String say(String msg){
            return msg;
        }
        public  String saySomthing3(String msg) {
            FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();
            return fie.doIt()+" "+fie.say(msg);
        }
    }
}
