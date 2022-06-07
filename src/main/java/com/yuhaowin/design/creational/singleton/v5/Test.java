package com.yuhaowin.design.creational.singleton.v5;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        HungrySingleton instance = HungrySingleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/yuhao/Desktop/singleron_file"));

        oos.writeObject(instance);

        File file = new File("/Users/yuhao/Desktop/singleron_file");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        HungrySingleton newinstance = (HungrySingleton) ois.readObject();

        System.out.println(instance == newinstance);
    }
}
