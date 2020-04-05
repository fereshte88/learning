package com.rad.ajavaobjectclass.estatickeyword;

public class CounterWithoutStaticVariable {
    int count=0;//will get memory each time when the instance is created

    CounterWithoutStaticVariable(){
        count++;//incrementing value
    }

    public int counter(){
        return count;
    }
}
