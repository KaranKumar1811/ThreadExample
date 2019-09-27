package com.lambton;

public class HandleMainThread {
    public static void main(String[] args) {
        ThreadExample t1=new ThreadExample("Karan Kumar");
        ThreadExample t2=new ThreadExample("Sandeep Singh");
        t1.start();
        t2.start();
    }
}
