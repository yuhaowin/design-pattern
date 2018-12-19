package com.yuhaowin.design.structure.adapter.classadapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        //在这里继续适配的相关操作
        super.adapteeRequest();
        //在这里继续适配的相关操作
    }
}
