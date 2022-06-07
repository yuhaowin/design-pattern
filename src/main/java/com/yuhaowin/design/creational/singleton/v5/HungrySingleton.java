package com.yuhaowin.design.creational.singleton.v5;

import java.io.Serializable;

public class HungrySingleton implements Serializable {

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

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
