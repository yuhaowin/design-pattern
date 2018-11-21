package com.yuhaowin.design.creational.singleton.v2;

public class T implements Runnable {
    @Override
    public void run() {
        LazydoubleCheckSingleton lazydoubleCheckSingleton = LazydoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + lazydoubleCheckSingleton);
    }
}
