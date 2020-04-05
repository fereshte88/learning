package com.rad.ajavaobjectclass.estatickeyword;
/*

    A static method belongs to the class rather than the object of a class.
    And can be invoked without the need for creating an instance of a class.
    And method can access static data member and can change the value of it.

    Restrictions for the static method:

    1.The static method can not use non static data member or call non-static method directly.
    2.this and super cannot be used in static context.

Q) Why is the Java main method static?

Ans) It is because the object is not required to call a static method.
 If it were a non-static method, JVM creates an object first then call main() method that will lead the problem of extra memory allocation.
 */
public class StudentStaticMethod {
    int rollno;
    String name;
    static String college = "ITS";
    //static method to change the value of static variable
    public static void change(){
        college = "BBDIT";
    }
    //constructor to initialize the variable
    StudentStaticMethod(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    public String display(){
        return college;
    }
}
