/*
There are many ways to copy the values of one object into another in Java. They are:

    By constructor
    By assigning the values of one object into another
    By clone() method of Object class

 */
package com.rad.ajavaobjectclass.dconstructor;

public class CopyConstructor {
    int id;
    String name;

    public CopyConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public CopyConstructor(CopyConstructor copyConstructor) {
        this.id = copyConstructor.id;
        this.name = copyConstructor.name;
    }
}
