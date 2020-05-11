package com.rad.ljavamultithreading.qruntimeclass;
/*
How to restart system in Java
 */
public class Runtime3 {
    public static void main(String args[])throws Exception{
        Runtime.getRuntime().exec("shutdown -r -t 0");
    }
}
