package com.yuhaowin.design.creational.singleton.v6;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;


    //v1
//    private LazySingleton() {
//        if (lazySingleton != null){
//            throw new RuntimeException("单例禁止利用反射调用构造器!!!");
//        }
//    }

    //v2
    // flag 为true表示现在可以创建实例的,false表示已经创建过实例了,不可以再创建新的实例;
    private static Boolean flag = true;

    private LazySingleton() {
        if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("单例禁止利用反射调用构造器!!!");
        }
    }

    public static LazySingleton getInstance() {
        synchronized (LazySingleton.class) {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }
}
