package com.yuhaowin.design.creational.singleton.v3;

public class T implements Runnable {
    @Override
    public void run() {
        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + staticInnerClassSingleton);
    }
}
