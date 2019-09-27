package com.lambton;

public class HandleMainThread {
    public static void main(String[] args) {
        ThreadExample t1=new ThreadExample("A");
        ThreadExample t2=new ThreadExample("B");
        System.out.println("Threads Started\n");
        t1.start();
        t2.start();


        SecondThread s1=new SecondThread("K");
              Thread t3=new Thread(s1);
              t3.start();


    }
}
