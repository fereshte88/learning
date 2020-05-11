package com.rad.ujava8feachers.otypeinference;

/**
 * Type inference is a feature of Java which provides ability to compiler to look at each method invocation and corresponding declaration to determine the type of arguments.
 * Java provides improved version of type inference in Java 8. the following example explains, how we can use type inference in our code:
 * Here, we are creating arraylist by mentioning integer type explicitly at both side. The following approach is used earlier versions of Java.
 * استنتاج نوع یکی از ویژگیهای جاوا است که امکان مشاهده هر فراخوانی متد و اظهارات مربوطه برای تعیین نوع آرگومان ها برای کامپایلر فراهم می کند.
 *
 * جاوا نسخه بهبود یافته نوع استنتاج را در جاوا 8 ارائه می دهد. مثال زیر توضیح می دهد که چگونه می توان از نوع استنباط در کد ما استفاده کرد:
 *
 * در اینجا ، ما با ذکر نوع عدد صحیح در هر دو طرف ، آرایه لیست را ایجاد می کنیم. روش زیر از نسخه های اولیه جاوا استفاده شده است.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *     List<Integer> list = new ArrayList<Integer>();
 *
 * In the following declaration, we are mentioning type of arraylist at one side.
 * This approach was introduce in Java 7. Here, you can left second side as blank diamond and compiler will infer type of it by type of reference variable.
 * در بیانیه زیر ، ما به نوع آرایه لیست در یک طرف اشاره می کنیم. این رویکرد در جاوا 7 معرفی شده است.
 * در اینجا ، شما می توانید از سمت دوم به عنوان الماس خالی استفاده کنید و کامپایلر نوع آن را براساس نوع متغیر مرجع استنباط می کند.
 *
 *     List<Integer> list2 = new ArrayList<>();
 *
 * Improved Type Inference
 *
 * In Java 8, you can call specialized method without explicitly mentioning of type of arguments.
 *در جاوا 8 می توانید بدون ذکر صریح نوع آرگومان ها ، متد تخصصی  را فراخوانی کنید.
 *     showList(new ArrayList<>());
 */
public class TypeInferenceExample {
    public static void showList(List<Integer> list){
        if(!list.isEmpty()){
            list.forEach(System.out::println);
        }else System.out.println("list is empty");
    }
    public static void main(String[] args) {
        // An old approach(prior to Java 7) to create a list
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(11);
        showList(list1);
        // Java 7
        List<Integer> list2 = new ArrayList<>(); // You can left it blank, compiler can infer type
        list2.add(12);
        showList(list2);
        // Compiler infers type of ArrayList, in Java 8
        showList(new ArrayList<>());
        //*************************************************generic
        GenericClass<String> genericClass = new GenericClass<String>();
        genericClass.setName("Peter");
        System.out.println(genericClass.getName());

        GenericClass<String> genericClass2 = new GenericClass<>();
        genericClass2.setName("peter");
        System.out.println(genericClass2.getName());

        // New improved type inference
        System.out.println(genericClass2.genericMethod(new GenericClass<>()));
    }
    //You can also create your own custom generic class and methods. In the following example, we are creating our own generic class and method.
    static class GenericClass<X> {
        X name;
        public void setName(X name){
            this.name = name;
        }
        public X getName(){
            return name;
        }
        public String genericMethod(GenericClass<String> x){
            x.setName("John");
            return x.name;
        }
    }
}
