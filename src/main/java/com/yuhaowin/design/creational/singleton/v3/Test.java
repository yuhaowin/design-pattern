package com.yuhaowin.design.creational.singleton.v3;

public class Test {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new T());
        Thread thread2 = new Thread(new T());
        thread1.start();
        thread2.start();
        System.out.println("program end");
    }
}
