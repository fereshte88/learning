package com.rad.ljavamultithreading.hjoiningathread;

import java.util.List;

/*
The join() method waits for a thread to die. In other words, it causes the currently running threads to stop executing until the thread it joins with completes its task.
Syntax:
public void join()throws InterruptedException
public void join(long milliseconds)throws InterruptedException
 */
public class JoinMethod1 extends Thread{
    public JoinMethod1() {
    }

    public JoinMethod1(String name) {
        this.setName(name);
    }

    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(5000);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i+"  "+this.getName());
        }

    }
    Runnable showRun(){
        JoinMethod1 t1=new JoinMethod1("t1");
        JoinMethod1 t2=new JoinMethod1("t2");
        JoinMethod1 t3=new JoinMethod1("t3");
        t1.start();
        try{

            t1.join();
        }catch(Exception e){System.out.println(e);}

        t2.start();
        t3.start();
        return null;
    }
//    Runnable showRun(List<JoinMethod1> threadList){
//
//        threadList.get(0).start();
//        try{
//
//            threadList.get(0).join();
//
//        }catch(Exception e){System.out.println(e);}
//
//        threadList.get(1).start();
//        threadList.get(2).start();
//        return this::run;
//    }

}
//As you can see in the above example,when t1 completes its task then t2 and t3 starts executing.