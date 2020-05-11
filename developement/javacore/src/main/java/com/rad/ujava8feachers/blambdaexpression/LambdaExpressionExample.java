package com.rad.ujava8feachers.blambdaexpression;

/**
 * Lambda expression is a new and important feature of Java which was included in Java SE 8.
 * It provides a clear and concise way to represent one method interface using an expression. It is very useful in collection library.
 * It helps to iterate, filter and extract data from collection.
 *بیان لامبدا یکی از ویژگی های جدید و مهم جاوا است که در Java SE 8 گنجانده شده است.
 *  این یک روش روشن و مختصر برای نشان دادن یک method interface با استفاده از یک عبارت است. در کتابخانه collection بسیار مفید است.
 *  این به iterate ، فیلتر و استخراج داده ها از مجموعه کمک می کند.
 * The Lambda expression is used to provide the implementation of an interface which has functional interface.
 * It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation.
 * Here, we just write the implementation code.
 *
 * Java lambda expression is treated as a function, so compiler does not create .class file.
 * عبارت Lambda برای ارائه یك رابط كه دارایfunctional interface است ، استفاده می شود. موجب صرفه جویی در بسیاری از کد ها می شود.
 * در صورت بروز لامبدا ، ما نیازی به تعریف مجدد متد برای ارائه اجرای آن نداریم. در اینجا ، ما فقط کد اجرای را می نویسیم.
 *
 * بیان جاوا لامبدا به عنوان یک تابع مورد استفاده قرار می گیرد ، بنابراین کامپایلر فایل .class را ایجاد نمی کند.
 */

/**
 * Functional Interface
 *
 * Lambda expression provides implementation of functional interface. An interface which has only one abstract method is called functional interface.
 * Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.
 * بیان لامبدا اجرای رابط کاربری را فراهم می کند. رابط که تنها یک متد انتزاعی دارد functional interface نامیده می شود.
 * جاواanotation حاشیه نویسیFunctionalInterface را ارائه می دهد ، که برای اعلام واسط به عنوانfunctional interface استفاده می شود.
 */

/**
 * Why use Lambda Expression
 *
 *     To provide the implementation of Functional interface.
 *     Less coding.
 */

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Java Lambda Expression Syntax
 *
 *     (argument-list) -> {body}
 *
 * Java lambda expression is consisted of three components.
 *
 * 1) Argument-list: It can be empty or non-empty as well.
 *
 * 2) Arrow-token: It is used to link arguments-list and body of expression.
 *
 * 3) Body: It contains expressions and statements for lambda expression.
 *
 بیان لامبدا جاوا از سه مؤلفه تشکیل شده است.

 1) آرگومان لیست: می تواند خالی یا غیر خالی باشد.

 2) Arrow-token: از آن برای پیوند دادن آرگومان-لیست و بدنه بیان استفاده می شود.

 3) بدن: این شامل عبارات و عبارات برای بیان لامبدا است.

 * No Parameter Syntax
 *
 *     () -> {
 *     //Body of no parameter lambda
 *     }
 *
 * One Parameter Syntax
 *
 *     (p1) -> {
 *     //Body of single parameter lambda
 *     }
 *
 * Two Parameter Syntax
 *
 *     (p1,p2) -> {
 *     //Body of multiple parameter lambda
 *     }
 */

public class LambdaExpressionExample {
    String result = "";
    //**********************************************************
    interface Drawable{
        public String draw();
    }
    public String withoutLambda(int width) {

        //without lambda, Drawable implementation using anonymous class
        Drawable d=new Drawable(){
            public String draw(){return "Drawing without lambda"+width;}
        };
        return d.draw();
    }
    //**********************************************************
    @FunctionalInterface  //It is optional
    interface Drawable1{
        public String draw();
    }
    public String withLambda(int width) {
        //with lambda
        Drawable1 d2=()->{
            return "Drawing with lambda"+width;
        };
        return d2.draw();
    }
    //**********************************************************
    interface Sayable{
        public String say();
    }
    public String noParameter() {
        Sayable s=()->{
            return "I have nothing to say.";
        };
        return s.say();
    }
    //**********************************************************
    interface Sayable1{
        public String say(String name);
    }
    public String singleParameter() {

        // Lambda expression with single parameter.
        Sayable1 s1=(name)->{
            return "Hello, "+name;
        };


        // You can omit function parentheses
        Sayable1 s2= name ->{
            return "without parentheses Hello, "+name;
        };
        return s2.say("Sonoo")+" **"+s1.say("Sonoo");
    }
    //**********************************************************
    interface Addable{
        int add(int a,int b);
    }

    public int multipleParameters (int x, int y) {

        // Multiple parameters in lambda expression
        Addable ad1=(a,b)->(a+b);
        // Multiple parameters with data type in lambda expression
        Addable ad2=(int a,int b)->(a+b);
        return ad2.add(x,y)+ad1.add(x,y);
    }
    //**********************************************************
    public String ForeachLoop(List<String> list) {
        this.result = "";
                list
                .stream()
                .forEach((item)-> this.append(item));
        return this.result;
    }
    public  void append(String s){
        this.result +=s+",";
    }
    //**********************************************************
    @FunctionalInterface
    interface Sayable2{
        String say(String message);
    }
    public String multipleStatements(String str) {

        // You can pass multiple statements in lambda expression
        Sayable2 person = (message)-> {
            String str1 = str;
            String str2 = str1 + message;
            return str2;
        };
        return person.say("time is precious.");
    }
    //**********************************************************
    public void threadExample() {

        //Thread Example without lambda
        Runnable r1=new Runnable(){
            public void run(){
                System.out.println("Thread1 is running...");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
        //Thread Example with lambda
        Runnable r2=()->{
            System.out.println("Thread2 is running...");
        };
        Thread t2=new Thread(r2);
        t2.start();
    }
    //**********************************************************
    class Product{
        int id;
        String name;
        float price;
        public Product(int id, String name, float price) {
            super();
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }
    public  String comparator() {
        List<Product> list=new ArrayList<Product>();
        String listString="";
        //Adding Products
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(3,"Keyboard",300f));
        list.add(new Product(2,"Dell Mouse",150f));

        // implementing lambda expression
        Collections.sort(list,(p1, p2)->{
            return p1.name.compareTo(p2.name);
        });
        for(Product p:list){
            listString= listString+" - "+ p.id+" "+p.name+" "+p.price;
        }
        return listString;
    }
    /*
    2 Dell Mouse 150.0
1 HP Laptop 25000.0
3 Keyboard 300.0

     */
    //**********************************************************
    public String filterCollectionData() {

        List<Product> list=new ArrayList<Product>();
        list.add(new Product(1,"Samsung A5",17000f));
        list.add(new Product(3,"Iphone 6S",65000f));
        list.add(new Product(2,"Sony Xperia",25000f));
        list.add(new Product(4,"Nokia Lumia",15000f));
        list.add(new Product(5,"Redmi4 ",26000f));
        list.add(new Product(6,"Lenevo Vibe",19000f));

        // using lambda to filter data
        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);
        // using lambda to iterate through collection
        String result = list
                .stream()
                .filter(p -> p.price > 20000)
                .map(product -> product.name+": "+product.price)
                .collect(Collectors.joining(","));
//        filtered_data.forEach(
//                product -> product.name+": "+product.price
//        );
        return result;
    }
    //**********************************************************
    public  void eventListener() {
        JTextField tf=new JTextField();
        tf.setBounds(50, 50,150,20);
        JButton b=new JButton("click");
        b.setBounds(80,100,70,30);

        // lambda expression implementing here.
        b.addActionListener(e-> {tf.setText("hello swing");});

        JFrame f=new JFrame();
        f.add(tf);f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(300, 200);
        f.setVisible(true);

    }
}
