package com.yuhaowin.design.creational.prototype.abstractprototype;

public abstract class A implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
