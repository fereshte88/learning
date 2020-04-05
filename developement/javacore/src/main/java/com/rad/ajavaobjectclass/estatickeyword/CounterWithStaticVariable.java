package com.rad.ajavaobjectclass.estatickeyword;

public class CounterWithStaticVariable {
    static int count=0;//will get memory only once and retain its value

    CounterWithStaticVariable(){
        count++;//incrementing the value of static variable

    }
    public int counter(){
        return count;
    }
}
