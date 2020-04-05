//Java Program to demonstrate the use of static variable
/*
The static variable
can be used to refer to the common property of all objects
And
gets memory only once in the class area at the time of class loading.
And
it saves memory
 */
package com.rad.ajavaobjectclass.estatickeyword;

public class StudentStaticVariable {
    private int rollno;//instance variable
    private String name;
    public static String college ="ITS";//static variable
    //constructor
    public StudentStaticVariable(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    public String display (){return college;}
}
