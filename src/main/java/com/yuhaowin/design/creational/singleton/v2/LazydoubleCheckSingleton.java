package com.yuhaowin.design.creational.singleton.v2;


public class LazydoubleCheckSingleton {

    //加上volatile关键字,就不允许2 3 有重排序的可能
    private volatile static LazydoubleCheckSingleton lazydoubleCheckSingleton = null;

    private LazydoubleCheckSingleton() {
    }

    public static LazydoubleCheckSingleton getInstance() {
        if (lazydoubleCheckSingleton == null) {
            synchronized (LazydoubleCheckSingleton.class) {
                if (lazydoubleCheckSingleton == null) {
                    //1.分配内存给这个对象
                    //2.初始化这个对象
                    //3.lazydoubleCheckSingleton指向刚分配这个对象的内存地址
                    lazydoubleCheckSingleton = new LazydoubleCheckSingleton();
                }
            }
        }
        return lazydoubleCheckSingleton;
    }
}
