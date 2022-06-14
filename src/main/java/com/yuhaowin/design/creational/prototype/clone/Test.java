package com.yuhaowin.design.creational.prototype.clone;

import java.util.Date;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Pig pig1 = new Pig("佩奇", new Date(0L));
        Pig pig2 = (Pig) pig1.clone();

        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(77777777L);

        System.out.println(pig1);
        System.out.println(pig2);

        //--------------------------------------------------------------------------------------------------------------

        CloneObject originalObject = new CloneObject();
        CloneObject cloneObject = (CloneObject) originalObject.clone();

        System.out.println(originalObject == cloneObject);
        System.out.println(originalObject.equals(cloneObject));

        cloneObject.getDateList().get(0).setTime(77777777L);
        System.out.println();
    }
}
