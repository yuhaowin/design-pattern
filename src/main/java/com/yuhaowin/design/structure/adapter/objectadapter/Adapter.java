package com.yuhaowin.design.structure.adapter.objectadapter;

public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //在这里继续适配的相关操作
        adaptee.adapteeRequest();
        //在这里继续适配的相关操作
    }
}
