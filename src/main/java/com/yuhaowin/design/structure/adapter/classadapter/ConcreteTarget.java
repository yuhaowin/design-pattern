package com.yuhaowin.design.structure.adapter.classadapter;

/**
 * 这个类似Target的直接实现,是为了和适配器做对比的,和适配器模式本身没有任何关系
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget的request方法...");
    }
}
