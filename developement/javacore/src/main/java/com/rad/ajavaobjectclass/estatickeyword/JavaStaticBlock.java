package com.rad.ajavaobjectclass.estatickeyword;
/*

    Is used to initialize the static data member.
    It is executed before the main method at the time of classloading.

 */
public class JavaStaticBlock {
    static{System.out.println("static block is invoked");}
    public static void main(String args[]){
        System.out.println("Hello main");
    }
}
