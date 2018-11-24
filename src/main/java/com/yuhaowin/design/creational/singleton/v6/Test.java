package com.yuhaowin.design.creational.singleton.v6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {


        //Class objectClass = HungrySingleton.class;
        Class objectClass = LazySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);


        //HungrySingleton instance = HungrySingleton.getInstance();
        //HungrySingleton newinstance = (HungrySingleton) constructor.newInstance();


        //对应Lazy模式的单例,无法彻底避免通过反射再次创建新的实例
        LazySingleton newinstance = (LazySingleton) constructor.newInstance();
        Field field = newinstance.getClass().getDeclaredField("flag");
        field.setAccessible(true);
        field.set(newinstance,true);

        LazySingleton instance = LazySingleton.getInstance();

        System.out.println(instance == newinstance);

        System.out.println(new Date());


    }
}
