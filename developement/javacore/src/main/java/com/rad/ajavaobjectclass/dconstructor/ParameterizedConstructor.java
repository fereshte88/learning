// constructor which has a specific number of parameters is called a parameterized constructor.
package com.rad.ajavaobjectclass.dconstructor;

public class ParameterizedConstructor {
    int id;
    String name;

    public ParameterizedConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //method to display the values
    void display(){System.out.println(id+" "+name);}
}
/*
Why use the parameterized constructor?
The parameterized constructor is used to provide different values to distinct objects.
 However, you can provide the same values also.
 */