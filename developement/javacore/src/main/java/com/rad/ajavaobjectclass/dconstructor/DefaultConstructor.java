/*
a constructor is a block of codes similar to the method.
 It is called when an instance of the class is created.
  At the time of calling constructor, memory for the object is allocated in the memory.
  It is used to initialize the object.
 */
/*
rules defined for the constructor.

    1.Constructor name must be the same as its class name
    2.A Constructor must have no explicit return type
    3.A Java constructor cannot be abstract, static, final, and synchronized

 */
/*
types of constructors in Java:

    1.Default constructor (no-arg constructor)
    2.Parameterized constructor

 */
//A constructor is called "Default Constructor" when it doesn't have any parameter.
package com.rad.ajavaobjectclass.dconstructor;

public class DefaultConstructor {
    int id;
    String name;
    public DefaultConstructor() {
        System.out.println("first call");
    }

}
/*
differences between constructors and methods. They are given below.
Java Constructor	Java Method
A constructor is used to initialize the state of an object.	A method is used to expose the behavior of an object.
A constructor must not have a return type.	A method must have a return type.
The constructor is invoked implicitly.	The method is invoked explicitly.
The Java compiler provides a default constructor if you don't have any constructor in a class.	The method is not provided by the compiler in any case.
The constructor name must be same as the class name.	The method name may or may not be same as the class name.
 */