package com.rad.ljavamultithreading.qruntimeclass;

/**
 * How to shutdown system in Java
 * You can use shutdown -s command to shutdown system. For windows OS, you need to provide full path of shutdown command e.g. c:\\Windows\\System32\\shutdown.
 * Here you can use -s switch to shutdown system, -r switch to restart system and -t switch to specify time delay.
 */
public class Runtime2 {
    public static void main(String args[])throws Exception{
        Runtime.getRuntime().exec("shutdown -s -t 0");
    }
}
/*
How to shutdown windows system in Java

    public class Runtime2{
     public static void main(String args[])throws Exception{
      Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
     }
    }
 */