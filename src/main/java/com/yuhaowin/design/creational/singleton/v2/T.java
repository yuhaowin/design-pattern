package com.yuhaowin.design.creational.singleton.v2;

public class T implements Runnable {
    @Override
    public void run() {
        LazyDoubleCheckSingleton lazydoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + lazydoubleCheckSingleton);
    }
}
