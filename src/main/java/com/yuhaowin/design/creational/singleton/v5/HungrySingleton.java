package com.yuhaowin.design.creational.singleton.v5;

import java.io.Serializable;

public class HungrySingleton implements Serializable {

    private HungrySingleton() {
    }

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

//    static {
//        hungrySingleton = new HungrySingleton();
//    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }
}
