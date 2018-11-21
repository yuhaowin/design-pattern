package com.yuhaowin.design.creational.singleton.v1;


/**
 * 懒汉式单例模式 v1
 * 1 声明一个static的对象
 * 2 private的构造器
 *
 * 当getInstance第一次被调用时会创建一个实例,以后再次调用时
 * 直接返回已经创建好的实例,不再创建实例.但是一下这种写法是线程不安全的.
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

//    public static LazySingleton getInstance(){
//        if (lazySingleton == null){
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }

    //加上同步锁,可以解决线程安全问题,但是多了加锁和解锁的步骤,
    //同时synchronized关键词加在静态方法上,相当于锁的死整个类文件
    //加锁的范围过大
//    public synchronized static LazySingleton getInstance(){
//        if (lazySingleton == null){
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }

    public  static LazySingleton getInstance(){
        synchronized (LazySingleton.class){
            if (lazySingleton == null){
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }
}
