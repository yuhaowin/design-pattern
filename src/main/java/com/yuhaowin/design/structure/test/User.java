package com.yuhaowin.design.structure.test;

public class User {


    public static User getInstance(){
        return new User();
    }

    public Yuhao getYuhao(){
        return new Yuhao();
    }

    public class Yuhao{

    }



    public static void main(String[] args) {
        User.getInstance();
    }
}




