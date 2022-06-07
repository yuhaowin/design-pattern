package com.yuhaowin.design.creational.singleton.v7;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        EnumSingleton instance = EnumSingleton.getInstance();
        instance.test();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/yuhao/Desktop/singleron_file"));

        oos.writeObject(instance);

        File file = new File("/Users/yuhao/Desktop/singleron_file");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        EnumSingleton newInstance = (EnumSingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
