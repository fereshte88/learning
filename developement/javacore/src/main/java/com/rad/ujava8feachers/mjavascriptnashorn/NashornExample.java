package com.rad.ujava8feachers.mjavascriptnashorn;

import javax.script.*;
import java.io.FileReader;

/**
 * Nashorn is a JavaScript engine. It is used to execute JavaScript code dynamically at JVM (Java Virtual Machine).
 * Java provides a command-line tool jjs which is used to execute JavaScript code.
 * You can execute JavaScript code by using jjs command-line tool and by embedding into Java source code.
 * نشورن موتور جاوا اسکریپت است. برای اجرای کد جاوا اسکریپت به صورت پویا در JVM (ماشین مجازی جاوا) استفاده می شود.
 * جاوا jjs ابزار خط فرمان را ارائه می دهد که برای اجرای کد JavaScript استفاده می شود.
 * می توانید با استفاده از ابزار خط فرمان jjs و با وارد کردن کد منبع جاوا ، کد JavaScript را اجرا کنید.
 */
public class NashornExample {
    /**
     * Example: Executing by Using Terminal
     *
     * Following is the step by step process to execute JavaScript code at the JVM.
     *
     * 1) Create a file hello.js.
     *
     * 2) Write and save the following code into the file.
     *     var hello = function(){
     *         print("Hello Nashorn");
     *     };
     *     hello();
     *
     * 3) Open terminal
     *
     * 4) Write command jjs hello.js and press enter.
     *
     * After executing command, you will see the below output.
     *
     * Output:
     *
     * Hello Nashorn
     */
    /**
     * Example: Executing JavaScript file in Java Code
     *
     * You can execute JavaScript file directly from your Java file. In the following code, we are reading a file hello.js with the help of FileReader class.
     */
    public static void main1(String[] args) throws Exception{
        // Creating script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
        // Reading Nashorn file
        ee.eval(new FileReader("c:\\hello.js"));
    }
    /**
     * Example: Embedding JavaScript Code in Java Source File
     *
     * You can embed your JavaScript code in Java source file.
     * Java compiler will not complaint but it is not good practice when you have large source code. In the following example, we are evaluating JavaScript code.
     * می توانید کد جاوا اسکریپت خود را در فایل منبع جاوا تعبیه کنید.
     * کامپایلر جاوا شکایت نخواهد کرد اما وقتی کد منبع بزرگی دارید ، عمل خوب نیست. در مثال زیر ، ما در حال ارزیابی کد JavaScript هستیم.
     */
    public static void main2(String[] args) throws Exception{
        // Creating script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
        // Evaluating Nashorn code
        ee.eval("print('Hello Nashorn');");
    }
    /**
     * Example: Embedding JavaScript Expression
     *
     * You can embed JavaScript expressions and variables in JavaScript code. In the following code we are embedding a variable to string.
     * To execute this program you need to pass a flag -scripting in command-line.
     *   می توانید عبارات و متغیرهای JavaScript را در کد JavaScript جاسازی کنید.
     *   در کد زیر متغیر رشته را تعبیه می کنیم. برای اجرای این برنامه ، باید یک نقشه برداری از پرچم را در خط فرمان منتقل کنید.
     * File: hello.js
     *
     *     var hello = function(msg){
     *         print("Hello ${msg}");
     *     };
     *     hello("Nashron");
     *
     * Command: jjs -scripting hello.js
     *
     * Output:
     *
     * Hello Nashorn
     */
    /**
     * Heredocs
     *
     * In Nashorn, heredocs are simply multi-line strings. You can create it with << followed by a special termination marker, which is EOF.
     * You can also embed JavaScript expressions in ${...} expressions.
     *
     در Nashorn ، heredocs به سادگی رشته های چند خطی هستند. شما می توانید آن را با << ایجاد کنید و به دنبال آن یک نشانگر خاتمه ویژه ، که EOF است ، ایجاد کنید. همچنین می توانید عبارات JavaScript را با عبارات $ {... em جاسازی کنید.
     * Example : Heredocs in JavaScript File
     *
     * file: hello.js
     *
     *     var message = <<EOF
     *     This is a java script file
     *     it contains multiple lines
     *     of code.
     *     let's execute.
     *     EOF
     *     print(message)
     *
     * Command: jjs -scripting hello.js
     *
     * Output:
     *
     * This is a java script file
     * it contains multiple lines
     * of code.
     * let's execute.
     */
    /**
     * Example: Setting JavaScript variable in Java File
     *
     * You can pass value to JavaScript variable in the Java file. In the followed example, we are binding and passing variable to JavaScript file.
     *
     * File: hello.js
     *
     *     print("Hello "+name);
     */
    public static void main3(String[] args) throws Exception{
        // Creating script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
        //Binding script and Define scope of script
        Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);
        bind.put("name", "Nashorn");
        // Reading Nashorn file
        ee.eval("print(java.lang.Math.sqrt(4))");
    }
    /**
     * Import Java Package in JavaScript File
     *
     * Java provides a facility to import Java package inside the JavaScript code. Here, we are using two approaches to import Java packages.
     * جاوا امکان وارد کردن بسته Java در داخل کد JavaScript را فراهم می کند. در اینجا ، ما از دو رویکرد برای وارد کردن بسته های جاوا استفاده می کنیم.
     * Example1: Import Java Package in JavaScript File
     *
     * File: hello.js
     *
     *     print(java.lang.Math.sqrt(4));
     *
     * Output:
     *
     * 2
     */
    /**
     * Example2: Import Java Package in JavaScript File
     *
     * File: hello.js
     *
     *     var importFile = new JavaImporter(java.util);
     *     var a = new importFile.ArrayList();
     *     a.add(12);
     *     a.add(20);
     *     print(a);
     *     print(a.getClass());
     *
     * Output:
     *
     * [12, 20]
     * class java.util.ArrayList
     */
    /**
     * Example3: Import Java Package in JavaScript File
     *
     * you can import multiple packages at the same time.
     *
     * File: hello.js
     *
     *     var importIt = new JavaImporter(java.lang.String,java.util,java.io);
     *     with (importIt) {
     *       var linkedHS = new LinkedHashSet();
     *       linkedHS.add(new File("abc"));
     *       linkedHS.add(new File("hello.js"));
     *       linkedHS.add("india".toUpperCase());
     *     }
     *     print(linkedHS);
     *
     * Output:
     *
     * [abc, hello.js, INDIA]
     */
    /**
     * Calling JavaScript function inside Java code
     *
     * You can call JavaScript function inside the Java file. In the followed example, we are calling JavaScript functions.
     * Example: Calling function inside Java code
     *
     * File: hello.js
     *
     *     var functionDemo1 = function(){
     *         print("This is JavaScript function");
     *     }
     *     var functionDemo2 = function(message){
     *         print("Hello "+message);
     *     }
     */
    public static void main(String[] args) throws Exception{
        // Creating script engine
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
        // Reading Nashorn file
        ee.eval(new FileReader("c:\\hello.js"));
        Invocable invocable = (Invocable)ee;
        // calling a function
        invocable.invokeFunction("functionDemo1");
        // calling a function and passing variable as well.
        invocable.invokeFunction("functionDemo2","Nashorn");
    }
}
