package com.rad.ljavamultithreading.qruntimeclass;

/**
 * Java Runtime freeMemory() and totalMemory() method
 *
 * In the given program, after creating 10000 instance, free memory will be less than the previous free memory. But after gc() call, you will get more free memory.
 * در برنامه داده شده ، بعد از ایجاد 10000 نمونه ، حافظه رایگان از حافظه رایگان قبلی قبلی کمتر خواهد بود. اما بعد از تماس gc () ، حافظه آزاد تری خواهید داشت.
 */
public class Memory {
    public static void main(String args[])throws Exception{
        Runtime r=Runtime.getRuntime();
        System.out.println("Total Memory: "+r.totalMemory());
        System.out.println("Free Memory: "+r.freeMemory());

        for(int i=0;i<10000;i++){
            new Memory();
        }
        System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());
        System.gc();
        System.out.println("After gc(), Free Memory: "+r.freeMemory());
    }
}
