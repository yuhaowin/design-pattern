package com.yuhaowin.design.creational.singleton.v4;

public class HungrySingleton {

    private HungrySingleton() {
    }

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

//    static {
//        hungrySingleton = new HungrySingleton();
//    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
