package com.rad.bjavainheritance.baggregationhasa;

public class Circle {
    Operation op;//aggregation
    Double pi=3.14;

    public Double area(Integer radius){
        op=new Operation();
        Integer square=op.square(radius);//code reusability (i.e. delegates the method call).
        return pi*square;
    }


}
