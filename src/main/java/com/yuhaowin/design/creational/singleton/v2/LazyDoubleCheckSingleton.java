package com.yuhaowin.design.creational.singleton.v2;

public class LazyDoubleCheckSingleton {

    //加上volatile关键字,就不允许2 3 有重排序的可能
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    //1.分配内存给这个对象
                    //2.初始化这个对象
                    //3.lazyDoubleCheckSingleton 指向刚分配这个对象的内存地址
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
