package com.rad.ljavamultithreading.gcallingrunmethod;
/*
What if we call run() method directly instead start() method?
    Each thread starts in a separate call stack.
    Invoking the run() method from main thread, the run() method goes onto the current call stack rather than at the beginning of a new call stack.
چه می شود اگر متد run را مستقیم صدا بزنیم به جای start
هر thread صدا زده می شود در call stack جداگانه
صدا زدن متد run از thread اصلی متد run به call stack جاری می رود به جای اینکه یک call stack جدید را شزوع کند
 */
public class CallRun  extends  Thread{
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
