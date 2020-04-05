package com.rad.kjavainnerclass.estaticnestedclass;
/*
Java static nested class example with static method

If you have the static member inside static nested class, you don't need to create instance of static nested class.
 */
public class StaticOuter2 {
    static int data=30;
    static class Inner{
       static int msg(){return data;}
    }
}
