package com.rad.ljavamultithreading.fstartathreadtwice;
/*
Can we start a thread twice
No. After starting a thread, it can never be started again.
If you does so, an IllegalThreadStateException is thrown.
n such case, thread will run once but for second time, it will throw exception.
آیا می توانیم دوبار thread را شروع کنیم
.خیر  پس از شروع thread ، هرگز نمی توان دوباره شروع کرد
اگر چنین کاری کنید ، یک IllegalThreadStateException پرتاب می شود.
در چنین حالتی ، thread یک بار اجرا می شود اما برای بار دوم ، استثنا را به وجود می آورد.

 */
public class ThreadTwice extends Thread {
    public void run(){
        System.out.println("running...");
    }
}
