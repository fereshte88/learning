package com.rad.ajavaobjectclass.dconstructor;

public class ConstructorOverloading {
    int id;
    String name;
    int age;

    public ConstructorOverloading(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ConstructorOverloading(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void display(){System.out.println(id+" "+name+" "+age);}
}
