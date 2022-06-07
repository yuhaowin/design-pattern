package com.yuhaowin.design.creational.singleton.v6;

import java.io.Serializable;

public class HungrySingleton implements Serializable {

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例禁止反射调用构造器");
        }
    }

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

//    static {
//        hungrySingleton = new HungrySingleton();
//    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }
}
